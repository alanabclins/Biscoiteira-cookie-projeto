import java.util.Scanner;

public abstract class Menu {
    public abstract int exibirMenu();

    public int lerOpcao() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
