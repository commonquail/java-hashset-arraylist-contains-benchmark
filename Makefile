awk_script=extract-full-dataset.awk
plotscript=plot.gpi
gnuplot=gnuplot --persist -c $(plotscript)

benchmark_output=$(DESTDIR)benchmark-output.csv
dataset=$(addsuffix .dat,full no-string no-object)
filter_out=no-string no-object
full_plot_elements=5 10 100 1200 10000
plot_sets=$(addprefix full-,$(full_plot_elements)) $(filter_out)
plots=$(addprefix $(DESTDIR),$(addsuffix .png,$(plot_sets)))

.SUFFIXES:

.PHONY: all
all: plot

.PHONY: plot
plot: $(plots)

.PHONY: run-benchmark
run-benchmark: $(benchmark_output)

.PHONY: count-unique-hashcodes
count-unique-hashcodes: HashCodeCollision.class
	java HashCodeCollision | sort -u | wc -l

.PHONY: clean
clean:
	$(RM) $(DESTDIR)*.png $(dataset) *.class

.PHONY: clobber
clobber: clean
	mvn clean
	$(RM) $(benchmark_output)

$(DESTDIR)full-%.png: full.dat $(plotscript)
	$(gnuplot) $< $* $@

$(DESTDIR)no-%.png: no-%.dat $(plotscript)
	$(gnuplot) $< 10 $@

full.dat: $(benchmark_output) $(awk_script)
	awk -F, -f $(awk_script) $< > $@

no-%.dat: full.dat
	sed '/$*/,/^$$/d' $< > $@

$(benchmark_output): target/benchmarks.jar
	test -d $(DESTDIR) || mkdir $(DESTDIR)
	java -jar $< -rf csv -rff $@

target/benchmarks.jar: src/main/java/org/sample/SetListContains.java
	mvn package

%.class: %.java
	javac $<
