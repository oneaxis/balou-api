package de.oneaxis.backend.domain.tactical.storytelling;

import de.oneaxis.backend.domain.strategic.Entity;
import lombok.Builder;
import lombok.Data;

import javax.validation.Valid;
import java.time.Instant;

@Entity
@Data
@Builder
public class Animal {
    @Valid
    private final AnimalId animalId;
    @Valid
    private final AnimalCharacteristics animalCharacteristics;
    private final Instant createdAt;
    private Instant deletedAt, updatedAt;
}
