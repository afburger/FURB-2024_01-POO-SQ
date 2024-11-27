package com.furb.poo.provas.prova02.model;

import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 * * Representa a locação de um veículo realizada por uma pessoa do tipo jurídica.
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class LocacaoPessoaJuridica extends Locacao {

    private static final Double valorDesconto = 10.0;
    
    private ArrayList<Veiculo> veiculos = new ArrayList<>();

    public ArrayList<Veiculo> getVeiculos() {
        return veiculos;
    }
    
    public void incluirVeiculo(Veiculo veiculo) {
        veiculos.add(veiculo);
    }
    
    @Override
    public Double getValorTotal() {
        Double valorTotal = 0.0;
        // Percorre todos os veículos da locação, e soma o valor da diária de cada veículo.
        for (Veiculo veiculo : veiculos) {
            valorTotal = valorTotal + veiculo.getPrecoDiaria();
        }
        
        // Multiplica o valot total das diárias 
        valorTotal = valorTotal * getQuantidadeDias();
        
        // Calcula o desconto dessa locação.
        Double valorDescontoAplicado = (valorTotal * this.valorDesconto) / 100.0;
        valorTotal = valorTotal - valorDescontoAplicado;
        
        return valorTotal;
    }

    @Override
    public String imprimir() {
        DecimalFormat decimalFormat = new DecimalFormat("R$ #,###.##");
        String relatorio = "Pessoa"
                + "\nNome: " + getPessoa().getNome()
                + "\nCNPJ: " + getPessoa().getCpfCnpj()
                + "\nTelefone: " + getPessoa().getTelefone()
                + "\ne-mail:" + getPessoa().getEmail()
                + "\n-----------------------------------------"
                + "\nQuantidade de diárias: " + getQuantidadeDias()
                + "\nValor total da locação" + decimalFormat.format(getValorTotal())
                + "\n-----------------------------------------"
                + "\nInformações dos veículos";
        
        for (Veiculo veiculo : veiculos) {
            relatorio = relatorio.concat("\n");
            relatorio = relatorio.concat(veiculo.imprimir());
            relatorio = relatorio.concat("\n");
            relatorio = relatorio.concat("###############################");
        }
        
        return relatorio;
    }

}
