package com.jsnsoftware.gerente;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Condominio.class)
public abstract class Condominio_ {

	public static volatile SingularAttribute<Condominio, Endereco> enderecoEnderecoId;
	public static volatile SingularAttribute<Condominio, String> condominioDescricao;
	public static volatile SingularAttribute<Condominio, String> condominioLocalizacao;
	public static volatile SingularAttribute<Condominio, Date> condominioContrato;
	public static volatile SingularAttribute<Condominio, String> condominioNome;
	public static volatile SingularAttribute<Condominio, String> condominiocol;
	public static volatile SingularAttribute<Condominio, Date> condominioData;
	public static volatile SingularAttribute<Condominio, Integer> condominioId;
	public static volatile ListAttribute<Condominio, TarefaCondominio> tarefaCondominioList;
	public static volatile SingularAttribute<Condominio, String> condominioRegiao;

}

