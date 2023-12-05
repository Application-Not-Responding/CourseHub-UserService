package com.siri_hate.coursehub_user_service.entity.test_content;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "question")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "question_id")
    Integer id;

    @Column(name = "name")
    String name;

    @Column(name = "correct_answers")
    Integer correctAnswers;

    @Column(name = "questions_number")
    Integer questionsNumber;

    @Column(name = "completion_percentage")
    Float completionPercentage;

    @Column(name = "completion_date")
    LocalDateTime completionDate;

}
