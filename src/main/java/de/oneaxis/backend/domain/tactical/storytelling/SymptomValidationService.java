package de.oneaxis.backend.domain.tactical.storytelling;

import org.apache.logging.log4j.util.Strings;

import java.util.Objects;

class SymptomValidationService implements ValidationService<Symptom> {

    @Override
    public Symptom validate(Symptom validationSubject) throws ValidationException {

        // Main instance validation
        if (!Objects.nonNull(validationSubject))
            throw new ValidationException("The provided instance of type Symptom has not been initialized!");
        if (!Objects.nonNull(validationSubject.getCreatedAt()))
            throw new ValidationException("The provided instance of type Symptom has no creation date associated!");
        if (!Strings.isNotEmpty(validationSubject.getSymptomDescription().getValue()))
            throw new ValidationException("The provided Symptom description has not been set or is empty!");
        if (!Strings.isNotEmpty(validationSubject.getSymptomName().getValue()))
            throw new ValidationException("The provided Symptom name has not been set or is empty!");
        if (!Strings.isNotEmpty(validationSubject.getSymptomId().getValue()))
            throw new ValidationException("The provided instance of type Symptom has no identity associated");

        return validationSubject;
    }
}
