package com.webapps.tss.meus.titulos.app.model;

public enum SituacaoTitulo {
	
	PENDENTE("Pendente"),
	FINALIZADO("Finalizado");
	
	private String descricao;
	
	private SituacaoTitulo(String descricao) {
		this.descricao = descricao;
	}
	
	public String GetDescricao() {
		return this.descricao;
	}
}
