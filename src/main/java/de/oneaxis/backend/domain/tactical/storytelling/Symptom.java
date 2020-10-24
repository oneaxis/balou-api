package de.oneaxis.backend.domain.tactical.storytelling;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import de.oneaxis.backend.domain.strategic.Entity;
import org.springframework.data.annotation.Id;

import java.util.Objects;

@Entity
public class Symptom {

    @Id
    private final SymptomId symptomId;
    private final Animal animal;

    @JsonCreator
    public Symptom(@JsonProperty("symptomId") SymptomId symptomId, @JsonProperty("animal") Animal animal) {
        this.symptomId = Objects.requireNonNullElse(symptomId, SymptomId.fromUUID());
        this.animal = animal;
    }

    public SymptomId getSymptomId() {
        return symptomId;
    }

    public Animal getAnimal() {
        return animal;
    }

    @Override
    public String toString() {
        return "Symptom{" +
                "symptomId=" + symptomId +
                ", animal=" + animal +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Symptom)) return false;
        Symptom symptom = (Symptom) o;
        return symptomId.equals(symptom.symptomId) &&
                animal.equals(symptom.animal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(symptomId, animal);
    }
}
