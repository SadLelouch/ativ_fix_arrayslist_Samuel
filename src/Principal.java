import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws ParseException {
        ArrayList<String> arrayList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        InputStreamReader input = new InputStreamReader(System.in);

        int decisao = 0;
        while (decisao != 7) {

            System.out.println("\n1 - Adicionar um elemento.");
            System.out.println("2 - Editar um elemento.");
            System.out.println("3 - Remover um elemento.");
            System.out.println("4 - Resgatar um elemento.");
            System.out.println("5 - Ordenar a lista.");
            System.out.println("6 - Resgatar o tamanho da lista.");
            System.out.println("7 - Sair do programa.");
            System.out.print("\nPor favor, selecione uma opção: ");
            decisao = scan.nextInt();
            switch(decisao) {

                case 1:
                    System.out.print("Por favor, digite o nome do novo elemento na lista: ");
                    String var = scan.nextLine();
                    var = scan.nextLine();
                    arrayList.add(var);
                    continue;

                case 2:
                    int d = 0;
                    for(String item : arrayList) {
                        System.out.println(d + ": " + item);
                        d++;
                    }
                    System.out.print("\nPor favor, digite o indice do elemento que deseja editar: ");
                    int i = scan.nextInt();
                    if (i <= arrayList.size()) {
                        System.out.print("Digite o novo valor deste elemento: ");
                        var = scan.nextLine();
                        var = scan.nextLine();
                        arrayList.set(i, var);
                        continue;
                    } else {
                        System.out.println("Índice inválido.");
                        try {
                            input.read();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    continue;

                case 3:
                    d = 0;
                    for(String item : arrayList) {
                        System.out.println(d + ": " + item);
                        d++;
                    }
                    System.out.print("\nPor favor, digite o indice do elemento que deseja remover: ");
                    i = scan.nextInt();
                    if (i <= arrayList.size()) {
                        arrayList.remove(i);
                        continue;
                    } else {
                        System.out.println("Índice inválido.");
                        try {
                            input.read();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    continue;

                case 4:
                    System.out.print("\nPor favor, digite o indice do elemento que deseja resgatar: ");
                    i = scan.nextInt();
                    if (i <= arrayList.size()) {
                        System.out.println(arrayList.get(i));
                        try {
                            input.read();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        continue;
                    } else {
                        System.out.println("Índice inválido.");
                        try {
                            input.read();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    continue;

                case 5:
                    Collections.sort(arrayList);
                    for (String item : arrayList) {
                        System.out.println(item);
                    }
                    try {
                        input.read();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    continue;

                case 6:
                    System.out.println("O total de elementos na lista é: " + arrayList.size());
                    try {
                        input.read();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    continue;

                case 7:
                    break;
            }
            System.out.println("\n\nObrigado por utilizar nossos serviços.");
        }
    }
}
