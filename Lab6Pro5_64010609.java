public class Lab6Pro5_64010609 {
    public static void main(String[] args) {
        Tax tax = new Tax();
        tax.setTaxableIncome(400000);
        System.out.println("Tax is " + tax.getTax());
    }
}
