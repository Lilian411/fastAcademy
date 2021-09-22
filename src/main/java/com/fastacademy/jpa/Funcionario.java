package com.fastacademy.jpa;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Funcionario {
	 
	private @Id @GeneratedValue Long id;
	private String nome;
	private String funcao;
	
	Funcionario() {}

	/**
	 * @param nome
	 * @param funcao
	 */
	public Funcionario( String nome, String funcao) {
		super();
		this.nome = nome;
		this.funcao = funcao;
	}

	@Override
	public int hashCode() {
		return Objects.hash(funcao, id, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Funcionario other = (Funcionario) obj;
		return Objects.equals(funcao, other.funcao) && Objects.equals(id, other.id) && Objects.equals(nome, other.nome);
	}

	@Override
	public String toString() {
		return "Funcionario [id=" + id + ", nome=" + nome + ", funcao=" + funcao + "]";
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the funcao
	 */
	public String getFuncao() {
		return funcao;
	}

	/**
	 * @param funcao the funcao to set
	 */
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
}