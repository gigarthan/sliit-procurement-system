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

import java.util.List;
import javax.persistence.*;

/**
 *
 * @author Marjan
 */
@Entity(name="Category")
@Table(name="category")
public class Category {

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    private int cateogryId;
    private String name;
    @OneToMany(mappedBy="itemName")
    private List<Items> itemName;

    /**
     * @return the cateogryId
     */
    public int getCateogryId() {
        return cateogryId;
    }

    /**
     * @param cateogryId the cateogryId to set
     */
    public void setCateogryId(int cateogryId) {
        this.cateogryId = cateogryId;
    }

    /**
     * @return the itemName
     */
    public List<Items> getItemName() {
        return itemName;
    }

    /**
     * @param itemName the itemName to set
     */
    public void setItemName(List<Items> itemName) {
        this.itemName = itemName;
    }
}
