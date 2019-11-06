package com.tom.ssm.exception;

/**
 * ClassName: StockException
 * Description:
 *
 * @author Mi_dad
 * @date 2019/10/12 22:06
 */
public class StockException extends RuntimeException {
    public StockException() {
        super();
    }

    public StockException(String message) {
        super(message);
    }

    public StockException(String message, Throwable cause) {
        super(message, cause);
    }

    public StockException(Throwable cause) {
        super(cause);
    }

    protected StockException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
