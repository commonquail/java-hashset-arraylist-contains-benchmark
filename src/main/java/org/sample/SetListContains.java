package org.sample;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.Warmup;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Fork(10)
@Warmup(iterations = 20, time = 1, timeUnit = TimeUnit.SECONDS)
@Measurement(iterations = 20, time = 1, timeUnit = TimeUnit.SECONDS)
@State(Scope.Thread)
public class SetListContains {

    private Ctx list_00000 = new Ctx(ArrayList::new, Object::new, 0);
    private Ctx list_00001 = new Ctx(ArrayList::new, Object::new, 1);
    private Ctx list_00002 = new Ctx(ArrayList::new, Object::new, 2);
    private Ctx list_00003 = new Ctx(ArrayList::new, Object::new, 3);
    private Ctx list_00004 = new Ctx(ArrayList::new, Object::new, 4);
    private Ctx list_00005 = new Ctx(ArrayList::new, Object::new, 5);
    private Ctx list_00010 = new Ctx(ArrayList::new, Object::new, 10);
    private Ctx list_00020 = new Ctx(ArrayList::new, Object::new, 20);
    private Ctx list_00050 = new Ctx(ArrayList::new, Object::new, 50);
    private Ctx list_00100 = new Ctx(ArrayList::new, Object::new, 100);
    private Ctx list_01000 = new Ctx(ArrayList::new, Object::new, 1000);
    private Ctx list_10000 = new Ctx(ArrayList::new, Object::new, 10000);

    private Ctx set_00000 = new Ctx(HashSet::new, Object::new, 0);
    private Ctx set_00001 = new Ctx(HashSet::new, Object::new, 1);
    private Ctx set_00002 = new Ctx(HashSet::new, Object::new, 2);
    private Ctx set_00003 = new Ctx(HashSet::new, Object::new, 3);
    private Ctx set_00004 = new Ctx(HashSet::new, Object::new, 4);
    private Ctx set_00005 = new Ctx(HashSet::new, Object::new, 5);
    private Ctx set_00010 = new Ctx(HashSet::new, Object::new, 10);
    private Ctx set_00020 = new Ctx(HashSet::new, Object::new, 20);
    private Ctx set_00050 = new Ctx(HashSet::new, Object::new, 50);
    private Ctx set_00100 = new Ctx(HashSet::new, Object::new, 100);
    private Ctx set_01000 = new Ctx(HashSet::new, Object::new, 1000);
    private Ctx set_10000 = new Ctx(HashSet::new, Object::new, 10000);

    // :list-false:

    @Benchmark
    public boolean arraylist_object_00000() {
        final Ctx ctx = list_00000;
        final Object o = ctx.notContained;
        return ctx.c.contains(o);
    }

    @Benchmark
    public boolean arraylist_object_00001() {
        final Ctx ctx = list_00001;
        final Object o = ctx.notContained;
        return ctx.c.contains(o);
    }

    @Benchmark
    public boolean arraylist_object_00002() {
        final Ctx ctx = list_00002;
        final Object o = ctx.notContained;
        return ctx.c.contains(o);
    }

    @Benchmark
    public boolean arraylist_object_00003() {
        final Ctx ctx = list_00003;
        final Object o = ctx.notContained;
        return ctx.c.contains(o);
    }

    @Benchmark
    public boolean arraylist_object_00004() {
        final Ctx ctx = list_00004;
        final Object o = ctx.notContained;
        return ctx.c.contains(o);
    }

    @Benchmark
    public boolean arraylist_object_00005() {
        final Ctx ctx = list_00005;
        final Object o = ctx.notContained;
        return ctx.c.contains(o);
    }

    @Benchmark
    public boolean arraylist_object_00010() {
        final Ctx ctx = list_00010;
        final Object o = ctx.notContained;
        return ctx.c.contains(o);
    }

    @Benchmark
    public boolean arraylist_object_00020() {
        final Ctx ctx = list_00020;
        final Object o = ctx.notContained;
        return ctx.c.contains(o);
    }

    @Benchmark
    public boolean arraylist_object_00050() {
        final Ctx ctx = list_00050;
        final Object o = ctx.notContained;
        return ctx.c.contains(o);
    }

