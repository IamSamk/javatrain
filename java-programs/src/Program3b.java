public class Customer {
    private String name;
    private double billAmount;
    private double discount;
    private double payableAmount;

    public Customer(String name, double billAmount) {
        this.name = name;
        this.billAmount = billAmount;
        calculateDiscount();
    }

    private void calculateDiscount() {
        if (billAmount >= 2000) {
            discount = billAmount * 0.08;
        } else if (billAmount >= 1000) {
            discount = billAmount * 0.06;
        } else if (billAmount >= 500) {
            discount = billAmount * 0.05;
        } else {
            discount = 0;
        }
        payableAmount = billAmount - discount;
    }

    public void displayCustomerDetails() {
        System.out.println("Customer Name: " + name);
        System.out.println("Bill Amount: " + billAmount);
        System.out.println("Discount: " + discount);
        System.out.println("Payable Amount: " + payableAmount);
    }

    public static void main(String[] args) {
        Customer customer = new Customer("John Doe", 1200);
        customer.displayCustomerDetails();
    }
}