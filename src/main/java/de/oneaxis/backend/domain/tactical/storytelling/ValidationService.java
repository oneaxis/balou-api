package de.oneaxis.backend.domain.tactical.storytelling;

import de.oneaxis.backend.domain.strategic.Service;

import java.util.Objects;

/**
 * Central validation logic for domain instances of generic type T
 */
@Service
interface ValidationService<T> {

    /**
     * Validates given domain instance of type T
     * @return if validation passes, returns validationSubject of type T, otherwise throws ValidationException
     */
    T validate(T validationSubject) throws ValidationException;
    default boolean isValid(T validationSubject) {
        return Objects.nonNull(this.validate(validationSubject));
    }
}
