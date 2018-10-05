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

import java.util.List;
import javax.inject.Named;
import lk.sliit.csse.procurementsystem.models.Site;
import lk.sliit.csse.procurementsystem.models.SiteItem;
import lk.sliit.csse.procurementsystem.repositories.SiteItemRepository;
import lk.sliit.csse.procurementsystem.repositories.SiteRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Kiru
 */
@Named
@Data
public class SiteController {
    
    private Site selectedSite;
    private Site newSite = new Site();
    private SiteItem newSiteItem = new SiteItem();
    
    @Autowired
    private SiteRepository siteRepository;
    
    @Autowired
    private SiteItemRepository siteItemRepository;
    
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
}
