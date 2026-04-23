package entidades;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;

import entidades.enumeradas.StatusPedido;



public class Pedido {
    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private StatusPedido status;
    private Cliente cliente;
    private ArrayList<ItensPedido> listaDeItens = new ArrayList<>();
    private Date momento;

    public Pedido(StatusPedido status, Cliente cliente, Date momento) {
        this.status = status;
        this.cliente = cliente;
        this.momento = momento;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<ItensPedido> getListaDeItens() {
        return listaDeItens;
    }

    public Date getMomento() {
        return momento;
    }

    public void setMomento(Date momento) {
        this.momento = momento;
    }

    public void addItem(ItensPedido item){
        listaDeItens.add(item);
    }

    public void removeItem(ItensPedido item){
        listaDeItens.remove(item);
    }

    public double total(){
        double total=0;
        for(ItensPedido item :listaDeItens){
            total+=item.subtotal();
        }
        return total;
    }

    @Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Momento do pedido: ");
		sb.append(sdf.format(momento) + "\n");
		sb.append("Status do pedido: ");
		sb.append(status + "\n");
		sb.append("Cliente: ");
		sb.append(cliente + "\n");
		sb.append("\n Itens do Pedido:\n");
		for (ItensPedido item : listaDeItens) {
			sb.append(item + "\n");
		}
		sb.append("Valor Total: R$");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
	}
    
    
}
