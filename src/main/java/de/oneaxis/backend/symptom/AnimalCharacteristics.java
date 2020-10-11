package de.oneaxis.backend.symptom;

import com.fasterxml.jackson.annotation.JsonCreator;
import de.oneaxis.backend.ddd.ValueObject;

@ValueObject
class AnimalCharacteristics {
    public final Species species;
    public final Race race;

    @JsonCreator
    AnimalCharacteristics(Species species, Race race) {
        this.species = species;
        this.race = race;
    }
}
