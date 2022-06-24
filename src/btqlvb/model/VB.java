/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btqlvb.model;

/**
 *
 * @author Manh Ha
 */
public class VB {
    private String soVB;
    private String tenVB;
    private String loaiVB;
    private String coquan;
    private String ngayGuiNhan;
    
    private String ngayKy;
    private String nguoiKy;
    private String kieuvb;
    private String noiDung;

    public VB() {
    }

    public VB(String soVB, String tenVB, String loaiVB, String coquan, String ngayGuiNhan, String ngayKy, String nguoiKy, String kieuvb, String noiDung) {
        this.soVB = soVB;
        this.tenVB = tenVB;
        this.loaiVB = loaiVB;
        this.coquan = coquan;
        this.ngayGuiNhan = ngayGuiNhan;
        this.ngayKy = ngayKy;
        this.nguoiKy = nguoiKy;
        this.kieuvb = kieuvb;
        this.noiDung = noiDung;
    }

    public String getSoVB() {
        return soVB;
    }

    public void setSoVB(String soVB) {
        this.soVB = soVB;
    }

    public String getTenVB() {
        return tenVB;
    }

    public void setTenVB(String tenVB) {
        this.tenVB = tenVB;
    }

    public String getLoaiVB() {
        return loaiVB;
    }

    public void setLoaiVB(String loaiVB) {
        this.loaiVB = loaiVB;
    }

    public String getCoquan() {
        return coquan;
    }

    public void setCoquan(String coquan) {
        this.coquan = coquan;
    }

    public String getNgayGuiNhan() {
        return ngayGuiNhan;
    }

    public void setNgayGuiNhan(String ngayGuiNhan) {
        this.ngayGuiNhan = ngayGuiNhan;
    }

    public String getNgayKy() {
        return ngayKy;
    }

    public void setNgayKy(String ngayKy) {
        this.ngayKy = ngayKy;
    }

    public String getNguoiKy() {
        return nguoiKy;
    }

    public void setNguoiKy(String nguoiKy) {
        this.nguoiKy = nguoiKy;
    }

    public String getKieuvb() {
        return kieuvb;
    }

    public void setKieuvb(String kieuvb) {
        this.kieuvb = kieuvb;
    }

    public String getNoiDung() {
        return noiDung;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    
}
