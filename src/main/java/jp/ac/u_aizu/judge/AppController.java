package jp.ac.u_aizu.judge;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import javax.validation.Valid;
import java.util.Optional;

@Controller
public class AppController {
    @Inject
    private SessionID sessionID;
    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = "/session", method = RequestMethod.POST, consumes = "application/json")
    @ResponseBody
    public ResponseEntity<User> login(@RequestBody @Valid LoginInfo loginInfo) {
        final String id = "abab"; /* loginInfo.getId(); */
        final String encryptedPass = "atamfoopsu@r"; /* TODO: ここで暗号化処理!  loginInfo.getPassword(); */

        Optional<User> userOpt = Optional.of(userRepository.findByIdAndPassword(id, encryptedPass).get(0));
        return userOpt.map(user -> {
            sessionID.setUser(user);
            return ResponseEntity.ok(user);
        }).orElse(
                ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(null)
        );
    }

    @RequestMapping(value = "/session", method = RequestMethod.DELETE)
    @ResponseBody
    public ResponseEntity<Void> logout() {
        sessionID.clearUser();
        return ResponseEntity.ok(null);
    }
}
