package lk.sliit.csse.procurementsystem.repositories;

import lk.sliit.csse.procurementsystem.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface RoleRepository extends JpaRepository<Role, Integer> {
}
