package de.oneaxis.backend.tactical.storytelling;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import de.oneaxis.backend.strategic.ValueObject;

import java.util.Objects;

@ValueObject
class Species {
    private final String value;

    @JsonCreator
    Species(@JsonProperty("value") String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Species{" +
                "value='" + value + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Species)) return false;
        Species species = (Species) o;
        return getValue().equals(species.getValue());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getValue());
    }
}
