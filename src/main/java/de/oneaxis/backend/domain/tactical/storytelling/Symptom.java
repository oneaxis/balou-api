package de.oneaxis.backend.domain.tactical.storytelling;

import de.oneaxis.backend.domain.strategic.Entity;
import lombok.Builder;
import lombok.Data;

import java.time.Instant;

@Entity
@Data
@Builder
public class Symptom {
    private final SymptomId symptomId;
    private final SymptomName symptomName;
    private final SymptomDescription symptomDescription;
    private final Instant createdAt;
    private Instant deletedAt, updatedAt;
}
