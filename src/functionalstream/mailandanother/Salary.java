package functionalstream.mailandanother;

class Salary extends AbstractMail<Integer> {
    public Salary(String from, String to, Integer amount) {
        super(from, to, amount);
    }
}
