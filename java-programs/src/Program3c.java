public class MobileBill {
    private int localCalls;
    private int isdCalls;
    private int netPackage; // in GB
    private double totalBill;

    // Default constructor
    public MobileBill() {
        this.localCalls = 0;
        this.isdCalls = 0;
        this.netPackage = 0;
    }

    // Parameterized constructor
    public MobileBill(int localCalls, int isdCalls, int netPackage) {
        this.localCalls = localCalls;
        this.isdCalls = isdCalls;
        this.netPackage = netPackage;
    }

    // Method to calculate total bill
    public void calculateTotalBill() {
        totalBill = (localCalls * 0.10) + (isdCalls * 1.00) + (netPackage * 500);
    }

    // Method to display bill details
    public void displayBill() {
        System.out.println("Local Calls: " + localCalls);
        System.out.println("ISD Calls: " + isdCalls);
        System.out.println("Net Package (GB): " + netPackage);
        System.out.println("Total Bill: Rs. " + totalBill);
    }

    public static void main(String[] args) {
        // Using default constructor
        MobileBill bill1 = new MobileBill();
        bill1.localCalls = 10; // Example values
        bill1.isdCalls = 5;
        bill1.netPackage = 2;
        bill1.calculateTotalBill();
        bill1.displayBill();

        // Using parameterized constructor
        MobileBill bill2 = new MobileBill(20, 10, 3);
        bill2.calculateTotalBill();
        bill2.displayBill();
    }
}