package packges;

public class emp {
    private String ename;
    private Designation desig;

    // Constructor
    public emp(String ename, Designation desig) {
        this.ename = ename;
        this.desig = desig;
    }

    // Default constructor
    public emp() {
        this.ename = "";
        this.desig = Designation.DEVELOPER; // default value
    }

    // Getter and Setter for ename
    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    // Getter and Setter for desig
    public Designation getDesig() {
        return desig;
    }

    public void setDesig(Designation desig) {
        this.desig = desig;
    }

    @Override
    public String toString() {
        return "emp [ename=" + ename + ", desig=" + desig + "]";
    }
}
