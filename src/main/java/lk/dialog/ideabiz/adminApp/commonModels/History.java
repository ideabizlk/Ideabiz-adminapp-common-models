package lk.dialog.ideabiz.adminApp.commonModels;

import lk.dialog.ideabiz.adminApp.commonModels.Enumarator.EVENT_STATUS;
import lk.dialog.ideabiz.adminApp.commonModels.Enumarator.EVENT_TRIGGER;
import lk.dialog.ideabiz.adminApp.commonModels.Enumarator.EVENT_TYPE;

/**
 * Created by Malinda on 6/9/2015.
 */

/**
 * History object. Each and every history event
 * should create object from this class
 */
public class History {
    private String datetime;
    private EVENT_TRIGGER trigger;
    private EVENT_TYPE event;
    private String note;
    private EVENT_STATUS status;

    public History(String datetime, EVENT_TRIGGER trigger, EVENT_TYPE event, String note, EVENT_STATUS status) {
        this.datetime = datetime;
        this.trigger = trigger;
        this.event = event;
        this.note = note;
        this.status = status;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public EVENT_TRIGGER getTrigger() {
        return trigger;
    }

    public void setTrigger(EVENT_TRIGGER trigger) {
        this.trigger = trigger;
    }

    public EVENT_TYPE getEvent() {
        return event;
    }

    public void setEvent(EVENT_TYPE event) {
        this.event = event;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public EVENT_STATUS getStatus() {
        return status;
    }

    public void setStatus(EVENT_STATUS status) {
        this.status = status;
    }
}
