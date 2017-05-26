
import java.util.ArrayList;

public class Clientes {
    private String Nombre;
    private String NumeroDTelef;
    private double Efectivo;
    private String Direccion;
    private ArrayList<Baleadas> BaleadasComprar = new ArrayList();

    public Clientes(String Nombre, String NumeroDTelef, double Efectivo, String Direccion) {
        this.Nombre = Nombre;
        this.NumeroDTelef = NumeroDTelef;
        this.Efectivo = Efectivo;
        this.Direccion = Direccion;
        
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNumeroDTelef() {
        return NumeroDTelef;
    }

    public void setNumeroDTelef(String NumeroDTelef) {
        this.NumeroDTelef = NumeroDTelef;
    }

    public double getEfectivo() {
        return Efectivo;
    }

    public void setEfectivo(double Efectivo) {
        this.Efectivo = Efectivo;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public ArrayList<Baleadas> getBaleadasComprar() {
        return BaleadasComprar;
    }

    public void setBaleadasComprar(ArrayList<Baleadas> BaleadasComprar) {
        this.BaleadasComprar = BaleadasComprar;
    }

    @Override
    public String toString() {
        return Nombre;
    }
    
}
