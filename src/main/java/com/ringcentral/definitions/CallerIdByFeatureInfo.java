package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class CallerIdByFeatureInfo
{
    // If 'PhoneNumber' value is specified, then a certain phone number is shown as a caller ID when using this telephony feature. If 'Blocked' value is specified, then a caller ID is hidden. The value 'CurrentLocation' can be specified for 'RingOut' feature only. The default is 'PhoneNumber' = ['PhoneNumber', 'Blocked', 'CurrentLocation']
    public String type;
    public CallerIdByFeatureInfo type(String type) {
        this.type = type;
        return this;
    }
    //
    public CallerIdPhoneInfo phoneInfo;
    public CallerIdByFeatureInfo phoneInfo(CallerIdPhoneInfo phoneInfo) {
        this.phoneInfo = phoneInfo;
        return this;
    }
}
