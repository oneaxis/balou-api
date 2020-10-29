package de.oneaxis.backend.domain.tactical.storytelling;

import org.apache.logging.log4j.util.Strings;

import java.util.Objects;

public class RaceValidationService implements ValidationService<Race> {
    @Override
    public Race validate(Race validationSubject) throws ValidationException {
        // Main instance validation
        if (!Objects.nonNull(validationSubject))
            throw new ValidationException("The provided instance of type Race has not been initialized!");
        if (!Strings.isNotEmpty(validationSubject.getValue()))
            throw new ValidationException("The provided Race value has not been set or is empty!");

        return validationSubject;
    }
}
