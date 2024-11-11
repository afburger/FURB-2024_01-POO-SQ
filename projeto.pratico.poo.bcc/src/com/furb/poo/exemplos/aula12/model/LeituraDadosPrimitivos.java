package com.furb.poo.exemplos.aula12.model;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;

/**
 *
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class LeituraDadosPrimitivos {

    public static void main(String[] args) {
        // Leitura
        try {
            File fireRead = new File("C:\\Temp\\dados.bin");
            FileInputStream fis = new FileInputStream(fireRead);
            DataInputStream dis = new DataInputStream(fis);
            double precoLido = dis.readDouble();
            boolean bool = dis.readBoolean();
            String instituicao = dis.readUTF();
            dis.close();
        } catch (Exception e) {
            System.out.println("Erro na leitura");
        }
    }
    
}
