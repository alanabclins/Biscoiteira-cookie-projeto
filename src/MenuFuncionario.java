public class MenuFuncionario extends Menu {
    @Override
    public int exibirMenu() {
        System.out.println("Informe a operação que deseja realizar: ");
        System.out.println("1. Buscar cadastro de cliente por nome");
        System.out.println("2. Adicionar produto no estoque");
        System.out.println("3. Apagar produto do estoque");
        System.out.println("4. Mostrar todo o estoque");
        System.out.println("5. Limpar estoque");
        System.out.println("6. Sair");
        int op=lerOpcao();
        if(op<1 || op >6){
            throw new IllegalArgumentException("Opção inválida. Por favor, digite uma opção válida.");
        }
        return op;
    }
}
