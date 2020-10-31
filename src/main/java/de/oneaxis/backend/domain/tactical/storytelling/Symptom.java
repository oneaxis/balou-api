package de.oneaxis.backend.domain.tactical.storytelling;

import de.oneaxis.backend.domain.strategic.Entity;
import lombok.Builder;
import lombok.Data;

import javax.validation.Valid;
import java.time.Instant;

@Entity
@Data
@Builder
public class Symptom {
    @Valid
    private final SymptomId symptomId;
    @Valid
    private final SymptomName symptomName;
    @Valid
    private final SymptomDescription symptomDescription;
    private final Instant createdAt;
    private Instant deletedAt, updatedAt;
}
