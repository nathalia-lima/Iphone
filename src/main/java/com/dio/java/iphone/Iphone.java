package com.dio.java.iphone;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {


    // AparelhoTelefonico
    @Override
    public void ligar() {
        System.out.println("Ligando pelo Iphone");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo pelo Iphone");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz pelo Iphone");
    }


    // NavegadorInternet
    @Override
    public void exibirPagina() {
        System.out.println("Exibindo pagina na internet pelo Iphone");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando aba na internet pelo Iphone");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina na internet pelo Iphone");
    }


    // ReprodutorMusical
    @Override
    public void tocar() {
        System.out.println("Tocando música pelo Iphone");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando musica pelo Iphone");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando musica pelo Iphone");
    }
}