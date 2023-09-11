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
        Libro libro1 = new Libro("100 años de soledad","Gabriel Garcia Marquez",173);
        System.out.println(libro1.nombre);
        System.out.println(libro1.autor);
        System.out.println(libro1.numPaginas);
        System.out.println(libro1.resumen());

        Libro libro2 = new Libro("El principito", 111);
        System.out.println(libro2.nombre);
        System.out.println(libro2.autor);
        System.out.println(libro2.numPaginas);
        System.out.println(libro2.resumen());





}






 


}