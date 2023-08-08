public class Televisor extends Electrodomestico {

    private int resolucion;

    private boolean sintonizadorTDT;

    public Televisor() {
    }

    public Televisor(int resolucion, boolean sintonizadorTDT, double precio, String color, char consumo, double peso) {
        super(precio, color, consumo, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }
    

    @Override
    public double precioFinal() {
        double finalTv = 0;
        super.precioFinal();
        if (resolucion>40){
            finalTv=super.precioFinal()*0.3 + super.precioFinal();
        }
        if (Televisor.this.sintonizadorTDT == true){
        finalTv=+super.precioFinal()+500;
        }
        return finalTv;
    }
}
