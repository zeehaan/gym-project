package com.gym.api.gym.Dto;

import com.gym.api.gym.domain.Member;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MemberDto {
    private String firstName;
    private String lastName;
    private String email;
    private int age;
    private double amount;
    private String phoneNo;
    private int membership;
    private Member.MemberShipType memberShipType;
}