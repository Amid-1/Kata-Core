package inputoutput.mailservice;

import inputoutput.mailservice.mailclasses.MailMessage;
import inputoutput.mailservice.mailservices.MailService;
import inputoutput.mailservice.mailservices.Sendable;
import java.util.logging.Level;
import java.util.logging.Logger;

import static inputoutput.mailservice.Main.AUSTIN_POWERS;

public class Spy implements MailService {
    private final Logger logger;

    public Spy(Logger logger) {
        this.logger = logger;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        if (mail instanceof MailMessage) {
            MailMessage message = (MailMessage) mail;

            if (Main.AUSTIN_POWERS.equals(message.getFrom()) || Main.AUSTIN_POWERS.equals(message.getTo())) {
                logger.log(Level.WARNING, "Detected target mail correspondence: from {0} to {1} \"{2}\"",
                        new Object[]{message.getFrom(), message.getTo(), message.getMessage()});
            } else {
                logger.log(Level.INFO, "Usual correspondence: from {0} to {1}",
                        new Object[]{message.getFrom(), message.getTo()});
            }
        }
        return mail;
    }
}
