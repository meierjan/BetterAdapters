package wtf.meier.betteradapters.adapter.exception;

/**
 * Created by meier on 29/12/2016.
 */

public class TypeNotSupportedException extends RuntimeException {
    private TypeNotSupportedException(String message) {
        super(message);
    }

    public static TypeNotSupportedException create(String message) {
        return new TypeNotSupportedException(message);
    }
}
