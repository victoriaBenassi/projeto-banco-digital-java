package main.java.dev.banco.model;

public class Main {

    public static void main(String[] args) {
        Cliente victoria = new Cliente("Victoria");

        Conta cc = new ContaCorrente(victoria);
        Conta poupanca = new ContaPoupanca(victoria);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
