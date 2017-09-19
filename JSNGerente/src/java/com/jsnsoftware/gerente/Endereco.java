/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsnsoftware.gerente;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author JSN
 */
@Entity
@Table(name = "endereco")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Endereco.findAll", query = "SELECT e FROM Endereco e")
    , @NamedQuery(name = "Endereco.findByEnderecoId", query = "SELECT e FROM Endereco e WHERE e.enderecoId = :enderecoId")
    , @NamedQuery(name = "Endereco.findByEnderecoCep", query = "SELECT e FROM Endereco e WHERE e.enderecoCep = :enderecoCep")
    , @NamedQuery(name = "Endereco.findByEnderecoLogradouro", query = "SELECT e FROM Endereco e WHERE e.enderecoLogradouro = :enderecoLogradouro")})
public class Endereco implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "endereco_id")
    private Integer enderecoId;
    @Size(max = 45)
    @Column(name = "endereco_cep")
    private String enderecoCep;
    @Size(max = 45)
    @Column(name = "endereco_logradouro")
    private String enderecoLogradouro;
    @OneToMany(mappedBy = "enderecoEnderecoId")
    private List<Condominio> condominioList;
    @OneToMany(mappedBy = "enderecoEnderecoId")
    private List<Profissional> profissionalList;

    public Endereco() {
    }

    public Endereco(Integer enderecoId) {
        this.enderecoId = enderecoId;
    }

    public Integer getEnderecoId() {
        return enderecoId;
    }

    public void setEnderecoId(Integer enderecoId) {
        this.enderecoId = enderecoId;
    }

    public String getEnderecoCep() {
        return enderecoCep;
    }

    public void setEnderecoCep(String enderecoCep) {
        this.enderecoCep = enderecoCep;
    }

    public String getEnderecoLogradouro() {
        return enderecoLogradouro;
    }

    public void setEnderecoLogradouro(String enderecoLogradouro) {
        this.enderecoLogradouro = enderecoLogradouro;
    }

    @XmlTransient
    public List<Condominio> getCondominioList() {
        return condominioList;
    }

    public void setCondominioList(List<Condominio> condominioList) {
        this.condominioList = condominioList;
    }

    @XmlTransient
    public List<Profissional> getProfissionalList() {
        return profissionalList;
    }

    public void setProfissionalList(List<Profissional> profissionalList) {
        this.profissionalList = profissionalList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (enderecoId != null ? enderecoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Endereco)) {
            return false;
        }
        Endereco other = (Endereco) object;
        if ((this.enderecoId == null && other.enderecoId != null) || (this.enderecoId != null && !this.enderecoId.equals(other.enderecoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jsnsoftware.gerente.Endereco[ enderecoId=" + enderecoId + " ]";
    }
    
}
