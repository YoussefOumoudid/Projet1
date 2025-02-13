package com.example.donservice.dtos;


import com.example.donservice.models.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDonDTO {
    private Long id;
    private double amount;
    private LocalDate localDate;
    private User user;
}
