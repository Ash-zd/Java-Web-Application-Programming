package javaweb.repository;

import javaweb.entity.Lmenu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LmenuRepository extends JpaRepository<Lmenu, Long> {

    Lmenu findLmenuByLname(String name);
}
