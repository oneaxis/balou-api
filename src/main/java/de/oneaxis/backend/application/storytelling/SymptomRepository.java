package de.oneaxis.backend.application.storytelling;

import de.oneaxis.backend.domain.tactical.storytelling.Symptom;
import de.oneaxis.backend.domain.tactical.storytelling.SymptomId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SymptomRepository extends MongoRepository<Symptom, SymptomId>, de.oneaxis.backend.domain.tactical.storytelling.SymptomRepository {
}
