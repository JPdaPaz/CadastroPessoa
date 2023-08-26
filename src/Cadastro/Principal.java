package Cadastro;

import Util.Util;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {

        ArrayList Agenda = new ArrayList();
        int code;

        do {
            code = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite: \n0 - Sair \n1 - Registrar pessoa"
                    + "\n2 - Listar \n3 - Alterar \n4 - Excluir \n5 - Carregar dados salvos \n6 - Salvar"));

            switch (code) {

                case 0: {
                    JOptionPane.showMessageDialog(null, "Fim.");
                }
                break;

                case 1: {
                    Metodos.inserepessoa(Agenda);
                }
                break;

                case 2: {
                    Metodos.listarpessoas(Agenda);
                }
                break;

                case 3: {
                    Metodos.alterapessoa(Agenda);
                }
                break;

                case 4: {
                    Metodos.removepessoa(Agenda);
                }
                break;

                case 5: {
                    Agenda = Util.ler();
                }
                break;

                case 6: {
                    Util.gravar(Agenda);
                }
                break;

                default: {
                    JOptionPane.showMessageDialog(null, "Código inválido, tente novamente.");
                }
            }

        } while (code != 0);

    }

}
