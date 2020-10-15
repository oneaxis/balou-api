package de.oneaxis.backend.tactical.story;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import de.oneaxis.backend.strategic.ValueObject;

import java.util.Objects;

@ValueObject
class Race {
    private final String value;

    @JsonCreator
    Race(@JsonProperty("value") String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Race{" +
                "value='" + value + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Race)) return false;
        Race race = (Race) o;
        return getValue().equals(race.getValue());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getValue());
    }
}
