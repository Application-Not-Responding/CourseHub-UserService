package com.siri_hate.coursehub_user_service.entity.course_content;

import com.siri_hate.coursehub_user_service.entity.test_content.Test;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "topic")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Topic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "topic_id")
    Integer id;

    @Column(name = "name")
    String name;

    @Column(name = "description")
    String description;

    @OneToMany
    @JoinColumn(name = "topic")
    List<Lesson> lessonList;

    @OneToOne(mappedBy = "topic")
    private Test test;

}
