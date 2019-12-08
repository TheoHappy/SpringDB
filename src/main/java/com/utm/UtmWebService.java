package com.utm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/university/")
public class UtmWebService {

    @Autowired
    StudentRepository studentRepository;

    @GetMapping("student")
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @PostMapping("student")
    public void save(@RequestBody Student student) {
        studentRepository.save(student);
    }

    @DeleteMapping("student/{firstName}")
    public void delete(@PathVariable String firstName) {
        studentRepository.delete(firstName);
    }
}
