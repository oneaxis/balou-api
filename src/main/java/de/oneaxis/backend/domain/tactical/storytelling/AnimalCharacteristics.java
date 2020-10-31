package de.oneaxis.backend.domain.tactical.storytelling;

import de.oneaxis.backend.domain.strategic.ValueObject;
import lombok.Builder;
import lombok.Value;

import javax.validation.Valid;

@ValueObject
@Value
@Builder
public class AnimalCharacteristics {
    @Valid
    private final Species species;
    @Valid
    private final Race race;
}
