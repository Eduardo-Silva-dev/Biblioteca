package com.biblioteca.apirest.models;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


@Entity
@Table(name = "TB_Livros")
public class Livros implements Serializable {
	 	
	private static final long serialVersionUID = 1l;
	
		@Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private long id;

		@NotBlank
	    @Column(unique=true)
	    private String titulo;

	    @NotNull
	    private Float valor;

	    @NotNull
	    private int status;

	    @NotNull
	    private Date data;


	    private long id_cliente;

	    public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}
	    
	    public String getTitulo() {
	        return titulo;
	    }

	    public void setTitulo(String titulo) {
	        this.titulo = titulo;
	    }

	    public Float getValor() {
	        return valor;
	    }

	    public void setValor(Float valor) {
	        this.valor = valor;
	    }

	    public int getStatus() {
	        return status;
	    }

	    public void setStatus(int status) {
	        this.status = status;
	    }

	    public Date getData() {
			return data;
		}

		public void setData(Date data) {
			this.data = data;
		}

	    public long getId_cliente() {
	        return id_cliente;
	    }

	    public void setId_cliente(long id_cliente) {
	        this.id_cliente = id_cliente;
	    }

}
