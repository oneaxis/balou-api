package de.oneaxis.backend.symptom;

import de.oneaxis.backend.ddd.AggregateRoot;
import org.springframework.data.annotation.Id;

@AggregateRoot
class Symptom {
    @Id
    public  final SymptomId symptomId;
    public final Animal animal;

    Symptom(SymptomId symptomId, Animal animal) {
        this.symptomId = symptomId;
        this.animal = animal;
    }

    Symptom(Animal animal) {
        this.symptomId = SymptomId.getNew();
        this.animal = animal;
    }
}
