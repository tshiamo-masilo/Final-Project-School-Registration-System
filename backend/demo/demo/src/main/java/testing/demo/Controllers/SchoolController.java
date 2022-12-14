package testing.demo.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import testing.demo.Services.SchoolService;
import testing.demo.model.School;

import java.util.List;

@RestController
@RequestMapping("/School")
public class SchoolController {
    @Autowired
    private SchoolService schoolService;


    @PostMapping("/saveSchool")
    public School saveSchool(@RequestBody School school){

        return schoolService.saveSchool(school) ;
    }

    @GetMapping("/getSchool/{id}")
    public School findSchoolById(@PathVariable int id){

        return schoolService.findSchoolById(id);
    }

    @GetMapping("/getAllSchool")
    public List<School> findAllSchool(){

        return schoolService.getAllSchools();
    }


    @DeleteMapping("/deleteSchool/{id}")
    public String deleteSchoolById(@PathVariable int id){

        return schoolService.deleteSchoolById(id);
    }
}
