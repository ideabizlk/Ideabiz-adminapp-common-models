package lk.dialog.ideabiz.adminApp.commonModel;

/**
 * Created by Malinda on 6/9/2015.
 */

/**
 * Error result wrapper
 */
public class ErrorResult {
    private ServerError serverError;

    public ErrorResult(ServerError serverError) {
        this.serverError = serverError;
    }

    public ServerError getServerError() {
        return serverError;
    }

    public void setServerError(ServerError serverError) {
        this.serverError = serverError;
    }
}
