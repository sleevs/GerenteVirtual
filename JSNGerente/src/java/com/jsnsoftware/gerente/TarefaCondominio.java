/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsnsoftware.gerente;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author JSN
 */
@Entity
@Table(name = "tarefa_condominio")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TarefaCondominio.findAll", query = "SELECT t FROM TarefaCondominio t")
    , @NamedQuery(name = "TarefaCondominio.findByTarefaCondominioId", query = "SELECT t FROM TarefaCondominio t WHERE t.tarefaCondominioId = :tarefaCondominioId")
    , @NamedQuery(name = "TarefaCondominio.findByTarefaCondominioTipo", query = "SELECT t FROM TarefaCondominio t WHERE t.tarefaCondominioTipo = :tarefaCondominioTipo")
    , @NamedQuery(name = "TarefaCondominio.findByTarefaCondominioFlagl", query = "SELECT t FROM TarefaCondominio t WHERE t.tarefaCondominioFlagl = :tarefaCondominioFlagl")
    , @NamedQuery(name = "TarefaCondominio.findByTarefaCondominioQuantidade", query = "SELECT t FROM TarefaCondominio t WHERE t.tarefaCondominioQuantidade = :tarefaCondominioQuantidade")})
public class TarefaCondominio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "tarefa_condominio_id")
    private Integer tarefaCondominioId;
    @Size(max = 45)
    @Column(name = "tarefa_condominio_tipo")
    private String tarefaCondominioTipo;
    @Size(max = 45)
    @Column(name = "tarefa_condominio_flagl")
    private String tarefaCondominioFlagl;
    @Size(max = 45)
    @Column(name = "tarefa_condominio_quantidade")
    private String tarefaCondominioQuantidade;
    @JoinColumn(name = "condominio_condominio_id", referencedColumnName = "condominio_id")
    @ManyToOne(optional = false)
    private Condominio condominioCondominioId;
    @JoinColumn(name = "tarefa_tarefa_id", referencedColumnName = "tarefa_id")
    @ManyToOne(optional = false)
    private Tarefa tarefaTarefaId;

    public TarefaCondominio() {
    }

    public TarefaCondominio(Integer tarefaCondominioId) {
        this.tarefaCondominioId = tarefaCondominioId;
    }

    public Integer getTarefaCondominioId() {
        return tarefaCondominioId;
    }

    public void setTarefaCondominioId(Integer tarefaCondominioId) {
        this.tarefaCondominioId = tarefaCondominioId;
    }

    public String getTarefaCondominioTipo() {
        return tarefaCondominioTipo;
    }

    public void setTarefaCondominioTipo(String tarefaCondominioTipo) {
        this.tarefaCondominioTipo = tarefaCondominioTipo;
    }

    public String getTarefaCondominioFlagl() {
        return tarefaCondominioFlagl;
    }

    public void setTarefaCondominioFlagl(String tarefaCondominioFlagl) {
        this.tarefaCondominioFlagl = tarefaCondominioFlagl;
    }

    public String getTarefaCondominioQuantidade() {
        return tarefaCondominioQuantidade;
    }

    public void setTarefaCondominioQuantidade(String tarefaCondominioQuantidade) {
        this.tarefaCondominioQuantidade = tarefaCondominioQuantidade;
    }

    public Condominio getCondominioCondominioId() {
        return condominioCondominioId;
    }

    public void setCondominioCondominioId(Condominio condominioCondominioId) {
        this.condominioCondominioId = condominioCondominioId;
    }

    public Tarefa getTarefaTarefaId() {
        return tarefaTarefaId;
    }

    public void setTarefaTarefaId(Tarefa tarefaTarefaId) {
        this.tarefaTarefaId = tarefaTarefaId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tarefaCondominioId != null ? tarefaCondominioId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TarefaCondominio)) {
            return false;
        }
        TarefaCondominio other = (TarefaCondominio) object;
        if ((this.tarefaCondominioId == null && other.tarefaCondominioId != null) || (this.tarefaCondominioId != null && !this.tarefaCondominioId.equals(other.tarefaCondominioId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jsnsoftware.gerente.TarefaCondominio[ tarefaCondominioId=" + tarefaCondominioId + " ]";
    }
    
}
