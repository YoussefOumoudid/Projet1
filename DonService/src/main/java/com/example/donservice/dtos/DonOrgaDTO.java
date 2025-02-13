package com.example.donservice.dtos;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@NoArgsConstructor
@AllArgsConstructor
public class DonOrgaDTO {
    private Long id;
    private Long organisationId;
    private String title;
    private String description;
    private double montantToAchieve;
    private double currentAmount;
    private boolean isAchieved;
}