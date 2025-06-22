package com.library.assignment2.service;

import com.library.assignment2.model.Member;
import com.library.assignment2.interface2.MemberRepository;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class MemberService {

    private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    // Get all members
    public Flux<Member> getAll() {
        return memberRepository.findAll();
    }

    // Get member by ID
    public Mono<Member> getById(final String id) {
        return memberRepository.findById(id);
    }

    // Save a member
    public Mono<Member> save(final Member member) {
        return memberRepository.save(member);
    }
}
