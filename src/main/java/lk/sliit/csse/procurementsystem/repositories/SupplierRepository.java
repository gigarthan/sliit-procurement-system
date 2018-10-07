package lk.sliit.csse.procurementsystem.repositories;

import lk.sliit.csse.procurementsystem.models.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface SupplierRepository extends JpaRepository<Supplier, Integer> {
}
