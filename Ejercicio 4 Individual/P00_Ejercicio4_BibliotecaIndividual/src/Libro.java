public class Libro {
    private String titulo;
    private String autor;
    private String categoria;
    private int anio;
    private int cantidadEjemplares;
    private int prestados = 0; // Nueva variable para control

    public Libro(){
        titulo="Java para ingenieros";
        autor="Paulo Guerra";
        categoria="Programacion";
        anio=2014;
        cantidadEjemplares=1;
    }

    public Libro(String t, String a, String c, int an, int can){
        titulo=t;
        autor=a;
        categoria=c;
        anio=an;
        cantidadEjemplares=can;
    }

    public Libro(int can, String t, String a, String c, int an){
        titulo=t;
        autor=a;
        categoria=c;
        anio=an;
        cantidadEjemplares=can;
    }

    public Libro(String autor, String categoria,int anio, int cantidadEjemplares, String titulo){
        this.titulo=titulo;
        this.autor=autor;
        this.categoria=categoria;
        this.anio=anio;
        this.cantidadEjemplares=cantidadEjemplares;
    }

    public String mostrarInformacion(){
        String aux="";
        aux="Titulo: "+titulo+"\n";
        aux+="Autor: "+autor+"\n";
        aux+="Categoría: "+categoria+"\n";
        aux+="Año: "+anio+"\n";
        aux+="Cantidad total: "+cantidadEjemplares+"\n";
        aux+="Ejemplares prestados: "+prestados+"\n";
        aux+="Disponibles: "+(cantidadEjemplares - prestados)+"\n";
        return aux;
    }

    public boolean prestarCantidad(int c){
        if(c <= (cantidadEjemplares - prestados)){
            prestados += c;
            return true;
        }
        return false;
    }

    public boolean devolverCantidad(int c){
        if(c <= prestados){
            prestados -= c;
            return true;
        }
        return false;
    }

    // Métodos originales mantenidos
    public int prestar(){
        if(cantidadEjemplares - prestados > 0){
            prestados++;
            return cantidadEjemplares - prestados;
        }
        return -1;
    }

    public void setTitulo(String titulo){
        this.titulo=titulo;
    }

    public void setAutor(String autor){
        this.autor=autor;
    }

    public void setCategoria(String categoria){
        this.categoria=categoria;
    }

    public void setAnio(int anio){
        this.anio=anio;
    }

    public void setCantidad(int cantidad){
        this.cantidadEjemplares=cantidad;
    }
}