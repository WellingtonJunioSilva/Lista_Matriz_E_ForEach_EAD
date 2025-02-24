
import java.util.*;

public static class ListaEAD {

    public static void EX01() {
        Scanner sc = new Scanner(System.in);
        List<Integer> num = new ArrayList<>();

        System.out.println("Digite 7 números: ");
        for (int i = 0; i < 7; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            int numeros = sc.nextInt();
            num.add(numeros);
        }
        Collections.reverse(num);

        System.out.println("Lista invertida: " + num);
    }

    public static void EX02() {

        Scanner sc = new Scanner(System.in);
        List<String> cincoNumeros = new ArrayList<>();

        System.out.println("Digite itens para adicionar a lista (digite 'sair' para terminar): ");
        while (cincoNumeros.size() < 5) {
            String numerosLista = sc.nextLine();
            if (numerosLista.equalsIgnoreCase("sair")) {
                break;
            }
            cincoNumeros.add(numerosLista);
            System.out.println("Item adicionado. Digite outro item (ou 'sair'): ");
            if (cincoNumeros.size() == 5) {
                System.out.println("A lista atingiu o limite de 5 itens.");
                break;
            }
        }

        System.out.println("Itens da lista: ");
        for (String item : cincoNumeros) {
            System.out.println(item);
        }
    }

    public static void EX03() {
        Scanner sc = new Scanner(System.in);
        List<Integer> number = new ArrayList<>();
        System.out.println("Digite 5 números");

        for (int i = 0; i < 5; i++) {
            System.out.println("Número " + (i + 1) + ": ");
            int num = sc.nextInt();
            number.add(num);
        }
        System.out.println("Você digitou: ");
        for (int num : number) {
            System.out.println(num);
        }

    }

    public static void EX04() {
        Scanner sc = new Scanner(System.in);
        List<Integer> lista1 = new ArrayList<>();
        List<Integer> lista2 = new ArrayList<>();

        //Primeira Lista
        System.out.println("Insira 5 números");
        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            int num = sc.nextInt();
            lista1.add(num);
        }
        //Segunda lista
        System.out.println("Insira 5 números");
        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            int numero = sc.nextInt();
            lista2.add(numero);
        }
        lista1.addAll(lista2);

        System.out.println("Lista Combinada: " + lista1);
    }
}

public static void EX05() {
    Scanner sc = new Scanner(System.in);
    int[][] matriz = new int[3][3];
    Random numMatriz = new Random();

    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            matriz[i][j] = numMatriz.nextInt(100);
        }
    }
    int maiorElemento = encontraMaior(matriz);
    System.out.println("O maior elemento da matriz é: " + maiorElemento);
    for (int[] linha : matriz) {
        for (int elemento : linha) {
            System.out.println(elemento + "\t");
        }
        System.out.println();
    }
}

public static int encontraMaior(int[][] matriz) {
    int maiorElemento = Integer.MIN_VALUE;
    for (int[] linha : matriz) {
        for (int elemento : linha) {
            if (elemento > maiorElemento) {
                maiorElemento = elemento;
            }
        }

    }
    return maiorElemento;
}

public static void EX06() {
    Scanner sc = new Scanner(System.in);
    int[][] matriz = new int[3][3];

    System.out.println("Insira os valores da matriz 2");
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            matriz[i][j] = sc.nextInt();
        }
    }
    int maiorElemento = encontraMaiorElemento(matriz);
    System.out.println("O maior elemento da matriz é: " + maiorElemento);
}

public static int encontraMaiorElemento(int[][] matriz) {
    int maiorElemnto = Integer.MAX_VALUE;

    for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz[i].length; j++) {
            if (matriz[i][j] > maiorElemnto) maiorElemnto = matriz[i][j];
        }
    }
    return maiorElemnto;
}

