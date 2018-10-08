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
package lk.sliit.csse.procurementsystem.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import lk.sliit.csse.procurementsystem.models.BlacklistedSupplier;
import lk.sliit.csse.procurementsystem.models.Site;
import lk.sliit.csse.procurementsystem.models.SiteItem;
import lk.sliit.csse.procurementsystem.models.SiteManager;
import lk.sliit.csse.procurementsystem.models.Supplier;
import lk.sliit.csse.procurementsystem.repositories.BlacklistedSupplierRepository;
import lk.sliit.csse.procurementsystem.repositories.SiteItemRepository;
import lk.sliit.csse.procurementsystem.repositories.SiteManagerRepository;
import lk.sliit.csse.procurementsystem.repositories.SiteRepository;
import lk.sliit.csse.procurementsystem.repositories.SupplierRepository;
import lombok.Data;
import org.primefaces.event.RowEditEvent;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Kiru
 */
@Named
@Data
public class SiteController {
    
    //Site and SiteItem
    private Site selectedSite;
    private Site newSite = new Site();
    private SiteItem newSiteItem = new SiteItem();
    private SiteManager siteManager = new SiteManager();
    
    //Supplier
    private Supplier selectedSupplier;
    private BlacklistedSupplier blacklistedSupplier = new BlacklistedSupplier();
    
    @Autowired
    private SiteRepository siteRepository;
    
    @Autowired
    private SiteItemRepository siteItemRepository;
    
    @Autowired
    private SiteManagerRepository siteManagerRepository;

    @Autowired
    private SupplierRepository supplierRepository;
    
    @Autowired
    private BlacklistedSupplierRepository blacklistedSupplierRepository;
    
    
    public List<Site> getSites(){      
        return siteRepository.findAll();
    }
    
    public void setSelectedSite(Site site) {
        this.selectedSite = site;
    }
    
    public Site getSelectedSite() {
        return selectedSite;
    }
    
    
    //Add site
    public boolean addSite() {
       siteRepository.save(newSite);
       newSite = new Site();
       return true;
    }
    
    //Get Items of Selected Site
    public List<SiteItem> getSiteItems() {
      return siteItemRepository.findAllBySiteSiteId(selectedSite.getSiteId());
    }
    
    //Add site items
    public boolean addSiteItem() {
        newSiteItem.setSite(selectedSite);
        siteItemRepository.save(newSiteItem);
        newSiteItem = new SiteItem();
        return true;
    }
    
    //Get SiteManager list
    public List<SiteManager> getSiteManagers() {
        return siteManagerRepository.findAll();
    }
    
    public List<String> completeText(String query) {
        
        List<SiteManager> siteManagers = siteManagerRepository.findByFirstnameContainingOrLastnameContaining(query, query);

        List<String> results = new ArrayList<>();
        for(SiteManager s : siteManagers) {
            results.add((s.getFirstName() + " " + s.getLastName()));
        }
         
        return results;
    }
    
    //Add site manager
    public void addSiteManager(){
        String result = siteManager.getFirstName();
        StringTokenizer name = new StringTokenizer(result, " ");
        String firstName = name.nextToken();
        String lastName = name.nextToken();
        SiteManager selSiteManager = siteManagerRepository.findByFirstNameAndLastName(firstName, lastName);
       
        siteRepository.setSiteManagerFor(selSiteManager, selectedSite.getSiteId());
    }
    
    
    //Get Whitelisted suppliers
    public List<Supplier> getSuppliers() {
      return supplierRepository.findByBlackListedFalse();
    }
    
    //Get Blacklisted Suppliers
    public List<BlacklistedSupplier> getBlacklistedSuppliers() {
      return blacklistedSupplierRepository.findAll();
    }
    
    //Blacklist a supplier
    public void blacklistSupplier() {
        selectedSupplier.setBlackListed(true);
        Boolean isBlacklisted = selectedSupplier.isBlackListed();
        supplierRepository.setBlackListedFor(isBlacklisted, selectedSupplier.getName());
        blacklistedSupplierRepository.save(blacklistedSupplier);
    }
    
    //Whitelist a Supplier
    public void whitelistSupplier() {
        selectedSupplier.setBlackListed(false);
        Boolean isBlacklisted = selectedSupplier.isBlackListed();
        supplierRepository.setBlackListedFor(isBlacklisted, selectedSupplier.getName());
    }
}
