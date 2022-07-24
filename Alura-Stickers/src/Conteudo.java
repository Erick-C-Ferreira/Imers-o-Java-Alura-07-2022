public class Conteudo {

    private final String titulo; // string privada para nao ser utilizada em todo lugar
    private final String urlImagem;
    
    public Conteudo(String titulo, String urlImagem) {
        this.titulo = titulo;
        this.urlImagem = urlImagem;
    }

    public String getTitulo() {
        return titulo;
    }
    public String getUrlImagem() {
        return urlImagem;
    }
    


}
