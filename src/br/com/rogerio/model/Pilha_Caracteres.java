/*
 3. Dada uma string de caracteres formada por uma sequência de letras e
dígitos, construa uma função que retorne uma fila na qual as letras são
mantidas na sequência original e os dígitos são colocados na ordem inversa.
Exemplos:
A1E5T7W8G → AETWG8751
3C9H4Q6 → CHQ6493
Como mostram os exemplos, as letras devem ser mostradas primeiro,
seguidas dos dígitos.
Sugestão: usar na função uma fila e uma pilha;
 */
package br.com.rogerio.model;

/**
 *
 * @author roger
 */
public class Pilha_Caracteres {
    
    private int elementos[];
    private int tamanho = 0;
    private int topo = -1 ;

    public Pilha_Caracteres(int tamanho) {
        this.tamanho = tamanho;
        elementos = new int [tamanho];
        topo = -1;
    }
    
    public boolean isEmpty(){
        return topo == -1;
    }
    
    public boolean isFull(){
        return topo == (elementos.length - 1);
    }
    
   public void push(int elemento){
       if (isFull()) {
           throw new RuntimeException("Pilha cheia");
       }
       topo++;
       elementos[topo] = elemento;
   }
   
   public int pop(){
       if (isEmpty()) {
           throw new RuntimeException("A fila está vazia!\n");
       }
       int elemento;
       elemento = elementos[topo];
       topo--;
       return elemento;
   }
   
   public int consultar(){
       return elementos[topo];
   }
   
   public int quantElementos(){
       return topo +1;
   }
   
   public void esvaziarPilha(){
       topo = -1;
   }
        
}
