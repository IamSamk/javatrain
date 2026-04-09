public abstract class Bank {
    public abstract int getBalance();
}

class BankA extends Bank {
    public int getBalance() {
        return 100;
    }
}

class BankB extends Bank {
    public int getBalance() {
        return 150;
    }
}

class BankC extends Bank {
    public int getBalance() {
        return 200;
    }
}

public class Program4c {
    public static void main(String[] args) {
        Bank bankA = new BankA();
        Bank bankB = new BankB();
        Bank bankC = new BankC();

        System.out.println("Bank A Balance: $" + bankA.getBalance());
        System.out.println("Bank B Balance: $" + bankB.getBalance());
        System.out.println("Bank C Balance: $" + bankC.getBalance());
    }
}