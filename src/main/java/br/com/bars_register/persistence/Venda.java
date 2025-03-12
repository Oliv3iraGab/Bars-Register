package br.com.bars_register.persistence;

import java.sql.Date;

/**
 *
 * @author limag
 */
public class Venda {
    private int id;
    private Date data;
    private double total;
    private Produto produtos;

    public Venda() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Produto getProdutos() {
        return produtos;
    }

    public void setProdutos(Produto produtos) {
        this.produtos = produtos;
    }
    
}
