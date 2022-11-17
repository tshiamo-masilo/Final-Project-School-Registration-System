package testing.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import testing.demo.model.School;
import testing.demo.services.SchoolService;

import java.util.List;

@RestController
@RequestMapping("/School")
public class SchoolController {
    @Autowired
    private SchoolService schoolService;

    @PostMapping("/saveSchool")
    @CrossOrigin
    public School saveSchool(@RequestBody School school) {

        return schoolService.saveSchool(school);
    }

    @GetMapping("/getSchool/{id}")
    public School findSchoolById(@PathVariable Long id) {

        return schoolService.findSchoolById(id);
    }

    @GetMapping("/getAllSchool")
    public List<School> findAllSchool() {

        return schoolService.getAllSchools();
    }

    @DeleteMapping("/deleteSchool/{id}")
    public String deleteSchoolById(@PathVariable Long id) {

        return schoolService.deleteSchoolById(id);
    }
}
