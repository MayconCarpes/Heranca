/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

/**
 *
 * @author 36649863858
 */
public class ContaPoupanca extends Conta{
   @Override
   public void atualiza(double taxa) {
       deposita(getSaldo() * (taxa*3)); //reescreve ou sobreescreveu
}
}
