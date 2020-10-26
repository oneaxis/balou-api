package de.oneaxis.backend.domain.tactical.storytelling;

import de.oneaxis.backend.domain.strategic.Entity;
import lombok.Builder;
import lombok.Data;

@Entity
@Data
@Builder
class Animal {

    private final AnimalId animalId;
    private final AnimalCharacteristics animalCharacteristics;

    Animal(AnimalId animalId, AnimalCharacteristics animalCharacteristics) {
        this.animalId = animalId;
        this.animalCharacteristics = animalCharacteristics;
    }

    public AnimalId getAnimalId() {
        return animalId;
    }

    public AnimalCharacteristics getAnimalCharacteristics() {
        return animalCharacteristics;
    }
}
