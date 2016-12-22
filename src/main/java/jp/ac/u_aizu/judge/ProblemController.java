package jp.ac.u_aizu.judge;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import javax.validation.Valid;

@Controller
public class ProblemController {
    @Inject
    private SessionID sessionID;
    @Autowired
    private ProblemRepository problemRepository;


    @RequestMapping(value = "/problems", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<Iterable<Problem>> findAll(
            @RequestParam(value = "page", required = false, defaultValue = "-1") int page,
            @RequestParam(value = "size", required = false, defaultValue = "-1") int size
    ) {
        return sessionID.ifAuthenticated(ignore ->
                ResponseUtil.applyPager(problemRepository, page, size)
        );
    }
}
