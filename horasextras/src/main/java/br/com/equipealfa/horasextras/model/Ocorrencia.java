package br.com.equipealfa.horasextras.model;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="itmn232_ocorrencia")
public class Ocorrencia {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "num_seq")
	private int numSeq;

	@Column(name = "id_usuario", insertable = false, updatable = false)
	private int idUsuario;

	@Column(name = "id_atividade", insertable = false, updatable = false)
	private int idAtividade;

	@Column(name = "descricao")
	private String descricao;

	@Column(name = "data_oc")
	private LocalDate dataOc;

	@Column(name = "num_horas")
	private LocalTime numHoras;

	@Column(name = "ponto_manual")
	private int pontoManual;

	@Column(name = "status")
	private int status;
	
	@ManyToOne
	@JoinColumn(name = "id_usuario")
	private Usuario colaborador;
	
	@ManyToOne
	@JoinColumn(name = "id_atividade")
	@JsonIgnoreProperties("listaOcorrencias")
	private Atividade atividade;

	public int getNumSeq() {
		return numSeq;
	}

	public void setNumSeq(int numSeq) {
		this.numSeq = numSeq;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public int getId_atividade() {
		return idAtividade;
	}

	public void setId_atividade(int id_atividade) {
		this.idAtividade = id_atividade;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public LocalDate getDataOc() {
		return dataOc;
	}

	public void setDataOc(LocalDate dataOc) {
		this.dataOc = dataOc;
	}

	public LocalTime getNumHoras() {
		return numHoras;
	}

	public void setNumHoras(LocalTime numHoras) {
		this.numHoras = numHoras;
	}

	public int getPontoManual() {
		return pontoManual;
	}

	public void setPontoManual(int pontoManual) {
		this.pontoManual = pontoManual;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

}
