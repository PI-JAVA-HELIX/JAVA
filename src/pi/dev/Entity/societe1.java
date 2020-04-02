/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi.dev.Entity;

public class societe1 {
    public int ids;
     private String names;
    private String address;
    private String email;
    private String tel;
    private String logo;
      public societe1(int ids, String names, String address, String email, String tel, String logo) {
        this.ids = ids;
        this.names = names;
        this.address = address;
        this.email = email;
        this.tel = tel;
        this.logo = logo;
    }

    public societe1() {
    }

    @Override
    public String toString() {
        return "societe1{" + "ids=" + ids + ", names=" + names + ", address=" + address + ", email=" + email + ", tel=" + tel + ", logo=" + logo + '}';
    }

    public int getIds() {
        return ids;
    }

    public void setIds(int ids) {
        this.ids = ids;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }
    
}
