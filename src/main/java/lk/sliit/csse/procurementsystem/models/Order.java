package lk.sliit.csse.procurementsystem.models;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Marjan
 */

/*
Orders(orderRef, orderedDate, endDate, siteMangerId, siteManagerStatus, managementStatus, supplierId,supplierStatus, totalPrice)
Ordered_Items(itemId, orderRef, itemQty)
Items(itemId, itemName, categoryId, price)
Category(categoryId, name)
 */
@Entity
public class Order {

      @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String orderRef;
    private Date orderedDate;
    private Date endDate;
    private int siteMangerId;
    private String siteManagerStatus;
    private String managementStatus;
    private int supplierId;
    private String supplierStatus;
    private double totalPrice;
    
    /**
     * @return the orderRef
     */
    public String getOrderRef() {
        return orderRef;
    }

    /**
     * @param orderRef the orderRef to set
     */
    public void setOrderRef(String orderRef) {
        this.orderRef = orderRef;
    }

    /**
     * @return the orderedDate
     */
    public Date getOrderedDate() {
        return orderedDate;
    }

    /**
     * @param orderedDate the orderedDate to set
     */
    public void setOrderedDate(Date orderedDate) {
        this.orderedDate = orderedDate;
    }

    /**
     * @return the endDate
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * @param endDate the endDate to set
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    /**
     * @return the siteMangerId
     */
    public int getSiteMangerId() {
        return siteMangerId;
    }

    /**
     * @param siteMangerId the siteMangerId to set
     */
    public void setSiteMangerId(int siteMangerId) {
        this.siteMangerId = siteMangerId;
    }

    /**
     * @return the siteManagerStatus
     */
    public String getSiteManagerStatus() {
        return siteManagerStatus;
    }

    /**
     * @param siteManagerStatus the siteManagerStatus to set
     */
    public void setSiteManagerStatus(String siteManagerStatus) {
        this.siteManagerStatus = siteManagerStatus;
    }

    /**
     * @return the managementStatus
     */
    public String getManagementStatus() {
        return managementStatus;
    }

    /**
     * @param managementStatus the managementStatus to set
     */
    public void setManagementStatus(String managementStatus) {
        this.managementStatus = managementStatus;
    }

    /**
     * @return the supplierId
     */
    public int getSupplierId() {
        return supplierId;
    }

    /**
     * @param supplierId the supplierId to set
     */
    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
    }

    /**
     * @return the supplierStatus
     */
    public String getSupplierStatus() {
        return supplierStatus;
    }

    /**
     * @param supplierStatus the supplierStatus to set
     */
    public void setSupplierStatus(String supplierStatus) {
        this.supplierStatus = supplierStatus;
    }

    /**
     * @return the totalPrice
     */
    public double getTotalPrice() {
        return totalPrice;
    }

    /**
     * @param totalPrice the totalPrice to set
     */
    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

}
