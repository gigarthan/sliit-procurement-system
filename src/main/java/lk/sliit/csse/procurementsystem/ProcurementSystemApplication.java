package lk.sliit.csse.procurementsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class ProcurementSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProcurementSystemApplication.class, args);
    }
       @EventListener
    public void appReady(ApplicationReadyEvent event) {
        System.out.println("App Started");
        
    }
}
