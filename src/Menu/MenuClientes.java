package Menu;

public class MenuClientes extends Menu {
    @Override
    public int exibirMenu(){
        System.out.println("Informe a operação que deseja realizar: ");
        System.out.println("1. Criar seu cadastro");
        System.out.println("2. Atualizar informações do seu cadastro");
        System.out.println("3. Deletar seu cadastro");
        System.out.println("4. Realizar compra");
        System.out.println("5. Calcular frete para sua zona");
        System.out.println("6. Sair");
        int op=lerOpcao();
        if(op<1 || op >6){
            throw new IllegalArgumentException("Opção inválida. Por favor, digite uma opção válida.");
        }
        return op;
    }
}
