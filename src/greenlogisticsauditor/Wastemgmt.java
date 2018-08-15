/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greenlogisticsauditor;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Saurav Dahal <www.sauravdahal.com>
 */
@Entity
@Table(name = "WASTEMGMT")
@NamedQueries({
    @NamedQuery(name = "Wastemgmt.findAll", query = "SELECT w FROM Wastemgmt w")
    , @NamedQuery(name = "Wastemgmt.findByWid", query = "SELECT w FROM Wastemgmt w WHERE w.wid = :wid")
    , @NamedQuery(name = "Wastemgmt.findByWasteMeasurement", query = "SELECT w FROM Wastemgmt w WHERE w.wasteMeasurement = :wasteMeasurement")
    , @NamedQuery(name = "Wastemgmt.findByTruckWaste", query = "SELECT w FROM Wastemgmt w WHERE w.truckWaste = :truckWaste")
    , @NamedQuery(name = "Wastemgmt.findByEngineoilWaste", query = "SELECT w FROM Wastemgmt w WHERE w.engineoilWaste = :engineoilWaste")
    , @NamedQuery(name = "Wastemgmt.findByTireWaste", query = "SELECT w FROM Wastemgmt w WHERE w.tireWaste = :tireWaste")
    , @NamedQuery(name = "Wastemgmt.findByElectricalWaste", query = "SELECT w FROM Wastemgmt w WHERE w.electricalWaste = :electricalWaste")
    , @NamedQuery(name = "Wastemgmt.findByOfficeWaste", query = "SELECT w FROM Wastemgmt w WHERE w.officeWaste = :officeWaste")
    , @NamedQuery(name = "Wastemgmt.findByWaterWaste", query = "SELECT w FROM Wastemgmt w WHERE w.waterWaste = :waterWaste")})
public class Wastemgmt implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "WID")
    private Integer wid;
    @Column(name = "WASTE_MEASUREMENT")
    private String wasteMeasurement;
    @Column(name = "TRUCK_WASTE")
    private String truckWaste;
    @Column(name = "ENGINEOIL_WASTE")
    private String engineoilWaste;
    @Column(name = "TIRE_WASTE")
    private String tireWaste;
    @Column(name = "ELECTRICAL_WASTE")
    private String electricalWaste;
    @Column(name = "OFFICE_WASTE")
    private String officeWaste;
    @Column(name = "WATER_WASTE")
    private String waterWaste;

    public Wastemgmt() {
    }

    public Wastemgmt(Integer wid) {
        this.wid = wid;
    }

    public Integer getWid() {
        return wid;
    }

    public void setWid(Integer wid) {
        this.wid = wid;
    }

    public String getWasteMeasurement() {
        return wasteMeasurement;
    }

    public void setWasteMeasurement(String wasteMeasurement) {
        this.wasteMeasurement = wasteMeasurement;
    }

    public String getTruckWaste() {
        return truckWaste;
    }

    public void setTruckWaste(String truckWaste) {
        this.truckWaste = truckWaste;
    }

    public String getEngineoilWaste() {
        return engineoilWaste;
    }

    public void setEngineoilWaste(String engineoilWaste) {
        this.engineoilWaste = engineoilWaste;
    }

    public String getTireWaste() {
        return tireWaste;
    }

    public void setTireWaste(String tireWaste) {
        this.tireWaste = tireWaste;
    }

    public String getElectricalWaste() {
        return electricalWaste;
    }

    public void setElectricalWaste(String electricalWaste) {
        this.electricalWaste = electricalWaste;
    }

    public String getOfficeWaste() {
        return officeWaste;
    }

    public void setOfficeWaste(String officeWaste) {
        this.officeWaste = officeWaste;
    }

    public String getWaterWaste() {
        return waterWaste;
    }

    public void setWaterWaste(String waterWaste) {
        this.waterWaste = waterWaste;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (wid != null ? wid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Wastemgmt)) {
            return false;
        }
        Wastemgmt other = (Wastemgmt) object;
        if ((this.wid == null && other.wid != null) || (this.wid != null && !this.wid.equals(other.wid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "greenlogisticsauditor.Wastemgmt[ wid=" + wid + " ]";
    }
    
}
