/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.opgea.visitors.domain.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Ramesh
 */
@Entity
@Table(name = "appartment")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Appartment.findById", query = "SELECT d FROM Appartment d WHERE d.id = :id"),
    @NamedQuery(name = "Appartment.findAll", query = "SELECT d FROM Appartment d"),
    @NamedQuery(name = "Appartment.findAllByCompanyId", query = "SELECT d FROM Appartment d WHERE d.company.id = :companyId")
}
)
public class Appartment implements Serializable {
    
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @ManyToOne
    private Company company;

    public Appartment() {
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Appartment other = (Appartment) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + (this.id != null ? this.id.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return "Appartment{" + "id=" + id + ", name=" + name + ", company=" + company + '}';
    }
    
    
}
