package de.oneaxis.backend.symptom;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("symptoms")
public class SymptomController {

    @PostMapping
    public Symptom createSymptom(Symptom symptom) {
        return symptom;
    }
}
