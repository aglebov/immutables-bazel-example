load("@bazel_tools//tools/build_defs/repo:http.bzl", "http_archive")

RULES_JVM_EXTERNAL_TAG = "2.8"

RULES_JVM_EXTERNAL_SHA = "79c9850690d7614ecdb72d68394f994fef7534b292c4867ce5e7dec0aa7bdfad"

http_archive(
    name = "rules_jvm_external",
    sha256 = RULES_JVM_EXTERNAL_SHA,
    strip_prefix = "rules_jvm_external-%s" % RULES_JVM_EXTERNAL_TAG,
    url = "https://github.com/bazelbuild/rules_jvm_external/archive/%s.zip" % RULES_JVM_EXTERNAL_TAG,
)

load("@rules_jvm_external//:defs.bzl", "maven_install")

IMMUTABLES_VERSION = "2.8.2"

maven_install(
    artifacts = [
        "org.immutables:value-annotations:%s" % IMMUTABLES_VERSION,
        "org.immutables:value-processor:%s" % IMMUTABLES_VERSION,
    ],
    repositories = [
        "https://repo1.maven.org/maven2",
    ],
)
