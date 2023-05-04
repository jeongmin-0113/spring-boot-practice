package com.mysite.sbb.question;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class QuestionForm {
    @NotEmpty(message = "제목은 필수 항목입니다.")
    @Size(max = 200, message = "제목의 길이가 너무 깁니다.")
    private String subject;

    @NotEmpty(message = "내용은 필수 항목입니다.")
    private String content;
}
