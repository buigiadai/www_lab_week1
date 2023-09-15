package vn.edu.iuh.fit.entities;


import java.util.regex.Pattern;

public class Account {
    private Integer accountId;
    private String fullName;
    private String password;
    private String email;
    private String phone;
    private Integer status; // 1-active, 0-deactive, -1-deleted

    // Constructors
    public Account(){}

    public Account(Integer accountId, String fullName, String password, String email, String phone, Integer status) {
        this.accountId = accountId;
        this.fullName = fullName;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.status = status;

        this.setEmail(email);
        this.setPhone(phone);
    }

    // Getters and Setters
    public Integer getAccountId(){
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public String getFullName(){
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (isValidEmail(email)) {
            this.email = email;
        } else {
            throw new IllegalArgumentException("Invalid email address");
        }
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        if (isValidPhone(phone)){
            this.phone = phone;
        } else {
            throw new IllegalArgumentException("Invalid phone number");
        }
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    private boolean isValidEmail(String email) {
        String emailRegex = "^[A-Za-z0-9+_.-]+@(.+)$";
        return Pattern.compile(emailRegex).matcher(email).matches();
    }

    private boolean isValidPhone(String phone) {
        return phone.matches("^\\d{10}$");
    }
}