package jp.ac.u_aizu.judge.user;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends PagingAndSortingRepository<User, Long> {
    List<User> findByIdAndPassword(@Param("ID") String id, @Param("PASSWORD") String password);
}
