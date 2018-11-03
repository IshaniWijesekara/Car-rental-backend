package lk.zeon.carrental.dto;

/**
 * Created by Ze on 10/31/2018.
 */
public class CustomerDto {
    private int cid;

    private String fullName;
    private String nic;
    private String nationality;
    private String country;
    private String city;
    private String mobile;

    public CustomerDto() {
    }

    public CustomerDto( String fullName, String nic, String nationality, String country, String city, String mobile) {

        this.fullName = fullName;
        this.nic = nic;
        this.nationality = nationality;
        this.country = country;
        this.city = city;
        this.mobile = mobile;
    }

    public CustomerDto(int cid, String fullName, String nic, String nationality, String country, String city, String mobile) {
        this.cid = cid;
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
        return "CustomerDto{" +
                "cid=" + cid +
                ", fullName='" + fullName + '\'' +
                ", nic='" + nic + '\'' +
                ", nationality='" + nationality + '\'' +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", mobile='" + mobile + '\'' +
                '}';
    }
}
