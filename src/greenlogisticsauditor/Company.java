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
@Table(name = "COMPANY")
@NamedQueries({
    @NamedQuery(name = "Company.findAll", query = "SELECT c FROM Company c")
    , @NamedQuery(name = "Company.findByCid", query = "SELECT c FROM Company c WHERE c.cid = :cid")
    , @NamedQuery(name = "Company.findByCName", query = "SELECT c FROM Company c WHERE c.cName = :cName")
    , @NamedQuery(name = "Company.findByCPhoneNo", query = "SELECT c FROM Company c WHERE c.cPhoneNo = :cPhoneNo")
    , @NamedQuery(name = "Company.findByCEmailAddress", query = "SELECT c FROM Company c WHERE c.cEmailAddress = :cEmailAddress")
    , @NamedQuery(name = "Company.findByCCountry", query = "SELECT c FROM Company c WHERE c.cCountry = :cCountry")
    , @NamedQuery(name = "Company.findByCCity", query = "SELECT c FROM Company c WHERE c.cCity = :cCity")})
public class Company implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "CID")
    private Integer cid;
    @Column(name = "C_NAME")
    private String cName;
    @Column(name = "C_PHONE_NO")
    private Integer cPhoneNo;
    @Column(name = "C_EMAIL_ADDRESS")
    private String cEmailAddress;
    @Column(name = "C_COUNTRY")
    private String cCountry;
    @Column(name = "C_CITY")
    private String cCity;

    public Company() {
    }

    public Company(Integer cid) {
        this.cid = cid;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCName() {
        return cName;
    }

    public void setCName(String cName) {
        this.cName = cName;
    }

    public Integer getCPhoneNo() {
        return cPhoneNo;
    }

    public void setCPhoneNo(Integer cPhoneNo) {
        this.cPhoneNo = cPhoneNo;
    }

    public String getCEmailAddress() {
        return cEmailAddress;
    }

    public void setCEmailAddress(String cEmailAddress) {
        this.cEmailAddress = cEmailAddress;
    }

    public String getCCountry() {
        return cCountry;
    }

    public void setCCountry(String cCountry) {
        this.cCountry = cCountry;
    }

    public String getCCity() {
        return cCity;
    }

    public void setCCity(String cCity) {
        this.cCity = cCity;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cid != null ? cid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Company)) {
            return false;
        }
        Company other = (Company) object;
        if ((this.cid == null && other.cid != null) || (this.cid != null && !this.cid.equals(other.cid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "greenlogisticsauditor.Company[ cid=" + cid + " ]";
    }
    
}
