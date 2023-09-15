package vn.edu.iuh.fit.entities;


public class GrantAccess {
    private Integer accountId;
    private Integer roleId;
    private Integer isGrant; // 0-disable, 1-enable
    private String note;

    // Constructors
    public GrantAccess() {}

    public GrantAccess(Integer accountId, Integer roleId, Integer isGrant, String note){
        this.accountId = accountId;
        this.isGrant = isGrant;
        this.roleId = roleId;
        this.note = note;
    }

    // Getters and Setters

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getIsGrant() {
        return isGrant;
    }

    public void setIsGrant(Integer isGrant) {
        this.isGrant = isGrant;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}