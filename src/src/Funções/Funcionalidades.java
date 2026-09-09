package Funções;

import java.util.Scanner;

public class Funcionalidades implements Telefone,NavegadorInternet,ReprodutorMusical{
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando a aba Youtube.com ");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando The Economist");

    }

    @Override
    public void tocar() {
        System.out.println("Tocando Musica");

    }

    @Override
    public void pausar() {
        System.out.println("Pausando musica");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Musica selecionada: " + musica);
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero);

    }

    @Override
    public void atender() {
        System.out.println("Atendo ligação");
    }

    @Override
    public void IniciarCorreioVoz() {
        System.out.println("Abrindo Correio de Voz");

    }
}
