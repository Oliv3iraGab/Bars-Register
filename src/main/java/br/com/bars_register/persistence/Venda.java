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

}
