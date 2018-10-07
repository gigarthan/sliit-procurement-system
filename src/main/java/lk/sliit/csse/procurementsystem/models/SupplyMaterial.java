package lk.sliit.csse.procurementsystem.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
public class SupplyMaterial {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long itemId;
    
    private int supId = 1;
    private String name;
    private String category;
    private String description;
    private String price;

    public long getItemId() {
        return itemId;
    }

    public void setItemId(long itemId) {
        this.itemId = itemId;
    }

    public int getSupId() {
        return supId;
    }

    public void setSupId(int supId) {
        this.supId = supId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

}

