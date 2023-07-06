package home.webfluxsecurity.exception;

public class ApiException extends RuntimeException {
    String errorCode;
    public ApiException(String message, String errorCode) {
        super(message);
        this.errorCode = errorCode;
    }
}
