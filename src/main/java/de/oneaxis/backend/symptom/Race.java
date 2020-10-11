package de.oneaxis.backend.symptom;

import com.fasterxml.jackson.annotation.JsonCreator;
import de.oneaxis.backend.ddd.ValueObject;

@ValueObject
class Race {
    public final String name;

    @JsonCreator
    Race(String name) {
        this.name = name;
    }
}
