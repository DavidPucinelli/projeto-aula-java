package br.com.fiap.main;

import br.com.fiap.entities.Cliente;
import br.com.fiap.entities.Colaborador;
import br.com.fiap.entities.Endereco;

import javax.swing.*;

public class TesteSistema {

    // String
    static String texto(String j){
       return JOptionPane.showInputDialog(j);
    }


    // int
    static int inteiro(String j){
        return Integer.parseInt( JOptionPane.showInputDialog(j) );
    }

    // double
    static double real(String j){
        return Double.parseDouble( JOptionPane.showInputDialog(j) );
    }

    // Java 21 psvm    // java 25 public psvma
    public static void main(String[] args) {

        // Instanciar objetos
        Cliente objCliente = new Cliente(
                texto("INFORMAÇÕES DO CLIENTE/nNOME"),
                texto("RG"),
                inteiro("Idade"),
                real("altura")
        );

        Colaborador objColaborador = new Colaborador(
                inteiro("Numero de registro"),
                texto("Informações do cliente/nNome"),
                texto("Setor"),
                real("salario")
        );

        Endereco objEndereco = new Endereco(
                texto("Logradouro"),
                inteiro("Número"),
                texto("Complemento"),
                texto("CEP"),
                texto("Bairro"),
                texto("Cidade"),
                texto("Estado")
                );






        // Entradas Colaborador
        objColaborador.setNumeroRegistro( inteiro("INFORMAÇÕES DO COLABORADOR\nNº de registro")  );
        objColaborador.setNome(texto("Nome"));
        objColaborador.setSetor(texto("Setor"));
        objColaborador.setSalario( real("Salário")  );
        objColaborador.setEndereco(objEndereco);

        // Entradas Endereco/Colaborador
        objEndereco.setLogradouro( texto("ENDEREÇO DO COLABORADOR\nLogradouro") );
        objEndereco.setNumero( inteiro("Numero")  );
        objEndereco.setComplemento(texto("Complemento"));
        objEndereco.setCep(texto("CEP"));
        objEndereco.setBairro(texto("Bairro"));
        objEndereco.setCidade(texto("Cidade"));
        objEndereco.setEstado(texto("Estado"));

        //Saídas
        System.out.print(
         objCliente + "" + objColaborador
        );
    }
}
