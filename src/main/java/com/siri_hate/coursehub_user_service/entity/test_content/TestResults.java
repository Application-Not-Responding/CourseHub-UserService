package com.siri_hate.coursehub_user_service.entity.test_content;

import com.siri_hate.coursehub_user_service.entity.user_content.Student;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "test_results")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TestResults {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "test_results_id")
    Integer id;

    @Column(name = "name")
    String name;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    @Column(name = "correct_answers")
    Integer correctAnswers;

    @Column(name = "questions_number")
    Integer questionsNumber;

    @Column(name = "completion_percentage")
    Float completionPercentage;

    @Column(name = "completion_date")
    LocalDateTime completionDate;

}
