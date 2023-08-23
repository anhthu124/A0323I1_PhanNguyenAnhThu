package ss6_ke_thua.BaiTap.lopCirclrbVaLopCylinder;

public class Cylinder extends Circle {
    public int chieuCao;

    public Cylinder(int banKinh, String mauSac, int chieuCao) {
        super(banKinh, mauSac);
        this.chieuCao = chieuCao;
    }

    public int getChieuCao() {
        return chieuCao;
    }

    public void setChieuCao(int chieuCao) {
        this.chieuCao = chieuCao;
    }

    public double theTich() {
        return dienTich() * chieuCao;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "banKinh=" + banKinh +
                ", mauSac='" + mauSac + '\'' +
                ", chieuCao=" + chieuCao + ", the tich =" + theTich() +
                '}';
    }
}
