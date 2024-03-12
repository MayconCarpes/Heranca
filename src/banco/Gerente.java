/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

/**
 *
 * @author 36649863858
 */
public class Gerente extends Funcionario { //extends cria classe filha
  
  private int senha;
  private int numeroDeFuncionariosGerenciados;

  public Gerente(String nome, String cpf, double salario){
  super(nome, cpf, salario);
  }
  
  
public boolean autentica(int senha) {
if (this.senha == senha) {

System.out.println("Acesso Permitido!");

return true;
} else {

System.out.println("Acesso Negado!");

return false;
}
}

// setter da senha omitido
  @Override //código que foi subescrito 
 public double getBonificao() {
   
    return super.getBonificao() + 1000;
}
}