public static void EX07() {
    Scanner sc = new Scanner(System.in);
    List<Integer> numeros = new ArrayList<>();
    Random random = new Random();

    for (int i = 0; i <= 10; i++) {
        numeros.add(random.nextInt(100) + 1);
    }

    System.out.print("Números gerados: " + numeros);
    System.out.println();

    int maior = Collections.max(numeros);
    int menor = Collections.min(numeros);

    System.out.println("Maior número: " + maior);
    System.out.println("Menor número: " + menor);
}

public static void EX08() {
    Scanner sc = new Scanner(System.in);
    int[][] matriz = new int[3][3];

    System.out.println("Por favor, insira 9 números para completar a matriz: ");
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            matriz[i][j] = sc.nextInt();
        }
    }
    System.out.println("Aqui está a matriz 3x3: ");
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            System.out.println(matriz[i][j] + "\t");
        }
        System.out.println();
    }
}

public static void EX09() {
    Scanner sc = new Scanner(System.in);
    double[][] matriz = new double[3][3];
    System.out.println("Digite os elementos da matriz: ");
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            matriz[i][j] = sc.nextDouble();
        }
    }
    System.out.println("Insira um número escalar: ");
    double escalar = sc.nextDouble();

    double[][] novaMatriz = new double[3][3];
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            novaMatriz[i][j] = matriz[i][j] * escalar;
        }
    }
    System.out.println("Nova matriz: ");
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            System.out.print(novaMatriz[i][j] + " ");
        }
        System.out.println();
    }
}

public static void EX10() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Insira o tamanho da matriz: ");
    int n = sc.nextInt();

    int[][] matriz = new int[n][n];
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if (i == j) {
                System.out.println("Insira os valores da matriz: ");
                matriz[i][j] = sc.nextInt();
            } else {
                System.out.println("Insira os valores da matriz");
                matriz[i][j] = sc.nextInt();
            }
        }
    }
    System.out.println("Matriz Identidade Tamanho " + n + " : ");
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            System.out.println(matriz[i][j] + "\t");
        }
        System.out.println();
    }
}

public static void EX11() {
    Scanner sc = new Scanner(System.in);
    int[][] matriz = new int[3][3];

    System.out.println("Insira os elemntos da matriz: ");
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            matriz[i][j] = sc.nextInt();
        }
    }
    int[][] transposta = new int[3][3];
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            transposta[i][j] = matriz[i][j];
        }
    }
    System.out.println("Matriz Transposta: ");
    System.out.println();
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            System.out.println(transposta[i][j] + "\t");
        }
        System.out.println();
    }

}

public static void EX12() {
    Scanner sc = new Scanner(System.in);
    List<Integer> numeros = new ArrayList<>();
    Random random = new Random();

    for (int i = 0; i < 6; i++) {
        System.out.print("Número " + (i + 1) + ": ");
        int num = sc.nextInt();
        numeros.add(num);
    }

    int soma = 0;
    for (int number : numeros) {
        soma += number;
    }
    double media = (double) soma / 6;
    sc.close();

    System.out.println("A soma dos números inseridos é: " + soma);
    System.out.println();
    System.out.println("A média dos números inseridos é: " + media);
}

public static void EX13() {
    Locale.setDefault(Locale.US);
    int[][] matriz = new int[4][4];
    Random numerosAleatorios = new Random();
    for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 4; j++) {
            matriz[i][j] = numerosAleatorios.nextInt(100);
        }
    }
    for (int i = 0; i < 4; i++) {
        int somaLinha = 0;
        for (int j = 0; j < 4; j++) {
            somaLinha += matriz[i][j];
        }
        double mediaLinha = somaLinha / 4.0;
        System.out.println("Média linha " + (i + 1) + ": " + mediaLinha);
    }
    for (int j = 0; j < 4; j++) {
        int somaColuna = 0;
        for (int i = 0; i < 4; i++) {
            somaColuna += matriz[i][j];
        }
        double mediaColuna = somaColuna / 4.0;
        System.out.println("Média da coluna " + (j + 1) + ": " + mediaColuna);
    }
    System.out.println("Matriz: ");
    for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 4; j++) {
            System.out.println(matriz[i][j] + "\t");
        }
        System.out.println();
    }
}

