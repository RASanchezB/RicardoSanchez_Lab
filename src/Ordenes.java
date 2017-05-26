
import java.util.ArrayList;
import java.util.Date;

public class Ordenes {
   private int NumeroDOrden;
   private Date fecha;
   private ArrayList<Clientes> Persona = new ArrayList();
   

    public Ordenes() {
    }

    public Ordenes(int NumeroDOrden, Date fecha) {
        this.NumeroDOrden = NumeroDOrden;
        this.fecha = fecha;
        
    }

    public int getNumeroDOrden() {
        return NumeroDOrden;
    }

    public void setNumeroDOrden(int NumeroDOrden) {
        this.NumeroDOrden = NumeroDOrden;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public ArrayList<Clientes> getPersona() {
        return Persona;
    }

    public void setPersona(ArrayList<Clientes> Persona) {
        this.Persona = Persona;
    }

    

    @Override
    public String toString() {
        return "Ordenes{" + "NumeroDOrden=" + NumeroDOrden + ", fecha=" + fecha + '}';
    }
   
}
