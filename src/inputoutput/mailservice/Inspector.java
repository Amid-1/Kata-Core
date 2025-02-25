package inputoutput.mailservice;

import inputoutput.mailservice.exceptions.IllegalPackageException;
import inputoutput.mailservice.exceptions.StolenPackageException;
import inputoutput.mailservice.mailclasses.MailPackage;
import inputoutput.mailservice.mailservices.MailService;
import inputoutput.mailservice.mailservices.Sendable;

public class Inspector implements MailService {
    @Override
    public Sendable processMail(Sendable mail) {
        if (mail instanceof MailPackage) {
            MailPackage mailPackage = (MailPackage) mail;
            Package content = mailPackage.getContent();

            if (content.getContent().contains(Main.WEAPONS) || content.getContent().contains(Main.BANNED_SUBSTANCE)) {
                throw new IllegalPackageException("Illegal package: " + content.getContent());
            }

            if (content.getContent().contains("stones")) {
                throw new StolenPackageException("Stolen package: " + content.getContent());
            }
        }
        return mail;
    }
}
