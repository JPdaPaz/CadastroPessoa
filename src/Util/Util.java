package Util;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Util {

    public static void gravar(ArrayList lista) {

        String acesso = "";
        JFileChooser escolhe = new JFileChooser();
        int returnVal = escolhe.showOpenDialog(null);
        if (returnVal == 0) {
            acesso = escolhe.getSelectedFile().getAbsolutePath();
        } else {
            JOptionPane.showMessageDialog(null, "Você não escolheu o arquivo");
        }

        try {
            FileOutputStream arquivo = new FileOutputStream(acesso);
            ObjectOutputStream fluxo = new ObjectOutputStream(arquivo);
            fluxo.writeObject(lista);
            fluxo.flush();
            JOptionPane.showMessageDialog(null, "Dados gravados com sucesso no arquivo");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha na gravação do arquivo" + (e));
        }
    }

    public static ArrayList ler() {
        ArrayList lista = new ArrayList<>();

        String acesso = "";
        JFileChooser escolhe = new JFileChooser();
        int returnVal = escolhe.showOpenDialog(null);
        if (returnVal == 0) {
            acesso = escolhe.getSelectedFile().getAbsolutePath();
        } else {
            JOptionPane.showMessageDialog(null, "Você não escolheu o arquivo");
        }

        try {
            FileInputStream arquivo = new FileInputStream(acesso);
            ObjectInputStream fluxo = new ObjectInputStream(arquivo);
            lista = (ArrayList) fluxo.readObject();
            JOptionPane.showMessageDialog(null, "Dados lidos com sucesso"
                    + " no arquivo" + acesso);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha na leitura do arquivo" + (e));
        }
        return lista;
    }
    
    public static String escreveData(Date dia){
        String data;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        data = sdf.format(dia);
        return data;
    }
    
    public static Date leData(String msg){
        Date data = null;
        DateFormat dtOutput = new SimpleDateFormat("dd/MM/yyyy");
        try {
            data = dtOutput.parse(msg);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Erro na conversão de data");
        }
        return data;
    }

}
