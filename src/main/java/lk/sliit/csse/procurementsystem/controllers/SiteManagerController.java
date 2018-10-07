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
import java.util.Optional;
import lk.sliit.csse.procurementsystem.models.Category;
import lk.sliit.csse.procurementsystem.models.Order;
import lk.sliit.csse.procurementsystem.models.Items;
import lk.sliit.csse.procurementsystem.repositories.CategoryRepository;
import lk.sliit.csse.procurementsystem.repositories.ItemsRepository;
import lk.sliit.csse.procurementsystem.repositories.OrderRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@Data
@Named
@RestController
public class SiteManagerController {

    private Order order = new Order();
    private Items items = new Items();
    private Category category = new Category();
    
    @Autowired
    private OrderRepository orderRepository;


    
    public void addOrder() {
        orderRepository.save(order);
        this.order = new Order();
//        return true;
    }
    
//    public void addNewProcurementStaff() {
//        procurementStaff.setEnabled(true);
//        procurementStaffRepository.save(procurementStaff);
//        this.procurementStaff = new ProcurementStaff();
//    }

    

//    public List<SiteManager> getSiteMangers() {
//        return siteManagerRepository.findAll();
//    }
    public List<Order> getOrders() {
        return orderRepository.findAll();
    }
    
    public Optional getOrderById(){
        Optional theOrder = orderRepository.findById("1");
        
        if(theOrder==null)
            return null;
        return theOrder;

    }

    


}
