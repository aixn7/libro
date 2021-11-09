
/**
 * Una clase que representa objetos libro.
 * Esta clase podria formar parte de un
 * proyecto mas grande, como el de una aplicacion de
 * una biblioteca
 * 
 * @author Miguel Bayon 
 * @version 1.2
 */
public class Libro {

    private String autor;
    private String titulo;
    private int paginas;

    /**
     * Fija el autor y el titulo del libro a los dados como parametro
     */
    public Libro(String autorLibro, String tituloLibro, int numeroPaginas)
    {
        autor = autorLibro;
        titulo = tituloLibro;
        paginas = numeroPaginas;
    }
    
    public String getaAutor() {
        return autor;
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public int getPaginas() {
        return paginas;
    }
    
    public void imprimeAutor() {
        System.out.println ("Autor: " + autor);
    }
    
    public void imprimeTitulo() {
        System.out.println ("Título: " + titulo);
    }
}
