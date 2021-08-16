package br.com.isidrocorp.eventdash.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*ANOTAR a classe Alarme para fazer efetivamente o mapeamento da classe para a tabela e dos atributos para as colunas da Tabela.*/

@Entity                           //Indica que a classe alarme é armazenável em banco
@Table(name="itmn_alarme")         //Especifica o nome da tabela
public class Alarme {

	@Column(name="id_alarme")                                //especifica o nome da coluna
	@Id                                                      //define que o atributo corresponde a uma pk na tabela
	@GeneratedValue(strategy=GenerationType.IDENTITY)        //define que é auto increment
	private int id;
	
	@Column(name="nome", length=100, nullable=false)  
	private String nome;
	
	@Column(name="descricao", length=200, nullable=true)  
	private String descricao;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
		
}


