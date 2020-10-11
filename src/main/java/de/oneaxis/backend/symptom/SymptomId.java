package de.oneaxis.backend.symptom;

import com.fasterxml.jackson.annotation.JsonCreator;
import de.oneaxis.backend.ddd.ValueObject;

import java.util.UUID;

@ValueObject
final class SymptomId {
    public final String value;

    @JsonCreator
    SymptomId(String value) {
        this.value = value;
    }

    static SymptomId getNew() {
        return new SymptomId(UUID.randomUUID().toString());
    }
}
