package Apps.Europe_Batch2.Project;

 

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

 

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

 

@Component
@Scope(scopeName = "prototype")
@Entity
@Table(name = "VENDOR_ADDRESS_TBL")
public class Vendor_Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "VENDOR_ADDRESSID")
    private int vendorAddressId;
    
    @Column(name = "VENDOR_CITY", nullable = false)
    private String vendorCity;
    
    @Column(name = "VENDOR_STATE", nullable = false)
    private String vendorState;
    
    @Column(name = "VENDOR_PINCODE", nullable = false, length = 6)
    private long vendorPincode;
   
    
    // @onetoone (bi directional  )
    
    
    public Vendor_Address(String vendorCity, String vendorState, long vendorPincode) {
        super();
        this.vendorCity = vendorCity;
        this.vendorState = vendorState;
        this.vendorPincode = vendorPincode;
    }

 

    public Vendor_Address() {

 

    }

 

    public int getVendorAddressId() {
        return vendorAddressId;
    }

 

    public void setVendorAddressId(int vendorAddressId) {
        this.vendorAddressId = vendorAddressId;
    }

 

    public String getVendorCity() {
        return vendorCity;
    }

 

    public void setVendorCity(String vendorCity) {
        this.vendorCity = vendorCity;
    }

 

    public String getVendorState() {
        return vendorState;
    }

 

    public void setVendorState(String vendorState) {
        this.vendorState = vendorState;
    }

 

    public long getVendorPincode() {
        return vendorPincode;
    }

 

    public void setVendorPincode(long vendorPincode) {
        this.vendorPincode = vendorPincode;
    }

 

    @Override
    public String toString() {
        return "Vendor_Address [vendorAddressId=" + vendorAddressId + ", vendorCity=" + vendorCity + ", vendorState="
                + vendorState + ", vendorPincode=" + vendorPincode + "]";
    }

 

}