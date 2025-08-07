public class Biblioteca {
// Atributos privados
private Livro[] livros;
private int quantidadeLivros;
private static final int CAPACIDADE_MAXIMA = 10;

// Construtor
public Biblioteca() {
livros = new Livro[CAPACIDADE_MAXIMA];
quantidadeLivros = 0;
}

// M�todo para adicionar livro
public boolean adicionarLivro(Livro livro) {
if (quantidadeLivros < CAPACIDADE_MAXIMA && livro != null) {
livros[quantidadeLivros] = livro;
quantidadeLivros++;
System.out.println("Livro '" + livro.getTitulo() + "' adicionado � biblioteca!");
return true;
} else {
System.out.println("N�o foi poss�vel adicionar o livro. Biblioteca cheia ou livro inv�lido.");
return false;
}
}
// M�todo para buscar livro por t�tulo
public Livro buscarLivroPorTitulo(String titulo) {
for (int i = 0; i < quantidadeLivros; i++) {
if (livros[i].getTitulo().equalsIgnoreCase(titulo)) {
return livros[i];
}
}
return null; // Livro n�o encontrado
}
// M�todo para listar livros dispon�veis
public void listarLivrosDisponiveis() {
System.out.println("=== LIVROS DISPON�VEIS ===");
boolean encontrouDisponivel = false;
for (int i = 0; i < quantidadeLivros; i++) {
if (livros[i].isDisponivel()) {
System.out.println("- " + livros[i].getTitulo() +
" por " + livros[i].getAutor() +
" (R$ " + livros[i].getPreco() + ")");
encontrouDisponivel = true;
}
}

if (!encontrouDisponivel) {
System.out.println("Nenhum livro dispon�vel no momento.");
}
}

// M�todo para calcular valor total
public double calcularValorTotal() {
double valorTotal = 0.0;
for (int i = 0; i < quantidadeLivros; i++) {
valorTotal += livros[i].getPreco();
}
return valorTotal;
}

// Getter para quantidade de livros
public int getQuantidadeLivros() {
return quantidadeLivros;
}
}