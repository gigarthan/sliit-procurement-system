package lk.sliit.csse.procurementsystem;

import lk.sliit.csse.procurementsystem.models.ItemList;
import static org.apache.coyote.http11.Constants.a;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProcurementSystemApplicationTests {
    ItemList il = new ItemList();
    
    @Test
    public void contextLoads() {
    }
    @Test
    public void addItemsToOrder(){
        
       //il.checkOrderQuantity(25,true);
       // checkOrderQuantity(25,true)
      //  checkOrderQuantity(25,true)
    }
    
    public void checkOrderQuantity(double bal, boolean s){
        
        boolean ex = s;
        boolean actual = true;//object.checkBal (bal);
                 
                 assertEquals(ex,actual);
        
    }
}
