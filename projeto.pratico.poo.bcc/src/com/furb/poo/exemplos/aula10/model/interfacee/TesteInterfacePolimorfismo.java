package com.furb.poo.exemplos.aula10.model.interfacee;

import java.util.ArrayList;

/**
 *
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class TesteInterfacePolimorfismo {

    public static void main(String[] args) {
        ArrayList<Pagavel> pagamentos = new ArrayList<>();
        
        pagamentos.add(new ContaAgua());
        pagamentos.add(new ContaLuz());
        pagamentos.add(new PrevidenciaPrivada());
        pagamentos.add(new MensalidadeEstudo());
        
        double totalPagamentos = 0.0;
        
        for (Pagavel pagamento : pagamentos) {
            totalPagamentos += pagamento.calcularValorPagar();
        }
        
        System.out.println("Total de pagamentos: " + totalPagamentos);
    }
    
}
