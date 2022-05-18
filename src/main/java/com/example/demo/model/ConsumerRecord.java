package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ConsumerRecord {
    private String externalUserId;
    private int userId;
    private String date;
    private StatusDurations statusDurations;
    private int distancePerDay;
}