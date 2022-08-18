public class Motorbike extends Vehicle{
    private String cubicCentimeters;
    public Motorbike() {
    }

    public Motorbike(String iD, String brand, String yearOfMunufacture, double price, String color, int type, String cubicCentimeters) {
        super(iD, brand, yearOfMunufacture, price, color, type);
        this.cubicCentimeters = cubicCentimeters;
    }

    public void bocDau(){
        System.out.println("Bốc đầu zui ghê");
    }

    public String getCubicCentimeters() {
        return cubicCentimeters;
    }

    public void setCubicCentimeters(String cubicCentimeters) {
        this.cubicCentimeters = cubicCentimeters;
    }

    @Override
    public String showMe() {
        return "Motorbike{" +
                "cubicCentimeters='" + cubicCentimeters + '\'' +
                '}';
    }

    @Override
    public void dopNhienLieu() {
        System.out.println("Đớp nhiên liệu 1.5 lit xăng cho 100 km");
    }

}
