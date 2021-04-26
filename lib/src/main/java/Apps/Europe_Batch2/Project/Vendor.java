package Apps.Europe_Batch2.Project;

 

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component
@Scope(scopeName = "prototype")
@Entity
@Table(name = "VENDOR_TBL")
public class Vendor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int vendorId;
    
    @Column(name = "VENDOR_NAME", nullable = false)
    private String vendorName;
    
    @Column(name = "VENDOR_CONTACT", nullable = false)
    private long vendorContact;
    
    @Column(name = "VENDOR_USERNAME", nullable = false)
    private String vendorUsername;
    
    @Column(name = "VENDOR_PASSWORD", nullable = false)
    private String vedorPassword;

 

    private Menu foodMenu;
    @Autowired
    @JoinColumn(name = "VENDOR_ADDRESSID")
    @OneToOne(cascade = CascadeType.ALL)
    private Vendor_Address vendorAddress;

 

    
    
    public Vendor(Menu foodMenu, Vendor_Address vendorAddress) {
        super();
        this.foodMenu = foodMenu;
        this.vendorAddress = vendorAddress;
    }

 

    public Vendor(String vendorName, long vendorContact, String vendorUsername, String vedorPassword) {
        super();
        this.vendorName = vendorName;
        this.vendorContact = vendorContact;
        this.vendorUsername = vendorUsername;
        this.vedorPassword = vedorPassword;
    }

 

    //  
    
    public int getVendorId() {
        return vendorId;
    }

 

    public void setVendorId(int vendorId) {
        this.vendorId = vendorId;
    }

 

    public String getVendorName() {
        return vendorName;
    }

 

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

 

    public long getVendorContact() {
        return vendorContact;
    }

 

    public void setVendorContact(long vendorContact) {
        this.vendorContact = vendorContact;
    }

 

    public String getVendorUsername() {
        return vendorUsername;
    }

 

    public void setVendorUsername(String vendorUsername) {
        this.vendorUsername = vendorUsername;
    }

 

    public String getVedorPassword() {
        return vedorPassword;
    }

 

    public void setVedorPassword(String vedorPassword) {
        this.vedorPassword = vedorPassword;
    }

 

    public Menu getFoodMenu() {
        return foodMenu;
    }

 

    public void setFoodMenu(Menu foodMenu) {
        this.foodMenu = foodMenu;
    }

 

    public Vendor_Address getVendorAddress() {
        return vendorAddress;
    }

 

    public void setVendorAddress(Vendor_Address vendorAddress) {
        this.vendorAddress = vendorAddress;
    }

 

    @Override
    public String toString() {
        return "Vendor [vendorId=" + vendorId + ", vendorName=" + vendorName + ", vendorContact=" + vendorContact
                + ", vendorUsername=" + vendorUsername + ", vedorPassword=" + vedorPassword + ", foodMenu=" + foodMenu
                + ", vendorAddress=" + vendorAddress + "]";
    }

 

}
 