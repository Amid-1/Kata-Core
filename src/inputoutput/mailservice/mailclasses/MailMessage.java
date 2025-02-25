package inputoutput.mailservice.mailclasses;

import inputoutput.mailservice.mailservices.AbstractSendable;

/*
Письмо, у которого есть текст, который можно получить с помощью метода `getMessage`
*/
public class MailMessage extends AbstractSendable {
    private final String message;

    public MailMessage(String from, String to, String message) {
        super(from, to);
        this.message = message;
    }

    public String getMessage() { return message; }
}