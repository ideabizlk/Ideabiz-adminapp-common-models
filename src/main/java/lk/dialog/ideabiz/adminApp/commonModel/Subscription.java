package lk.dialog.ideabiz.adminApp.commonModel;

import lk.dialog.ideabiz.adminApp.commonModel.Enumarator.SUBSCRIPTION_STATUS;

/**
 * Created by Malinda on 6/9/2015.
 */

/**
 * User subscription information class
 */
public class Subscription {
    private String number;
    private SUBSCRIPTION_STATUS status;
    private RegistrationInfo registration;
    private RegistrationInfo unregistration;

    public Subscription() {
    }

    public Subscription(String number, SUBSCRIPTION_STATUS status, RegistrationInfo registration, RegistrationInfo unregistration) {
        this.number = number;
        this.status = status;
        this.registration = registration;
        this.unregistration = unregistration;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public SUBSCRIPTION_STATUS getStatus() {
        return status;
    }

    public void setStatus(SUBSCRIPTION_STATUS status) {
        this.status = status;
    }

    public RegistrationInfo getRegistration() {
        return registration;
    }

    public void setRegistration(RegistrationInfo registration) {
        this.registration = registration;
    }

    public RegistrationInfo getUnregistration() {
        return unregistration;
    }

    public void setUnregistration(RegistrationInfo unregistration) {
        this.unregistration = unregistration;
    }
}
