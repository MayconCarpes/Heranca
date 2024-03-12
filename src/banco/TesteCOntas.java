/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

/**
 *
 * @author 36649863858
 */
public class TesteCOntas {
    public static void main(String[] args) {
        Conta c = new Conta();
ContaCorrente cc = new ContaCorrente();
ContaPoupanca cp = new ContaPoupanca();
c.deposita(1000);
cc.deposita(1000);
cp.deposita(1000);
c.atualiza(0.10);
cc.atualiza(0.10);
cp.atualiza(0.10);
System.out.println(c.getSaldo());
System.out.println(cc.getSaldo());
System.out.println(cp.getSaldo());

}
    }

