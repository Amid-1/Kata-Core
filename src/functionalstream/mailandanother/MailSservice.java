package functionalstream.mailandanother;

import java.util.*;
import java.util.function.Consumer;

class MailService<T> implements Consumer<AbstractMail<T>> {
    private final Map<String, List<T>> mailBox = new HashMap<>();

    @Override
    public void accept(AbstractMail<T> mail) {
        mailBox.computeIfAbsent(mail.getTo(), k -> new ArrayList<>()).add(mail.getContent());
    }

    public Map<String, List<T>> getMailBox() {
        return new HashMap<String, List<T>>(mailBox) {
            @Override
            public List<T> get(Object key) {
                return super.getOrDefault(key, Collections.emptyList());
            }
        };
    }
}
