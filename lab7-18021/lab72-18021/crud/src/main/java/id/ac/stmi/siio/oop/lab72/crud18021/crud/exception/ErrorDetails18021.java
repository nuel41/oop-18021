package id.ac.stmi.siio.oop.lab72.crud18021.crud.exception;

import java.util.Date;

public class ErrorDetails18021 {
    private Date timestamp;
    private String message;
    private String details;

    public ErrorDetails18021(Date timestamp, String message, String details) {
        super();
        this.timestamp = timestamp;
        this.message = message;
        this.details = details;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public String getMessage() {
        return message;
    }

    public String getDetails() {
        return details;
    }
}