package javaweb.repository;

import javaweb.entity.Lmenu;
import javaweb.entity.News;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NewsRepository extends JpaRepository<News, Long> {
    List<News> findAllByLmenu(Lmenu lmenu);
}
