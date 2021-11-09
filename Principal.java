public class Principal {
    public static void main(String args []) {

        Funcionario f = new Funcionario();
        f.setNome("João Pedro");
        f.setSalario(1000.0);

        Gerente g = new Gerente();
        g.setNome("Carla Martins");
        g.setSalario(5000.0);
        g.setSenha(9797);

        System.out.println("Gerente.........: " + f.getNome());
        System.out.println("Salario.........: " + f.getSalario());
        System.out.println("Bonificacao.....: " + f.getBonificacao());

        System.out.println("Gerente.........: " + g.getNome());
        System.out.println("Salario.........: " + g.getSalario());
        System.out.println("Bonificacao.....: " + g.getBonificacao());
    }
}
