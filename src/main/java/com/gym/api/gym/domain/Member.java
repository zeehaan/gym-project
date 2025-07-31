package com.gym.api.gym.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "members")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private String firstName;
    
    @Column(nullable = false)
    private String lastName;
    
    @Column(nullable = false, unique = true)
    private String email;
    
    private int age;
    private double amount;
    
    @Column(name = "phone_number")
    private String phoneNo;
    
    private int membership; 
    
    @Enumerated(EnumType.STRING)
    private MemberShipType memberShipType;
    
    public enum MemberShipType {
        PAID, NOT_PAID, EXPIRED
    }
}