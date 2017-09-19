package com.jsnsoftware.gerente;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Profissional.class)
public abstract class Profissional_ {

	public static volatile SingularAttribute<Profissional, Endereco> enderecoEnderecoId;
	public static volatile SingularAttribute<Profissional, Integer> profissionalId;
	public static volatile ListAttribute<Profissional, Tarefa> tarefaList;
	public static volatile SingularAttribute<Profissional, String> profissionalNome;
	public static volatile SingularAttribute<Profissional, Date> profissionalNascimento;
	public static volatile SingularAttribute<Profissional, String> profissionalEmail;
	public static volatile SingularAttribute<Profissional, String> profissionalSobrenome;

}

