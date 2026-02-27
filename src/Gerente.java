public class Gerente extends Empelado {
    String departamento;

    public Gerente(String nombre, double salarioBase, String departamento) {
        super(nombre, salarioBase);
        this.departamento = departamento;
    }
}
