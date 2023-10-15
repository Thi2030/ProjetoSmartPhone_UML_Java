import JuntarTodasAsFuncoes.JuntandoMultiFuncionalidade;
import funcionalidades.AparelhoTelefonico;
import funcionalidades.NavegadorNaInternet;
import funcionalidades.ReprodutorMusical;

public class Smartphone {
    public static void main(String[] args){

        //Instanciar a Classe: JuntandoMultiFuncionalidade.
        JuntandoMultiFuncionalidade objeto = new JuntandoMultiFuncionalidade();

        //O Objeto jogará as características herdadas nas variáveis: ligar, navegar e reproduzirMusica.
        AparelhoTelefonico ligar = objeto;
        NavegadorNaInternet navegar = objeto;
        ReprodutorMusical reproduzirMusica = objeto;

        //Ações contidas no Método: AparelhoTelefonico
        ligar.atender();
        ligar.ligar();
        ligar.iniciarCorreioVoz();
        
        //Ações contidas no Método: NavegadorNaInternet
        navegar.adicionarNovaAba();
        navegar.atualizarPagina();
        navegar.exibirPagina();

        //Ações contidas no Método: ReprodutorMusical
        reproduzirMusica.tocar();
        reproduzirMusica.pausar();
        reproduzirMusica.selecionarMusica();
    }
}
