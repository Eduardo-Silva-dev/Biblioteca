package com.biblioteca.apirest.models;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="TB_Clientes")
public class Clientes implements Serializable{

	private static final long serialVersionUID = 1l;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotBlank
    private String nome;

    @NotBlank
    @Column(unique=true)
    private String cpf;
    
    public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}
