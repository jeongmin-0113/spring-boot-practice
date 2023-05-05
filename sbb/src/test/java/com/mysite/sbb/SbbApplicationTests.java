package com.mysite.sbb;

import com.mysite.sbb.answer.Answer;
import com.mysite.sbb.answer.AnswerRepository;
import com.mysite.sbb.question.QuestionService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.mysite.sbb.question.Question;
import com.mysite.sbb.question.QuestionRepository;

import java.time.LocalDateTime;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class SbbApplicationTests {

	@Autowired
	private QuestionService questionService;
	@Test
	void testJpa() {
		for (int i=1; i<=300; i++) {
			String subject = String.format("테스트 데이터!![%03d]", i);
			String content = "ㅎㅎㅋ";
			this.questionService.create(subject, content);
		}
	}
}
