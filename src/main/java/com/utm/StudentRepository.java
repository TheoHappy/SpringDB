package com.utm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Student> findAll() {
        return jdbcTemplate.query(
                "SELECT * FROM Student",
                (reponse, rownumber) ->
                        new Student(reponse.getInt("studentid"),
                                reponse.getString("firstName"),
                                reponse.getString("lastname"),
                                reponse.getString("gender"),
                                reponse.getString("group"),
                                reponse.getDouble("average")));
    }

    public void save(Student student) {
        jdbcTemplate.update(
                "INSERT INTO Student(firstName, lastName, gender, \"group\", average) VALUES(?,?,?,?,?)",
                student.getFirstName(), student.getLastName(), student.getGender(), student.getGroup(), student.getAverage());
    }

    public void delete(String firstName){
        jdbcTemplate.update(
                "DELETE FROM Student WHERE firstName = ?",firstName);
    }


}
