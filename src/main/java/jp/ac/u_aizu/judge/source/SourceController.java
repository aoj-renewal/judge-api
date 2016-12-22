package jp.ac.u_aizu.judge.source;

import jp.ac.u_aizu.judge.ResponseUtil;
import jp.ac.u_aizu.judge.auth.SessionID;
import jp.ac.u_aizu.judge.problem.ProblemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.parsing.Problem;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.inject.Inject;

@Controller
public class SourceController {
    @Autowired
    private SourceRepository sourceRepository;


    @RequestMapping(value = "/sources", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<Iterable<Source>> findAll(
            @RequestParam(value = "page", required = false, defaultValue = "-1") int page,
            @RequestParam(value = "size", required = false, defaultValue = "-1") int size
    ) {
        return ResponseEntity.ok(ResponseUtil.applyPager(sourceRepository, page, size));
    }
}
