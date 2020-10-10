package de.oneaxis.backend.symptom;

import com.fasterxml.jackson.annotation.JsonCreator;
import de.oneaxis.backend.ddd.ValueObject;

@ValueObject
class AnimalCharacteristics {
    private final Species species;
    private final Race race;

    @JsonCreator
    AnimalCharacteristics(Species species, Race race) {
        this.species = species;
        this.race = race;
    }

    public Species getSpecies() {
        return species;
    }

    public Race getRace() {
        return race;
    }
}
