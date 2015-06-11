package lk.dialog.ideabiz.adminApp.commonModels;

/**
 * Created by Malinda on 6/9/2015.
 */

/**
 * Subscriber history result wrapper
 */
public class SubscriberHistoryResult {
    private  SubscriberHistory subscriberHistory;

    public SubscriberHistoryResult(SubscriberHistory subscriberHistory) {
        this.subscriberHistory = subscriberHistory;
    }

    public SubscriberHistory getSubscriberHistory() {
        return subscriberHistory;
    }

    public void setSubscriberHistory(SubscriberHistory subscriberHistory) {
        this.subscriberHistory = subscriberHistory;
    }

}
