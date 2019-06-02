package com.embracon.model;

import java.math.BigDecimal;

public class SaudeFinanceira {

	private Long id;
	private BigDecimal rendaFixaMensal;
	private BigDecimal custoFixoMensal;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public BigDecimal getRendaFixaMensal() {
		return rendaFixaMensal;
	}

	public void setRendaFixaMensal(BigDecimal rendaFixaMensal) {
		this.rendaFixaMensal = rendaFixaMensal;
	}

	public BigDecimal getCustoFixoMensal() {
		return custoFixoMensal;
	}

	public void setCustoFixoMensal(BigDecimal custoFixoMensal) {
		this.custoFixoMensal = custoFixoMensal;
	}

}
