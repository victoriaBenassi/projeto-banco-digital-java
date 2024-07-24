package main.java.dev.banco.model;

import lombok.Data;
import lombok.Getter;

import java.util.*;

@Data
public class Banco {

    private List<Cliente> clientes;

    private List<Conta> contas;

    public Banco(){
        this.clientes = new ArrayList<>();
        this.contas = new ArrayList<>();
    }
}