    @Benchmark
    public boolean arraylist_object_00100() {
        final Ctx ctx = list_00100;
        final Object o = ctx.notContained;
        return ctx.c.contains(o);
    }

    @Benchmark
    public boolean arraylist_object_01000() {
        final Ctx ctx = list_01000;
        final Object o = ctx.notContained;
        return ctx.c.contains(o);
    }

    @Benchmark
    public boolean arraylist_object_10000() {
        final Ctx ctx = list_10000;
        final Object o = ctx.notContained;
        return ctx.c.contains(o);
    }

    // :list-1st:

    @Benchmark
    public boolean arraylist_object_1st_00001() {
        final Ctx ctx = list_00001;
        final Object o = ctx.contained;
        return ctx.c.contains(o);
    }

    @Benchmark
    public boolean arraylist_object_1st_00002() {
        final Ctx ctx = list_00002;
        final Object o = ctx.contained;
        return ctx.c.contains(o);
    }

    @Benchmark
    public boolean arraylist_object_1st_00003() {
        final Ctx ctx = list_00003;
        final Object o = ctx.contained;
        return ctx.c.contains(o);
    }

    @Benchmark
    public boolean arraylist_object_1st_00004() {
        final Ctx ctx = list_00004;
        final Object o = ctx.contained;
        return ctx.c.contains(o);
    }

    @Benchmark
    public boolean arraylist_object_1st_00005() {
        final Ctx ctx = list_00005;
        final Object o = ctx.contained;
        return ctx.c.contains(o);
    }

    @Benchmark
    public boolean arraylist_object_1st_00010() {
        final Ctx ctx = list_00010;
        final Object o = ctx.contained;
        return ctx.c.contains(o);
    }

    @Benchmark
    public boolean arraylist_object_1st_00020() {
        final Ctx ctx = list_00020;
        final Object o = ctx.contained;
        return ctx.c.contains(o);
    }

    @Benchmark
    public boolean arraylist_object_1st_00050() {
        final Ctx ctx = list_00050;
        final Object o = ctx.contained;
        return ctx.c.contains(o);
    }

    @Benchmark
    public boolean arraylist_object_1st_00100() {
        final Ctx ctx = list_00100;
        final Object o = ctx.contained;
        return ctx.c.contains(o);
    }

    @Benchmark
    public boolean arraylist_object_1st_01000() {
        final Ctx ctx = list_01000;
        final Object o = ctx.contained;
        return ctx.c.contains(o);
    }

    @Benchmark
    public boolean arraylist_object_1st_10000() {
        final Ctx ctx = list_10000;
        final Object o = ctx.contained;
        return ctx.c.contains(o);
    }

    // :list-25th:

    @Benchmark
    public boolean arraylist_object_25th_00004() {
        final Ctx ctx = list_00004;
        final Object o = ctx.q25;
        return ctx.c.contains(o);
    }

    @Benchmark
    public boolean arraylist_object_25th_00005() {
        final Ctx ctx = list_00005;
        final Object o = ctx.q25;
        return ctx.c.contains(o);
    }

    @Benchmark
    public boolean arraylist_object_25th_00010() {
        final Ctx ctx = list_00010;
        final Object o = ctx.q25;
        return ctx.c.contains(o);
    }

    @Benchmark
    public boolean arraylist_object_25th_00020() {
        final Ctx ctx = list_00020;
        final Object o = ctx.q25;
        return ctx.c.contains(o);
    }

    @Benchmark
    public boolean arraylist_object_25th_00050() {
        final Ctx ctx = list_00050;
        final Object o = ctx.q25;
        return ctx.c.contains(o);
    }

    @Benchmark
    public boolean arraylist_object_25th_00100() {
        final Ctx ctx = list_00100;
        final Object o = ctx.q25;
        return ctx.c.contains(o);
    }

    @Benchmark
    public boolean arraylist_object_25th_01000() {
        final Ctx ctx = list_01000;
        final Object o = ctx.q25;
        return ctx.c.contains(o);
    }

    @Benchmark
    public boolean arraylist_object_25th_10000() {
        final Ctx ctx = list_10000;
        final Object o = ctx.q25;
        return ctx.c.contains(o);
    }

    // :list-50th:

