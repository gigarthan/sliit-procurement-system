package lk.sliit.csse.procurementsystem.controllers;

import lk.sliit.csse.procurementsystem.models.AccountingStaff;
import lk.sliit.csse.procurementsystem.models.ProcurementStaff;
import lk.sliit.csse.procurementsystem.models.SiteManager;
import lk.sliit.csse.procurementsystem.repositories.AccountingStaffRepository;
import lk.sliit.csse.procurementsystem.repositories.ProcurementStaffRepository;
import lk.sliit.csse.procurementsystem.repositories.SiteManagerRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

import javax.inject.Named;
import java.util.List;
import lk.sliit.csse.procurementsystem.models.Category;
import lk.sliit.csse.procurementsystem.models.Order;
import lk.sliit.csse.procurementsystem.models.Items;
import lk.sliit.csse.procurementsystem.repositories.CategoryRepository;
import lk.sliit.csse.procurementsystem.repositories.ItemsRepository;
import lk.sliit.csse.procurementsystem.repositories.OrderRepository;


@Data
@Named
public class SiteManagerController {

    private Order order = new Order();
    private Items items = new Items();
    private Category category = new Category();
    
//    @Autowired
    private OrderRepository orderRepository;

//    @Autowired

//    @Autowired
    private ItemsRepository itemsRepository;

    private CategoryRepository categoryRepository;
    
//    public boolean addNewManager() {
//        siteManager.setEnabled(true);
//        siteManager.setPassword(new BCryptPasswordEncoder().encode("1234"));
//        siteManagerRepository.save(siteManager);
//        this.siteManager = new SiteManager();
//        return true;
//    }
    
//    public void addNewProcurementStaff() {
//        procurementStaff.setEnabled(true);
//        procurementStaffRepository.save(procurementStaff);
//        this.procurementStaff = new ProcurementStaff();
//    }

    

//    public List<SiteManager> getSiteMangers() {
//        return siteManagerRepository.findAll();
//    }

    


}
