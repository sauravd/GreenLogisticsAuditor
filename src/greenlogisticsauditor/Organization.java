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
@Table(name = "ORGANIZATION")
@NamedQueries({
    @NamedQuery(name = "Organization.findAll", query = "SELECT o FROM Organization o")
    , @NamedQuery(name = "Organization.findByOrgid", query = "SELECT o FROM Organization o WHERE o.orgid = :orgid")
    , @NamedQuery(name = "Organization.findByGreenLogisticView", query = "SELECT o FROM Organization o WHERE o.greenLogisticView = :greenLogisticView")
    , @NamedQuery(name = "Organization.findByBudgetGreenLogistics", query = "SELECT o FROM Organization o WHERE o.budgetGreenLogistics = :budgetGreenLogistics")
    , @NamedQuery(name = "Organization.findBySafetyPolicy", query = "SELECT o FROM Organization o WHERE o.safetyPolicy = :safetyPolicy")
    , @NamedQuery(name = "Organization.findByDriverTraining", query = "SELECT o FROM Organization o WHERE o.driverTraining = :driverTraining")
    , @NamedQuery(name = "Organization.findByComplyWithGov", query = "SELECT o FROM Organization o WHERE o.complyWithGov = :complyWithGov")
    , @NamedQuery(name = "Organization.findByInsuranceType", query = "SELECT o FROM Organization o WHERE o.insuranceType = :insuranceType")
    , @NamedQuery(name = "Organization.findByOrgEnvPolicy", query = "SELECT o FROM Organization o WHERE o.orgEnvPolicy = :orgEnvPolicy")
    , @NamedQuery(name = "Organization.findByAudit", query = "SELECT o FROM Organization o WHERE o.audit = :audit")
    , @NamedQuery(name = "Organization.findByOperationalProcuders", query = "SELECT o FROM Organization o WHERE o.operationalProcuders = :operationalProcuders")
    , @NamedQuery(name = "Organization.findByOrgCommunication", query = "SELECT o FROM Organization o WHERE o.orgCommunication = :orgCommunication")})
public class Organization implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ORGID")
    private Integer orgid;
    @Column(name = "GREEN_LOGISTIC_VIEW")
    private String greenLogisticView;
    @Column(name = "BUDGET_GREEN_LOGISTICS")
    private String budgetGreenLogistics;
    @Column(name = "SAFETY_POLICY")
    private String safetyPolicy;
    @Column(name = "DRIVER_TRAINING")
    private String driverTraining;
    @Column(name = "COMPLY_WITH_GOV")
    private String complyWithGov;
    @Column(name = "INSURANCE_TYPE")
    private String insuranceType;
    @Column(name = "ORG_ENV_POLICY")
    private String orgEnvPolicy;
    @Column(name = "AUDIT")
    private String audit;
    @Column(name = "OPERATIONAL_PROCUDERS")
    private String operationalProcuders;
    @Column(name = "ORG_COMMUNICATION")
    private String orgCommunication;

    public Organization() {
    }

    public Organization(Integer orgid) {
        this.orgid = orgid;
    }

    public Integer getOrgid() {
        return orgid;
    }

    public void setOrgid(Integer orgid) {
        this.orgid = orgid;
    }

    public String getGreenLogisticView() {
        return greenLogisticView;
    }

    public void setGreenLogisticView(String greenLogisticView) {
        this.greenLogisticView = greenLogisticView;
    }

    public String getBudgetGreenLogistics() {
        return budgetGreenLogistics;
    }

    public void setBudgetGreenLogistics(String budgetGreenLogistics) {
        this.budgetGreenLogistics = budgetGreenLogistics;
    }

    public String getSafetyPolicy() {
        return safetyPolicy;
    }

    public void setSafetyPolicy(String safetyPolicy) {
        this.safetyPolicy = safetyPolicy;
    }

    public String getDriverTraining() {
        return driverTraining;
    }

    public void setDriverTraining(String driverTraining) {
        this.driverTraining = driverTraining;
    }

    public String getComplyWithGov() {
        return complyWithGov;
    }

    public void setComplyWithGov(String complyWithGov) {
        this.complyWithGov = complyWithGov;
    }

    public String getInsuranceType() {
        return insuranceType;
    }

    public void setInsuranceType(String insuranceType) {
        this.insuranceType = insuranceType;
    }

    public String getOrgEnvPolicy() {
        return orgEnvPolicy;
    }

    public void setOrgEnvPolicy(String orgEnvPolicy) {
        this.orgEnvPolicy = orgEnvPolicy;
    }

    public String getAudit() {
        return audit;
    }

    public void setAudit(String audit) {
        this.audit = audit;
    }

    public String getOperationalProcuders() {
        return operationalProcuders;
    }

    public void setOperationalProcuders(String operationalProcuders) {
        this.operationalProcuders = operationalProcuders;
    }

    public String getOrgCommunication() {
        return orgCommunication;
    }

    public void setOrgCommunication(String orgCommunication) {
        this.orgCommunication = orgCommunication;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (orgid != null ? orgid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Organization)) {
            return false;
        }
        Organization other = (Organization) object;
        if ((this.orgid == null && other.orgid != null) || (this.orgid != null && !this.orgid.equals(other.orgid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "greenlogisticsauditor.Organization[ orgid=" + orgid + " ]";
    }
    
}
