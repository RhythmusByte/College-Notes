class Acc {
    int accId;
    double accBal;

    Acc(int id, double accBal) {
        this.accId = id;
        this.accBal = accBal;
    }

    void withdraw(double amt) {
        accBal -= amt;
        System.out.println("Rs. " + amt + "\t Withdrawn Successfully");
    }

    void deposit(double amt) {
        accBal += amt;
        System.out.println("Rs. " + amt + "\t Deposited Successfully");
    }

    double getBal() {
        return accBal;
    }
    
    int getId() {
        return accId;
    }
}

public class AccInfo {
    public static void main(String[] args) {
        Acc acc1 = new Acc(101, 50000);
        System.out.println("Acc Id: " + acc1.getId() +"\tCurrent Bal: Rs. " + acc1.getBal());
        acc1.deposit(1000);
        System.out.println("Acc Id: " + acc1.getId() +"\tCurrent Bal: Rs. " + acc1.getBal());
        acc1.withdraw(500);
        System.out.println("Acc Id: " + acc1.getId() +"\tCurrent Bal: Rs. " + acc1.getBal());
        
        System.out.println("\n\n------------------\n\n");
        
        Acc acc2 = new Acc(202, 1000);
        System.out.println("Acc Id: " + acc2.getId() +"\tCurrent Bal: Rs. " + acc2.getBal());
        acc2.deposit(100000);
        acc2.withdraw(20000);
        System.out.println("Acc Id: " + acc2.getId() +"\tCurrent Bal: Rs. " + acc2.getBal());
        
        System.out.println("\n\n------------------\n\n");
        
        Acc acc3 = new Acc(303, 12);
        System.out.println("Acc Id: " + acc3.getId() + "\tCurrent Balance: Rs. " + acc3.getBal());
        acc3.deposit(500);
        acc3.withdraw(12);
        System.out.println("Acc Id: " + acc3.getId() + "\tCurrent Balance: Rs. " + acc3.getBal());
    }
}

/* Output

Acc Id: 101	Current Bal: Rs. 50000.0

Rs. 1000.0	 Deposited Successfully

Acc Id: 101	Current Bal: Rs. 51000.0

Rs. 500.0	 Withdrawn Successfully

Acc Id: 101	Current Bal: Rs. 50500.0





------------------





Acc Id: 202	Current Bal: Rs. 1000.0

Rs. 100000.0	 Deposited Successfully

Rs. 20000.0	 Withdrawn Successfully

Acc Id: 202	Current Bal: Rs. 81000.0





------------------





Acc Id: 303	Current Balance: Rs. 12.0

Rs. 500.0	 Deposited Successfully

Rs. 12.0	 Withdrawn Successfully

Acc Id: 303	Current Balance: Rs. 500.0



=== Code Execution Successful ===
*/
