package com.mars.TerraformingMarsVPCounter.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter
public class Yellow {

    @Id
    private String name = "Pifta";
    private Integer currentPoints ;
    private Integer totalScore;
}
