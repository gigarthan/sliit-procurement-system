package lk.sliit.csse.procurementsystem.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;
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
import lk.sliit.csse.procurementsystem.models.ItemList;
import lk.sliit.csse.procurementsystem.models.MaterialRequest;
import lk.sliit.csse.procurementsystem.models.Items;
import lk.sliit.csse.procurementsystem.repositories.CategoryRepository;
import lk.sliit.csse.procurementsystem.repositories.ItemsRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import lk.sliit.csse.procurementsystem.repositories.MaterialRequestRepository;


@Data
@Named
@RestController
public class SiteManagerController {

    private MaterialRequest materialRequest = new MaterialRequest();
    private Items items = new Items();
    private ItemList itemList = new ItemList();
    private Category category = new Category();
    
    String itemListStr="";
    @Autowired
    private MaterialRequestRepository materialRequestRepository;

    private ItemsRepository itemsRepository;

    private CategoryRepository categoryRepository;
       SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");  
    Date date = new Date();  
    public void addOrder() {
        materialRequest.setOrderDate(formatter.format(date));
        materialRequestRepository.save(materialRequest);
        this.materialRequest = new MaterialRequest();
    }
  
    public List<MaterialRequest> getOrders() {
        return materialRequestRepository.findAll();
    }
    
//    public Optional getOrderById(){
//        Optional theOrder = materialRequestRepository.findById("1");
//        if(theOrder==null)
//            return null;
//        return theOrder;
//    }
}
