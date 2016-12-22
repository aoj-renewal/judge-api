package jp.ac.u_aizu.judge.source;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SourceRepository extends PagingAndSortingRepository<Source, Long> {
    List<Source> findByAbbr(@Param("ABBR") String abbr);
}
