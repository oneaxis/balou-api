package de.oneaxis.backend.domain.tactical.storytelling;

import de.oneaxis.backend.domain.strategic.ValueObject;
import lombok.Builder;
import lombok.Value;

import javax.validation.constraints.NotEmpty;

@ValueObject
@Value
@Builder
public class SymptomName {
    @NotEmpty
    private final String value;
}
