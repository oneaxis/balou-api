package de.oneaxis.backend.symptom;

import com.fasterxml.jackson.annotation.JsonCreator;
import de.oneaxis.backend.ddd.AggregateRoot;

@AggregateRoot
public class Symptom {
    private final Animal animal;

    @JsonCreator
    Symptom(Animal animal) {
        this.animal = animal;
    }

    public Animal getAnimal() {
        return animal;
    }
}
