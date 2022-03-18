import java.util.Scanner;


public class App{

   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        int escolha;
       
         
        System.out.println("    | Até 5KG |     ");
        System.out.format("[1] Filé Duplo  R$ 4,90\n"
                        + "[2] Alcatra     R$ 5,90\n"
                        + "[3] Picanha     R$ 6,90\n");
        System.out.println("");
        
        System.out.println(" | Acima de 5KG | ");
        System.out.format("[1] Filé Duplo  R$ 5,80\n"
                        + "[2] Alcatra     R$ 6,80\n"
                        + "[3] Picanha     R$ 7,80\n");
        System.out.println("");
        
       
        System.out.print("Escolha um tipo de carne: ");
        escolha = input.nextInt();
        
        
        switch (escolha){
            case 1:
                System.out.print("Digite a quantidade desejada: ");
                float quant = input.nextFloat();
                
                if (quant > 5.0){       
                    float valorapagar = quant * 5.8f;
                    System.out.print("Você irá pagar com o cartão tabajara? ");
                    String resp = input.next();
                    
                    
                    if (resp.equals("sim")){
                        float desconto = valorapagar * 5/100;
                        float valorcdesconto = valorapagar - desconto;
                        
                        //Apresentação do Cupom Fiscal
                        System.out.println("");
                        System.out.println("            CUPOM FISCAL           ");
                        System.out.println("===================================");
                        System.out.printf("Tipo de carne: Filé Duplo\n"
                                        + "Quantidade %.2f KG\n", quant);
                        System.out.format("Valor Total R$ %.2f\n", valorapagar);   
                        System.out.println("Forma de pagamento: Cartão Tabajara");
                        System.out.printf("Valor de desconto R$ %.2f\n", desconto);
                        System.out.printf("Valor a pagar R$ %.2f\n", valorcdesconto);
                        System.out.println("===================================");
                    }else{
                        System.out.println("");
                        System.out.println("            CUPOM FISCAL           ");
                        System.out.println("===================================");
                        System.out.printf("Tipo de carne: Filé Duplo\n"
                                        + "Quantidade %.2f KG\n", quant);
                        System.out.format("Valor a pagar R$ %.2f\n", valorapagar);   
                        System.out.println("Forma de pagamento: Débito/Crédito/Dinheiro");
                        System.out.println("===================================");
                    }
                }else if (quant <= 5.0){
                    float valorapagar = quant * 4.9f;    
                    System.out.print("Você irá pagar com o cartão tabajara? ");
                    String resp = input.next();
            
                    if (resp.equals("sim")){
                        float desconto = valorapagar * 5/100;
                        float valorcdesconto = valorapagar - desconto;
                        
                        
                        System.out.println("");
                        System.out.println("            CUPOM FISCAL           ");
                        System.out.println("===================================");
                        System.out.printf("Tipo de carne: Filé Duplo\n"
                                        + "Quantidade %.2f KG\n", quant);
                        System.out.format("Valor Total R$ %.2f\n", valorapagar);   
                        System.out.println("Forma de pagamento: Cartão Tabajara");
                        System.out.printf("Valor de desconto R$ %.2f\n", desconto);
                        System.out.printf("Valor a pagar R$ %.2f\n", valorcdesconto);
                        System.out.println("===================================");
           
                    }else{
                        System.out.println("");
                        System.out.println("            CUPOM FISCAL           ");
                        System.out.println("===================================");
                        System.out.printf("Tipo de carne: Filé Duplo\n"
                                        + "Quantidade %.2f KG\n", quant);
                        System.out.format("Valor a pagar R$ %.2f\n", valorapagar);   
                        System.out.println("Forma de pagamento: Débito/Crédito/Dinheiro");
                        System.out.println("===================================");
                    }

                } 
                break;

            case 2:
                System.out.print("Digite a quantidade desejada: ");
                float quant2 = input.nextFloat();

                if (quant2 > 5.0){       
                    float valorapagar2 = quant2 * 6.8f;
                    System.out.print("Você irá pagar com o cartão tabajara? ");
                    String resp2 = input.next();

                    if (resp2.equals("sim")){
                        float desconto2 = valorapagar2 * 5/100;
                        float valorcdesconto2 = valorapagar2 - desconto2;
                            
                        //Apresentação do Cupom Fiscal
                        System.out.println("");
                        System.out.println("            CUPOM FISCAL           ");
                        System.out.println("===================================");
                        System.out.printf("Tipo de carne: Alcatra\n"
                                            + "Quantidade %.2f KG\n", quant2);
                        System.out.format("Valor Total R$ %.2f\n", valorapagar2);   
                        System.out.println("Forma de pagamento: Cartão Tabajara");
                        System.out.printf("Valor de desconto R$ %.2f\n", desconto2);
                        System.out.printf("Valor a pagar R$ %.2f\n", valorcdesconto2);
                        System.out.println("===================================");

                    }else{
                        System.out.println("");
                        System.out.println("            CUPOM FISCAL           ");
                        System.out.println("===================================");
                        System.out.printf("Tipo de carne: Alcatra\n"
                                            + "Quantidade %.2f KG\n", quant2);
                        System.out.format("Valor a pagar R$ %.2f\n", valorapagar2);   
                        System.out.println("Forma de pagamento: Débito/Crédito/Dinheiro");
                        System.out.println("===================================");
                    }
                }else if(quant2 <= 5.0){
                        float valorapagar2 = quant2 * 5.9f;    
                        System.out.print("Você irá pagar com o cartão tabajara? ");
                        String resp2 = input.next();

                        if (resp2.equals("sim")){
                            float desconto2 = valorapagar2 * 5/100;
                            float valorcdesconto2 = valorapagar2 - desconto2;
                                
                                
                            System.out.println("");
                            System.out.println("            CUPOM FISCAL           ");
                            System.out.println("===================================");
                            System.out.printf("Tipo de carne: Alcatra\n"
                                                + "Quantidade %.2f KG\n", quant2);
                            System.out.format("Valor Total R$ %.2f\n", valorapagar2);   
                            System.out.println("Forma de pagamento: Cartão Tabajara");
                            System.out.printf("Valor de desconto R$ %.2f\n", desconto2);
                            System.out.printf("Valor a pagar R$ %.2f\n", valorcdesconto2);
                            System.out.println("===================================");
                
                        }else{
                            System.out.println("");
                            System.out.println("            CUPOM FISCAL           ");
                            System.out.println("===================================");
                            System.out.printf("Tipo de carne: Alcatra\n"
                                                    + "Quantidade %.2f KG\n", quant2);
                            System.out.format("Valor a pagar R$ %.2f\n", valorapagar2);   
                            System.out.println("Forma de pagamento: Débito/Crédito/Dinheiro");
                            System.out.println("===================================");
                        }
                }
                break;

            case 3:
                System.out.print("Digite a quantidade desejada: ");
                float quant3 = input.nextFloat();

                if(quant3 > 5.0){
                    float valorapagar3 = quant3 * 7.8f;
                    System.out.print("Você irá pagar com o cartão tabajara? ");
                    String resp3 = input.next();

                    if(resp3.equals("sim")){
                        float desconto3 = valorapagar3 * 5/100;
                        float valorcdesconto3 = valorapagar3 - desconto3;

                        //Apresentação do Cupom Fiscal
                        System.out.println("");
                        System.out.println("            CUPOM FISCAL           ");
                        System.out.println("===================================");
                        System.out.printf("Tipo de carne: Picanha\n"
                                        + "Quantidade %.2f KG\n", quant3);
                        System.out.format("Valor Total R$ %.2f\n", valorapagar3);   
                        System.out.println("Forma de pagamento: Cartão Tabajara");
                        System.out.printf("Valor de desconto R$ %.2f\n", desconto3);
                        System.out.printf("Valor a pagar R$ %.2f\n", valorcdesconto3);
                        System.out.println("===================================");

                    }else{
                        System.out.println("");
                        System.out.println("            CUPOM FISCAL           ");
                        System.out.println("===================================");
                        System.out.printf("Tipo de carne: Picanha\n"
                                        + "Quantidade %.2f KG\n", quant3);
                        System.out.format("Valor a pagar R$ %.2f\n", valorapagar3);   
                        System.out.println("Forma de pagamento: Débito/Crédito/Dinheiro");
                        System.out.println("===================================");
                    }

                }else if (quant3 <= 5.0){
                    float valorapagar3 = quant3 * 6.9f;    
                    System.out.print("Você irá pagar com o cartão tabajara? ");
                    String resp3 = input.next();

                    if (resp3.equals("sim")){
                        float desconto3 = valorapagar3 * 5/100;
                        float valorcdesconto3 = valorapagar3 - desconto3;
                        
                        
                        System.out.println("");
                        System.out.println("            CUPOM FISCAL           ");
                        System.out.println("===================================");
                        System.out.printf("Tipo de carne: Picanha\n"
                                        + "Quantidade %.2f KG\n", quant3);
                        System.out.format("Valor Total R$ %.2f\n", valorapagar3);   
                        System.out.println("Forma de pagamento: Cartão Tabajara");
                        System.out.printf("Valor de desconto R$ %.2f\n", desconto3);
                        System.out.printf("Valor a pagar R$ %.2f\n", valorcdesconto3);
                        System.out.println("===================================");
                    }else{
                        System.out.println("");
                        System.out.println("            CUPOM FISCAL           ");
                        System.out.println("===================================");
                        System.out.printf("Tipo de carne: Picanha\n"
                                        + "Quantidade %.2f KG\n", quant3);
                        System.out.format("Valor a pagar R$ %.2f\n", valorapagar3);   
                        System.out.println("Forma de pagamento: Débito/Crédito/Dinheiro");
                        System.out.println("===================================");
                    }

            
                }
            default:
                input.close();
                break;
        }
    }
}