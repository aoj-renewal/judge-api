package jp.ac.u_aizu.judge.auth;

import javax.validation.constraints.NotNull;

public class LoginInfo {
    @NotNull
    private String id;
    @NotNull
    private String password;

    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }
}
