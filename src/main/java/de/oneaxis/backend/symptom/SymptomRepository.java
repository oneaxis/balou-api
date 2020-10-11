package de.oneaxis.backend.symptom;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SymptomRepository extends MongoRepository<Symptom, SymptomId> {
}
