package org.chandima.jobapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;
import org.springframework.stereotype.Component;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Component
@Entity
public class JobPost {

    @Id
    private int postId;
    private String postProfile;
    private String postDesc;
    private Integer reqExperience;
    private List<String> postTechStack;
}
