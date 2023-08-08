    class Lavadora extends Electrodomestico {
    private double carga;

    public Lavadora() {
    }


    public Lavadora(double carga, double precio, String color, char consumo, double peso) {
        super(precio, color, consumo, peso);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    
    @Override
    public double precioFinal() {
    
        double lavaFinal=0;
        if (carga>30){
        lavaFinal=500;
        }
        lavaFinal=+super.precioFinal();
    return lavaFinal;
    
    }
    }
