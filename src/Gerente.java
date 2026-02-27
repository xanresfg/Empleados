public class Gerente extends Empelado {
    String departamento;

    public Gerente(String nombre, double salarioBase, String departamento) {
        super(nombre, salarioBase);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public double calcularSalario(){
        return super.calcularSalario() + 500;
    }

    public String toString(){
        return super.toString() + " Su departamento es " + this.departamento;
    }
}
