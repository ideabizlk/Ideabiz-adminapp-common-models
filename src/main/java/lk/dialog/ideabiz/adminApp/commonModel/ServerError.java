package lk.dialog.ideabiz.adminApp.commonModel;

/**
 * Created by Malinda on 6/9/2015.
 */

/**
 * Error Object that returns if there is an error
 */
public class ServerError {
    private String statusCode;
    private String message;

    public ServerError(String statusCode, String message) {
        this.statusCode = statusCode;
        this.message = message;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
