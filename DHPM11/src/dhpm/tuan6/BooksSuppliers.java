/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dhpm.tuan6;



/**
 *
 * @author VanThuan
 */
public class BooksSuppliers {
    private int supplierid;
    private String suppliername;
    private String suppliertype;
    private String address;
    private String contactno;
    private String emailid;
    private String remarks;
    public BooksSuppliers(){
        
    }

    public BooksSuppliers(int supplierid, String suppliername, String suppliertype, String address, String contactno, String emailid, String remarks) {
        this.supplierid = supplierid;
        this.suppliername = suppliername;
        this.suppliertype = suppliertype;
        this.address = address;
        this.contactno = contactno;
        this.emailid = emailid;
        this.remarks = remarks;
    }

    
    

    public int getSupplierid() {
        return supplierid;
    }

    public String getSuppliername() {
        return suppliername;
    }

    public String getSuppliertype() {
        return suppliertype;
    }

    public String getAddress() {
        return address;
    }

    public String getContactno() {
        return contactno;
    }

    public String getEmailid() {
        return emailid;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setSupplierid(int supplierid) {
        this.supplierid = supplierid;
    }

    public void setSuppliername(String suppliername) {
        this.suppliername = suppliername;
    }

    public void setSuppliertype(String suppliertype) {
        this.suppliertype = suppliertype;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setContactno(String contactno) {
        this.contactno = contactno;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    Object getsuppliername() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setSupplierid(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
