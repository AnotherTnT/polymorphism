package taxes;

public class Usn6 extends TaxSystem {
    @Override
    public int calcTaxFor(int debit, int credit) {
        var result = (debit * 0.06);
        return (int) result;
    }
}
