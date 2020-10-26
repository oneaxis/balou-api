package de.oneaxis.backend.domain.tactical.storytelling;

import de.oneaxis.backend.domain.strategic.Entity;
import lombok.Builder;
import lombok.Data;

@Entity
@Data
@Builder
class Symptom {
    private final SymptomId symptomId;
    private final SymptomName symptomName;
    private final SymptomDescription symptomDescription;
}
