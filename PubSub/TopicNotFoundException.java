package PubSub;

public class TopicNotFoundException extends Exception {
    public TopicNotFoundException(String message) {
        super(message);
    }
}
