package lk.dialog.ideabiz.adminApp.commonModel;

/**
 * Created by Malinda on 6/9/2015.
 */

/**
 * User subscription result wrapper
 */
public class SubscriptionResult {
    private Subscription subscription;

    public SubscriptionResult(Subscription subscription) {
        this.subscription = subscription;
    }

    public Subscription getSubscription() {
        return subscription;
    }

    public void setSubscription(Subscription subscription) {
        this.subscription = subscription;
    }

}
