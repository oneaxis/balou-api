package de.oneaxis.backend.domain.tactical.storytelling;

import org.apache.logging.log4j.util.Strings;

import java.util.Objects;

public class AnimalValidationService implements ValidationService<Animal> {
    @Override
    public Animal validate(Animal validationSubject) throws ValidationException {
        // Main instance validation
        if (!Objects.nonNull(validationSubject))
            throw new ValidationException("The provided instance of type Animal has not been initialized!");
        if (!Objects.nonNull(validationSubject.getCreatedAt()))
            throw new ValidationException("The provided instance of type Animal has no creation date associated!");
        if (!Strings.isNotEmpty(validationSubject.getAnimalId().getValue()))
            throw new ValidationException("The provided instance of type Animal has no identity associated");

        // Nested instance validation
        var animalCharacteristics = new AnimalCharacteristicsValidationService();
        animalCharacteristics.validate(validationSubject.getAnimalCharacteristics());

        return validationSubject;
    }
}
