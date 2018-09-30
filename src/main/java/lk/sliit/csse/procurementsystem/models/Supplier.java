package lk.sliit.csse.procurementsystem.models;

import lombok.Data;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import java.util.List;

@Data
@Entity
public class Supplier extends User {
    private String name;
    private String accountNo;
    private String phone;
    private boolean availability;
    @ElementCollection
    private List<?> items;
}
