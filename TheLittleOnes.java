
/**
 * Abstract class TheLittleOnes - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public class TheLittleOnes extends Vehiculo
{
    private int plazas;
    public TheLittleOnes(Marca marca, int antiguedad, int kilometraje, int plazas)
    {
        super(marca, antiguedad, kilometraje);
        this.plazas = plazas;
    }
    
    /**
    * @Override
    */
    public int getplazas(){
        return plazas;
    }
}
