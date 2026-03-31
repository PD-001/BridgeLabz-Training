package bankandaccountholders;

class Bank {
    private String bankName;

    public Bank(String bankName) {
        this.bankName= bankName;
    }

    //method to open an account for a customer
    public void openAccount(Customer customer, double initialBalance) {
        customer.setBank(this);
        customer.setBalance(initialBalance);
        System.out.println("Account opened for "+ customer.getName() +" at "+ bankName);
    }

    public String getBankName() {
        return bankName;
    }
}
