package br.com.equipealfa.horasextras.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;

@Entity
@Table(name = "itmn232_usuario")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	@Column(name = "id_usuario")
	private int idUsuario;

	@Column(name = "nome_usuario")
	private String nomeUsuario;

	@Column(name = "email_usuario")
	private String emailUsuario;

	@Column(name = "racf")
	private String racf;

	@Column(name = "senha")
	private String senha;

	@Column(name = "link_foto")
	private String linkFoto;

	@Column(name = "gestor")
	private int gestor;

	@OneToMany(mappedBy="colaborador", cascade=CascadeType.ALL)
	@JsonIgnoreProperties("colaborador")
	private List<Ocorrencia> ListaOcorrencias;

	public List<Ocorrencia> getListaOcorrencias() {
		return ListaOcorrencias;
	}

	public void setListaOcorrencias(List<Ocorrencia> listaOcorrencias) {
		ListaOcorrencias = listaOcorrencias;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public String getEmailUsuario() {
		return emailUsuario;
	}

	public void setEmailUsuario(String emailUsuario) {
		this.emailUsuario = emailUsuario;
	}

	public String getRacf() {
		return racf;
	}

	public void setRacf(String racf) {
		this.racf = racf;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getLinkFoto() {
		return linkFoto;
	}

	public void setLinkFoto(String linkFoto) {
		this.linkFoto = linkFoto;
	}

	public int getGestor() {
		return gestor;
	}

	public void setGestor(int gestor) {
		this.gestor = gestor;
	}

}
