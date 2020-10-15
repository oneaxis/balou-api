package de.oneaxis.backend.domain.tactical.storytelling;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import de.oneaxis.backend.domain.strategic.Entity;
import org.springframework.data.annotation.Id;

import java.util.Objects;

@Entity
class Animal {

    @Id
    private final AnimalId animalId;
    private final AnimalCharacteristics animalCharacteristics;

    @JsonCreator
    Animal(@JsonProperty("animalId") AnimalId animalId, @JsonProperty("animalCharacteristics") AnimalCharacteristics animalCharacteristics) {
        this.animalId = animalId;
        this.animalCharacteristics = animalCharacteristics;
    }

    public AnimalId getAnimalId() {
        return animalId;
    }

    public AnimalCharacteristics getAnimalCharacteristics() {
        return animalCharacteristics;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "animalId=" + animalId +
                ", animalCharacteristics=" + animalCharacteristics +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal)) return false;
        Animal animal = (Animal) o;
        return animalId.equals(animal.animalId) &&
                animalCharacteristics.equals(animal.animalCharacteristics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(animalId, animalCharacteristics);
    }
}
