package de.oneaxis.backend.domain.tactical.storytelling;

import de.oneaxis.backend.domain.strategic.ValueObject;
import lombok.Builder;
import lombok.Value;

@ValueObject
@Value
@Builder
public class Race {
    private final String value;
}
