package modelo;

public class Filme {

    private int id;
    private String nome;
    private Genero genero;
    private double avaliacao;
    private int duracao;
    private Diretor diretor;
    private Usuario usuario;

    public Filme() {
    }

    public Filme(int id, String nome, Genero genero,
                 double avaliacao, int duracao,
                 Diretor diretor, Usuario usuario) {

        this.id = id;
        this.nome = nome;
        this.genero = genero;
        this.avaliacao = avaliacao;
        this.duracao = duracao;
        this.diretor = diretor;
        this.usuario = usuario;
    }

    public String classificarFilme() {

        if (avaliacao >= 8) return "Excelente";
        if (avaliacao >= 6) return "Bom";

        return "Regular";
    }

    public String getDuracaoFormatada() {

        int horas = duracao / 60;
        int minutos = duracao % 60;

        if (horas > 0) {
            return horas + "h " + minutos + "min";
        }

        return minutos + "min";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public double getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(double avaliacao) {
        if (avaliacao < 0) avaliacao = 0;
        if (avaliacao > 10) avaliacao = 10;

        this.avaliacao = avaliacao;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public Diretor getDiretor() {
        return diretor;
    }

    public void setDiretor(Diretor diretor) {
        this.diretor = diretor;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String toString() {
        return nome;
    }

    public String detalhes() {
        return "Filme: " + nome +
               "\nDiretor: " + diretor +
               "\nGênero: " + genero +
               "\nUsuário: " + usuario +
               "\nNota: " + avaliacao +
               "\nDuração: " + getDuracaoFormatada();
    }
}