package de.oneaxis.backend.domain.tactical.storytelling;

import de.oneaxis.backend.domain.strategic.ValueObject;
import lombok.Builder;
import lombok.Value;

import javax.validation.constraints.Size;

@ValueObject
@Value
@Builder
public class SymptomDescription {
    @Size(min = 3, message = "SymptomDescription should contain at least 3 characters")
    private final String value;
}
