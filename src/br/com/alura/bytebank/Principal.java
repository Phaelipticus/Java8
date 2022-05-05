package br.com.alura.bytebank;

import br.com.alura.bytebank.io.Leitor;
import br.com.alura.bytebank.io.LeitorCSV;
import br.com.alura.bytebank.io.LeitorPagamento;
import br.com.alura.bytebank.io.LeitorXML;
import br.com.alura.bytebank.model.Pagamento;
import br.com.alura.bytebank.visualizador.OpcoesPagamento;

import java.io.IOException;
import java.util.List;

public class Principal {

    private static LeitorCSV leitorCSV;

    public static void main(String[] args) throws IOException {
        /*new OpcoesPagamento().mensagemDeBoasVindas();
        LeitorXML l = new LeitorXML();
        l.verificaLeitor();*/

        LeitorCSV leitorCSV = new LeitorCSV();
        //leitorCSV = new LeitorCSV();
        List<Pagamento> pagamentos = leitorCSV.ler(1);


        System.out.println("Req2");

    }

}
