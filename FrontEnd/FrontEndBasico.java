import javax.swing.*; //Importa a biblioteca Swing para criar interfaces gráficas
import java.awt.event.*; //Importa as classes de eventos (como ActionListener), cliques de botão e digitação

public class FrontEndBasico {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Aplicação Simples."); //Criação de uma nova instância da janela (JFrame), com Título da janela(Aplicação simples)
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Fecha o programa quando a janela for fechada
        frame.setSize(500, 300); //Define o tamanho da janela (largura, altura)

        JPanel panel = new JPanel(); //criando um painel onde os componentes (botões, campos de texto) serão colocados
        frame.add(panel); //Adiciona o painel à janela

        //Definindo o layout do painel (arranjo dos componentes)
        panel.setLayout(null); //Usa layout nulo para posicionar os componentes manualmente

        //Criando o campo de texto para o usuário digitar seu nome
        JTextField nomeField = new JTextField(); //Cria um campo de texto
        nomeField.setBounds(50, 30, 300, 30); //Define a posição e o tamanho (x, y, largura, altura)
        panel.add(nomeField); //Adiciona o campo de texto ao painel

        //Criando o botão que o usuário clicará
        JButton botao = new JButton("Clique aqui para Inserir seu name."); //Texto do botão
        botao.setBounds(150, 70, 100, 30); //Define a posição e o tamanho do botão
        panel.add(botao); //Adiciona o botão ao painel

        //Criando um rótulo (label) que irá exibir a mensagem de boas-vindas
        JLabel mensagemLabel = new JLabel(""); //Inicia o rótulo vazio
        mensagemLabel.setBounds(50, 110, 300, 30); //Define a posição e o tamanho do rótulo
        panel.add(mensagemLabel); //Adiciona o rótulo ao painel

        //Adicionando a funcionalidade ao botão (quando clicado, mostra uma mensagem)
        botao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = nomeField.getText(); //Obtém o texto digitado no campo de texto
                if(!nome.isEmpty()) { //Verifica se o campo não está vazio
                    mensagemLabel.setText("Bien-venido, " + nome + "!"); //se não estiver vazio
                } else {
                    mensagemLabel.setText("Por Favor, insira seu nome."); //se estiver
                }
            }
        });

        //Tornando a janela visível
        frame.setVisible(true);
    }
}

//OBS: comentários pertinentes
//SWING: é uma biblioteca gráfica do Java que permite criar interfaces de usuário com facilidade
//JFrame é a janela principal da aplicação
//JButton é um botão que o usuário pode clicar
//JTextField é um campo onde o usuário pode digitar informações
//JLabel é um rótulo que exibe texto
//ActionListener é um mecanismo que permite adicionar funcionalidades aos componentes (como o clique de um botão)