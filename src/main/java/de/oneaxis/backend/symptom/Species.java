package de.oneaxis.backend.symptom;

import com.fasterxml.jackson.annotation.JsonCreator;
import de.oneaxis.backend.ddd.ValueObject;

@ValueObject
class Species {
    public final String name;

    @JsonCreator
    Species(String name) {
        this.name = name;
    }
}
