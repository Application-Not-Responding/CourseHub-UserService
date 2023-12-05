package com.siri_hate.coursehub_user_service.service;

import com.siri_hate.coursehub_user_service.entity.user_content.Organizer;
import com.siri_hate.coursehub_user_service.entity.user_content.Student;
import com.siri_hate.coursehub_user_service.repository.OrganizerRepository;
import com.siri_hate.coursehub_user_service.repository.StudentRepository;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final StudentRepository studentRepository;

    private final OrganizerRepository organizerRepository;


    UserServiceImpl(StudentRepository studentRepository, OrganizerRepository organizerRepository) {
        this.studentRepository = studentRepository;
        this.organizerRepository = organizerRepository;
    }

    @Override
    public Student registerNewStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Organizer registerNewOrganizer(Organizer organizer) {
        return organizerRepository.save(organizer);
    }

}
