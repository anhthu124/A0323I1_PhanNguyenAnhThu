package ss6_ke_thua.BaiTap.lopCirclrbVaLopCylinder;

public class Circle {
    public int banKinh;
    public String mauSac;

    public Circle(int banKinh, String mauSac) {
        this.banKinh = banKinh;
        this.mauSac = mauSac;
    }

    public Circle(int banKinh) {
        this.banKinh = banKinh;
    }

    public int getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(int banKinh) {
        this.banKinh = banKinh;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public double dienTich() {
        return Math.PI * Math.pow(banKinh, 2);

    }

    @Override
    public String toString() {
        return "Circle{" +
                "banKinh=" + banKinh +
                ", mauSac='" + mauSac + '\'' +
                '}' + ", dienTich='" + dienTich();
    }

}
