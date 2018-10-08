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
package lk.sliit.csse.procurementsystem.repositories;

import lk.sliit.csse.procurementsystem.models.BlacklistedSupplier;
import lk.sliit.csse.procurementsystem.models.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author Kiru
 */
public interface BlacklistedSupplierRepository extends JpaRepository<BlacklistedSupplier, Long> {
    
    //set BlackListed supplier;
    @Modifying
    @Query("update BlacklistedSupplier s set s.supplier = ?1 where s.id = ?2")
    int setBlackListedFor(Supplier supplier, Long id);
    
}
