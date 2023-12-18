package com.heiwa.surveyapp.model;


import javax.persistence.*;
import java.io.Serializable;

@MappedSuperclass
public class BaseEntity implements Serializable {
   @Id
   @GeneratedValue(strategy = GenerationType.TABLE)
   @Column(name = "id", nullable = false)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
