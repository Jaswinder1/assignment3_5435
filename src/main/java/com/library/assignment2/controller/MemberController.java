package com.library.assignment2.controller;
import com.library.assignment2.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import org.springframework.web.bind.annotation.*;
import com.library.assignment2.model.Member;

@RestController
@RequestMapping("/member")
public class MemberController {
	private final MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("/{id}")
    public Mono<Member> getMemberById(@PathVariable String id) {
        return memberService.getById(id);
    }

    @GetMapping
    public Flux<Member> getAllMembers() {
        return memberService.getAll();
    }

    @PostMapping
    public Mono<Member> saveMember(@RequestBody Member member) {
        return memberService.save(member);
    }
    //for testing purpose
    @RequestMapping(value = "/member", method = RequestMethod.GET)
    public Member getMember() {
        Member member = new Member();
        member.setMemb_id(1001);
        member.setName("John Doe");
        member.setAddress("123 Main Street");
        member.setMemb_type("Annual");
        member.setMemb_date("2024-06-21");
        member.setExpiry_date("2025-12-31");
        return member;
    }
}
