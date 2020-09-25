package br.com.equipealfa.horasextras.model;

import java.time.LocalDate;


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

	@Column(name = "descricao")
	private String descricao;

	@Column(name = "data_oc")
	private LocalDate dataOc;

	@Column(name = "num_horas")
	private String numHoras;

	@Column(name = "ponto_manual")
	private int pontoManual;

	@Column(name = "status")
	private int status;
	
	@ManyToOne
	@JoinColumn(name="id_usuario")
	@JsonIgnoreProperties("listaOcorrencias")
	private Usuario   colaborador;
	
	@ManyToOne
	@JoinColumn(name="id_atividade")
	private Atividade atividade;
	
	
	public Usuario getColaborador() {
		return colaborador;
	}

	public void setColaborador(Usuario colaborador) {
		this.colaborador = colaborador;
	}

	public Atividade getAtividade() {
		return atividade;
	}

	public void setAtividade(Atividade atividade) {
		this.atividade = atividade;
	}

	public int getNumSeq() {
		return numSeq;
	}

	public void setNumSeq(int numSeq) {
		this.numSeq = numSeq;
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

	public String getNumHoras() {
		return numHoras;
	}

	public void setNumHoras(String numHoras) {
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
