/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.opgea.visitors.web.dto;

/**
 *
 * @author Ramesh
 */
public class AppartmentDTO {
    
    private Long id;
    private String name;
    private Long companyId;

    public AppartmentDTO() {
    }

    public AppartmentDTO(Long id, String name, Long companyId) {
        this.id = id;
        this.name = name;
        this.companyId = companyId;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
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
        final AppartmentDTO other = (AppartmentDTO) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + (this.id != null ? this.id.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return "AppartmentDTO{" + "id=" + id + ", name=" + name + ", companyId=" + companyId + '}';
    }
    
    
}
