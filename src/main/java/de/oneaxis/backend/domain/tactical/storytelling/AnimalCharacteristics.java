package de.oneaxis.backend.domain.tactical.storytelling;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import de.oneaxis.backend.domain.strategic.ValueObject;

import java.util.Objects;

@ValueObject
class AnimalCharacteristics {
    private final Species species;
    private final Race race;

    @JsonCreator
    AnimalCharacteristics(@JsonProperty("species") Species species, @JsonProperty("race") Race race) {
        this.species = species;
        this.race = race;
    }

    public Species getSpecies() {
        return species;
    }

    public Race getRace() {
        return race;
    }

    @Override
    public String toString() {
        return "AnimalCharacteristics{" +
                "species=" + species +
                ", race=" + race +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AnimalCharacteristics)) return false;
        AnimalCharacteristics that = (AnimalCharacteristics) o;
        return getSpecies().equals(that.getSpecies()) &&
                getRace().equals(that.getRace());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSpecies(), getRace());
    }
}
