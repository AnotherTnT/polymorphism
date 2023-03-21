package taxes;

public class Usn15 extends TaxSystem {
    @Override
    public int calcTaxFor(int debit, int credit) {
        var result = ((debit - credit) * 0.15);
        return (int) result;
    }
}
