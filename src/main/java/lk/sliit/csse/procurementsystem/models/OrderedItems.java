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
OrderedItems(itemId, orderRef, itemQty)
 */
package lk.sliit.csse.procurementsystem.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Marjan
 */
@Entity
public class OrderedItems  {
    
     @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int itemId;
    private String orderRef;
    private int itemQty;
    /**
     * @return the itemId
     */
    
    
    public int getItemId() {
        return itemId;
    }

    /**
     * @param itemId the itemId to set
     */
//    public void setItemId(String itemId) {
//        this.itemId = itemId;
//    }

    /**
     * @return the orderRef
     */
    public String getOrderRef() {
        return orderRef;
    }

    /**
     * @param orderRef the orderRef to set
     */
//    public void setOrderRef(String orderRef) {
//        this.orderRef = orderRef;
//    }

    /**
     * @return the itemQty
     */
    public int getItemQty() {
        return itemQty;
    }

    /**
     * @param itemQty the itemQty to set
     */
    public void setItemQty(int itemQty) {
        this.itemQty = itemQty;
    }

}
