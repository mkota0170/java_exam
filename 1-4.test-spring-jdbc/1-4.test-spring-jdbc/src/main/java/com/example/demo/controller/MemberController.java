package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.domain.Member;
import com.example.demo.repository.MemberRepository;

@Controller
@RequestMapping("/member")
public class MemberController {
	@Autowired
	private MemberRepository repository;

	@RequestMapping("")
	public String index() {
		// 問題5
		System.out.println(repository.findAll());
		System.out.println(repository.load(2));

		// 問題6
		Member member = new Member();
		member.setAge(24);
		member.setDepId(2);
		member.setName("松花虎太郎");
		repository.save(member);
		member = repository.load(2);
		member.setName("シロー");
		repository.save(member);

		return "member"; 
	}
}
