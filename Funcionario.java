public class Funcionario{
    private String nome;
    private String cpf;
    private double salario;
    private int senha;

    public void setCpf(String cpf){
        this.cpf = cpf;
    }public String getCpf(){
        return this.cpf;
    }

    public void setNome(String nome){
        this.nome = nome;
    }public String getNome(){
        return this.nome;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }public double getSalario(){
        return this.salario;
    }

    public void setSenha(int senha){
        this.senha = senha;
    }public int getSenha(){
        return this.senha;
    }

    public double getBonificacao(){
        return this.salario * 0.10;
    }

}