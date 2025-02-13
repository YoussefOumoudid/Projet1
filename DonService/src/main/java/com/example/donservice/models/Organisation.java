package com.example.donservice.models;


import lombok.Data;



@Data
public class Organisation {
    private Long id;
    private String name;
    private String description;
    private String contactEmail;
    private String phoneNumber;
    private String address;
    private boolean isVerified;



}

