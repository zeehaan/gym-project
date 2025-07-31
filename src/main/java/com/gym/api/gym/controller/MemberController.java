package com.gym.api.gym.controller;


import java.io.IOException;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.gym.api.gym.Dto.MemberDto;
import com.gym.api.gym.domain.Member;
import com.gym.api.gym.service.MemberService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/members")
@CrossOrigin(origins = "http://localhost:8080", allowCredentials = "true")
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService ;

    @GetMapping
    public ResponseEntity<List<MemberDto>> getAllMembers() {
        return ResponseEntity.ok(memberService.getAllMembers());
    }

    @PostMapping("/add")
    public ResponseEntity<String> addMembers(@RequestBody Member member) {
        return ResponseEntity.ok(memberService.addMember(member));
    }

    @GetMapping("/testing")
    public ResponseEntity<Long> addMembers(@RequestBody Long integer) throws IOException {
        return ResponseEntity.ok(memberService.testingString(integer));
    }
}
