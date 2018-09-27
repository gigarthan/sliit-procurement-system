package lk.sliit.csse.procurementsystem.repositories;

import lk.sliit.csse.procurementsystem.models.Items;
import lk.sliit.csse.procurementsystem.models.OrderedItems;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.transaction.annotation.Transactional;

@NoRepositoryBean
public interface OrderedItemsRepository <T extends OrderedItems> extends JpaRepository<T, String>{
        //ItemsRepository<OrderedItems>  {
}
