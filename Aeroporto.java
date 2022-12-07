import java.sql.SQLException;
import java.util.Scanner;

public class  Aeroporto{

    public static void main(String[] args) throws SQLException{
        int op = 0;
        do {
            System.out.println("Seja bem vindo ao aeroport Jatinho Feliz/n/n/n");
            System.out.println("O que deseja fazer?/n/n");
            System.out.println("1 - Cadastrar Aeronave");
            System.out.println("2 - Cadastrar Companhia");
            System.out.println("3 - Cadastrar Hangar");
            System.out.println("4 - Cadastrar Voo");
            System.out.println("5 - Cadastrar Pista");
            System.out.println("6 - Listar Hangar");
            System.out.println("7 - Listar Aeronave");
            System.out.println("8 - Listar Companhia");
            System.out.println("9 - Listar Voo");
            System.out.println("10 - Listar Pista");
            System.out.println("11 ");
            System.out.println("12 - Sair");
            try {
                op = scanner.nextInt();
            } catch (Exception e) {
                op = 21;
            }
            switch(op) {
                case 1:
                    System.out.println("Cadastrar Aeronave");
                    cadastrarAeronave();
                    break;
                case 2:
                    System.out.println("Cadastrar Companhia");
                    cadastrarCompanhia();
                    break;
                case 3:
                    System.out.println("Cadastrar Hangar");
                    cadastrarHangar();
                    break;
                case 4:
                    System.out.println("Cadastrar Voo");
                    cadastrarVoo();
                    break;
                case 5:
                    System.out.println("Cadastrar Pista");
                    cadastrarPista();
                    break;
                case 6: 
                    System.out.println("Listar Aeronave");
                    Aeronave.listAeronave();                   
                    break;
                case 7:
                    System.out.println("Listar Companhia");
                    Companhia.listCompanhia();
                    break;
                case 8:
                    System.out.println("Listar Hangar");
                    Hangar.listHangar();
                    break;
                case 9:
                    System.out.println("Listar Voo");
                    Voo.listVoo();
                    break;
                case 10:
                    System.out.println("Listar Pista");
                    Pista.listPista();
                    break;
                case 11:
                System.out.println("Atualizar Aeronave");
                Aeronave.updateAeronave(1);
                break;
                case 12:
                    System.out.println("Atualizar Companhia");
                    Companhia.updateCompanhia(1);
                    break;
                case 13:
                    System.out.println("Atualizar Hangar");
                    Hangar.updateHangar(1);
                    break;
                case 14:
                    System.out.println("Atualizar Voo");
                    Voo.updateVoo(1);
                    break;
                case 15:
                    System.out.println("Atualizar Pista");
                    Pista.updatePista(1);
                    break;
                case 16:
                    System.out.println("Deletar Aeronave");
                    Aeronave.deleteAeronave(1);
                    break;
                case 17:
                    System.out.println("Deletar Companhia");
                    Companhia.deleteCompanhia(1);
                    break;
                case 18:
                    System.out.println("Deletar Hangar");
                    Hangar.deleteHangar(1);
                    break;
                case 19:
                    System.out.println("Deletar Voo");
                    Voo.deleteVoo(1);
                    break;
                case 20:
                    System.out.println("Deletar Pista");
                    Pista.deletePista(1);
                    break;
                case 21:
                    System.out.println("Sair");
                    break;
                default:
                    System.out.println("Opção inválida");
                break;
            }
        } while (op != 0);
        
    }

    public static void cadastrarAeronave() throws SQLException{
        System.out.println("Digite o id: ");
        int id = scanner.nextInt();
        System.out.println("Digite o marca: ");
        String marca = scanner.next();
        System.out.println("Digite o modelo: ");
        String modelo = scanner.next();
        System.out.println("Digite qual tipo: \n(1)=Aviao, \n(2)Helicoptero, \n(3)Jato");
        int tipoAeronave = scanner.nextInt();
        switch(tipoAeronave){
            case 1:
                System.out.println("Digite o prefixo");
                String prefixo = scanner.next();
                System.out.println("Digite a capacidade");
                int capacidadeAviao = scanner.nextInt();
                System.out.println("Digite o id da companhia");
                int idCompanhia = scanner.nextInt();
                new Aviao(id, marca, modelo, prefixo, capacidadeAviao, idCompanhia, Companhia.getByInt(idCompanhia));
            break;
            case 2:
                System.out.println("Digite a cor");
                String cor = scanner.next();
                System.out.println("Digite a  capacidade");
                int capacidadeHelioptero = scanner.nextInt();
                new Helicoptero(id, marca, modelo, cor, capacidadeHelioptero);
            break;
            case 3:
                System.out.println("Digite o prefixo");
                prefixo = scanner.next();
                System.out.println("Digite a capacidade");
                capacidadeAviao = scanner.nextInt();
                System.out.println("Digite o id da companhia");
                idCompanhia = scanner.nextInt();
                new Jato(id, marca, modelo, prefixo, capacidadeAviao);
            break;
        }
    }

    public static void cadastrarCompanhia() throws SQLException{
        System.out.println("Digite o id: ");
        int id = scanner.nextInt();
        System.out.println("Digite o nome: ");
        String nome = scanner.next();
        System.out.println("Digite o cnpj: ");
        String cnpj = scanner.next();
        new Companhia(id, nome, cnpj);
    
    }

    public static void cadastrarHangar() throws SQLException{
        System.out.println("Digite o id: ");
        int id = scanner.nextInt();
        System.out.println("Digite o numero: ");
        String numero = scanner.next();
        System.out.println("Digite o id_aviao: ");
        int idAviao = scanner.nextInt();
        new Hangar(id, numero, idAviao);
    }

    public static void cadastrarVoo() throws SQLException{
        System.out.println("Digite o id: ");
        int id = scanner.nextInt();
        System.out.println("Digite o numero: ");
        String numero = scanner.next();
        System.out.println("Digite o data: ");
        String data = scanner.next();
        System.out.println("Digite o hora: ");
        String hora = scanner.next();
        System.out.println("Digite a Origem");
        String origem = scanner.next();
        System.out.println("Digite o Destino");
        String destino = scanner.next();
        System.out.println("Digite o nome do piloto");
        String nomePiloto = scanner.next();
        System.out.println("Digite o nome do copiloto");
        String nomeCopiloto = scanner.next();
        System.out.println("Digite a observação");
        String observacao = scanner.next();
        System.out.println("Digite o id da Pista: ");
        int id_pista = scanner.nextInt();
        System.out.println("Digite o id do Aviao: ");
        int idAviao = scanner.nextInt();
        System.out.println("Digite o id do Jato: ");
        int idJato = scanner.nextInt();
        System.out.println("Digite o id do Helicoptero: ");
        int idHelicoptero = scanner.nextInt();
        new Voo(id, numero, data, hora, origem, destino, nomePiloto, nomeCopiloto, observacao, id_pista, idAviao, idJato, idHelicoptero);
    }

    public static void cadastrarPista() throws SQLException{
        System.out.println("Digite o id: ");
        int id = scanner.nextInt();
        System.out.println("Digite o numero: ");
        String numero = scanner.next();
        new Pista(id, numero);
    }




    public static Scanner scanner = new Scanner(System.in);



 }
