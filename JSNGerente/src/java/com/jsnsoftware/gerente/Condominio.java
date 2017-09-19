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
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author JSN
 */
@Entity
@Table(name = "condominio")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Condominio.findAll", query = "SELECT c FROM Condominio c")
    , @NamedQuery(name = "Condominio.findByCondominioId", query = "SELECT c FROM Condominio c WHERE c.condominioId = :condominioId")
    , @NamedQuery(name = "Condominio.findByCondominioNome", query = "SELECT c FROM Condominio c WHERE c.condominioNome = :condominioNome")
    , @NamedQuery(name = "Condominio.findByCondominioDescricao", query = "SELECT c FROM Condominio c WHERE c.condominioDescricao = :condominioDescricao")
    , @NamedQuery(name = "Condominio.findByCondominioLocalizacao", query = "SELECT c FROM Condominio c WHERE c.condominioLocalizacao = :condominioLocalizacao")
    , @NamedQuery(name = "Condominio.findByCondominioRegiao", query = "SELECT c FROM Condominio c WHERE c.condominioRegiao = :condominioRegiao")
    , @NamedQuery(name = "Condominio.findByCondominioData", query = "SELECT c FROM Condominio c WHERE c.condominioData = :condominioData")
    , @NamedQuery(name = "Condominio.findByCondominioContrato", query = "SELECT c FROM Condominio c WHERE c.condominioContrato = :condominioContrato")
    , @NamedQuery(name = "Condominio.findByCondominiocol", query = "SELECT c FROM Condominio c WHERE c.condominiocol = :condominiocol")})
public class Condominio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "condominio_id")
    private Integer condominioId;
    @Size(max = 45)
    @Column(name = "condominio_nome")
    private String condominioNome;
    @Size(max = 45)
    @Column(name = "condominio_descricao")
    private String condominioDescricao;
    @Size(max = 45)
    @Column(name = "condominio_localizacao")
    private String condominioLocalizacao;
    @Size(max = 45)
    @Column(name = "condominio_regiao")
    private String condominioRegiao;
    @Column(name = "condominio_data")
    @Temporal(TemporalType.DATE)
    private Date condominioData;
    @Column(name = "condominio_contrato")
    @Temporal(TemporalType.DATE)
    private Date condominioContrato;
    @Size(max = 45)
    @Column(name = "condominiocol")
    private String condominiocol;
    @JoinColumn(name = "endereco_endereco_id", referencedColumnName = "endereco_id")
    @ManyToOne
    private Endereco enderecoEnderecoId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "condominioCondominioId")
    private List<TarefaCondominio> tarefaCondominioList;

    public Condominio() {
    }

    public Condominio(Integer condominioId) {
        this.condominioId = condominioId;
    }

    public Integer getCondominioId() {
        return condominioId;
    }

    public void setCondominioId(Integer condominioId) {
        this.condominioId = condominioId;
    }

    public String getCondominioNome() {
        return condominioNome;
    }

    public void setCondominioNome(String condominioNome) {
        this.condominioNome = condominioNome;
    }

    public String getCondominioDescricao() {
        return condominioDescricao;
    }

    public void setCondominioDescricao(String condominioDescricao) {
        this.condominioDescricao = condominioDescricao;
    }

    public String getCondominioLocalizacao() {
        return condominioLocalizacao;
    }

    public void setCondominioLocalizacao(String condominioLocalizacao) {
        this.condominioLocalizacao = condominioLocalizacao;
    }

    public String getCondominioRegiao() {
        return condominioRegiao;
    }

    public void setCondominioRegiao(String condominioRegiao) {
        this.condominioRegiao = condominioRegiao;
    }

    public Date getCondominioData() {
        return condominioData;
    }

    public void setCondominioData(Date condominioData) {
        this.condominioData = condominioData;
    }

    public Date getCondominioContrato() {
        return condominioContrato;
    }

    public void setCondominioContrato(Date condominioContrato) {
        this.condominioContrato = condominioContrato;
    }

    public String getCondominiocol() {
        return condominiocol;
    }

    public void setCondominiocol(String condominiocol) {
        this.condominiocol = condominiocol;
    }

    public Endereco getEnderecoEnderecoId() {
        return enderecoEnderecoId;
    }

    public void setEnderecoEnderecoId(Endereco enderecoEnderecoId) {
        this.enderecoEnderecoId = enderecoEnderecoId;
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
        hash += (condominioId != null ? condominioId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Condominio)) {
            return false;
        }
        Condominio other = (Condominio) object;
        if ((this.condominioId == null && other.condominioId != null) || (this.condominioId != null && !this.condominioId.equals(other.condominioId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jsnsoftware.gerente.Condominio[ condominioId=" + condominioId + " ]";
    }
    
}
