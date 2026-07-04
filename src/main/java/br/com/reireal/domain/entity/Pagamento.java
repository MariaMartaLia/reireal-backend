package br.com.reireal.domain.entity;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;


public class Pagamento {
private UUID id;
private Tipo  tipo;
private BigDecimal valor;
private LocalDate dataPagamento;
private Status status;
}
