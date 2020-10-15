package de.oneaxis.backend.tactical.story;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import de.oneaxis.backend.strategic.Entity;
import org.springframework.data.annotation.Id;

import java.util.Objects;

@Entity
class Pet {

    @Id
    private final AnimalId animalId;
    private final AnimalCharacteristics animalCharacteristics;

    @JsonCreator
    Pet(@JsonProperty("animalId") AnimalId animalId, @JsonProperty("animalCharacteristics") AnimalCharacteristics animalCharacteristics) {
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
        return "Pet{" +
                "animalId=" + animalId +
                ", animalCharacteristics=" + animalCharacteristics +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pet)) return false;
        Pet pet = (Pet) o;
        return animalId.equals(pet.animalId) &&
                animalCharacteristics.equals(pet.animalCharacteristics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(animalId, animalCharacteristics);
    }
}
