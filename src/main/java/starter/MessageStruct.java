package starter;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by Christopher Travers on 06/04/2017.
 *
 * This message structure defines the public API for the messages returned by the web server
 * It is intended to be used as a return type of internal object methods, not to implement
 * business logic.
 */
public class MessageStruct {
    public final Long id;
    public final String message;

    public MessageStruct(Long id, String message) {
        this.id = id;
        this.message = message;
    }
}
