package lk.sliit.csse.procurementsystem.repositories;

import lk.sliit.csse.procurementsystem.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface UserBaseRepository<T extends User> extends JpaRepository<T, Long> {
}
