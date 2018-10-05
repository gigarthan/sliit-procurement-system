/*
 * Copyright 2018 JoinFaces.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package lk.sliit.csse.procurementsystem.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author Kiru
 */
@Entity
public class Site implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long siteId;

    private String siteName;
    private String address;
    private Float storageCapacity; //cubic meters
    private Float currentCapacity;
    
    @OneToMany(
        mappedBy = "site", 
        cascade = CascadeType.ALL, 
        orphanRemoval = true
    )
    private List<SiteItem> siteItems = new ArrayList<SiteItem>();
   

    @OneToOne
    private SiteManager siteManager;

    
    /**
     * @return the siteId
     */
    public Long getSiteId() {
        return siteId;
    }

    /**
     * @param siteId the siteId to set
     */
    public void setSiteId(Long siteId) {
        this.siteId = siteId;
    }

    /**
     * @return the siteName
     */
    public String getSiteName() {
        return siteName;
    }

    /**
     * @param siteName the siteName to set
     */
    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the storageCapacity
     */
    public Float getStorageCapacity() {
        return storageCapacity;
    }

    /**
     * @param storageCapacity the storageCapacity to set
     */
    public void setStorageCapacity(Float storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    /**
     * @return the currentCapacity
     */
    public Float getCurrentCapacity() {
        return currentCapacity;
    }

    /**
     * @param currentCapacity the currentCapacity to set
     */
    public void setCurrentCapacity(Float currentCapacity) {
        this.currentCapacity = currentCapacity;
    }

    public List<SiteItem> getSiteItems() {
        return siteItems;
    }

    public void setSiteItems(List<SiteItem> siteItems) {
        this.siteItems = siteItems;
    } 
    
    public SiteManager getSiteManager() {
        return siteManager;
    }

    public void setSiteManager(SiteManager siteManager) {
        this.siteManager = siteManager;
    }

    @Override
    public String toString() {
        return "Site{" + "siteId=" + siteId + ", siteName=" + siteName + ", address=" + address + ", storageCapacity=" + storageCapacity + ", currentCapacity=" + currentCapacity + ", siteItems=" + siteItems + ", siteManager=" + siteManager + '}';
    }

    


}
