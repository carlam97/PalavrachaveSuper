public class Gerente extends Funcionario {
    private int senha;

    public double getBonificacao(){
        //return this.getSalario() * 0.15;
        return super.getBonificacao() + 1000.0;
    }
    
}
