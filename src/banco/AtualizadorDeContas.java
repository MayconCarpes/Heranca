/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

/**
 *
 * @author 36649863858
 */
public class AtualizadorDeContas {
        private double saldoTotal = 0;
        private double selic;

    public double getSaldoTotal() {
        return saldoTotal;
    }

    public void setSaldoTotal(double saldoTotal) {
        this.saldoTotal = saldoTotal;
    }

    public double getSelic() {
        return selic;
    }

    public void setSelic(double selic) {
        this.selic = selic;
    }
        
        
            AtualizadorDeContas(double selic) {
             this.selic = selic;
            }
            
            
        void roda(Conta c) {
        double saldoAnterior = c.getSaldo();// aqui voce imprime o saldo anterior, atualiza a conta,
        c.atualiza(this.selic);

        double saldoFinal = c.getSaldo();
        this.saldoTotal += saldoFinal - saldoAnterior;// lembrando de somar o saldo final ao atributo saldoTotal

            System.out.println(c.getIdentificador());    
        System.out.println("Saldo anterior: " + saldoAnterior);
        System.out.println("Saldo final: " + saldoFinal);// e depois imprime o saldo final
        }
// outros métodos, colocar o getter para saldoTotal!  
}
