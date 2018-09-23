package lk.sliit.csse.procurementsystem;

import lk.sliit.csse.procurementsystem.models.SiteManager;
import lk.sliit.csse.procurementsystem.repositories.SiteManagerRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

//@Data
@Named
public class HomeController {

    private SiteManager siteManager = new SiteManager();
    private String name = "";

    @Autowired
    private SiteManagerRepository siteManagerRepository;


    public boolean addNewManager() {
        siteManagerRepository.save(siteManager);
        this.siteManager = new SiteManager();
        return true;
    }

    public SiteManager getSiteManager() {
        return this.siteManager;
    }

    public String getName() {
        return this.name;
    }

}
