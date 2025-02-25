package inputoutput.mailservice;

import inputoutput.mailservice.mailservices.MailService;
import inputoutput.mailservice.mailservices.Sendable;

public class UntrustworthyMailWorker implements MailService {
    private final MailService[] mailServices;
    private final RealMailService realMailService = new RealMailService();

    public UntrustworthyMailWorker(MailService[] mailServices) {
        this.mailServices = mailServices;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        for (MailService service : mailServices) {
            mail = service.processMail(mail);
        }
        return realMailService.processMail(mail);
    }

    public RealMailService getRealMailService() {
        return realMailService;
    }
}