public class Car extends Vehicle {
    private String seatingCapacity;
    private String typeEngine;

    public Car() {
    }

    public Car(String iD, String brand, String yearOfMunufacture, double price, String color, int type, String seatingCapacity, String typeEngine) {
        super(iD, brand, yearOfMunufacture, price, color, type);
        this.seatingCapacity = seatingCapacity;
        this.typeEngine = typeEngine;
    }

    public void moCuaSoTroi() {
        System.out.println("Đã mở cửa sổ trời, mời thưởng thức");
    }

    public String getSeatingCapacity() {
        return seatingCapacity;
    }

    public void setSeatingCapacity(String seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }

    public String getTypeEngine() {
        return typeEngine;
    }

    public void setTypeEngine(String typeEngine) {
        this.typeEngine = typeEngine;
    }

    @Override
    public String showMe() {
        return "Car{" +
                "seatingCapacity='" + seatingCapacity + '\'' +
                ", typeEngine='" + typeEngine + '\'' +
                '}';
    }

    @Override
    public void dopNhienLieu() {
        System.out.println(" Đớn nhiên liệu 7 lít Xăn cho một 100KM");
    }

}
