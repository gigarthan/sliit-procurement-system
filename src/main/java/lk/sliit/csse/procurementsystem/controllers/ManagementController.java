package lk.sliit.csse.procurementsystem.controllers;

import lk.sliit.csse.procurementsystem.models.AccountingStaff;
import lk.sliit.csse.procurementsystem.models.ProcurementStaff;
import lk.sliit.csse.procurementsystem.models.SiteManager;
import lk.sliit.csse.procurementsystem.repositories.AccountingStaffRepository;
import lk.sliit.csse.procurementsystem.repositories.ProcurementStaffRepository;
import lk.sliit.csse.procurementsystem.repositories.SiteManagerRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.inject.Named;
import java.util.List;

@Data
@Named
public class ManagementController {

    private ProcurementStaff  procurementStaff = new ProcurementStaff();
    private AccountingStaff accountingStaff = new AccountingStaff();
    private SiteManager siteManager = new SiteManager();

    @Autowired
    private ProcurementStaffRepository procurementStaffRepository;

    @Autowired
    private AccountingStaffRepository accountingStaffRepository;

    @Autowired
    private SiteManagerRepository siteManagerRepository;

    public boolean addNewManager() {
        siteManager.setEnabled(true);
        siteManager.setPassword(new BCryptPasswordEncoder().encode("1234"));
        siteManagerRepository.save(siteManager);
        this.siteManager = new SiteManager();
        return true;
    }

    public void addNewProcurementStaff() {
        procurementStaff.setEnabled(true);
        procurementStaff.setPassword(new BCryptPasswordEncoder().encode("1234"));
        procurementStaffRepository.save(procurementStaff);
        this.procurementStaff = new ProcurementStaff();
    }

    public void addNewAccountingStaff() {
        accountingStaff.setEnabled(true);
        accountingStaff.setPassword(new BCryptPasswordEncoder().encode("1234"));
        accountingStaffRepository.save(accountingStaff);
        this.accountingStaff = new AccountingStaff();
    }

    public List<SiteManager> getSiteManagers() {
        return siteManagerRepository.findAll();
    }

    public List<AccountingStaff> getAccountingStaffs() {
        return accountingStaffRepository.findAll();
    }

    public List<ProcurementStaff> getProcurementStaffs() {
        return procurementStaffRepository.findAll();
    }

    public void deleteSiteManager(SiteManager sm) {
        siteManagerRepository.delete(sm);
    }

    public void deleteAccountingStaff(AccountingStaff as) { accountingStaffRepository.delete(as); }

    public void deleteProcurementStaff(ProcurementStaff ps) { procurementStaffRepository.delete(ps); }


}
