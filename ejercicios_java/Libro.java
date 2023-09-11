import javax.swing.JOptionPane;

public class Libro {
    /*
     * primero se declaran las variables
     */
    String nombre = "";
    String autor = "";
    int numPaginas = 0;

    /*
     * creamos el metodo constructor donde se le pase el nombre el autor y las paginas
     */

    Libro(String nombre,String autor,int numPaginas){
        this.nombre = nombre;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }

    Libro(String nombre, int numPaginas ){
        this.nombre = nombre;
        this.numPaginas = numPaginas;
    }

    public String resumen(){
        /*
         * nomrelibro escrito por autor y tiene num paginas paginas
         */
        String resumenLibro = this.nombre + " escrito por " + this.autor + " y tiene " + this.numPaginas + " paginas";
        return resumenLibro;
    
    }

    public static void main(String[] args){ 
        String nombre1 = JOptionPane.showInputDialog("ingresa el nombre del libro");
        String autor1 = JOptionPane.showInputDialog("ingresa el nombre del autor");
        int numPaginas1 = Integer.parseInt(JOptionPane.showInputDialog("ingresa el numero de paginas"));

        Libro libro1 = new Libro(nombre1,autor1,numPaginas1);
        System.out.println(libro1.nombre);
        System.out.println(libro1.autor);
        System.out.println(libro1.numPaginas);
        System.out.println(libro1.resumen());

    }
}