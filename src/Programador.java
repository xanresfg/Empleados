public class Programador extends Empelado {
    String lenguajeDominante;

    public Programador(String nombre, double salarioBase, String lenguajeDominante) {
        super(nombre, salarioBase);
        this.lenguajeDominante = lenguajeDominante;
    }

    @Override
    public String toString(){
        return super.toString() + " Su lenguaje dominante es " + this.lenguajeDominante;
    }
}
