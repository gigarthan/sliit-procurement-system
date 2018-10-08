package lk.sliit.csse.procurementsystem.repositories;

import java.util.List;
import lk.sliit.csse.procurementsystem.models.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface SupplierRepository extends JpaRepository<Supplier, Integer> {
    List<Supplier> findByBlackListedFalse();
    
    //set BlackListed = true/false;
    @Modifying
    @Query("update Supplier s set s.blackListed = ?1 where s.name = ?2")
    int setBlackListedFor(Supplier supplier, String name);
}
