package id.ac.stmi.siio.oop.lab72.crud18021.crud.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException18021 extends Exception {
    private static final long serialVersionUID = 1L;

    public ResourceNotFoundException18021(String message) {
        super(message);
    }
}
