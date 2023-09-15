package vn.edu.iuh.fit.entities;


import java.util.Date;

public class Log {
    private Integer logId;
    private Integer accountId;
    private Date loginTime;
    private Date logoutTime;
    private String note;

    // Constructors
    public Log() {}

    public Log(Integer logId, Integer accountId, Date loginTime, Date logoutTime, String note ) {
        this.logId = logId;
        this.accountId = accountId;
        this.loginTime = loginTime;
        this.logoutTime = logoutTime;
        this.note = note;
    }

    // Getters and Setters

    public Integer getLogId() {
        return logId;
    }

    public void setLogId(Integer logId) {
        this.logId = logId;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public Date getLogoutTime() {
        return logoutTime;
    }

    public void setLogoutTime(Date logoutTime) {
        this.logoutTime = logoutTime;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}