package inputoutput.mailservice;

import inputoutput.mailservice.mailclasses.MailPackage;
import inputoutput.mailservice.mailservices.MailService;
import inputoutput.mailservice.mailservices.Sendable;

public class Thief implements MailService {
    private final int minPrice;
    private int stolenValue = 0;

    public Thief(int minPrice) {
        this.minPrice = minPrice;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        if (mail instanceof MailPackage) {
            MailPackage mailPackage = (MailPackage) mail;
            Package content = mailPackage.getContent();

            if (content.getPrice() >= minPrice) {
                stolenValue += content.getPrice();
                Package stolenPackage = new Package("stones instead of " + content.getContent(), 0);
                return new MailPackage(mail.getFrom(), mail.getTo(), stolenPackage);
            }
        }
        return mail;
    }

    public int getStolenValue() {
        return stolenValue;
    }
}