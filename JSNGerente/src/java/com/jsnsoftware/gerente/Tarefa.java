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
import javax.persistence.Lob;
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
@Table(name = "tarefa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tarefa.findAll", query = "SELECT t FROM Tarefa t")
    , @NamedQuery(name = "Tarefa.findByTarefaId", query = "SELECT t FROM Tarefa t WHERE t.tarefaId = :tarefaId")
    , @NamedQuery(name = "Tarefa.findByTarefaNome", query = "SELECT t FROM Tarefa t WHERE t.tarefaNome = :tarefaNome")
    , @NamedQuery(name = "Tarefa.findByTarefaData", query = "SELECT t FROM Tarefa t WHERE t.tarefaData = :tarefaData")
    , @NamedQuery(name = "Tarefa.findByTarefaVencimento", query = "SELECT t FROM Tarefa t WHERE t.tarefaVencimento = :tarefaVencimento")
    , @NamedQuery(name = "Tarefa.findByTarefaPonto", query = "SELECT t FROM Tarefa t WHERE t.tarefaPonto = :tarefaPonto")
    , @NamedQuery(name = "Tarefa.findByTarefaValor", query = "SELECT t FROM Tarefa t WHERE t.tarefaValor = :tarefaValor")})
public class Tarefa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "tarefa_id")
    private Integer tarefaId;
    @Size(max = 45)
    @Column(name = "tarefa_nome")
    private String tarefaNome;
    @Column(name = "tarefa_data")
    @Temporal(TemporalType.DATE)
    private Date tarefaData;
    @Lob
    @Size(max = 16777215)
    @Column(name = "tarefa_descricao")
    private String tarefaDescricao;
    @Column(name = "tarefa_vencimento")
    @Temporal(TemporalType.DATE)
    private Date tarefaVencimento;
    @Size(max = 45)
    @Column(name = "tarefa_ponto")
    private String tarefaPonto;
    @Size(max = 45)
    @Column(name = "tarefa_valor")
    private String tarefaValor;
    @JoinColumn(name = "profissional_profissional_id", referencedColumnName = "profissional_id")
    @ManyToOne(optional = false)
    private Profissional profissionalProfissionalId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tarefaTarefaId")
    private List<TarefaCondominio> tarefaCondominioList;

    public Tarefa() {
    }

    public Tarefa(Integer tarefaId) {
        this.tarefaId = tarefaId;
    }

    public Integer getTarefaId() {
        return tarefaId;
    }

    public void setTarefaId(Integer tarefaId) {
        this.tarefaId = tarefaId;
    }

    public String getTarefaNome() {
        return tarefaNome;
    }

    public void setTarefaNome(String tarefaNome) {
        this.tarefaNome = tarefaNome;
    }

    public Date getTarefaData() {
        return tarefaData;
    }

    public void setTarefaData(Date tarefaData) {
        this.tarefaData = tarefaData;
    }

    public String getTarefaDescricao() {
        return tarefaDescricao;
    }

    public void setTarefaDescricao(String tarefaDescricao) {
        this.tarefaDescricao = tarefaDescricao;
    }

    public Date getTarefaVencimento() {
        return tarefaVencimento;
    }

    public void setTarefaVencimento(Date tarefaVencimento) {
        this.tarefaVencimento = tarefaVencimento;
    }

    public String getTarefaPonto() {
        return tarefaPonto;
    }

    public void setTarefaPonto(String tarefaPonto) {
        this.tarefaPonto = tarefaPonto;
    }

    public String getTarefaValor() {
        return tarefaValor;
    }

    public void setTarefaValor(String tarefaValor) {
        this.tarefaValor = tarefaValor;
    }

    public Profissional getProfissionalProfissionalId() {
        return profissionalProfissionalId;
    }

    public void setProfissionalProfissionalId(Profissional profissionalProfissionalId) {
        this.profissionalProfissionalId = profissionalProfissionalId;
    }

    @XmlTransient
    public List<TarefaCondominio> getTarefaCondominioList() {
        return tarefaCondominioList;
    }

    public void setTarefaCondominioList(List<TarefaCondominio> tarefaCondominioList) {
        this.tarefaCondominioList = tarefaCondominioList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tarefaId != null ? tarefaId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tarefa)) {
            return false;
        }
        Tarefa other = (Tarefa) object;
        if ((this.tarefaId == null && other.tarefaId != null) || (this.tarefaId != null && !this.tarefaId.equals(other.tarefaId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jsnsoftware.gerente.Tarefa[ tarefaId=" + tarefaId + " ]";
    }
    
}
