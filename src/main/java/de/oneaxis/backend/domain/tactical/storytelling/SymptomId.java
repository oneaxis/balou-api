package de.oneaxis.backend.domain.tactical.storytelling;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import de.oneaxis.backend.domain.strategic.ValueObject;

import java.util.Objects;
import java.util.UUID;

@ValueObject
public final class SymptomId {
    private final String value;

    @JsonCreator
    public SymptomId(@JsonProperty("value") String value) {
        this.value = value;
    }

    static SymptomId fromUUID() {
        return new SymptomId(UUID.randomUUID().toString());
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "SymptomId{" +
                "value='" + value + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SymptomId)) return false;
        SymptomId symptomId = (SymptomId) o;
        return getValue().equals(symptomId.getValue());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getValue());
    }
}
