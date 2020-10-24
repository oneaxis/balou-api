package de.oneaxis.backend.domain.tactical.storytelling;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import de.oneaxis.backend.domain.strategic.ValueObject;

import java.util.Objects;
import java.util.UUID;

@ValueObject
class AnimalId {
    private final String value;

    @JsonCreator
    AnimalId(@JsonProperty("value") String value) {
        this.value = value;
    }

    static AnimalId fromUUID() {
        return new AnimalId(UUID.randomUUID().toString());
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "AnimalId{" +
                "value='" + value + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AnimalId)) return false;
        AnimalId animalId = (AnimalId) o;
        return getValue().equals(animalId.getValue());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getValue());
    }
}
