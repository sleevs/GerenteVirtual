package com.jsnsoftware.gerente;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Tarefa.class)
public abstract class Tarefa_ {

	public static volatile SingularAttribute<Tarefa, Date> tarefaData;
	public static volatile SingularAttribute<Tarefa, Date> tarefaVencimento;
	public static volatile SingularAttribute<Tarefa, Profissional> profissionalProfissionalId;
	public static volatile SingularAttribute<Tarefa, String> tarefaValor;
	public static volatile SingularAttribute<Tarefa, Integer> tarefaId;
	public static volatile ListAttribute<Tarefa, TarefaCondominio> tarefaCondominioList;
	public static volatile SingularAttribute<Tarefa, String> tarefaPonto;
	public static volatile SingularAttribute<Tarefa, String> tarefaDescricao;
	public static volatile SingularAttribute<Tarefa, String> tarefaNome;

}

