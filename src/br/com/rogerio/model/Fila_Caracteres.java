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
public class Fila_Caracteres {

    private int tamanho;
    private int inicio;
    private int fim;
    private int array[];
    private int quantElementos;

    public Fila_Caracteres() {
        this(10);
    }

    public Fila_Caracteres(int tamanho) {
        if (tamanho <= 0) {
            throw new RuntimeException("Tamanho deve ser maior do que zero\n");
        }
        this.tamanho = tamanho;
        this.array = new int[tamanho];
        inicio = 0;
        fim = 0;
        quantElementos = 0;
    }

    public boolean isEmpty() {
        return quantElementos == 0;
    }

    public boolean isFull() {
        return quantElementos == array.length;
    }

    public int size() {
        return quantElementos;
    }

    public void enqueue(int elemento) {
        if (isFull()) {
            throw new RuntimeException("A fila está cheia!\n");
        }
        array[fim] = elemento;
        fim = (fim + 1) % array.length;
        quantElementos++;
    }

    public void dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("A fila está vazia!\n");
        }
        inicio = (inicio + 1) % array.length;
        quantElementos--;
    }

    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("A fila está vazia!\n");
        }
        return array[inicio];
    }

    public void destroy() {
        inicio = 0;
        fim = 0;
        quantElementos = 0;
    }

}
