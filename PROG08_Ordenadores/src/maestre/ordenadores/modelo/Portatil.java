/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maestre.ordenadores.modelo;

import maestre.ordenadores.excepciones.ExcepcionMaxPulgadas;

/**
 *
 * @author ANTONIO SANZ PANS
 */
public class Portatil extends Ordenador {

    private final byte MAX_PULGADAS = 99;
    private short MAX_BATERIA;
    private final byte MIN_BATERIA = 0;

    private byte pulgadas; //MAX: 2
    private short duracionBateria; //MAX: 300minutos

    //CONSTRUCTORES
    public Portatil() {
        super();
    }

    public Portatil(String nroSerie, String marca, String modelo, byte memoriaRAM, String procesador, byte nucleos, String tipoDiscoDuro, byte pulgadas, short duracionBateria) {

        super(nroSerie, marca, modelo, memoriaRAM, procesador, nucleos, tipoDiscoDuro);
        try {
            maxPulgadas(pulgadas);
            this.pulgadas = pulgadas;
            this.duracionBateria = duracionBateria;
            this.MAX_BATERIA = duracionBateria;
        } catch (ExcepcionMaxPulgadas ex) {
            throw new AssertionError(ex);
        } catch (Exception ex) {
            throw new AssertionError(ex);
        }
    }

    //GET Y SET
    public byte getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(byte pulgadas) {
        try {
            maxPulgadas(pulgadas);
            this.pulgadas = pulgadas;
        } catch (ExcepcionMaxPulgadas ex) {
            throw new AssertionError(ex);
        } catch (Exception ex) {
            throw new AssertionError(ex);
        }
    }

    public short getDuracionBateria() {
        return duracionBateria;
    }

    public void setDuracionBateria(short duracionBateria) {
        this.duracionBateria = duracionBateria;
    }

    //OVERRIDE
    @Override
    public String toString() {
        String ordenador = super.toString();
        return "Portatil{" + ordenador + "pulgadas=" + pulgadas + ", duracionBateria=" + duracionBateria + ", arrancado=" + super.getArrancado() + '}';
    }

    /**
     * Muestra los datos del ordenador. Muestra una linea por cada nucleo.
     * Muestra un * por cada GB de RAM en cada nucleo.
     */
    @Override
    public void dibujar() {
        System.out.println(this.toString());
        String strRam = this.mostrarStrRam();
        for (int i = 0; i < this.getNucleos(); i++) {
            System.out.println(strRam);
        }
    }

    //METODOS
    /**
     * Muestra una linea con tantos asteriscos como RAM haya.
     *
     * @return strRAM (String)
     */
    private String mostrarStrRam() {
        String strRAM = "";
        for (int i = 0; i < super.getMemoriaRAM(); i++) {
            strRAM = strRAM + "*";
        }
        return strRAM;
    }

    //EXCEPCIONES
    public String cargar(short carga) {
        this.duracionBateria = (short) (this.duracionBateria + carga);
        if (this.duracionBateria > this.MAX_BATERIA) {
            this.duracionBateria = this.MAX_BATERIA;
        }
        return "Batería para el portatil " + this.getNroSerie() + ": " + this.duracionBateria;
    }

    public String descargar(short descarga) {
        this.duracionBateria = (short) (this.duracionBateria - descarga);
        if (this.duracionBateria < this.MIN_BATERIA) {
            this.duracionBateria = this.MIN_BATERIA;
        }
        return "Batería para el portatil " + this.getNroSerie() + ": " + this.duracionBateria;
    }

    //EXCEPCIONES
    private void maxPulgadas(byte pulgadas) throws ExcepcionMaxPulgadas {
        if (pulgadas > this.MAX_PULGADAS) {
            throw new ExcepcionMaxPulgadas("ERROR PULGADAS: máximo superado (" + this.MAX_PULGADAS + ")");
        }
    }
}
