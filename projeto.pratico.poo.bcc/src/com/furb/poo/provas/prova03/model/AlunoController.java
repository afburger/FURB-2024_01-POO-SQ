package com.furb.poo.provas.prova03.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Classe responsável por fazer as funções com um {@code Aluno}
 * 
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class AlunoController {

    private final static double DEZ = 10.0;
    private final static double ZERO = 0.0;
    public final static String FILE_PATH = "C:\\Temp\\alunos.csv";
    
    public Double calcularMedia(List<Double> notas) {
        int quantidadeNotas = 0;
        Double media = 0.0;
        
        if (notas != null) {
            for (Double nota : notas) {
                if (nota < 0 || nota > 10) {
                    throw new NotaInvalidaException();
                }
                quantidadeNotas++;
                media = media + nota;
            }
            
            media = media / quantidadeNotas;
        }
        
        return media;
    }
    
    public void salvarAlunos(List<Aluno> alunos) throws IOException {
        PrintWriter pw = null;

        try {
            FileWriter fw = new FileWriter(FILE_PATH, false);
            pw = new PrintWriter(fw);
            
            for (Aluno aluno : alunos) {
                pw.println(aluno.persistir());
            }

        } finally {
            if (pw != null) {
                pw.close();
            }
        }
    }
    
    public List<Aluno> lerArquivo(String caminho) throws FileNotFoundException, IOException, NumberFormatException {
        List<Aluno> alunos = new ArrayList<>();

        Scanner sc = new Scanner(new File(caminho));

        String linha;

        
        // André,6.0
        // [0] = André
        // [1] = 6.0
        while (sc.hasNext()) {
            linha = sc.nextLine();
            String[] dados = linha.split(",");
            String nome = dados[0];
            Double media = Double.parseDouble(dados[1]);

            Aluno aluno = new Aluno();
            aluno.setNome(nome);
            aluno.setMedia(media);
            
            alunos.add(aluno);
        }

        return alunos;
    }
}
