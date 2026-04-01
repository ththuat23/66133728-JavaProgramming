package QLHocSinh;

public class HocSinh {
    private String tenHS;
    private short tuoiHS;
    private String lopHS;

    public HocSinh(){}

    public HocSinh(String tenHS, short tuoiHS, String lopHS){
        super();
        this.tenHS = tenHS;
        this.tuoiHS = tuoiHS;
        this.lopHS = lopHS;
    }

    public String getTenHS() {
        return this.tenHS;
    }

    public void setTenHS(String tenHS) {
        this.tenHS = tenHS;
    }

    public short getTuoiHS() {
        return this.tuoiHS;
    }

    public void setTuoiHS(short tuoiHS) {
        this.tuoiHS = tuoiHS;
    }

    public String getLopHS() {
        return this.lopHS;
    }

    public void setLopHS(String lopHS) {
        this.lopHS = lopHS;
    }

    @Override
    public String toString() {
        return "{" +
            " tenHS='" + getTenHS() + "'" +
            ", tuoiHS='" + getTuoiHS() + "'" +
            ", lopHS='" + getLopHS() + "'" +
            "}";
    }
}
