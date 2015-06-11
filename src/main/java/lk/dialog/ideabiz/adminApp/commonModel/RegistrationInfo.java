package lk.dialog.ideabiz.adminApp.commonModel;

import lk.dialog.ideabiz.adminApp.commonModel.Enumarator.EVENT_METHOD;

import java.util.Date;

/**
 * Created by Malinda on 6/9/2015.
 */
public class RegistrationInfo {
    private String datetime;
    private EVENT_METHOD method;

    public RegistrationInfo(String datetime, EVENT_METHOD method) {
        this.datetime = datetime;
        this.method = method;
    }


    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public EVENT_METHOD getMethod() {
        return method;
    }

    public void setMethod(EVENT_METHOD method) {
        this.method = method;
    }
}
