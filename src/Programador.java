public class Programador extends Empelado {
    String lenguajeDominante;

    public Programador(String nombre, double salarioBase, String lenguajeDominante) {
        super(nombre, salarioBase);
        this.lenguajeDominante = lenguajeDominante;
    }

    public String getLenguajeDominante() {
        return lenguajeDominante;
    }

    public void setLenguajeDominante(String lenguajeDominante) {
        this.lenguajeDominante = lenguajeDominante;
    }

    @Override
    public double calcularSalario(){
        return 110*super.calcularSalario()/100;
    }

    @Override
    public String toString(){
        return super.toString() + " Su lenguaje dominante es " + this.lenguajeDominante;
    }
}
