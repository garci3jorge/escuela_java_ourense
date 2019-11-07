/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg02_intro_java_poo;

/**
 *
 * @author PC
 */
public class CocheRally extends Coche {

    private float rozamiento;

    public CocheRally() {
        super();
        rozamiento = 5f;
        tipo = TipoVehiculo.RALLY;
        

    }

    /**
     * Constructor con parametros Al implementar un constructor
     *
     * @param marca
     */
    public CocheRally(String marca) {
        super(marca);
        rozamiento = 5f;
        tipo= TipoVehiculo.RALLY;
    }

    public CocheRally(float rozamiento, String marca) {
        super(marca);
        this.rozamiento = rozamiento;
    }

    /**
     * Get the value of rozamiento
     *
     * @return the value of rozamiento
     */
    public float getRozamiento() {
        return rozamiento;
    }

    /**
     * Set the value of rozamiento
     *
     * @param rozamiento new value of rozamiento
     */
    public void setRozamiento(float rozamiento) {
        this.rozamiento = rozamiento;
    }

    @Override // no es obligatorio ponerlo ya que java entiende 
    //que sobreescribimos el metodo pero meor es ponerselo 
    public boolean arrancar(String orden) {
        if (super.arrancar(orden)) {
            return true;

        } else {
            if ("arrancar".equalsIgnoreCase(orden)) {
                arrancado = true;

            } else {
                return "arrancar".equals(orden.toLowerCase());
            }
            return arrancado;
        }
        //return super.arrancar(orden); //To change body of generated methods, choose Tools | Templates.
    }

    /*
    Ejercicio:
    1º
    sobrescribir el metodo mostrarEstado
    para que tambien muestre el rozamiento
    2º
    que indique que es "coche de rally: marca, rozamiento, arrancado"
     */
    //1º
    public void mostrarEstadoAntiguo() {
        super.mostrarEstado();
        setRozamiento(rozamiento);//To change body of generated methods, choose Tools | Templates.
    }

    //2º
    @Override
    public void mostrarEstado() {
        System.out.println("Coche de rally " + getMarca()
                + ", rozamiento =" + rozamiento
                + (isArrancado() ? " arrancado" : " apagado"));
    }

    @Override
    public String toString() {
        return "CocheRally{" + "rozamiento=" + rozamiento + '}';
    }
    
    

}
