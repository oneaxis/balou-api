package de.oneaxis.backend.domain.tactical.validation;

import de.oneaxis.backend.domain.strategic.Service;

import javax.validation.*;
import java.util.Set;

/**
 * Central validation logic for domain instances of generic type T
 */
@Service
public class ValidationService<T> {

    /**
     * Validates given domain instance of type T
     *
     * @return if validation passes, returns validationSubject of type T, otherwise throws ValidationException
     */
    public ValidationResult<T> validate(T validationSubject) {

        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
        Set<ConstraintViolation<T>> constraintViolations = validator.validate(validationSubject);

        return new ValidationResult<T>(validationSubject, constraintViolations);
    }

    public boolean isValid(T validationSubject) {
        return validate(validationSubject).getConstraintViolations().isEmpty();
    }
}
