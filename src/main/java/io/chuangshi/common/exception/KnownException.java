package io.chuangshi.common.exception;

public class KnownException extends RuntimeException {

    private String code;

    public KnownException() {
        super();
    }

    public KnownException(String code, String message) {
        super(message);
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
