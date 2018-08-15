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
@Table(name = "PROCUREMENT")
@NamedQueries({
    @NamedQuery(name = "Procurement.findAll", query = "SELECT p FROM Procurement p")
    , @NamedQuery(name = "Procurement.findByPid", query = "SELECT p FROM Procurement p WHERE p.pid = :pid")
    , @NamedQuery(name = "Procurement.findByHaveGreenProduct", query = "SELECT p FROM Procurement p WHERE p.haveGreenProduct = :haveGreenProduct")
    , @NamedQuery(name = "Procurement.findBySeekGreenProduct", query = "SELECT p FROM Procurement p WHERE p.seekGreenProduct = :seekGreenProduct")
    , @NamedQuery(name = "Procurement.findByHaveEuroStdVehicle", query = "SELECT p FROM Procurement p WHERE p.haveEuroStdVehicle = :haveEuroStdVehicle")})
public class Procurement implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "PID")
    private Integer pid;
    @Column(name = "HAVE_GREEN_PRODUCT")
    private String haveGreenProduct;
    @Column(name = "SEEK_GREEN_PRODUCT")
    private String seekGreenProduct;
    @Column(name = "HAVE_EURO_STD_VEHICLE")
    private String haveEuroStdVehicle;

    public Procurement() {
    }

    public Procurement(Integer pid) {
        this.pid = pid;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getHaveGreenProduct() {
        return haveGreenProduct;
    }

    public void setHaveGreenProduct(String haveGreenProduct) {
        this.haveGreenProduct = haveGreenProduct;
    }

    public String getSeekGreenProduct() {
        return seekGreenProduct;
    }

    public void setSeekGreenProduct(String seekGreenProduct) {
        this.seekGreenProduct = seekGreenProduct;
    }

    public String getHaveEuroStdVehicle() {
        return haveEuroStdVehicle;
    }

    public void setHaveEuroStdVehicle(String haveEuroStdVehicle) {
        this.haveEuroStdVehicle = haveEuroStdVehicle;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pid != null ? pid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Procurement)) {
            return false;
        }
        Procurement other = (Procurement) object;
        if ((this.pid == null && other.pid != null) || (this.pid != null && !this.pid.equals(other.pid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "greenlogisticsauditor.Procurement[ pid=" + pid + " ]";
    }
    
}
