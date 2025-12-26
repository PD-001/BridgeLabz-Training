class Customer {
    private String name;
    private double balance;
    private Bank bank; //association with Bank

    public Customer(String name) {
        this.name= name;
    }

    //setters used by Bank
    public void setBalance(double balance) {
        this.balance= balance;
    }

    public void setBank(Bank bank) {
        this.bank= bank;
    }

    //method to view balance
    public void viewBalance() {
        if (bank!=null) {
            System.out.println("Customer: "+ name);
            System.out.println("Bank: "+ bank.getBankName());
            System.out.println("Balance: ₹"+ balance);
        } else {
            System.out.println(name +" has no bank account.");
        }
    }

    public String getName() {
        return name;
    }
}
