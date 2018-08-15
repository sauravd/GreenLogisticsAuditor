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
@Table(name = "MAINTENANCE")
@NamedQueries({
    @NamedQuery(name = "Maintenance.findAll", query = "SELECT m FROM Maintenance m")
    , @NamedQuery(name = "Maintenance.findByMid", query = "SELECT m FROM Maintenance m WHERE m.mid = :mid")
    , @NamedQuery(name = "Maintenance.findByTireMgmtPlan", query = "SELECT m FROM Maintenance m WHERE m.tireMgmtPlan = :tireMgmtPlan")
    , @NamedQuery(name = "Maintenance.findByAvgTirePressure", query = "SELECT m FROM Maintenance m WHERE m.avgTirePressure = :avgTirePressure")
    , @NamedQuery(name = "Maintenance.findByAvgTireDepthNumerator", query = "SELECT m FROM Maintenance m WHERE m.avgTireDepthNumerator = :avgTireDepthNumerator")
    , @NamedQuery(name = "Maintenance.findByAvgTireDepthDenominator", query = "SELECT m FROM Maintenance m WHERE m.avgTireDepthDenominator = :avgTireDepthDenominator")
    , @NamedQuery(name = "Maintenance.findByRefrigerantType", query = "SELECT m FROM Maintenance m WHERE m.refrigerantType = :refrigerantType")
    , @NamedQuery(name = "Maintenance.findByMaintenancePlan", query = "SELECT m FROM Maintenance m WHERE m.maintenancePlan = :maintenancePlan")
    , @NamedQuery(name = "Maintenance.findByAnalyzeMaintenanceData", query = "SELECT m FROM Maintenance m WHERE m.analyzeMaintenanceData = :analyzeMaintenanceData")
    , @NamedQuery(name = "Maintenance.findByInvestigateBreakdown", query = "SELECT m FROM Maintenance m WHERE m.investigateBreakdown = :investigateBreakdown")})
public class Maintenance implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "MID")
    private Integer mid;
    @Column(name = "TIRE_MGMT_PLAN")
    private String tireMgmtPlan;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "AVG_TIRE_PRESSURE")
    private Double avgTirePressure;
    @Column(name = "AVG_TIRE_DEPTH_NUMERATOR")
    private Double avgTireDepthNumerator;
    @Column(name = "AVG_TIRE_DEPTH_DENOMINATOR")
    private Double avgTireDepthDenominator;
    @Column(name = "REFRIGERANT_TYPE")
    private String refrigerantType;
    @Column(name = "MAINTENANCE_PLAN")
    private String maintenancePlan;
    @Column(name = "ANALYZE_MAINTENANCE_DATA")
    private String analyzeMaintenanceData;
    @Column(name = "INVESTIGATE_BREAKDOWN")
    private String investigateBreakdown;

    public Maintenance() {
    }

    public Maintenance(Integer mid) {
        this.mid = mid;
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public String getTireMgmtPlan() {
        return tireMgmtPlan;
    }

    public void setTireMgmtPlan(String tireMgmtPlan) {
        this.tireMgmtPlan = tireMgmtPlan;
    }

    public Double getAvgTirePressure() {
        return avgTirePressure;
    }

    public void setAvgTirePressure(Double avgTirePressure) {
        this.avgTirePressure = avgTirePressure;
    }

    public Double getAvgTireDepthNumerator() {
        return avgTireDepthNumerator;
    }

    public void setAvgTireDepthNumerator(Double avgTireDepthNumerator) {
        this.avgTireDepthNumerator = avgTireDepthNumerator;
    }

    public Double getAvgTireDepthDenominator() {
        return avgTireDepthDenominator;
    }

    public void setAvgTireDepthDenominator(Double avgTireDepthDenominator) {
        this.avgTireDepthDenominator = avgTireDepthDenominator;
    }

    public String getRefrigerantType() {
        return refrigerantType;
    }

    public void setRefrigerantType(String refrigerantType) {
        this.refrigerantType = refrigerantType;
    }

    public String getMaintenancePlan() {
        return maintenancePlan;
    }

    public void setMaintenancePlan(String maintenancePlan) {
        this.maintenancePlan = maintenancePlan;
    }

    public String getAnalyzeMaintenanceData() {
        return analyzeMaintenanceData;
    }

    public void setAnalyzeMaintenanceData(String analyzeMaintenanceData) {
        this.analyzeMaintenanceData = analyzeMaintenanceData;
    }

    public String getInvestigateBreakdown() {
        return investigateBreakdown;
    }

    public void setInvestigateBreakdown(String investigateBreakdown) {
        this.investigateBreakdown = investigateBreakdown;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mid != null ? mid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Maintenance)) {
            return false;
        }
        Maintenance other = (Maintenance) object;
        if ((this.mid == null && other.mid != null) || (this.mid != null && !this.mid.equals(other.mid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "greenlogisticsauditor.Maintenance[ mid=" + mid + " ]";
    }
    
}
