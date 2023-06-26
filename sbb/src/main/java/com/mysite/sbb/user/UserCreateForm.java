package com.mysite.sbb.user;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserCreateForm {
    // username, email, password 작성해야 함.
    @Size(min = 3, max = 25)
    @NotEmpty(message = "ID는 필수 항목입니다.")
    private String username;

    @NotEmpty(message = "비밀번호는 필수 항목입니다.")
    private String password1;

    @NotEmpty(message = "비밀번호 확인은 필수 항목입니다.")
    private String password2;

    @NotEmpty(message = "닉네임은 필수 항목입니다.")
    private String nickname;

    @NotEmpty(message = "이메일은 필수 항목입니다.")
    @Email
    private String email;
}
