package lk.zeon.carrental.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


/**
 * Created by Ze on 10/30/2018.
 */
@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int cid;

    private String fullName;
    private String nic;
    private String nationality;
    private String country;
    private String city;
    private String mobile;

    public Customer() {
    }

    public Customer(int cid, String fullName, String nic, String nationality, String country, String city, String mobile) {
        this.cid = cid;
        this.fullName = fullName;
        this.nic = nic;
        this.nationality = nationality;
        this.country = country;
        this.city = city;
        this.mobile = mobile;
    }

    public Customer(String fullName, String nic, String nationality, String country, String city, String mobile) {
        this.fullName = fullName;
        this.nic = nic;
        this.nationality = nationality;
        this.country = country;
        this.city = city;
        this.mobile = mobile;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "cid='" + cid + '\'' +
                ", fullName='" + fullName + '\'' +
                ", nic='" + nic + '\'' +
                ", nationality='" + nationality + '\'' +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", mobile='" + mobile + '\'' +
                '}';
    }
}
