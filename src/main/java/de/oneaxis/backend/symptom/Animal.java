package de.oneaxis.backend.symptom;

import com.fasterxml.jackson.annotation.JsonCreator;
import de.oneaxis.backend.ddd.Entity;

@Entity
class Animal {
    public final AnimalCharacteristics animalCharacteristics;

    @JsonCreator
    Animal(AnimalCharacteristics animalCharacteristics) {
        this.animalCharacteristics = animalCharacteristics;
    }
}
