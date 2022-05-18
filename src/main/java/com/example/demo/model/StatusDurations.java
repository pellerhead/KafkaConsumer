package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class StatusDurations {
    private Long onDutyNotDriving;
    private Long driving;
    private Long sleeperBerth;
    private Long offDuty;
}