import javax.swing.JOptionPane;

class VendaDEIngressos {
    

    public static void main (String[] args) {
        
    

        int menu = 0;
        int comprarIngresso = 0;
        int comprarMeia = 0;
        int pagamento = 0;
        double troco;
        int carrinho;
        int formadepagamento;
        
        




        while(menu!=4){
            menu = Integer.parseInt(JOptionPane.showInputDialog("BEM VINDO AO MENU DE COMPRA DE INGRESSO:"+
            "\n 1 -Comprar Ingresso" +

            "\n 2- Ingresso Meia Entrada" +
            "\n 3- Carrinho" +

             "\n 4 -Sair"));

            switch (menu){
                case 1:
                JOptionPane.showMessageDialog(null, "Bem Vindo a Compra de Ingresso");
                int valorIngressoInteira = 14;
                int numIngresso;
                numIngresso = Integer.parseInt(JOptionPane.showInputDialog("Cada Ingresso custa R$" + valorIngressoInteira + "\n Informe quantos ingressos você irá comprar:"));
                comprarIngresso = (valorIngressoInteira * numIngresso);
                JOptionPane.showMessageDialog(null, "O valor total da compra é: "+ comprarIngresso);
                break;

                case 2:
                JOptionPane.showMessageDialog(null, "Bem Vindo a Compra de Ingresso Meia entrada");
                int ValorIngressoMeia = 7;
                int numMeia;
                numMeia = Integer.parseInt(JOptionPane.showInputDialog("Cada Ingresso custa R$" + ValorIngressoMeia + "\n Informe quantos ingressos você irá comprar:"));
                comprarMeia = (ValorIngressoMeia * numMeia);
                JOptionPane.showMessageDialog(null, "O valor total da compra é: "+ comprarMeia);
                break;

                case 3:
                
                carrinho = (comprarIngresso + comprarMeia);
                JOptionPane.showMessageDialog(null, "O valor total da compra é:" + carrinho);
                formadepagamento = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma forma de pagamento: " +
                "\n" + " 1 - Cartão (5%juros)" +
                "\n" + " 2 - Boleto" +
                "\n" + " 3 - Pix (5% de desconto)"));
                switch (formadepagamento){
                    case 1:
                    JOptionPane.showMessageDialog(null, " O Valor total da compra é: " + (carrinho * 1.05));
                pagamento = Integer.parseInt(JOptionPane.showInputDialog(null, "Olá, bem vindo ao caixa. Por favor informe a quantia para pagamento:"));
                troco = (pagamento - (carrinho * 1.05));
                JOptionPane.showMessageDialog(null, "Agradecemos a sua compra, o seu troco é: " + troco);
                break;

                    case 2:
                    JOptionPane.showMessageDialog(null, " O Valor total da compra é: " + carrinho);
                pagamento = Integer.parseInt(JOptionPane.showInputDialog(null, "Olá, bem vindo ao caixa. Por favor informe a quantia para pagamento:"));
                troco = (pagamento - carrinho);
                JOptionPane.showMessageDialog(null, "Agradecemos a sua compra, o seu troco é: " + troco);
                break;
                    case 3:
                    JOptionPane.showMessageDialog(null, " O Valor total da compra é: " + (carrinho -  (carrinho * 0.05)));
                pagamento = Integer.parseInt(JOptionPane.showInputDialog(null, "Olá, bem vindo ao caixa. Por favor informe a quantia para pagamento:"));
                troco = (pagamento - (carrinho -  (carrinho * 0.05)));
                JOptionPane.showMessageDialog(null, "Agradecemos a sua compra, o seu troco é: " + troco);
                break;


                

                }
                
                case 4:
                break;
                

            }

        }




    }
}