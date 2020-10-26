package de.oneaxis.backend.domain.tactical.storytelling;

import de.oneaxis.backend.domain.strategic.Service;
import org.apache.logging.log4j.util.Strings;

import java.util.Objects;


@Service
class StoryValidationService implements ValidationService<Story> {

    @Override
    public Story validate(Story validationSubject) {

        // Main instance validation
        if (!Objects.nonNull(validationSubject))
            throw new ValidationException("The provided instance of type Story has not been initialized!");
        if (!Objects.nonNull(validationSubject.getCreatedAt()))
            throw new ValidationException("The provided instance of type Story has no creation date associated!");
        if (!Strings.isNotEmpty(validationSubject.getStoryContent().getValue()))
            throw new ValidationException("The provided story content has not been set or is empty!");
        if (!Strings.isNotEmpty(validationSubject.getStoryId().getValue()))
            throw new ValidationException("The provided instance of type Story has no identity associated");

        // Nested instance validation
        var animalValidationService = new AnimalValidationService();
        var symptomValidationService = new SymptomValidationService();
        symptomValidationService.validate(validationSubject.getSymptom());
        animalValidationService.validate(validationSubject.getAnimal());

        return validationSubject;
    }
}
