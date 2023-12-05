package com.siri_hate.coursehub_user_service;

import com.siri_hate.coursehub_user_service.entity.user_content.Organizer;
import com.siri_hate.coursehub_user_service.entity.user_content.Student;
import com.siri_hate.coursehub_user_service.repository.OrganizerRepository;
import com.siri_hate.coursehub_user_service.repository.StudentRepository;
import com.siri_hate.coursehub_user_service.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.testng.Assert;

import static org.mockito.Mockito.when;

@SpringBootTest
class CourseHubAccountServiceApplicationTests {

    @Autowired
    UserService userService;

    @MockBean
    OrganizerRepository organizerRepository;

    @MockBean
    StudentRepository studentRepository;

    @Test
    void createStudentTest() {

        Student student = new Student(1, "Test", "Test", "Test", null, null);

        when(studentRepository.save(student)).thenReturn(student);

        Assert.assertEquals(student, userService.registerNewStudent(student));
    }

    @Test
    void createOrganizerTest() {
        Organizer organizer = new Organizer(1, "Test", "Test", "Test", "Test", null);

        when(organizerRepository.save(organizer)).thenReturn(organizer);

        Assert.assertEquals(organizer, userService.registerNewOrganizer(organizer));
    }

}
