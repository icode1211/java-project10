package chap11;

/**
 * QueueExample2에서 사용되는 Message
 */
public class Message {
    private final String command;
    private final String to;

    public Message(String command, String to) {
        this.command = command;
        this.to = to;
    }

    public String getCommand() {
        return command;
    }

    public String getTo() {
        return to;
    }
}
