package ch16.quiz6;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Message {
    private String receiver;
    private String sender;
    private String content;

    @Override
    public String toString() {
        return "["+this.getReceiver() +" → "+this.getSender()+"]\n"+this.getContent();
    }
}
