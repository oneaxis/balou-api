package de.oneaxis.backend.domain.tactical.validation;

import lombok.Builder;
import lombok.Value;

import javax.validation.ConstraintViolation;
import java.util.Set;

@Builder
@Value
public class ValidationResult<T> {
    private final T validationSubject;
    private final Set<ConstraintViolation<T>> constraintViolations;
}
