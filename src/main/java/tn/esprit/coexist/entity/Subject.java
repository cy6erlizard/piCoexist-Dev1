package tn.esprit.coexist.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Data
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer subjectId;
    private String subjectTitle;
    private Date date;
    private  String content;
    private String image;
    private Integer likes;
    private Integer dislikes;


    @OneToMany(mappedBy = "subject")
    private List<Comment> comments;
    @OneToMany(mappedBy = "subject" ,cascade = CascadeType.ALL)
    private  List<React> reacts;

}
