/^Benchmark/ {
    in_benchmark_results = 1
    next
}

in_benchmark_results {
    bench_suffix = match($1, "_[0-9]+$")
    dataset = format_linetitle(substr($1, 0, bench_suffix))
    xvalue = substr($1, bench_suffix + 1)
    if (linetitle != dataset) {
        linetitle = dataset
        print_dataset_header(linetitle)
    }
    print xvalue, $4, $6
}

function format_linetitle(dataset,    ordinal)
{
    # Strip class name.
    sub(".+\.", "", dataset)

    gsub("_", " ", dataset)
    # "st" requires disambiguation.
    ordinal = match(dataset, "[0-9](st|th)$")
    if (ordinal) {
        ++ordinal
        dataset = substr(dataset, 0, ordinal) "^{" substr(dataset, ordinal) "}"
    }
    return "\"" dataset "\""
}

function print_dataset_header(linetitle)
{
    if (in_benchmark_results == 1) {
        ++in_benchmark_results
    } else {
        print "\n"
    }
    print linetitle, "score", "error"
}
