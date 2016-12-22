package jp.ac.u_aizu.judge;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

public interface ProblemRepository extends PagingAndSortingRepository<Problem, Long> {
}