    @Benchmark
    public boolean arraylist_object_50th_00004() {
        final Ctx ctx = list_00004;
        final Object o = ctx.q50;
        return ctx.c.contains(o);
    }

    @Benchmark
    public boolean arraylist_object_50th_00005() {
        final Ctx ctx = list_00005;
        final Object o = ctx.q50;
        return ctx.c.contains(o);
    }

    @Benchmark
    public boolean arraylist_object_50th_00010() {
        final Ctx ctx = list_00010;
        final Object o = ctx.q50;
        return ctx.c.contains(o);
    }

    @Benchmark
    public boolean arraylist_object_50th_00020() {
        final Ctx ctx = list_00020;
        final Object o = ctx.q50;
        return ctx.c.contains(o);
    }

    @Benchmark
    public boolean arraylist_object_50th_00050() {
        final Ctx ctx = list_00050;
        final Object o = ctx.q50;
        return ctx.c.contains(o);
    }

    @Benchmark
    public boolean arraylist_object_50th_00100() {
        final Ctx ctx = list_00100;
        final Object o = ctx.q50;
        return ctx.c.contains(o);
    }

    @Benchmark
    public boolean arraylist_object_50th_01000() {
        final Ctx ctx = list_01000;
        final Object o = ctx.q50;
        return ctx.c.contains(o);
    }

    @Benchmark
    public boolean arraylist_object_50th_10000() {
        final Ctx ctx = list_10000;
        final Object o = ctx.q50;
        return ctx.c.contains(o);
    }

    // :list-75th:

    @Benchmark
    public boolean arraylist_object_75th_00004() {
        final Ctx ctx = list_00004;
        final Object o = ctx.q75;
        return ctx.c.contains(o);
    }

    @Benchmark
    public boolean arraylist_object_75th_00005() {
        final Ctx ctx = list_00005;
        final Object o = ctx.q75;
        return ctx.c.contains(o);
    }

    @Benchmark
    public boolean arraylist_object_75th_00010() {
        final Ctx ctx = list_00010;
        final Object o = ctx.q75;
        return ctx.c.contains(o);
    }

    @Benchmark
    public boolean arraylist_object_75th_00020() {
        final Ctx ctx = list_00020;
        final Object o = ctx.q75;
        return ctx.c.contains(o);
    }

    @Benchmark
    public boolean arraylist_object_75th_00050() {
        final Ctx ctx = list_00050;
        final Object o = ctx.q75;
        return ctx.c.contains(o);
    }

    @Benchmark
    public boolean arraylist_object_75th_00100() {
        final Ctx ctx = list_00100;
        final Object o = ctx.q75;
        return ctx.c.contains(o);
    }

    @Benchmark
    public boolean arraylist_object_75th_01000() {
        final Ctx ctx = list_01000;
        final Object o = ctx.q75;
        return ctx.c.contains(o);
    }

    @Benchmark
    public boolean arraylist_object_75th_10000() {
        final Ctx ctx = list_10000;
        final Object o = ctx.q75;
        return ctx.c.contains(o);
    }

    // :set-false:

    @Benchmark
    public boolean set_object_00000() {
        final Ctx ctx = set_00000;
        final Object o = ctx.notContained;
        return ctx.c.contains(o);
    }

    @Benchmark
    public boolean set_object_00001() {
        final Ctx ctx = set_00001;
        final Object o = ctx.notContained;
        return ctx.c.contains(o);
    }

    @Benchmark
    public boolean set_object_00002() {
        final Ctx ctx = set_00002;
        final Object o = ctx.notContained;
        return ctx.c.contains(o);
    }

    @Benchmark
    public boolean set_object_00003() {
        final Ctx ctx = set_00003;
        final Object o = ctx.notContained;
        return ctx.c.contains(o);
    }

    @Benchmark
    public boolean set_object_00004() {
        final Ctx ctx = set_00004;
        final Object o = ctx.notContained;
        return ctx.c.contains(o);
    }

    @Benchmark
    public boolean set_object_00005() {
        final Ctx ctx = set_00005;
        final Object o = ctx.notContained;
        return ctx.c.contains(o);
    }

