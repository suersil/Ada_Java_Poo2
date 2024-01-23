package br.com.ada.pooii.Aula6.Solid.ExcSRP;

import java.math.BigDecimal;

//classe imutavel - nao precisa de getter, setter e etc
public record Item (String nome, String descricao, BigDecimal preco){}
