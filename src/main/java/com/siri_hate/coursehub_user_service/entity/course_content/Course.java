package com.siri_hate.coursehub_user_service.entity.course_content;

import com.siri_hate.coursehub_user_service.entity.feedback_content.Feedback;
import com.siri_hate.coursehub_user_service.entity.user_content.Organizer;
import com.siri_hate.coursehub_user_service.entity.user_content.Student;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "course")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "course_id")
    Integer id;

    @Column(name = "name")
    String name;

    @Column(name = "description")
    String description;

    @ManyToOne
    @JoinColumn(name = "organizer_id")
    Organizer organizer;

    @ManyToMany
    @JoinTable(
            name = "course_students_list",
            joinColumns = @JoinColumn(name = "course_id"),
            inverseJoinColumns = @JoinColumn(name = "student_id")
    )
    List<Student> studentsList;

    @OneToMany
    @JoinColumn(name = "course")
    List<Topic> topicList;

    @OneToMany
    @JoinColumn(name = "course")
    List<Feedback> feedbackList;

    @Column(name = "is_hide")
    Boolean isHide;

}
