
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
    private String numeroReferencia;
    private int vecesPrestado;
    private boolean esLibroDeTexto;

    /**
     * Fija el autor y el titulo del libro a los dados como parametro
     */
    public Libro(String autorLibro, String tituloLibro, int numeroPaginas, boolean esLibroTexto)
    {
        autor = autorLibro;
        titulo = tituloLibro;
        paginas = numeroPaginas;
        numeroReferencia = "";
        vecesPrestado = 0;
        esLibroDeTexto = esLibroTexto;
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
    
    public String getNumeroReferencia() {
        return numeroReferencia;
    }
    
    public int getVecesPrestado() {
        return vecesPrestado;
    }
    
    public boolean getEsLibroTexto() {
        return esLibroDeTexto;
    }
    
    public void setNumeroReferencia(String nuevoNumeroReferencia) {
        if (nuevoNumeroReferencia.length() >= 3) {
           numeroReferencia = nuevoNumeroReferencia; 
        }
        else {
            System.out.println ("Error: Referencia demasiado corta");
            System.out.println ("Introduce un número de referencia de al menos 3 caracteres");
        }
    }
    
    public void imprimeAutor() {
        System.out.println ("Autor: " + autor);
    }
    
    public void imprimeTitulo() {
        System.out.println ("Título: " + titulo);
    }
    
    public void prestar () {
        vecesPrestado = vecesPrestado + 1;
    }
    
    public void imprimeDetalles() {
        System.out.println (getDetalles());
    }
    
    public String getDetalles() {
        String detalles;
        String libroTexto;
        
        if (esLibroDeTexto == true) {
            libroTexto = "Sí";
        }
        else {
            libroTexto = "No";
        }
        
        if (numeroReferencia != "") {
            detalles = "Título: " + titulo + " | Autor: " + autor + " | Paginas: "+ paginas + " | Número de Referencia: "
            + numeroReferencia + " | Veces prestado: " + vecesPrestado + " | ¿Es un libro de texto? " + libroTexto;
        }
        else {
            detalles = "Título: " + titulo + " | Autor: " + autor + " | Paginas: " + paginas + " | Número de Referencia: ZZZ"
             + " | Veces prestado: " + vecesPrestado + " | ¿Es un libro de texto? " + libroTexto;
        }
        return detalles;
    }
}
