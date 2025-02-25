package exeption.bankclient;

interface BankWorker {
    boolean checkClientForCredit(BankClient client) throws BadCreditHistoryException, ProblemWithLawException;

}
