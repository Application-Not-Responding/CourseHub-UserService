package com.siri_hate.coursehub_user_service.entity.test_content;

import com.siri_hate.coursehub_user_service.entity.course_content.Topic;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "test")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Test {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "test_id")
    Integer id;

    @Column(name = "question_text")
    String questionText;

    @Column(name = "question_points")
    String questionPoints;

    @ElementCollection
    @CollectionTable(name = "answers", joinColumns = @JoinColumn(name = "id"))
    @Column(name = "answer")
    List<String> answers;

    @Column(name = "right_answer")
    Integer rightAnswer;

    @ManyToOne
    @JoinColumn(name = "topic_id")
    private Topic topic;

}
