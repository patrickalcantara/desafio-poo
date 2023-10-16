public class Iphone implements ReprodutorMusical, NavegadorNaInternet, AparelhoTelefonico {

    @Override
    public void ligar(String numero) {
        System.out.println("Realizando ligação para: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação.");
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("Ligando para o correio de voz.");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Abrindo página da internet: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Abrindo nova aba no navegador.");
    }

    @Override
    public void atualizarPagina(String url) {
        System.out.println("Atualizando página: " + url);
    }

    @Override
    public void tocar() {
        System.out.println("Reproduzindo música.");
    }

    @Override
    public void pausar() {
        System.out.println("Parando música.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Reproduzindo " + musica);
    }

}
