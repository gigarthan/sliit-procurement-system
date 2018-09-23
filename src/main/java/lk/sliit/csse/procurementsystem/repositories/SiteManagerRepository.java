package lk.sliit.csse.procurementsystem.repositories;

import lk.sliit.csse.procurementsystem.models.SiteManager;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface SiteManagerRepository extends EmployeeBaseRepository<SiteManager> {
}
