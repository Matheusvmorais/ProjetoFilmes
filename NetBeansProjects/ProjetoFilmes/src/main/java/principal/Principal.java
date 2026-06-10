package principal;

import java.util.Scanner;
import modelo.*;

public class Principal {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // OBJETOS
        Usuario usuario = new Usuario();
        Diretor diretor = new Diretor();
        Genero genero = new Genero();
        Filme filme = new Filme();

        System.out.println("===== CADASTRO DE USUARIO =====");
        System.out.print("Nome: ");
        usuario.setNome(entrada.nextLine());

        System.out.print("Email: ");
        usuario.setEmail(entrada.nextLine());

        System.out.print("Senha: ");
        usuario.setSenha(entrada.nextLine());

        System.out.println("\n===== CADASTRO DE FILME =====");

        System.out.print("Nome do filme: ");
        filme.setNome(entrada.nextLine());

        System.out.print("Nome do diretor: ");
        diretor.setNome(entrada.nextLine());

        System.out.print("Genero do filme: ");
        genero.setNome(entrada.nextLine());

        System.out.print("Avaliacao (0 a 10): ");
        filme.setAvaliacao(entrada.nextDouble());

        System.out.print("Duracao em minutos: ");
        filme.setDuracao(entrada.nextInt());

        // RELACIONAMENTOS
        filme.setDiretor(diretor);
        filme.setGenero(genero);
        filme.setUsuario(usuario);

        // SAÍDA
        System.out.println("\n===== DADOS DO FILME =====");
        System.out.println(filme.detalhes());
        System.out.println("Classificacao: " + filme.classificarFilme());

        entrada.close();
    }
}