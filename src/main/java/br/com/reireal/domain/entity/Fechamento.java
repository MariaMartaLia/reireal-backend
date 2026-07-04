package br.com.reireal.domain.entity;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

public class Fechamento {
    private UUID id;
    private LocalDate data;
    private BigDecimal totalDinheiro;
    private BigDecimal totalCartaoCredito;
    private BigDecimal totalCartaoDebito;
    private BigDecimal totalPix;
    private BigDecimal totalGeral;


}
