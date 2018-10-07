package lk.sliit.csse.procurementsystem.controllers;

import java.util.List;

import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import lk.sliit.csse.procurementsystem.models.Order;
import lk.sliit.csse.procurementsystem.repositories.PayOrderRepository;
import lombok.Data;


@Data
@Named
@RestController
public class PayOrderController {
	
	private Order order = new Order();
	
	@Autowired
    private PayOrderRepository payorderRepository;
	
	
	 public List<Order> getOrders() {
	        return payorderRepository.findAll();
	    }

}
