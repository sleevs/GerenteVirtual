/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsnsoftware.gerente;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author JSN
 */
@Entity
@Table(name = "profissional")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Profissional.findAll", query = "SELECT p FROM Profissional p")
    , @NamedQuery(name = "Profissional.findByProfissionalId", query = "SELECT p FROM Profissional p WHERE p.profissionalId = :profissionalId")
    , @NamedQuery(name = "Profissional.findByProfissionalNome", query = "SELECT p FROM Profissional p WHERE p.profissionalNome = :profissionalNome")
    , @NamedQuery(name = "Profissional.findByProfissionalEmail", query = "SELECT p FROM Profissional p WHERE p.profissionalEmail = :profissionalEmail")
    , @NamedQuery(name = "Profissional.findByProfissionalSobrenome", query = "SELECT p FROM Profissional p WHERE p.profissionalSobrenome = :profissionalSobrenome")
    , @NamedQuery(name = "Profissional.findByProfissionalNascimento", query = "SELECT p FROM Profissional p WHERE p.profissionalNascimento = :profissionalNascimento")})
public class Profissional implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "profissional_id")
    private Integer profissionalId;
    @Size(max = 45)
    @Column(name = "profissional_nome")
    private String profissionalNome;
    @Size(max = 45)
    @Column(name = "profissional_email")
    private String profissionalEmail;
    @Size(max = 45)
    @Column(name = "profissional_sobrenome")
    private String profissionalSobrenome;
    @Column(name = "profissional_nascimento")
    @Temporal(TemporalType.DATE)
    private Date profissionalNascimento;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "profissionalProfissionalId")
    private List<Tarefa> tarefaList;
    @JoinColumn(name = "endereco_endereco_id", referencedColumnName = "endereco_id")
    @ManyToOne
    private Endereco enderecoEnderecoId;

    public Profissional() {
    }

    public Profissional(Integer profissionalId) {
        this.profissionalId = profissionalId;
    }

    public Integer getProfissionalId() {
        return profissionalId;
    }

    public void setProfissionalId(Integer profissionalId) {
        this.profissionalId = profissionalId;
    }

    public String getProfissionalNome() {
        return profissionalNome;
    }

    public void setProfissionalNome(String profissionalNome) {
        this.profissionalNome = profissionalNome;
    }

    public String getProfissionalEmail() {
        return profissionalEmail;
    }

    public void setProfissionalEmail(String profissionalEmail) {
        this.profissionalEmail = profissionalEmail;
    }

    public String getProfissionalSobrenome() {
        return profissionalSobrenome;
    }

    public void setProfissionalSobrenome(String profissionalSobrenome) {
        this.profissionalSobrenome = profissionalSobrenome;
    }

    public Date getProfissionalNascimento() {
        return profissionalNascimento;
    }

    public void setProfissionalNascimento(Date profissionalNascimento) {
        this.profissionalNascimento = profissionalNascimento;
    }

    @XmlTransient
    public List<Tarefa> getTarefaList() {
        return tarefaList;
    }

    public void setTarefaList(List<Tarefa> tarefaList) {
        this.tarefaList = tarefaList;
    }

    public Endereco getEnderecoEnderecoId() {
        return enderecoEnderecoId;
    }

    public void setEnderecoEnderecoId(Endereco enderecoEnderecoId) {
        this.enderecoEnderecoId = enderecoEnderecoId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (profissionalId != null ? profissionalId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Profissional)) {
            return false;
        }
        Profissional other = (Profissional) object;
        if ((this.profissionalId == null && other.profissionalId != null) || (this.profissionalId != null && !this.profissionalId.equals(other.profissionalId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jsnsoftware.gerente.Profissional[ profissionalId=" + profissionalId + " ]";
    }
    
}