public static void EX14() {
    Scanner sc = new Scanner(System.in);
    List<Integer> num = new ArrayList<>();

    for (int i = 0; i < 5; i++) {
        System.out.println("Insira " + (5 - i) + " números: ");
        int numero = sc.nextInt();
        num.add(numero);
    }

    System.out.println("Insira um valor para multiplicar: ");
    int multiplicador = sc.nextInt();

    List<Integer> multipliedNumbers = new ArrayList<>();
    for (int number : num) {
        multipliedNumbers.add(number * multiplicador);
    }
    System.out.println("A lista resultante é: " + multipliedNumbers);
}

public static void EX15() {
    Scanner sc = new Scanner(System.in);
    List<String> nomes = new ArrayList<>();

    System.out.println("Insira 5 nomes");
    for (int i = 0; i < 5; i++) {
        System.out.println("Nome " + (i + 1) + ": ");
        String name = sc.nextLine();
        nomes.add(name);
    }
    Collections.sort(nomes);

    for (String nome : nomes) {
        System.out.println(nome);
    }
}


public static void EX16() {
    List<Integer> numeros = new ArrayList<>();
    Random num = new Random();
    int par = 0;
    for (int i = 0; i < 10; i++) {
        int number = num.nextInt(100);
        if (number % 2 == 0) {
            numeros.add(number);
        }
    }
    for (int pares : numeros) {
        System.out.println("Os números pares da lista são: " + pares);
    }

}

public static void EX17() {
    List<String> names = generateRandomNames(5);

    for (String name : names) {
        System.out.println("Olá " + name + " !");
    }

}

private static List<String> generateRandomNames(int cont) {
    List<String> randomNames = new ArrayList<>();
    Random nomes = new Random();
    String[] nomesPossiveis = {"João", "Maria", "Pedro", "Ana", "Lucas", "Carla", "Rafael", "Caio", "Maria Eduarda"};

    for (int i = 0; i < cont; i++) {
        String randomName = nomesPossiveis[nomes.nextInt(nomesPossiveis.length)];
        randomNames.add(randomName);
    }
    return randomNames;
}


public static void EX18() {
    Scanner sc = new Scanner(System.in);
    List<Integer> num = new ArrayList<>();

    System.out.println("Digite 8 números: ");
    for (int i = 0; i < 8; i++) {
        System.out.print("Número " + (i + 1) + ": ");
        int numeros = sc.nextInt();
        num.add(numeros);
    }

    Collections.sort(num);

    System.out.println("Lista ordenada: " + num);
}

public static void EX19() {
    Scanner sc = new Scanner(System.in);
    int[][] matriz = new int[3][3];


    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            System.out.println("Insira os elementos da matriz: ");
            matriz[i][j] = sc.nextInt();
        }
    }
    for (int[] row : matriz) {
        for (int elemento : row) {
            System.out.println("Os números da matriz são: " + elemento + " \t");
        }
        System.out.println();
    }
}

public static void EX20() {
    Scanner sc = new Scanner(System.in);
    List<Integer> numeros = new ArrayList<>();

    System.out.println("Insira 10 números: ");
    for (int i = 0; i < 10; i++) {
        System.out.println("Número " + (i + 1) + ": ");
        int num = sc.nextInt();
        numeros.add(num);
    }
    numeros.removeIf(numero -> numero % 2 != 0);
    System.out.println("Números pares na lista: " + numeros);
}

public static void EX21() {
    int[][] matrix = new int[4][4];
    Random random = new Random();

    // Preencher a matriz com números aleatórios
    for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 4; j++) {
            matrix[i][j] = random.nextInt(100); // Números aleatórios de 0 a 99
        }
    }

    int[] columnSums = new int[matrix[0].length];

    // Usar loop "for-each" para percorrer a matriz e calcular a soma de cada coluna
    for (int[] row : matrix) {
        for (int j = 0; j < row.length; j++) {
            columnSums[j] += row[j];
        }
    }

    // Exibir a matriz
    System.out.println("Matriz 4x4:");
    for (int[] row : matrix) {
        for (int element : row) {
            System.out.print(element + "\t");
        }
        System.out.println();
    }

    // Exibir as somas de cada coluna
    System.out.println("Soma de cada coluna:");
    for (int i = 0; i < columnSums.length; i++) {
        System.out.println("Coluna " + (i + 1) + ": " + columnSums[i]);
    }
}

