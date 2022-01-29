import banco.Banco;
import cliente.Cliente;
import conta.Conta;
import conta.ContaCorrente;
import conta.ContaPoupanca;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestBanco {
    @Test
    public void criandoClienteComContaTipoPoupancaECorrente(){
        Cliente julia = new Cliente("Julia", "02148566735","590583654");
        Banco ju = new Banco();
        List<Conta> contasJu = new ArrayList<>();
        Conta cc = new ContaCorrente(julia,5000);
        Conta poupanca = new ContaPoupanca(julia,0);
        contasJu.add(cc);
        contasJu.add(poupanca);

        cc.transferir(1000,poupanca);
        cc.sacar(500);
        poupanca.depositar(100);


        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }

}
