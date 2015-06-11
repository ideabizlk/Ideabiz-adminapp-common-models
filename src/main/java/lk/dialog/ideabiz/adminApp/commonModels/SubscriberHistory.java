package lk.dialog.ideabiz.adminApp.commonModels;

import java.util.ArrayList;

/**
 * Created by Malinda on 6/9/2015.
 */

/**
 * Subscriber history list and other information class
 */
public class SubscriberHistory {
    private String number;
    private int offset;
    private int limit;
    ArrayList<History> history;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public ArrayList<History> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<History> history) {
        this.history = history;
    }

    public SubscriberHistory() {
        this.history = new ArrayList<History>();
    }
}
