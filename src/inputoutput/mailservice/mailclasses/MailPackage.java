package inputoutput.mailservice.mailclasses;

import inputoutput.mailservice.mailservices.AbstractSendable;

/*
Посылка, содержимое которой можно получить с помощью метода `getContent`
*/

/*
Посылка, содержимое которой можно получить с помощью метода `getContent`
*/
public class MailPackage extends AbstractSendable {
    private final Package content;

    public MailPackage(String from, String to, Package content) {
        super(from, to);
        this.content = content;
    }

    public Package getContent() { return content; }
}


