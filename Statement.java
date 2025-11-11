import java.util.Enumeration;

public abstract class Statement {
    public abstract String headerString(Customer aCustomer);
    public abstract String eachRentalString(Rental aRental);
    public abstract String footerString(Customer aCustomer);
}