
/**
 * Abstract class TheBigOnes - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public class TheBigOnes extends Vehiculo
{
    private int peso;
    public TheBigOnes(Marca marca, int antiguedad, int kilometraje, int peso)
    {
        super(marca, antiguedad, kilometraje);
        this.peso = peso;
    }
    
    /**
    * @Override
    */
    public int getPeso(){
        return peso;
    }
}
