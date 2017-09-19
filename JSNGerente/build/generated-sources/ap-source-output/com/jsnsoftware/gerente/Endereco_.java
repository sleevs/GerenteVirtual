package com.jsnsoftware.gerente;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Endereco.class)
public abstract class Endereco_ {

	public static volatile SingularAttribute<Endereco, String> enderecoLogradouro;
	public static volatile SingularAttribute<Endereco, String> enderecoCep;
	public static volatile SingularAttribute<Endereco, Integer> enderecoId;
	public static volatile ListAttribute<Endereco, Condominio> condominioList;
	public static volatile ListAttribute<Endereco, Profissional> profissionalList;

}

