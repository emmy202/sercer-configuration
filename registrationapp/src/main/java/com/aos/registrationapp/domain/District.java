package com.aos.registrationapp.domain;
import javax.persistence.*;
import java.util.List;
@Entity
public class District {
    @Id
    private String distId;
    private String distName;
    @ManyToOne
    private Province province;
    @OneToMany(mappedBy="district",fetch=FetchType.EAGER)
    List<Sector>sector;

    public String getDistId() {
        return distId;
    }

    public void setDistId(String distId) {
        this.distId = distId;
    }

    public String getDistName() {
        return distName;
    }

    public void setDistName(String distName) {
        this.distName = distName;
    }

    public Province getProvince() {
        return province;
    }

    public void setProvince(Province province) {
        this.province = province;
    }

    public List<Sector> getSector() {
        return sector;
    }

    public void setSector(List<Sector> sector) {
        this.sector = sector;
    }

    @Override
    public String toString() {
        return "District{" +
                "distId='" + distId + '\'' +
                ", distName='" + distName + '\'' +
                ", province=" + province +
                ", sector=" + sector +
                '}';
    }
}
