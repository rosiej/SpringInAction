package pl.sda.jira.message;

import java.util.List;

public class MessageRepository {
    private final List<Message> messages;

    public MessageRepository(List<Message> messages) {
        this.messages = messages;
    }

    public void add(Message message) {

    }

    public void update(Message message) {

    }

    public void remove(String messageId) {

    }

    public Message get(String messageId) {
        return null;
    }

    public boolean exists(String messageId) {
        return false;
    }

    public List<Message> getAll() {
        return messages;
    }

    private void makeItEasy() {
        System.out.println("Before giving it back");
    }

    private void makeItHard() {
        System.out.println("I'm so hard:)");
    }
}
