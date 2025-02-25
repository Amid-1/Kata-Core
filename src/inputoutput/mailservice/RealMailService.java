package inputoutput.mailservice;

import inputoutput.mailservice.mailservices.MailService;
import inputoutput.mailservice.mailservices.Sendable;

public class RealMailService implements MailService {
    @Override
    public Sendable processMail(Sendable mail) {
        return mail;
    }
}
