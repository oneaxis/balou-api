package de.oneaxis.backend.domain.tactical.storytelling;

import de.oneaxis.backend.domain.strategic.ValueObject;
import lombok.Builder;
import lombok.Value;

@ValueObject
@Value
@Builder
class AnimalId {
    private final String value;
}
