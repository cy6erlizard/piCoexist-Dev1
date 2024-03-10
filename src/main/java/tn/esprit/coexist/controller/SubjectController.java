package tn.esprit.coexist.controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.coexist.entity.Subject;
import tn.esprit.coexist.service.Subject.SubjectService;
import tn.esprit.coexist.service.Subject.SubjectServiceImp;

import java.util.List;

@RestController
@AllArgsConstructor
public class SubjectController {
    @Autowired
    SubjectServiceImp subjectService ;
    @CrossOrigin(origins = "http://localhost:4200")

    @PostMapping("/add-Subject")
    @ResponseBody
    public Subject addSubject(@RequestBody Subject b) {

        return subjectService.add(b);
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/get_all_Subjects")
    public List<Subject> findAll() {
        return subjectService.findAll();
    }
    @CrossOrigin(origins = "http://localhost:4200", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE, RequestMethod.OPTIONS})
    @PutMapping("/updateSubject/{id}")
    public Subject update(@RequestBody Subject Subject ,@PathVariable("id") Integer id) {
        return subjectService.update(id,Subject);
    }
    @CrossOrigin(origins = "http://localhost:4200", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE, RequestMethod.OPTIONS})
    @DeleteMapping("/deleteSubject/{SubjectId}")
    public void delete(@PathVariable("SubjectId") Integer SubjectId) {
        subjectService.delete(SubjectId);
    }

}
