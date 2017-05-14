NR > 1 {
    bench_suffix = match($1, /_[0-9]+"$/)
    # Unwanted characters _ and "
    xlength = RLENGTH - 2 
    dataset = format_linetitle(substr($1, 0, bench_suffix))
    xvalue = substr($1, bench_suffix + 1, xlength)
    if (linetitle != dataset) {
        linetitle = dataset
        print_dataset_header(linetitle)
    }
    print xvalue, $5, $6
}

function format_linetitle(dataset,    ordinal)
{
    # Strip class name.
    gsub(/.+\./, "", dataset)

    gsub(/_/, " ", dataset)
    # "st" requires disambiguation.
    ordinal = match(dataset, /[0-9](st|th)$/)
    if (ordinal) {
        ++ordinal
        dataset = substr(dataset, 0, ordinal) "^{" substr(dataset, ordinal) "}"
    }
    return "\"" dataset "\""
}

function print_dataset_header(linetitle)
{
    if (NR > 2) {
        print "\n"
    }
    print linetitle, "score", "error"
}
