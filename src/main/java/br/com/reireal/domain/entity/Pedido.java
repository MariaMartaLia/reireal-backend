package br.com.reireal.domain.entity;


import java.time.LocalDate;

import org.hibernate.annotations.Generated;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "pedidos")

public class Pedido {
    @Id
    @GeneratedValue
    private UUID id;
    @Column(name = "data_pedido", nullable = false)
    private LocalDate dataPedido;
    @Column(name = "total", nullable = false)
    private Integer total;
    @Column(name = "status", nullable = false)
    private boolean status;

public Pedido(ItemPedido itemPedido, Integer total) {
    this.dataPedido = LocalDate.now();
    this.total = total;
    this.status = true;
    }
public LocalDate getDataPedido(){
    return dataPedido;
}

public Interger getTotal(){
    return total;
}

}

