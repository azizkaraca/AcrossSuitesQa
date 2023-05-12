package AcrossAPI.POJO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Login {

    private String email;
    private String password;

    @Override
    public String toString() {
        return "Login{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
