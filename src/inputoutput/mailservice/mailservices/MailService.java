package inputoutput.mailservice.mailservices;

import java.util.List;
import java.util.Map;

public interface MailService {
    Sendable processMail(Sendable mail);
}
