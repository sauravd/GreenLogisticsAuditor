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
@Table(name = "OPERATIONS")
@NamedQueries({
    @NamedQuery(name = "Operations.findAll", query = "SELECT o FROM Operations o")
    , @NamedQuery(name = "Operations.findByOperid", query = "SELECT o FROM Operations o WHERE o.operid = :operid")
    , @NamedQuery(name = "Operations.findByTotalFuleConsumption", query = "SELECT o FROM Operations o WHERE o.totalFuleConsumption = :totalFuleConsumption")
    , @NamedQuery(name = "Operations.findByTotalDistanceTravelled", query = "SELECT o FROM Operations o WHERE o.totalDistanceTravelled = :totalDistanceTravelled")
    , @NamedQuery(name = "Operations.findByTotalAvgOperatingHrs", query = "SELECT o FROM Operations o WHERE o.totalAvgOperatingHrs = :totalAvgOperatingHrs")
    , @NamedQuery(name = "Operations.findByTotalEmptyTrips", query = "SELECT o FROM Operations o WHERE o.totalEmptyTrips = :totalEmptyTrips")
    , @NamedQuery(name = "Operations.findByMonitorCustFeedback", query = "SELECT o FROM Operations o WHERE o.monitorCustFeedback = :monitorCustFeedback")
    , @NamedQuery(name = "Operations.findByTotalPerctDamage", query = "SELECT o FROM Operations o WHERE o.totalPerctDamage = :totalPerctDamage")
    , @NamedQuery(name = "Operations.findByRouteMgmtSys", query = "SELECT o FROM Operations o WHERE o.routeMgmtSys = :routeMgmtSys")
    , @NamedQuery(name = "Operations.findByAvgCapacityUtilization", query = "SELECT o FROM Operations o WHERE o.avgCapacityUtilization = :avgCapacityUtilization")
    , @NamedQuery(name = "Operations.findByAvgDropSize", query = "SELECT o FROM Operations o WHERE o.avgDropSize = :avgDropSize")
    , @NamedQuery(name = "Operations.findByDetailFleetList", query = "SELECT o FROM Operations o WHERE o.detailFleetList = :detailFleetList")
    , @NamedQuery(name = "Operations.findByAccidentRecord", query = "SELECT o FROM Operations o WHERE o.accidentRecord = :accidentRecord")
    , @NamedQuery(name = "Operations.findByAvgVehicleAge", query = "SELECT o FROM Operations o WHERE o.avgVehicleAge = :avgVehicleAge")
    , @NamedQuery(name = "Operations.findByStandardUsed", query = "SELECT o FROM Operations o WHERE o.standardUsed = :standardUsed")
    , @NamedQuery(name = "Operations.findByFreightTrackingSys", query = "SELECT o FROM Operations o WHERE o.freightTrackingSys = :freightTrackingSys")
    , @NamedQuery(name = "Operations.findByKpiEmbraced", query = "SELECT o FROM Operations o WHERE o.kpiEmbraced = :kpiEmbraced")
    , @NamedQuery(name = "Operations.findByFleetInspection", query = "SELECT o FROM Operations o WHERE o.fleetInspection = :fleetInspection")
    , @NamedQuery(name = "Operations.findByRouteComplianceRecord", query = "SELECT o FROM Operations o WHERE o.routeComplianceRecord = :routeComplianceRecord")
    , @NamedQuery(name = "Operations.findByCostPerUnitTransport", query = "SELECT o FROM Operations o WHERE o.costPerUnitTransport = :costPerUnitTransport")
    , @NamedQuery(name = "Operations.findByAvgIdilingTime", query = "SELECT o FROM Operations o WHERE o.avgIdilingTime = :avgIdilingTime")
    , @NamedQuery(name = "Operations.findByOrderSchedulingSw", query = "SELECT o FROM Operations o WHERE o.orderSchedulingSw = :orderSchedulingSw")})
