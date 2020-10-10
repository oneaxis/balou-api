package de.oneaxis.backend.symptom;

import com.fasterxml.jackson.annotation.JsonCreator;
import de.oneaxis.backend.ddd.ValueObject;

@ValueObject
class Species {
    private final String name;

    @JsonCreator
    Species(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
