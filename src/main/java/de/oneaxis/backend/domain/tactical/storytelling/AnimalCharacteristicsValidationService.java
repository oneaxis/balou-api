package de.oneaxis.backend.domain.tactical.storytelling;

import java.util.Objects;

public class AnimalCharacteristicsValidationService implements ValidationService<AnimalCharacteristics> {
    @Override
    public AnimalCharacteristics validate(AnimalCharacteristics validationSubject) throws ValidationException {
        // Main instance validation
        if (!Objects.nonNull(validationSubject))
            throw new ValidationException("The provided instance of type AnimalCharacteristics has not been initialized!");

        // Nested instance validation
        var raceValidationService = new RaceValidationService();
        raceValidationService.validate(validationSubject.getRace());
        var speciesValidationService = new SpeciesValidationService();
        speciesValidationService.validate(validationSubject.getSpecies());

        return validationSubject;
    }
}