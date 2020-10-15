package de.oneaxis.backend.tactical.storytelling;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("symptoms")
public class SymptomController {

    private final SymptomRepository symptomRepository;

    public SymptomController(SymptomRepository symptomRepository) {
        this.symptomRepository = symptomRepository;
    }

    @PostMapping
    public Symptom createSymptom(@RequestBody Symptom symptom) {
        return this.symptomRepository.save(symptom);
    }

    @DeleteMapping("{symptomId}")
    public void deleteSymptom(@PathVariable String symptomId) {
        this.symptomRepository.deleteById(new SymptomId(symptomId));
    }

    @GetMapping
    public List<Symptom> getAllSymptoms() {
        return this.symptomRepository.findAll();
    }

    @GetMapping("{symptomId}")
    public Symptom getSymptomById(@PathVariable String symptomId) {
        return this.symptomRepository.findById(new SymptomId(symptomId)).orElseThrow();
    }
}
