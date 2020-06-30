package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spi.spi.model.Jedy;

@Repository
public interface JedyRepository extends JpaRepository<Jedy, Long> {

}
