package com.mysite.sbb;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest
class SbbApplicationTests {

	@Autowired
	private QuestionRepository questionRepository;
	@Test
	void testJpa() {
		Question q1 = new Question();
		q1.setSubject("sbb가 머임요?");
		q1.setContent("알려주셈ㅜ");
		q1.setCreateDate(LocalDateTime.now());
		this.questionRepository.save(q1);

		Question q2 = new Question();
		q2.setSubject("스프링부트 모델 질문");
		q2.setContent("id 자동 생성됨?");
		q2.setCreateDate(LocalDateTime.now());
		this.questionRepository.save(q2);
	}

}