    @Benchmark
    public boolean set_object_00010() {
        final Ctx ctx = set_00010;
        final Object o = ctx.notContained;
        return ctx.c.contains(o);
    }

    @Benchmark
    public boolean set_object_00020() {
        final Ctx ctx = set_00020;
        final Object o = ctx.notContained;
        return ctx.c.contains(o);
    }

    @Benchmark
    public boolean set_object_00050() {
        final Ctx ctx = set_00050;
        final Object o = ctx.notContained;
        return ctx.c.contains(o);
    }

    @Benchmark
    public boolean set_object_00100() {
        final Ctx ctx = set_00100;
        final Object o = ctx.notContained;
        return ctx.c.contains(o);
    }

    @Benchmark
    public boolean set_object_01000() {
        final Ctx ctx = set_01000;
        final Object o = ctx.notContained;
        return ctx.c.contains(o);
    }

    @Benchmark
    public boolean set_object_10000() {
        final Ctx ctx = set_10000;
        final Object o = ctx.notContained;
        return ctx.c.contains(o);
    }

    // :set-true:

    @Benchmark
    public boolean set_object_true_00001() {
        final Ctx ctx = set_00001;
        final Object o = ctx.contained;
        return ctx.c.contains(o);
    }

    @Benchmark
    public boolean set_object_true_00002() {
        final Ctx ctx = set_00002;
        final Object o = ctx.contained;
        return ctx.c.contains(o);
    }

    @Benchmark
    public boolean set_object_true_00003() {
        final Ctx ctx = set_00003;
        final Object o = ctx.contained;
        return ctx.c.contains(o);
    }

    @Benchmark
    public boolean set_object_true_00004() {
        final Ctx ctx = set_00004;
        final Object o = ctx.contained;
        return ctx.c.contains(o);
    }

    @Benchmark
    public boolean set_object_true_00005() {
        final Ctx ctx = set_00005;
        final Object o = ctx.contained;
        return ctx.c.contains(o);
    }

    @Benchmark
    public boolean set_object_true_00010() {
        final Ctx ctx = set_00010;
        final Object o = ctx.contained;
        return ctx.c.contains(o);
    }

    @Benchmark
    public boolean set_object_true_00020() {
        final Ctx ctx = set_00020;
        final Object o = ctx.contained;
        return ctx.c.contains(o);
    }

    @Benchmark
    public boolean set_object_true_00050() {
        final Ctx ctx = set_00050;
        final Object o = ctx.contained;
        return ctx.c.contains(o);
    }

    @Benchmark
    public boolean set_object_true_00100() {
        final Ctx ctx = set_00100;
        final Object o = ctx.contained;
        return ctx.c.contains(o);
    }

    @Benchmark
    public boolean set_object_true_01000() {
        final Ctx ctx = set_01000;
        final Object o = ctx.contained;
        return ctx.c.contains(o);
    }

    @Benchmark
    public boolean set_object_true_10000() {
        final Ctx ctx = set_10000;
        final Object o = ctx.contained;
        return ctx.c.contains(o);
    }

    // :end:

    private static final class Ctx {
        public final Collection<Object> c;
        public final Object contained;
        public final Object q25;
        public final Object q50;
        public final Object q75;
        public final Object notContained;

        public Ctx(
                final Supplier<? extends Collection<Object>> collection,
                final Supplier<?> factory,
                final int numElements
        ) {
            this.c = Stream
                .generate(factory)
                .limit(numElements)
                .collect(Collectors.toCollection(collection));

            if (c instanceof ArrayList) {
                final List<?> l = (ArrayList) c;
                final int size = l.size();

                this.contained = size > 0 ? l.get(0) : null;

                if (size > 4) {
                    final int quartile = size / 4;
                    this.q25 = l.get(quartile);
                    this.q50 = l.get(2 * quartile);
                    this.q75 = l.get(3 * quartile);
                } else {
                    this.q25 = null;
                    this.q50 = null;
                    this.q75 = null;
                }
            } else {
                this.contained = c
                    .stream()
                    .findAny()
                    .orElse(null);

                this.q25 = null;
                this.q50 = null;
                this.q75 = null;
            }

            this.notContained = this.contained instanceof String
                ? new Object().toString()
                : new Object();
        }
    }
}
