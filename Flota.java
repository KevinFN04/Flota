
/**
 * Write a description of class Flota here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Flota
{
    // instance variables - replace the example below with your own
    private Vehiculo[] vehiculos;

    /**
     * Constructor for objects of class Flota
     */
    public Flota()
    {
        vehiculos = new Vehiculo[0];
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     */
    public void addVehiculo(Vehiculo vehiculo)
    {
        Vehiculo[] vehiTempo = vehiculos;
        vehiculos = new Vehiculo[vehiTempo.length + 1];
        for (int count = 0; count < vehiTempo.length ; count++){
            vehiculos[count] = vehiTempo[count];
        }
        vehiculos[vehiculos.length - 1] = vehiculo;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     */
    public void removeVehiculo(int numIden)
    {
        boolean vehiculoEncontrado = false;
        for (int count = 0; count < vehiculos.length; count++){
            if (vehiculos[count].getNumIdent() == numIden){
                vehiculos[count] = null;
                vehiculoEncontrado = true;
            }
        }
        if (vehiculoEncontrado){
            Vehiculo[] vehiTempo = vehiculos;
            vehiculos = new Vehiculo[vehiTempo.length - 1];
            int contador = 0;
            for (int cont = 0; cont < vehiTempo.length; cont++)
            {
                if (vehiTempo[cont] != null){
                    vehiculos[contador] = vehiTempo[cont];
                    contador++;
                }
            }
        }
    }

    public Marca marcaMayoritaria(){
        Marca resultado = null;
        int opelCont = 0;
        int fordCont = 0;
        int citroenCont = 0;
        int fiatCont = 0;
        for(Vehiculo vehiculoTemp : vehiculos){
            Marca marcaTemp = vehiculoTemp.getMarca();
            if(marcaTemp == Marca.OPEL){
                opelCont++;
            }
            else if (marcaTemp == Marca.FORD){
                fordCont++;
            }
            else if (marcaTemp == Marca.CITROEN){
                citroenCont++;
            }
            else if (marcaTemp == Marca.FIAT){
                fiatCont++;
            }
        }
        if(fordCont> opelCont && fordCont> citroenCont && fordCont> fiatCont)
            resultado = Marca.FORD;
        else if(opelCont> fordCont && opelCont> citroenCont && opelCont> fiatCont)
            resultado = Marca.OPEL;
        else if(citroenCont > fordCont && citroenCont > opelCont&& citroenCont > fiatCont)
            resultado = Marca.CITROEN;
        else if(fiatCont > fordCont && fiatCont > opelCont && fiatCont > citroenCont)
            resultado = Marca.FIAT;
        return resultado;
    }
    
    
}
