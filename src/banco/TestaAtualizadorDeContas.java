/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

import static com.sun.tools.doclint.Entity.quot;

/**
 *
 * @author 36649863858
 */
class TestaAtualizadorDeContas {
public static void main(String[] args) {
Conta c = new Conta();
Conta cc = new ContaCorrente();
Conta cp = new ContaPoupanca();
c.deposita(1000);
cc.deposita(1000);
cp.deposita(1000);
AtualizadorDeContas adc = new AtualizadorDeContas(0.10);
adc.roda(c);
adc.roda(cc);
adc.roda(cp);

    System.out.println("-------------------------------");
System.out.println("Saldo Total: " + adc.getSaldoTotal());
}
}