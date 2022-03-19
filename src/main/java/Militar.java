public class Militar {

    private String nome;
    private Patente patente;

    public Militar(String nome, Patente patente){
        this.nome = nome;
        this.patente = patente;
    }

    public String obterMilitar(){
        return "Militar{" +
                "nome='" + this.nome + '\'' +
                ", patente='" + patente.getNome() + '\'' +
                '}';
    }

}
