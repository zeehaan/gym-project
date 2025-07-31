package com.gym.api.gym.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import com.gym.api.gym.Dto.MemberDto;
import com.gym.api.gym.Repository.MemberRepository;
import com.gym.api.gym.domain.Member;

import java.util.List;
import java.util.stream.Collectors;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;

    public List<MemberDto> getAllMembers() {
        return memberRepository.findAll().stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }

    private MemberDto convertToDto(Member member) {
        return MemberDto.builder()
                .firstName(member.getFirstName())
                .lastName(member.getLastName())
                .email(member.getEmail())
                .age(member.getAge())
                .amount(member.getAmount())
                .phoneNo(member.getPhoneNo())
                .membership(member.getMembership())
                .memberShipType(member.getMemberShipType())
                .build();
    }

    public String addMember(Member member) {
        memberRepository.save(member);
        return "Members Saved";
    }

    public Long testingString(Long integer) throws IOException {
        File f=new File("abc.txt");
        FileReader fr=new FileReader(f);
         for (int i = 0; i <f.length() ; i++) {
             System.out.println((char)fr.read());
         }
         fr.close();
         return 2l;
    }
}
