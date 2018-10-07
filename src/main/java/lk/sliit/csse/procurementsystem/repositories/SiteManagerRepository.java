package lk.sliit.csse.procurementsystem.repositories;

import java.util.List;
import lk.sliit.csse.procurementsystem.models.SiteManager;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface SiteManagerRepository extends EmployeeBaseRepository<SiteManager> {
    SiteManager findByFirstName(String firstName);
    
    SiteManager findByFirstNameAndLastName(String firstName, String lastName);
    
    @Query("select s from SiteManager s where s.firstName like %?1")
    List<SiteManager> findByFirstnameEndsWith(String firstname);
    
    @Query("select s from SiteManager s where s.firstName like %?1% or s.lastName like %?2%")
    List<SiteManager> findByFirstnameContainingOrLastnameContaining(String firstname, String lastname);
}
