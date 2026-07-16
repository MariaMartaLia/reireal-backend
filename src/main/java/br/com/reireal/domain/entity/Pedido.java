package br.com.reireal.domain.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.ArrayList;
import java.util.UUID;

import br.com.reireal.domain.enums.StatusPedido;

public class Pedido {

    private UUID id;
    private LocalDateTime dataPedido;
    private BigDecimal total;
    private StatusPedido status;
    private List<ItemPedido> itens;
    private Cliente cliente;


    public Pedido (Cliente cliente ){
        validarCliente(cliente);
        this.id = UUID.randomUUID();
        this.dataPedido = LocalDateTime.now();
        this.total= BigDecimal.ZERO;
        this.status =  StatusPedido.PENDENTE;
        this.itens = new ArrayList<>();
        this.cliente = cliente;         
    }
   public UUID getId(){
    return id;
   }
   public LocalDateTime getDataPedido( ){
    return dataPedido;
   }
   public BigDecimal getTotal(){
    return total;
   }
   public StatusPedido getStatus(){
    return status;
   }
   public List<ItemPedido> getItens( ){
    return itens;
   }
   public Cliente getCliente(){
    return cliente;
   }

   private void validarCliente(Cliente cliente){
        if(cliente == null){
        throw new IllegalArgumentException("Pedido não pode ser feito sem um cliente!");
    } 
}
private void validarItemPedido(ItemPedido itemPedido){
    if(itemPedido ==null){
        throw new IllegalArgumentException( "ItemPedido não pode ser nulo");
    }
}
public void adicionarItem(ItemPedido itemPedido) { 

    validarItemPedido(itemPedido);

    for (ItemPedido itemExistente : itens) {         

        if (itemExistente.getProduto()
                .equals(itemPedido.getProduto())) {  

            itemExistente.aumentarQuantidade(
                    itemPedido.getQuantidade()
            );
            calcularTotal();
            return;
    } } 
    itens.add(itemPedido);
    calcularTotal();
} 
public void diminuirItem(ItemPedido itemPedido){
    validarItemPedido(itemPedido);
    
    for (ItemPedido itemExistente : itens){
     if(itemExistente.getProduto().equals(itemPedido.getProduto()) && itemExistente.getQuantidade() > 1){
        itemExistente.diminuirQuantidade(1);
        calcularTotal();
}
    if(itemExistente.getProduto().equals(itemPedido.getProduto()) && itemExistente.getQuantidade() == 1){
        itens.remove(itemExistente);
}
        calcularTotal();
        return;
    }}
private void calcularTotal(){
    total=BigDecimal.ZERO;
    for (ItemPedido itemPedido : itens){
        total = total.add(itemPedido.getSubTotal());

    }
} 
public void confirmarPagamento(){
    if(status != StatusPedido.PENDENTE){
           throw new IllegalStateException("O pagamento só pode ser confirmado para pedidos pendentes.");
        }
        status = StatusPedido.PAGAMENTO_REALIZADO;
}
public void comecarSeparacao(){
    if(status != StatusPedido.PAGAMENTO_REALIZADO){
       throw new IllegalStateException("O pedido so pode ser separado se pagamento for confirmado!!");
     
}
status = StatusPedido.EM_SEPARACAO;
    
}
public void finalizarSeparacao(){
    if( status != StatusPedido.EM_SEPARACAO){
        throw new IllegalStateException("O pedido só pode ficar pronto para entrega se estiver em separação.");
    }
    status = StatusPedido.PRONTO_PARA_ENTREGA;
}
public void entregarPedido(){
    if(status != StatusPedido.PRONTO_PARA_ENTREGA){
        throw new IllegalStateException("O pedido só pode ser entregue se estiver pronto para entrega.");
    }
    status = StatusPedido.ENTREGUE;
}
public void cancelarPedido(){
    if (status != StatusPedido.PENDENTE){
        throw new IllegalStateException("O pedido só pode ser cancelado se estiver pendente.");
    }
    status = StatusPedido.CANCELADO;
}

}  

