package com.siri_hate.coursehub_user_service.service;

import com.siri_hate.coursehub_user_service.entity.user_content.Organizer;
import com.siri_hate.coursehub_user_service.entity.user_content.Student;

public interface UserService {

    Student registerNewStudent(Student student);

    Organizer registerNewOrganizer(Organizer organizer);

}
