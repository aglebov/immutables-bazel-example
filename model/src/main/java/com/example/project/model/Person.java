package com.example.project.model;

import org.immutables.value.Value;

@Value.Immutable
public interface Person {

    static ImmutablePerson.Builder build() {
        return ImmutablePerson.builder();
    }

    String firstName();

    String lastName();

}
