package com.mars.TerraformingMarsVPCounter.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "green")
@Getter
@Setter
public class Green {

    @Id
    private String name = "Cöccentyű";
    private Integer currentPoints;
    private Integer cityTag;
    private Integer eventTag;
    private Integer earthTag;
    private Integer plantTag;
    private Integer microbeTag;
    private Integer spaceTag;
    private Integer jovianTag;
    private Integer scienceTag;
    private Integer buildingTag;
    private Integer animalTag;
    private Integer powerTag;
    private Integer totalScore;

    public Green() {
    }
}
