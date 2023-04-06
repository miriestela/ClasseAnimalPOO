public class Animal{
    
    private String tipo;
    private String nome;
    private int idade;
    private String barulho;

    
    public Animal(String tipo, String nome, int idade, String barulho){
        this.tipo = tipo;
        this.nome = nome;
        this.idade = idade;
        this.barulho = barulho;
    }

    public String getTipo(){
        return tipo;
    }
    public void setTipo(String raca){
        this.tipo = raca;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String apelido){
        nome = apelido;
    }

    public int getIdade(){
        return idade;
    }
    public void setIdade(int anos){
        idade = anos;
    }

    public String getBarulho(){
        return barulho;
    }
    public void setBarulho(String som){
        barulho = som;
    }

    @Override
    public String toString(){

        return " Tipo: " + tipo + " Nome: " + nome + " Idade: " + idade + " Barulho: " + barulho;
    }
}

