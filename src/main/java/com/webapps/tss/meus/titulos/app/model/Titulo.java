package com.webapps.tss.meus.titulos.app.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;

@Entity
@Table(name = "titulos")
public class Titulo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String descricao;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dataVencimento;
	
	@NumberFormat(pattern = "#,##.00")
	private BigDecimal valor;
	
	@Enumerated(EnumType.STRING)
	private SituacaoTitulo situacaoTitulo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public SituacaoTitulo getSituacaoTitulo() {
		return situacaoTitulo;
	}

	public void setSituacaoTitulo(SituacaoTitulo situacaoTitulo) {
		this.situacaoTitulo = situacaoTitulo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dataVencimento, descricao, id, situacaoTitulo, valor);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Titulo other = (Titulo) obj;
		return Objects.equals(dataVencimento, other.dataVencimento) && Objects.equals(descricao, other.descricao)
				&& Objects.equals(id, other.id) && situacaoTitulo == other.situacaoTitulo
				&& Objects.equals(valor, other.valor);
	}

	@Override
	public String toString() {
		return "Titulo [id=" + id + ", descricao=" + descricao + ", dataVencimento=" + dataVencimento + ", valor="
				+ valor + ", situacaoTitulo=" + situacaoTitulo + "]";
	}

}
