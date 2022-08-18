public class Truck extends Vehicle {
    private int tonnage;

    public Truck() {
    }

    public Truck(String iD, String brand, String yearOfMunufacture, double price, String color, int type, int tonnage) {
        super(iD, brand, yearOfMunufacture, price, color, type);
        this.tonnage = tonnage;
    }

    public int getTonnage() {
        return tonnage;
    }

    public void setTonnage(int tonnage) {
        this.tonnage = tonnage;
    }

    public void goHang() {
        System.out.println("đang go hang xuong");
    }

    @Override
    public String showMe() {
        return "Truck{" +
                "tonnage=" + tonnage +
                '}';

    }

    @Override
    public void dopNhienLieu() {
        System.out.println(" Đớp nhiên liệu 6 lít dầu cho 100km");
    }

}