public static void EX22() {
    Scanner sc = new Scanner(System.in);
    int[][] matriz = new int[3][3];

    System.out.println("Insira os valores da matriz ");
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            matriz[i][j] = sc.nextInt();
        }
    }
    int soma = 0;
    for (int i = 0; i < 3; i++) {
        soma += matriz[i][i];
    }
    System.out.println("A soma dos elementos da diagonal principal é: " + soma);
}

public static void EX23() {
    Scanner sc = new Scanner(System.in);
    int[][] matriz = new int[3][3];

    System.out.println("Insira os valores da matriz: ");
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            matriz[i][j] = sc.nextInt();
        }
    }
    System.out.println();
    System.out.printf("A soma dos elementos da diagonal secundária é: %d", somaDiagonalSecundaria(matriz));
}

public static int somaDiagonalSecundaria(int[][] matriz) {
    int soma = 0;
    int j = matriz[0].length - 1;
    for (int i = 0; i < matriz.length; i++) {
        soma += matriz[i][j];
        j--;
        if (j < 0) {
            break;
        }
    }
    return soma;
}

public static void EX24() {
    Scanner sc = new Scanner(System.in);
    List<Integer> number = new ArrayList<>();

    int soma = 0;
    System.out.println("Insira os elementos: ");
    for (int i = 0; i < 5; i++) {
        int num = sc.nextInt();
        number.add(num);
    }
    for (int num : number) {
        soma += num;
    }
    System.out.printf("A soma de todos os elementos é: %d", soma);

}

public static void EX25() {
    int[][] matriz = new int[4][4];
    Random random = new Random();

    // Preenchendo a matriz com números aleatórios
    for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 4; j++) {
            matriz[i][j] = random.nextInt(100); // números aleatórios de 0 a 99
        }
    }

    // Calculando a soma de cada linha
    for (int i = 0; i < 4; i++) {
        int somaLinha = 0;
        for (int j = 0; j < 4; j++) {
            somaLinha += matriz[i][j];
        }
        System.out.println("Soma da linha " + (i + 1) + ": " + somaLinha);
    }

    // Calculando a soma de cada coluna
    for (int j = 0; j < 4; j++) {
        int somaColuna = 0;
        for (int i = 0; i < 4; i++) {
            somaColuna += matriz[i][j];
        }
        System.out.println("Soma da coluna " + (j + 1) + ": " + somaColuna);
    }

    // Exibindo a matriz
    System.out.println("Matriz:");
    for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 4; j++) {
            System.out.print(matriz[i][j] + "\t");
        }
        System.out.println();
    }
}

public static void EX26() {
    Scanner sc = new Scanner(System.in);
    int[][] matriz1 = new int[3][3];
    int[][] matriz2 = new int[3][3];

    System.out.println("Por favor, insira os números da matriz");
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            matriz1[i][j] = sc.nextInt();
        }
    }
    System.out.println("Insira os valores da matriz 2");
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            matriz2[i][j] = sc.nextInt();
        }
    }
    int[][] result = new int[3][3];
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            result[i][j] = matriz1[i][j] + matriz2[i][j];
        }
    }
    System.out.print("Resultado da soma das matrizes: ");
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            System.out.println(result[i][j] + " ");
        }
        System.out.println();
    }
}

