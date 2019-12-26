java_plugin(
    name = "immutables-generate",
    generates_api = 1,
    processor_class = "org.immutables.value.processor.Processor",
    deps = [
        "@maven//:org_immutables_value_processor",
    ],
)

java_library(
    name = "compile",
    srcs = glob(["src/**/*.java"]),
    plugins = [":immutables-generate"],
    deps = [
        "@maven//:org_immutables_value_annotations",
    ],
)
