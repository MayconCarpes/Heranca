/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

/**
 *
 * @author 36649863858
 */
public class TesteHerenca {
    public static void main(String[] args) {
       
        Funcionario objFuncionario = new Funcionario("nada", "085788", 1000);
        Gerente objGerente = new Gerente("Pedro", "008", 1000);
        Diretor objDiretor = new Diretor("Maria", "00987988", 30000);
        
        System.out.println("Nome Gerente: "+objGerente.getNome());
        System.out.println("");
        System.out.println("Nome Funcionario: "+objFuncionario.getNome());
        System.out.println("Nome Diretor: "+objDiretor.getNome());
        
        
        System.out.println("Bonificação do funcionario: "+objFuncionario.getBonificao());
        System.out.println("Bonificação do gerente: "+objGerente.getBonificao());
    }
    
    
}
