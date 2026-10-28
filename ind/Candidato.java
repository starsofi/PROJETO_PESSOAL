public class Candidato {
    // Atributos (características do candidato)
    private String nome;
    private int numero;
    private int votos;

    // Construtor (como o candidato nasce no sistema)
    public Candidato(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
        this.votos = 0; // Todo candidato começa com zero votos
    }

    // Métodos (ações que podemos fazer)
    public void receberVoto() {
        this.votos++;
    }

    // Getters (para conseguirmos ler as informações protegidas)
    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }

    public int getVotos() {
        return votos;
    }
}
