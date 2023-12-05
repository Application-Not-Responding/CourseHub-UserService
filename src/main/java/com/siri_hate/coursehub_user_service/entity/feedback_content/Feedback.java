package com.siri_hate.coursehub_user_service.entity.feedback_content;

import com.siri_hate.coursehub_user_service.entity.course_content.Course;
import com.siri_hate.coursehub_user_service.entity.user_content.Student;
import jakarta.persistence.*;

@Entity
@Table(name = "feedback")
public class Feedback {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "feedback_id")
    Integer id;

    @ManyToOne
    @JoinColumn(name = "course_id")
    Course course;

    @ManyToOne
    @JoinColumn(name = "student_id")
    Student student;

    @Column(name = "feedback_text")
    String feedbackText;

    @Column(name = "rating")
    Integer rating;

}
