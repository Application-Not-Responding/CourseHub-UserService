package com.siri_hate.coursehub_user_service.controller;

import com.siri_hate.coursehub_user_service.entity.user_content.Organizer;
import com.siri_hate.coursehub_user_service.entity.user_content.Student;
import com.siri_hate.coursehub_user_service.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    private final UserService userService;

    UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register/student")
    ResponseEntity<Student> registerNewStudent(@RequestBody Student student) {
        Student newStudent = userService.registerNewStudent(student);
        return new ResponseEntity<>(newStudent, HttpStatus.CREATED);
    }

    @PostMapping("/register/organizer")
    ResponseEntity<Organizer> registerNewOrganizer(@RequestBody Organizer organizer) {
        Organizer newOrganizer = userService.registerNewOrganizer(organizer);
        return new ResponseEntity<>(newOrganizer, HttpStatus.CREATED);
    }

}
