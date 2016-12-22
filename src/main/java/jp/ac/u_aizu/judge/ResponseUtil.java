package jp.ac.u_aizu.judge;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.io.Serializable;

public class ResponseUtil {
    public static <T, U extends Serializable> Iterable<T> applyPager(
            PagingAndSortingRepository<T, U> repository, int page, int size) {
        if (page < 0 || size <= 0) {
            return repository.findAll();
        } else {
            return repository.findAll(new PageRequest(page, size)).getContent();
        }
    }
}
