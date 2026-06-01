package ma.ms.generateprojectservice.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/generate")
public class GenerateConroller {

    @GetMapping("/health")
    public ResponseEntity<String> health() {
        return ResponseEntity.ok("Generate Service is UP!");
    }
}