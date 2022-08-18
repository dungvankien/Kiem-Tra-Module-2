public abstract class Vehicle {
    private String iD;
    private String brand;
    private String yearOfMunufacture;
    private double price;
    private String color;
    private int type;

    public abstract String showMe();

    public abstract void dopNhienLieu();

    public Vehicle() {
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public Vehicle(String iD, String brand, String yearOfMunufacture, double price, String color, int type) {
        this.iD = iD;
        this.brand = brand;
        this.yearOfMunufacture = yearOfMunufacture;
        this.price = price;
        this.color = color;
        this.type = type;
    }

    public String getiD() {
        return iD;
    }

    public void setiD(String iD) {
        this.iD = iD;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getYearOfMunufacture() {
        return yearOfMunufacture;
    }

    public void setYearOfMunufacture(String yearOfMunufacture) {
        this.yearOfMunufacture = yearOfMunufacture;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
