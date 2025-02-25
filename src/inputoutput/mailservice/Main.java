package inputoutput.mailservice;

import inputoutput.mailservice.exceptions.IllegalPackageException;
import inputoutput.mailservice.exceptions.StolenPackageException;
import inputoutput.mailservice.mailclasses.MailMessage;
import inputoutput.mailservice.mailclasses.MailPackage;
import inputoutput.mailservice.mailservices.MailService;
import inputoutput.mailservice.mailservices.Sendable;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static final String AUSTIN_POWERS = "Austin Powers";
    public static final String WEAPONS = "weapons";
    public static final String BANNED_SUBSTANCE = "banned substance";

    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Main.class.getName());

        Inspector inspector = new Inspector();
        Spy spy = new Spy(logger);
        Thief thief = new Thief(10000);
        MailService[] variousWorkers = new MailService[]{spy, thief, inspector};
        UntrustworthyMailWorker worker = new UntrustworthyMailWorker(variousWorkers);

        Sendable[] correspondence = {
                new MailMessage("Oxxxymiron", "Гнойный", "Я здесь чисто по фану..."),
                new MailMessage(AUSTIN_POWERS, "Психиатр", "Помогите"),
                new MailPackage("NASA", AUSTIN_POWERS, new Package("stones", 1000)),
                new MailPackage("Китай", "КНДР", new Package(BANNED_SUBSTANCE, 99)),
        };

        for (Sendable mail : correspondence) {
            try {
                worker.processMail(mail);
            } catch (StolenPackageException e) {
                logger.log(Level.WARNING, "Inspector found stolen package: " + e);
            } catch (IllegalPackageException e) {
                logger.log(Level.WARNING, "Inspector found illegal package: " + e);
            }
        }
    }
}
