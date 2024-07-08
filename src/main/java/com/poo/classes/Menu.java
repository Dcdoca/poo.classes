package com.poo.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    private List<Funcionario> funcionarios;

    public void Sistema() {
        funcionarios = new ArrayList<>();
        funcionarios.add(new Gerente("Alice", "121123454" , "23345673", new Endereco(), "alice_gerente", "12345"));
        funcionarios.add(new Atendente("Bob", "123546765" ,"3000344",new Endereco(), "bob_atendente", "67890"));
    }

    public void menu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nSistema de ContraCheque");
            System.out.println("1. Acessar ContraCheque");
            System.out.println("2. Sair");
            System.out.print("Escolha uma opção: ");
            String opcao = scanner.nextLine();

            if ("1".equals(opcao)) {
                acessarContraCheque(scanner);
            } else if ("2".equals(opcao)) {
                System.out.println("Saindo do sistema...");
                break;
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }

    private void acessarContraCheque(Scanner scanner) {
        System.out.print("Login: ");
        String login = scanner.nextLine();
        System.out.print("Senha: ");
        String senha = scanner.nextLine();

        for (Funcionario funcionario : funcionarios) {
            if (funcionario.autentica(login, senha)) {
                if (funcionario instanceof Gerente) {
                    funcionario.imprimeContraCheque();
                } else {
                    System.out.println("Apenas gerentes podem acessar esta área.");
                }
                return;
            }
        }
        System.out.println("Login ou senha inválidos.");
    }

    
    }




