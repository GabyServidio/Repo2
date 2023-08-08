    class Electrodomestico {

    protected double precio;

    protected String color;

    protected char consumo;

    private double peso;

    public Electrodomestico() {
    }

    public Electrodomestico(double precio, String color, char consumo, double peso) {
        this.precio = precio;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumo() {
        return consumo;
    }

    public void setConsumo(char consumo) {
        this.consumo = consumo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    

    public char comprobarConsumoEnergetico(char letra) {
        if(letra=='A' || letra=='B'|| letra=='C' || letra == 'D' || letra == 'E'){
        return letra;
        }else{
            return 'F';
        }
         }

    public String comprobarColor(String color) {
        if (color.equalsIgnoreCase("rojo") || color.equalsIgnoreCase("negro")  || color.equalsIgnoreCase("azul")  || color.equalsIgnoreCase("gris")){
            return color;
        }else{
            return "Blanco";
    }}

    public double precioFinal() {
        char consumo = Electrodomestico.this.getConsumo();
        int rangoPeso=1;
        double precioXcons = 0;
        double precioXpeso=100;
        double precioFinal;
        switch (consumo){
            case 'A':
            precioXcons=1000; break;
            case 'B':
            precioXcons=800; break;
            case 'C':
            precioXcons=600; break;
            case 'D':
            precioXcons=500; break;
            case 'E':
            precioXcons=300; break;
            case 'F':
            precioXcons=100; break;
                    }
        if (rangoPeso>=1 && rangoPeso<=19){
            precioXpeso=100;
        }else if
            (rangoPeso>=20 && rangoPeso<=49){
            precioXpeso=500;
        }else if
            (rangoPeso>=50 && rangoPeso<=79){
            precioXpeso=800;
        }else if
            (rangoPeso>=80){
            precioXpeso=800;
        }
precioFinal=Electrodomestico.this.getPrecio()+precioXcons+precioXpeso;        
return precioFinal;      
    }
    }
        
