import taxes.TaxSystem;
import taxes.Usn15;
import taxes.Usn6;

public class Main {
    public static TaxSystem usn6 = new Usn6();
    public static TaxSystem usn15 = new Usn15();

    public static void main(String[] args) {
        Company company = new Company("Domodedovo", usn6);
        Company company1 = new Company("Rossiya", usn15);
        company.shiftMoney(12000);
        company.payTaxes();
        company.setTaxSystem(usn15);
        company.shiftMoney(12000);
        company.payTaxes();
        company1.shiftMoney(12000);
        company1.payTaxes();
        company1.setTaxSystem(usn6);
        company1.shiftMoney(12000);
        company1.payTaxes();
        company1.setTaxSystem(usn15);
        company1.shiftMoney(12000);
        company1.payTaxes();
    }
}
