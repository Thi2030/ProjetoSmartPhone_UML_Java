package JuntarTodasAsFuncoes;

//Importação das classes para serem implementadas nesta classe
import funcionalidades.AparelhoTelefonico;
import funcionalidades.NavegadorNaInternet;
import funcionalidades.ReprodutorMusical;

public class JuntandoMultiFuncionalidade implements AparelhoTelefonico, NavegadorNaInternet, ReprodutorMusical {

//Métodos da Inteface: AparelhoTelefonico
    public void ligar(){
        System.out.println("Ligando...");
    }
    public void atender(){
        System.out.println("Alô...");
    }
    public void iniciarCorreioVoz(){
        System.out.println("Grave o seu recado na caixa de voz! ");
    }
//Métodos da Inteface: NavegadorNaInternet
    public void exibirPagina(){
        System.out.println("Abrindo Janela do Navegador.");
    }
    public void adicionarNovaAba(){
        System.out.println("Nova aba do navegador aberta! ");
    }
    public void atualizarPagina(){
        System.out.println("Atualizando...");
    }

//Métodos da Inteface: ReprodutorMusical
    public void tocar(){
        System.out.println("tocando...");
    }
    public void pausar(){
        System.out.println("pausando...");
    }
    public void selecionarMusica(){
        System.out.println("Selecionando música...");
    }
}
