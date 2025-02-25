package inputoutput.mailservice.mailservices;

/*
Абстрактный класс,который позволяет абстрагировать логику хранения
источника и получателя письма в соответствующих полях класса.
*/

public abstract class AbstractSendable implements Sendable {
    protected final String from;
    protected final String to;

    public AbstractSendable(String from, String to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public String getFrom() { return from; }

    @Override
    public String getTo() { return to; }
}
