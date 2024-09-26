
import fatec.poo.model.PessoaFisica;
import fatec.poo.model.PessoaJuridica;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author rafav
 */
public class Aplic {

    public static void main(String[] args) {
        
        DecimalFormat percent = new DecimalFormat("#,##0.00 %");
        DecimalFormat def = new DecimalFormat ("R$ #,##0.00");
        
        Scanner enter = new Scanner(System.in);
        
        int anoAtual = 2024;
        
        System.out.println("\nBem Vindo a Atv_POO_3");
        
        System.out.println("\n------ Pessoa Física ------ ");
        
        System.out.printf("Digite o nome: ");
        String nomepf = enter.nextLine();
        System.out.printf("Digite o cpf: ");
        String cpf = enter.nextLine();
        System.out.printf("Digite o ano de Inscrição do funcionário: ");
        int aipf = enter.nextInt();
        //Valor com o qual o cliente vai receber fixo por ano que esteja comprando
        //A menos que compre mais de 12000
        System.out.printf("Digite agora o valor do atributo base: ");
        double base = enter.nextDouble();
        
        PessoaFisica peF = new PessoaFisica( nomepf, cpf, aipf);
        
        int saida = 0;
        do{
            System.out.printf("\nDigite os valores das compras: ");
            double c = enter.nextDouble();
            peF.addCompras(c);
            
            System.out.println("Caso não queira inserir mais compras, digite 1, se não aperte qualquer tecla: ");
            saida = enter.nextInt();
            
            enter.nextLine(); //Limpeza do buffer
            
        }while(saida != 1);
        peF.setBase(base);
        
        System.out.println("\nNome: " + peF.getNome());
        System.out.println("Cpf: " + peF.getCpf());
        System.out.println("Ano de Inscrição: " + peF.getAnoInscricao());
        System.out.println("Atributo Base: " + def.format(peF.getBase()));
        System.out.println("Total de Compras: " + def.format(peF.getTotalCompras()));
        System.out.println("Total do bônus: " + def.format(peF.calcBonus(anoAtual)));

        
         System.out.println("\n------ Pessoa Jurídica ------ ");
        
        System.out.printf("\nDigite o nome: ");
        String nomepj = enter.nextLine();
        System.out.printf("Digite o cgc: ");
        String cgc = enter.nextLine();
        System.out.printf("Digite o ano de Inscrição do funcionário: ");
        int aipj = enter.nextInt();
        //Valor que vai ser adicionado como desconto.
        System.out.printf("Digite agora o valor da taxa de incentivo: ");
        double txin = enter.nextDouble();
        
        PessoaJuridica pj = new PessoaJuridica( nomepj, cgc, aipj);
        
        int saidapj = 0;
        do{
            System.out.printf("\nDigite os valores das compras: ");
            double cpj = enter.nextDouble();
            pj.addCompras(cpj);
            
            System.out.printf("Caso não queira inserir mais compras, digite 1, se não aperte qualquer tecla: ");
            saidapj = enter.nextInt();
            
            enter.nextLine(); //Limpeza do buffer
            
        }while(saidapj != 1);
        pj.setTaxaIncentivo(txin);
        
        //Saída dos dados
        System.out.println("\nNome: " + pj.getNome());
        System.out.println("Cgc: " + pj.getCgc());
        System.out.println("Ano de Inscrição: " + pj.getAnoInscricao());
        System.out.println("Taxa de incentivo: " + percent.format(pj.getTaxaIncentivo()));
        System.out.println("Total de Compras: " + def.format(pj.getTotalCompras()));
        System.out.println("Total do bônus: " + def.format(pj.calcBonus(anoAtual)));
    }
    
}