public class Operations implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "OPERID")
    private Integer operid;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "TOTAL_FULE_CONSUMPTION")
    private Double totalFuleConsumption;
    @Column(name = "TOTAL_DISTANCE_TRAVELLED")
    private Double totalDistanceTravelled;
    @Column(name = "TOTAL_AVG_OPERATING_HRS")
    private Double totalAvgOperatingHrs;
    @Column(name = "TOTAL_EMPTY_TRIPS")
    private Double totalEmptyTrips;
    @Column(name = "MONITOR_CUST_FEEDBACK")
    private String monitorCustFeedback;
    @Column(name = "TOTAL_PERCT_DAMAGE")
    private Double totalPerctDamage;
    @Column(name = "ROUTE_MGMT_SYS")
    private String routeMgmtSys;
    @Column(name = "AVG_CAPACITY_UTILIZATION")
    private Double avgCapacityUtilization;
    @Column(name = "AVG_DROP_SIZE")
    private Double avgDropSize;
    @Column(name = "DETAIL_FLEET_LIST")
    private String detailFleetList;
    @Column(name = "ACCIDENT_RECORD")
    private String accidentRecord;
    @Column(name = "AVG_VEHICLE_AGE")
    private Double avgVehicleAge;
    @Column(name = "STANDARD_USED")
    private String standardUsed;
    @Column(name = "FREIGHT_TRACKING_SYS")
    private String freightTrackingSys;
    @Column(name = "KPI_EMBRACED")
    private String kpiEmbraced;
    @Column(name = "FLEET_INSPECTION")
    private String fleetInspection;
    @Column(name = "ROUTE_COMPLIANCE_RECORD")
    private String routeComplianceRecord;
    @Column(name = "COST_PER_UNIT_TRANSPORT")
    private Double costPerUnitTransport;
    @Column(name = "AVG_IDILING_TIME")
    private Double avgIdilingTime;
    @Column(name = "ORDER_SCHEDULING_SW")
    private String orderSchedulingSw;

    public Operations() {
    }

    public Operations(Integer operid) {
        this.operid = operid;
    }

    public Integer getOperid() {
        return operid;
    }

    public void setOperid(Integer operid) {
        this.operid = operid;
    }

    public Double getTotalFuleConsumption() {
        return totalFuleConsumption;
    }

    public void setTotalFuleConsumption(Double totalFuleConsumption) {
        this.totalFuleConsumption = totalFuleConsumption;
    }

    public Double getTotalDistanceTravelled() {
        return totalDistanceTravelled;
    }

    public void setTotalDistanceTravelled(Double totalDistanceTravelled) {
        this.totalDistanceTravelled = totalDistanceTravelled;
    }

    public Double getTotalAvgOperatingHrs() {
        return totalAvgOperatingHrs;
    }

    public void setTotalAvgOperatingHrs(Double totalAvgOperatingHrs) {
        this.totalAvgOperatingHrs = totalAvgOperatingHrs;
    }

    public Double getTotalEmptyTrips() {
        return totalEmptyTrips;
    }

    public void setTotalEmptyTrips(Double totalEmptyTrips) {
        this.totalEmptyTrips = totalEmptyTrips;
    }

    public String getMonitorCustFeedback() {
        return monitorCustFeedback;
    }

    public void setMonitorCustFeedback(String monitorCustFeedback) {
        this.monitorCustFeedback = monitorCustFeedback;
    }

    public Double getTotalPerctDamage() {
        return totalPerctDamage;
    }

    public void setTotalPerctDamage(Double totalPerctDamage) {
        this.totalPerctDamage = totalPerctDamage;
    }

    public String getRouteMgmtSys() {
        return routeMgmtSys;
    }

    public void setRouteMgmtSys(String routeMgmtSys) {
        this.routeMgmtSys = routeMgmtSys;
    }

    public Double getAvgCapacityUtilization() {
        return avgCapacityUtilization;
    }

    public void setAvgCapacityUtilization(Double avgCapacityUtilization) {
        this.avgCapacityUtilization = avgCapacityUtilization;
    }

    public Double getAvgDropSize() {
        return avgDropSize;
    }

    public void setAvgDropSize(Double avgDropSize) {
        this.avgDropSize = avgDropSize;
    }

    public String getDetailFleetList() {
        return detailFleetList;
    }

    public void setDetailFleetList(String detailFleetList) {
        this.detailFleetList = detailFleetList;
    }

    public String getAccidentRecord() {
        return accidentRecord;
    }

    public void setAccidentRecord(String accidentRecord) {
        this.accidentRecord = accidentRecord;
    }

    public Double getAvgVehicleAge() {
        return avgVehicleAge;
    }

    public void setAvgVehicleAge(Double avgVehicleAge) {
        this.avgVehicleAge = avgVehicleAge;
    }

    public String getStandardUsed() {
        return standardUsed;
    }

    public void setStandardUsed(String standardUsed) {
        this.standardUsed = standardUsed;
    }

    public String getFreightTrackingSys() {
        return freightTrackingSys;
    }

    public void setFreightTrackingSys(String freightTrackingSys) {
        this.freightTrackingSys = freightTrackingSys;
    }

    public String getKpiEmbraced() {
        return kpiEmbraced;
    }

    public void setKpiEmbraced(String kpiEmbraced) {
        this.kpiEmbraced = kpiEmbraced;
    }

    public String getFleetInspection() {
        return fleetInspection;
    }

    public void setFleetInspection(String fleetInspection) {
        this.fleetInspection = fleetInspection;
    }

    public String getRouteComplianceRecord() {
        return routeComplianceRecord;
    }

    public void setRouteComplianceRecord(String routeComplianceRecord) {
        this.routeComplianceRecord = routeComplianceRecord;
    }

    public Double getCostPerUnitTransport() {
        return costPerUnitTransport;
    }

    public void setCostPerUnitTransport(Double costPerUnitTransport) {
        this.costPerUnitTransport = costPerUnitTransport;
    }

    public Double getAvgIdilingTime() {
        return avgIdilingTime;
    }

    public void setAvgIdilingTime(Double avgIdilingTime) {
        this.avgIdilingTime = avgIdilingTime;
    }

    public String getOrderSchedulingSw() {
        return orderSchedulingSw;
    }

    public void setOrderSchedulingSw(String orderSchedulingSw) {
        this.orderSchedulingSw = orderSchedulingSw;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (operid != null ? operid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Operations)) {
            return false;
        }
        Operations other = (Operations) object;
        if ((this.operid == null && other.operid != null) || (this.operid != null && !this.operid.equals(other.operid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "greenlogisticsauditor.Operations[ operid=" + operid + " ]";
    }
    
}
