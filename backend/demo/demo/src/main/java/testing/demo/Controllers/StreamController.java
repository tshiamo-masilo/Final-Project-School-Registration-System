package testing.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import testing.demo.entities.Stream;
import testing.demo.services.StreamService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/stream")
public class StreamController {
    @Autowired
    private StreamService repository;
    
    @PostMapping("/save")
    public ResponseEntity<Stream> saveStream(Stream requirements) {
        return new ResponseEntity<>(repository.saveStream(requirements), HttpStatus.CREATED);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Optional<Stream>> getStreamById(@PathVariable Long id) {
        return ResponseEntity.ok(repository.getStreamById(id));
    }

    @GetMapping("/getAll")
    public ResponseEntity<List> getUser() {
        return ResponseEntity.ok(repository.getAllStreams());
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteRequirementById(@PathVariable Long id) {
        return ResponseEntity.ok(repository.deleteStreamById(id));
    }

    @DeleteMapping("/deleteAll")
    public ResponseEntity<String> deleteStream() {
        return ResponseEntity.ok(repository.deleteAllStream());
    }

    
}
