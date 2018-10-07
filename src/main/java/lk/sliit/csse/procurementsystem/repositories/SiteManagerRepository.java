package lk.sliit.csse.procurementsystem.repositories;

import java.util.List;
import lk.sliit.csse.procurementsystem.models.SiteManager;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface SiteManagerRepository extends EmployeeBaseRepository<SiteManager> {
    SiteManager findByFirstName(String firstName);
    
    @Query("select s from SiteManager s where s.firstName like %?1")
    List<SiteManager> findByFirstnameEndsWith(String firstname);
}
