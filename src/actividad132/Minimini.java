/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad132;

/**
 *
 * @author vina
 */
public class Minimini {
    private int nsolicitud;
    private String fecha;
    private Cliente cliente;
    private int total;
    private String desctotal;

    public Minimini(int nsolicitud, String fecha, Cliente cliente, int total, String desctotal) {
        this.nsolicitud = nsolicitud;
        this.fecha = fecha;
        this.cliente = cliente;
        this.total = total;
        this.desctotal = desctotal;
    }

    public Minimini() {
    }

    public int getNsolicitud() {
        return nsolicitud;
    }

    public void setNsolicitud(int nsolicitud) {
        this.nsolicitud = nsolicitud;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getDesctotal() {
        return desctotal;
    }

    public void setDesctotal(String desctotal) {
        this.desctotal = desctotal;
    }

    @Override
    public String toString() {
        return "Minimini{" + "nsolicitud=" + nsolicitud + ", fecha=" + fecha + ", cliente=" + cliente + ", total=" + total + ", desctotal=" + desctotal + '}';
    }
    
    
}
