package Cadastro;

import Classes.Pessoa;
import Util.Util;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Metodos {

    static void inserepessoa(ArrayList<Pessoa> Agenda) {
        Pessoa pessoa = new Pessoa();

        pessoa.setNome(JOptionPane.showInputDialog(null, "Digite o nome:"));
        pessoa.setSexo(JOptionPane.showInputDialog(null, "Digite o sexo:").charAt(0));
        pessoa.setDataNasc(Util.leData(JOptionPane.showInputDialog(null, "Digite a data de nascimento (dd/MM/yyyy):")));
        pessoa.setNacionalidade(JOptionPane.showInputDialog(null, "Digite a nacionalidade:"));

        Agenda.add(pessoa);
    }

    static void removepessoa(ArrayList<Pessoa> Agenda) {
        int posicao;

        posicao = Integer.parseInt(JOptionPane.showInputDialog("Digite a posição a ser removida."));
        Agenda.remove(posicao);
    }

    static void listarpessoas(ArrayList<Pessoa> Agenda) {
        int c1;
        String msg = "";

        for (c1 = 0; c1 < Agenda.size(); c1++) {
            Pessoa exemplo = new Pessoa();
            exemplo = (Pessoa) Agenda.get(c1);

            msg += "\nPessoa nº" + c1
                    + "\nNome: " + exemplo.getNome()
                    + "\nSexo: " + exemplo.getSexo()
                    + "\nData de nascimento: " + Util.escreveData(exemplo.getDataNasc())
                    + "\nNacionalidade: " + exemplo.getNacionalidade()
                    + "\n__________________________________";
        }
        JOptionPane.showMessageDialog(null, msg);
    }

    static void alterapessoa(ArrayList<Pessoa> Agenda) {
        int c1;
        int achou = 0;
        int editar = 0;
        String nome;
        nome = JOptionPane.showInputDialog(null, "Digite o nome da pessoa a procurar:");
        for (c1 = 0; c1 < Agenda.size(); c1++) {
            if ((Agenda.get(c1).getNome()).equals(nome)) {
            //if (Agenda.get(c1).getNome() == nome) {
                achou = 1;
                editar = c1;
            }
        }

        if (achou != 1) {
            JOptionPane.showMessageDialog(null, "Pessoa não encontrada.");
        } else {

            Pessoa pessoa = new Pessoa();
            pessoa = (Pessoa) Agenda.get(editar);

            pessoa.setNome(JOptionPane.showInputDialog("Digite o nome da pessoa:", pessoa.getNome()));
            pessoa.setSexo(JOptionPane.showInputDialog("Digite o sexo da pessoa:", pessoa.getSexo()).charAt(0));
            pessoa.setDataNasc(Util.leData((JOptionPane.showInputDialog("Digite a data de nascimento da pessoa", Util.escreveData(pessoa.getDataNasc())))));
            pessoa.setNacionalidade(JOptionPane.showInputDialog("Digite a nacionalidade da pessoa:", pessoa.getNacionalidade()));

            //Agenda.set(c1, pessoa);
        }
    }

}
