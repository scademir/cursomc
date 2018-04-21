package com.nelioalves.cursomc.domain;

import java.io.Serializable;
import java.util.ArrayList;
<<<<<<< HEAD
import java.util.HashSet;
import java.util.List;
import java.util.Set;
=======
import java.util.List;
>>>>>>> 04fcbc0d3e8104fcd90e14d5cb19da145a7b8c3e

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
<<<<<<< HEAD
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Produto  implements Serializable {
=======

@Entity
public class Produto implements Serializable{
>>>>>>> 04fcbc0d3e8104fcd90e14d5cb19da145a7b8c3e
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private Double preco;
	
<<<<<<< HEAD
	@JsonIgnore
=======
	
>>>>>>> 04fcbc0d3e8104fcd90e14d5cb19da145a7b8c3e
	@ManyToMany
	@JoinTable(name = "PRODUTO_CATEGORIA",
		joinColumns = @JoinColumn(name = "produto_id"),
		inverseJoinColumns = @JoinColumn(name = "categoria_id")
<<<<<<< HEAD
	)
	private List<Categoria> categorias = new ArrayList<>();
	
	@JsonIgnore
	@OneToMany(mappedBy="id.produto")
	private Set<ItemPedido> itens = new HashSet<>();
=======
			)
	
	private List<Categoria> categorias = new ArrayList<>();
>>>>>>> 04fcbc0d3e8104fcd90e14d5cb19da145a7b8c3e
	
	public Produto() {
	}

	public Produto(Integer id, String nome, Double preco) {
		super();
		this.id = id;
		this.nome = nome;
		this.preco = preco;
	}

<<<<<<< HEAD
	@JsonIgnore
	public List<Pedido> getPedidos() {
		List<Pedido> lista = new ArrayList<>();
		for (ItemPedido x : itens) {
			lista.add(x.getPedido());
		}
		return lista;
	}
	
	
=======
>>>>>>> 04fcbc0d3e8104fcd90e14d5cb19da145a7b8c3e
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public List<Categoria> getCategorias() {
		return categorias;
	}

	public void setCategorias(List<Categoria> categorias) {
		this.categorias = categorias;
	}

<<<<<<< HEAD
	public Set<ItemPedido> getItens() {
		return itens;
	}

	public void setItens(Set<ItemPedido> itens) {
		this.itens = itens;
	}
	
=======
>>>>>>> 04fcbc0d3e8104fcd90e14d5cb19da145a7b8c3e
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
<<<<<<< HEAD
=======
	
>>>>>>> 04fcbc0d3e8104fcd90e14d5cb19da145a7b8c3e

}
