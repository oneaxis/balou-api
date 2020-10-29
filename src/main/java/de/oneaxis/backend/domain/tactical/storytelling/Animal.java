package de.oneaxis.backend.domain.tactical.storytelling;

import de.oneaxis.backend.domain.strategic.Entity;
import lombok.Builder;
import lombok.Data;

import java.time.Instant;

@Entity
@Data
@Builder
public class Animal {

    private final AnimalId animalId;
    private final AnimalCharacteristics animalCharacteristics;
    private final Instant createdAt;
    private Instant deletedAt, updatedAt;
}
