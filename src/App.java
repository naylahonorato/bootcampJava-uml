public class App {
    public static void main(String[] args) {

        Iphone meuIphone = new Iphone("iPhone 15", "iOS 18");

        meuIphone.selecionarMusica("Imagine - John Lennon");
        meuIphone.tocar();
        meuIphone.pausar();

        meuIphone.ligar("123456789");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        meuIphone.exibirPagina("https://www.google.com.br");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
        
    }
}
