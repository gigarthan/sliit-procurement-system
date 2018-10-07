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

import java.io.IOException;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.inject.Named;
import javax.servlet.http.HttpServletRequest;
import lk.sliit.csse.procurementsystem.models.SupplyMaterial;
import lk.sliit.csse.procurementsystem.repositories.ReceiptMaterialRepository;
import lk.sliit.csse.procurementsystem.repositories.SupplyMaterialRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Vithu
 */
@Data
@Named
public class SupplyMaterialController {
 
    public SupplyMaterial supplyMaterial = new SupplyMaterial();
    
    @Autowired
    private SupplyMaterialRepository supplyMaterialRepository;
   
    

    public void addNewItem() {
        supplyMaterialRepository.save(supplyMaterial); 
        this.supplyMaterial = new SupplyMaterial();
    }
    
    public List<SupplyMaterial> getItem() {
        return supplyMaterialRepository.findAll();
    }
    
    public void deleteItem(long id) throws IOException {
        supplyMaterialRepository.deleteById(id);
        ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
        ec.redirect(((HttpServletRequest) ec.getRequest()).getRequestURI());
    }
    
    public void updateItem(long id) {
//        Optional it = itemRepository.findById(id);
//        itemList = (SupplyItemList) it.get();
        
        
//        ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
//        ec.redirect(((HttpServletRequest) ec.getRequest()).getRequestURI());
    }
    
    
     public void buttonAction(ActionEvent actionEvent) {
        addMessage("Successfully Done");
    }
     
    public void addMessage(String summary) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary,  null);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
    
}
