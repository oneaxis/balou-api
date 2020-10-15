package de.oneaxis.backend.tactical.story;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import de.oneaxis.backend.strategic.Entity;
import org.springframework.data.annotation.Id;

import java.util.Objects;

@Entity
class Symptom {
    @Id
    private final SymptomId symptomId;
    private final Pet pet;

    @JsonCreator
    Symptom(@JsonProperty("symptomId") SymptomId symptomId, @JsonProperty("pet") Pet pet) {
        this.symptomId = symptomId;
        this.pet = pet;
    }

    public SymptomId getSymptomId() {
        return symptomId;
    }

    public Pet getPet() {
        return pet;
    }

    @Override
    public String toString() {
        return "Symptom{" +
                "symptomId=" + symptomId +
                ", pet=" + pet +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Symptom)) return false;
        Symptom symptom = (Symptom) o;
        return symptomId.equals(symptom.symptomId) &&
                pet.equals(symptom.pet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(symptomId, pet);
    }
}
