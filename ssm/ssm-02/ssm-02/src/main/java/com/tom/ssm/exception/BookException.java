package com.tom.ssm.exception;

/**
 * ClassName: BookException
 * Description:
 *
 * @author Mi_dad
 * @date 2019/10/12 22:04
 */
public class BookException extends RuntimeException {
    public BookException() {
        super();
    }

    public BookException(String message) {
        super(message);
    }

    public BookException(String message, Throwable cause) {
        super(message, cause);
    }

    public BookException(Throwable cause) {
        super(cause);
    }

    protected BookException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
