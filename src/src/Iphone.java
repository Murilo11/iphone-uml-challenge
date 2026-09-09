import Funções.Funcionalidades;

public class Iphone extends Funcionalidades {
    public static void main(String[] args) {
        Iphone ip =  new Iphone();

        System.out.println("Telefone:");
        ip.ligar("1236789");
        ip.atender();
        ip.IniciarCorreioVoz();

        System.out.println();

        System.out.println("Apple Music:");
        ip.selecionarMusica("Feel No Ways");
        ip.tocar();
        ip.pausar();

        System.out.println();

        System.out.println("Safari:");
        ip.exibirPagina("The Economist");
        ip.adicionarNovaAba();
        ip.atualizarPagina();
    }
}
