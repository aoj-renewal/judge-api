package jp.ac.u_aizu.judge.problem;

import jp.ac.u_aizu.judge.ResponseUtil;
import jp.ac.u_aizu.judge.auth.SessionID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;

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
        return ResponseEntity.ok(ResponseUtil.applyPager(problemRepository, page, size));
    }
}
