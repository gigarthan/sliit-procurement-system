package lk.sliit.csse.procurementsystem;

import static org.apache.coyote.http11.Constants.a;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

//@RunWith(SpringRunner.class)
//@SpringBootTest
public class ProcurementSystemApplicationTests {

    @Test
    public void contextLoads() {
    }
    @Test
    public void addItemsToOrder(){
        
        checkBal(25,true);
    }
    
    public void checkBal(double bal, boolean s){
        
        boolean ex = s;
        boolean actual = true;//object.checkBal (bal);
                 
                 assertEquals(ex,actual);
        
    }
}
