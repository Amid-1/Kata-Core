package functionalstream.mailandanother;

class MailMessage extends AbstractMail<String> {
    public MailMessage(String from, String to, String content) {
        super(from, to, content);
    }
}
