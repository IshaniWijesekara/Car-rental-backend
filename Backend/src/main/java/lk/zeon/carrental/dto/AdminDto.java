package lk.zeon.carrental.dto;

/**
 * Created by Ze on 10/31/2018.
 */
public class AdminDto {

    private int adminId;

    private String password;
    private String userName;
    private String fullName;
    private String address;
    private String mobile;

    public AdminDto() {
    }

    public AdminDto( String password, String userName, String fullName, String address, String mobile) {

        this.password = password;
        this.userName = userName;
        this.fullName = fullName;
        this.address = address;
        this.mobile = mobile;
    }


    public AdminDto(int adminId, String password, String userName, String fullName, String address, String mobile) {
        this.adminId = adminId;
        this.password = password;
        this.userName = userName;
        this.fullName = fullName;
        this.address = address;
        this.mobile = mobile;
    }

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "AdminDto{" +
                "adminId=" + adminId +
                ", password='" + password + '\'' +
                ", userName='" + userName + '\'' +
                ", fullName='" + fullName + '\'' +
                ", address='" + address + '\'' +
                ", mobile='" + mobile + '\'' +
                '}';
    }
}
