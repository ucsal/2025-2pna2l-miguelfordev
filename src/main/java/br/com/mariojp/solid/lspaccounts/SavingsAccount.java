package br.com.mariojp.solid.lspaccounts;

public class SavingsAccount extends Account implements iWithdrawable{
    
    public void withdraw(double amount) {
    	System.out.println("SavingsAccount: Saque ignorado");
        //throw new UnsupportedOperationException("Saque não permitido em poupança");
    }
}