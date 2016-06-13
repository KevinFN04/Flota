
/**
 * Write a description of class Vehiculo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vehiculo
{
    // instance variables - replace the example below with your own
    private Marca marca;
    private int antiguedad;
    private int kilometraje;
    private static int contNumeroIdentificativo = 0;
    private int numeroIdentificativo;

    /**
     * Constructor for objects of class Vehiculo
     */
    public Vehiculo(Marca marca, int antiguedad, int kilometraje)
    {
        this.antiguedad = antiguedad;
        this.kilometraje = kilometraje;   
        this.marca = marca;
        numeroIdentificativo = contNumeroIdentificativo;
        contNumeroIdentificativo++;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     */
    public int getNumIdent()
    {
        return numeroIdentificativo;
    }
    
    public Marca getMarca(){
        return marca;
    }
}
