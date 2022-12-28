/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardapiocachorroquente;
import Controller.AcompanhamentosFrios;
import Controller.AcompanhamentosQuentes;
import javax.swing.JOptionPane;

import View.JFormCardapio;
import javax.swing.text.View;
public class Cardapiocachorroquente {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        JFormCardapio jformcardapio = new JFormCardapio();
        jformcardapio.setVisible(true);
        
        
       Controller.AcompanhamentosFrios AF = new AcompanhamentosFrios();
       Controller.AcompanhamentosQuentes AQ = new AcompanhamentosQuentes();
       
       String CQPao;
       String CQMolho;
       String CQSalsicha;
       double CQPreco;
       
       String escolha,choice;
       int principal=0, cadastrar=0;
       int lblCadastrar;
       
       while(principal!=3){
           escolha = JOptionPane.showInputDialog(null,"Digite uma opção:"
                   + "\n 1. Listar Acompanhamentos Frios."
                   + "\n 2. Listar Acompanhamentos Quentes."
                   + "\n 3. Sair do Menu Principal",
                   "Menu principal", JOptionPane.QUESTION_MESSAGE);
           principal = Integer.parseInt(escolha);
           switch (principal){
               case 1:
                      while(cadastrar!=5){
                          escolha = JOptionPane.showInputDialog(null,
                                  "Listagem dos Acompanhamentos Frios:\n Digite a"
                                   + " quantidade de acompanhamentos as opções"
                                          + "que deseja inserir de 1 a 4:"
                                          + "\n 1. Batata Palha."
                                          + "\n 2. Vinagrete."
                                          + "\n 3. Salada."
                                          + "\n 4. Ervilha."
                                          + "\n 5. Sair do menu Cadastrar.","Menu Cadastrar",
                                          JOptionPane.QUESTION_MESSAGE);
                          int opcao = Integer.parseInt(escolha);
                          int opcao1=0;
                          for(opcao1=0;opcao1<=opcao;opcao1++){
                              choice = JOptionPane.showInputDialog(null,
                                      "Listagem dos Acompanhamentos Frios:\n Digite a"
                                   + " quantidade de acompanhamentos as opções"
                                          + "que deseja inserir de 1 a 4:"
                                          + "\n 1. Batata Palha."
                                          + "\n 2. Vinagrete."
                                          + "\n 3. Salada."
                                          + "\n 4. Ervilha."
                                          + "\n 5. Sair do menu Cadastrar.","Menu Cadastrar",
                                          JOptionPane.QUESTION_MESSAGE);
                              lblCadastrar = Integer.parseInt(choice);
                              switch (lblCadastrar){
                                  case 1:
                                      JOptionPane.showMessageDialog(null, "Batata Palha incluído com sucesso!");
                                      break;
                                  
                                  case 2:
                                      JOptionPane.showMessageDialog(null, "Vinagrete incluído com sucesso!");
                                      break;
                                  
                                  case 3:
                                      JOptionPane.showMessageDialog(null, "Salada incluído com sucesso!");
                                      break;
                                      
                                  case 4:
                                      JOptionPane.showMessageDialog(null, "Ervilha incluído com sucesso!");
                                      break;
                                      
                                  case 5:
                                      JOptionPane.showMessageDialog(null, "Retorno ao menu inicial!");
                                      break;
                                  
                                   
                              }
                          
                          }
                      }
           }
       }
    }
    
}
