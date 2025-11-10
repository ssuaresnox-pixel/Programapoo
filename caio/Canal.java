public class Canal {
    private int numero;
    private String nome;
    private String categoria;
    
   
    public Canal(int numero, String nome, String categoria) {
        this.numero = numero;
        this.nome = nome;
        this.categoria = categoria;
    }
    
   
    public int getNumero() {
        return numero;
    }
    
    public String getNome() {
        return nome;
    }
    
    public String getCategoria() {
        return categoria;
    }
    
  
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    @Override
    public String toString() {
        return "Canal " + numero + " - " + nome + " (" + categoria + ")";
    }
}