package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class AccountStatusInfo
{
    // A free-form user comment, describing the status change reason
    public String comment;
    public AccountStatusInfo comment(String comment) {
        this.comment = comment;
        return this;
    }
    // Type of suspension
    public String reason;
    public AccountStatusInfo reason(String reason) {
        this.reason = reason;
        return this;
    }
    // Date until which the account will get deleted. The default value is 30 days since current date
    public String till;
    public AccountStatusInfo till(String till) {
        this.till = till;
        return this;
    }
}
