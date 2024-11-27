package com.furb.poo.provas.prova02.model;

import java.text.DecimalFormat;

/**
 * Representa a locação de um veículo realizada por uma pessoa do tipo física.
 *
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class LocacaoPessoaFisica extends Locacao {

    private final static Double valorDesconto = 5.0;

    private Veiculo veiculo;

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    @Override
    public Double getValorTotal() {
        Double valorTotal = 0.0;
        Double valorDiariaComDesconto = 0.0;
        if (getVeiculo() != null) {
            valorDiariaComDesconto = getVeiculo().getPrecoDiaria();
            if (getQuantidadeDias() >= 5) {
                valorDiariaComDesconto = valorDiariaComDesconto - ((getVeiculo().getPrecoDiaria() * this.valorDesconto) / 100.0);
            }
        }

        // Calcula o valor total da locação com base no preço da diária e quantidade de dias.
        valorTotal = getQuantidadeDias() * valorDiariaComDesconto;

        return valorTotal;
    }

    @Override
    public String imprimir() {
        DecimalFormat decimalFormat = new DecimalFormat("R$ #,###.##");
        String relatorio = "Pessoa"
                + "\nNome: " + getPessoa().getNome()
                + "\nCPF: " + getPessoa().getCpfCnpj()
                + "\nTelefone: " + getPessoa().getTelefone()
                + "\ne-mail:" + getPessoa().getEmail()
                + "\n-----------------------------------------"
                + "\nQuantidade de diárias: " + getQuantidadeDias()
                + "\nValor total da locação: " + decimalFormat.format(getValorTotal())
                + "\n-----------------------------------------"
                + "\nInformações do veículo";

        if (veiculo != null) {
            relatorio = relatorio.concat("\n");
            relatorio = relatorio.concat(veiculo.imprimir());
            relatorio = relatorio.concat("\n");
            relatorio = relatorio.concat("###############################");
        }

        return relatorio;
    }

}
