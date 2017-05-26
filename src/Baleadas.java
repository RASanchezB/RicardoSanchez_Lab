public class Baleadas {
    private String Tipo;
    private String Ingredientes;
    private int Precio;

    public Baleadas() {
    }

    
    public Baleadas(String Tipo, String Ingredientes, int Precio) {
        this.Tipo = Tipo;
        this.Ingredientes = Ingredientes;
        this.Precio = Precio;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getIngredientes() {
        return Ingredientes;
    }

    public void setIngredientes(String Ingredientes) {
        this.Ingredientes = Ingredientes;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }

    @Override
    public String toString() {
        return "Baleadas{" + "Tipo=" + Tipo + ", Ingredientes=" + Ingredientes + ", Precio=" + Precio + '}';
    }
    
    
    
}