public static void EX27() {
    int[][] matriz = new int[4][4];
    Random numAleatorios = new Random();

    for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 4; j++) {
            matriz[i][j] = numAleatorios.nextInt(100);
        }
    }
    for (int i = 0; i < 4; i++) {
        int somaLinha = 0;
        for (int j = 0; j < 4; j++) {
            somaLinha += matriz[i][j];
        }
        System.out.println("Soma linha" + (i + 1) + " : " + somaLinha);
        System.out.println();
    }
    for (int j = 0; j < 4; j++) {
        int somaColuna = 0;
        for (int i = 0; i < 4; i++) {
            somaColuna += matriz[i][j];
        }
        System.out.println("Soma das Colunas: " + (j + 1) + " : " + somaColuna);
        System.out.println();
    }
    System.out.println("Matriz: ");
    for (int[] row : matriz) {
        for (int element : row) {
            System.out.println();
            System.out.println(element + "\t");

        }
    }
}

public static void EX28() {
    Scanner sc = new Scanner(System.in);
    List<Integer> numeros = new ArrayList<>();

    System.out.println("Digite 5 números: ");
    for (int i = 0; i < 5; i++) {
        System.out.print("Número " + (i + 1) + ": ");
        int num = sc.nextInt();
        numeros.add(num);
    }

    int soma = 0;
    for (int number : numeros) {
        soma += number;
    }
    sc.close();

    System.out.println("A soma dos números inseridos é: " + soma);
}

public static void EX29() {
    Random random = new Random();
    List<Integer> numbers = new ArrayList<>();

    // Gerar 10 números aleatórios, incluindo números negativos
    for (int i = 0; i < 10; i++) {
        numbers.add(random.nextInt(201) - 100); // Números aleatórios de -100 a 100
    }

    List<Integer> updatedNumbers = new ArrayList<>();
    for (int number : numbers) {
        if (number < 0) {
            updatedNumbers.add(0);
        } else {
            updatedNumbers.add(number);
        }
    }

    System.out.println("Lista original: " + numbers);
    System.out.println("Lista atualizada: " + updatedNumbers);
}

public static void EX30() {
    Scanner sc = new Scanner(System.in);
    List<Integer> num = new ArrayList<>();

    System.out.println("Digite 5 números: ");
    for (int i = 0; i < 5; i++) {
        System.out.print("Número " + (i + 1) + ": ");
        int numeros = sc.nextInt();
        num.add(numeros);
    }

    System.out.println("Digite um número: ");
    int numVerificar = sc.nextInt();

    if (num.contains(numVerificar)) {
        System.out.println("O número " + numVerificar + " está na lista");
    } else {
        System.out.println("O número " + numVerificar + " não está na lista");
    }
}

public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int questao;
    do {
        System.out.print("Escolha qual questão deseja ver: ");

        questao = sc.nextInt();

        switch (questao) {
            case 1:
                ListaEAD.EX01();
                break;

            case 2:
                ListaEAD.EX02();
                break;
            case 3:
                ListaEAD.EX03();
                break;
            case 4:
                ListaEAD.EX04();
                break;
            case 5:
                EX05();
                break;
            case 6:
                EX06();
                break;
            case 7:
                EX07();
                break;
            case 8:
                EX08();
                break;
            case 9:
                EX09();
                break;
            case 10:
                EX10();
                break;
            case 11:
                EX11();
                break;
            case 12:
                EX12();
                break;
            case 13:
                EX13();
                break;
            case 14:
                EX14();
                break;
            case 15:
                EX15();
                break;
            case 16:
                EX16();
                break;
            case 17:
                EX17();
                break;
            case 18:
                EX18();
                break;
            case 19:
                EX19();
            case 20:
                EX20();
                break;
            case 21:
                EX21();
                break;
            case 22:
                EX22();
                break;
            case 23:
                EX23();
                break;
            case 24:
                EX24();
                break;
            case 25:
                EX25();
                break;
            case 26:
                EX26();
                break;
            case 27:
                EX27();
                break;
            case 28:
                EX28();
                break;
            case 29:
                EX29();
                break;
            case 30:
                EX30();
                break;
            case 0:
                System.out.println("Obrigado por acessar!!");

            default:
                System.out.println("Opção inválida");
        }

    } while (questao != 0);
    sc.close();
}