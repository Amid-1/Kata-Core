package exeption.bankclient;

public class BankService {
    public boolean getCreditForClient(BankWorker bankWorker, BankClient bankClient)  {
        try {
            return bankWorker.checkClientForCredit(bankClient);
        } catch (BadCreditHistoryException e) {
            System.out.println("Проблемы с банковской историей");
        } catch (ProblemWithLawException e) {
            System.out.println("Проблемы с законом");
        }
        return false;
    }
}
