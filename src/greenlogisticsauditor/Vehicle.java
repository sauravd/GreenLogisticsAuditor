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
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Saurav Dahal <www.sauravdahal.com>
 */
@Entity
@Table(name = "VEHICLE")
@NamedQueries({
    @NamedQuery(name = "Vehicle.findAll", query = "SELECT v FROM Vehicle v")
    , @NamedQuery(name = "Vehicle.findByVid", query = "SELECT v FROM Vehicle v WHERE v.vid = :vid")
    , @NamedQuery(name = "Vehicle.findByFueltype", query = "SELECT v FROM Vehicle v WHERE v.fueltype = :fueltype")
    , @NamedQuery(name = "Vehicle.findByVehicletype", query = "SELECT v FROM Vehicle v WHERE v.vehicletype = :vehicletype")
    , @NamedQuery(name = "Vehicle.findByFuelconsumption", query = "SELECT v FROM Vehicle v WHERE v.fuelconsumption = :fuelconsumption")
    , @NamedQuery(name = "Vehicle.findByKilometers", query = "SELECT v FROM Vehicle v WHERE v.kilometers = :kilometers")})
public class Vehicle implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "VID")
    private Integer vid;
    @Column(name = "FUELTYPE")
    private String fueltype;
    @Column(name = "VEHICLETYPE")
    private String vehicletype;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "FUELCONSUMPTION")
    private Double fuelconsumption;
    @Column(name = "KILOMETERS")
    private Double kilometers;

    public Vehicle() {
    }

    public Vehicle(Integer vid) {
        this.vid = vid;
    }

    public Integer getVid() {
        return vid;
    }

    public void setVid(Integer vid) {
        this.vid = vid;
    }

    public String getFueltype() {
        return fueltype;
    }

    public void setFueltype(String fueltype) {
        this.fueltype = fueltype;
    }

    public String getVehicletype() {
        return vehicletype;
    }

    public void setVehicletype(String vehicletype) {
        this.vehicletype = vehicletype;
    }

    public Double getFuelconsumption() {
        return fuelconsumption;
    }

    public void setFuelconsumption(Double fuelconsumption) {
        this.fuelconsumption = fuelconsumption;
    }

    public Double getKilometers() {
        return kilometers;
    }

    public void setKilometers(Double kilometers) {
        this.kilometers = kilometers;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (vid != null ? vid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Vehicle)) {
            return false;
        }
        Vehicle other = (Vehicle) object;
        if ((this.vid == null && other.vid != null) || (this.vid != null && !this.vid.equals(other.vid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "greenlogisticsauditor.Vehicle[ vid=" + vid + " ]";
    }
    
}
