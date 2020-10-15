package de.oneaxis.backend.tactical.story;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SymptomRepository extends MongoRepository<Symptom, SymptomId> {
}
