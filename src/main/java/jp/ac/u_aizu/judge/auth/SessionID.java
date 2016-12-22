package jp.ac.u_aizu.judge.auth;

import jp.ac.u_aizu.judge.user.User;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Optional;
import java.util.function.Function;

@Component
@Scope(value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class SessionID implements Serializable {
    private static final long serialVersionUID = 1L;
    private Optional<User> user;

    public SessionID() {
        this.user = Optional.empty();
    }

    public SessionID(User user) {
        this.user = Optional.of(user);
    }

    public Optional<User> getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = Optional.of(user);
    }

    public void clearUser() {
        this.user = Optional.empty();
    }

    public <T> ResponseEntity<T> ifAuthenticated(Function<User, T> sessionScope) {
        return getUser().map(user -> ResponseEntity.ok(sessionScope.apply(user)))
                .orElse(ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(null));
    }
}


