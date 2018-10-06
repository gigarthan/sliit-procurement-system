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

import lk.sliit.csse.procurementsystem.models.Site;
import lk.sliit.csse.procurementsystem.models.SiteManager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Kiru
 */
@Transactional
public interface SiteRepository extends JpaRepository<Site, Long> {
    
    @Modifying
    @Query("update Site s set s.siteManager = ?1 where s.siteId = ?2")
    int setSiteManagerFor(SiteManager sitemanager, Long id);  //selected site manager, site id of site
}
