
package com.ocaj.estudo;

import com.ocaj.estudo.MostraTela;
import com.ocaj.estudo.InspecionaArquivo;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Container;
import java.awt.Component;
import java.awt.Event;
import javax.swing.JLabel;
import javax.swing.JFileChooser;
import java.io.File;
import javax.swing.SwingUtilities;
import javax.swing.JTextArea;
import java.awt.Insets;
import javax.swing.UIManager;
import java.awt.Color;
import com.ocaj.estudo.Utilidades;


public class PreparaComponentes{

	static private final String newline = "\n";
	//criando elementos
	JButton btProcessa,  btSair;
	JFileChooser fc = new JFileChooser();
	Container  contentPane;
	JLabel lbl02 = new JLabel();
	JLabel lbl03 = new JLabel();
	//labels dos tipos
	JLabel lbl04 = new JLabel(); //a
	JLabel lbl05 = new JLabel(); //b
	JLabel lbl06 = new JLabel(); //c
	JLabel lbl07 = new JLabel(); //j
	JLabel lbl08 = new JLabel(); //k
	JLabel lbl09 = new JLabel(); //z	
	JLabel lbl10 = new JLabel(); //inclusão	
	JLabel lbl11 = new JLabel(); //exclusão
	JFrame frame = null;


	public void prepara(){

       //Frame
		frame = new JFrame("## Processador de Arquivos ##");
		frame.setResizable(false); //layout nulo para usar posição absoluta
		//criando o contentPane
		contentPane = frame.getContentPane();
		contentPane.setLayout(null); //layout nulo para usar posição absoluta

		//setando o comportamento default para fechar a janela
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//setando as coordenada para a tela
		frame.setBounds(100,100,600, 400);

     	//label do file chooser
		JLabel lbl01 = new JLabel("++ Escolha o arquivo a ser processado ++");
		lbl01.setBounds(175,10,500,20);
		lbl01.setToolTipText("id001");
		contentPane.add(lbl01);


		lbl02.setBounds(175,30,300,20);
		lbl02.setText(" Nenhum arquivo selecionado...");
		lbl02.setOpaque(true);
		lbl02.setBackground(Color.CYAN);
		lbl02.setToolTipText("id002");
		contentPane.add(lbl02);

		lbl03.setBounds(10,60,500,20);
		lbl03.setText("Caminho...");
		lbl03.setOpaque(true);
		lbl03.setToolTipText("id003");
		contentPane.add(lbl03);

		Utilidades util = new Utilidades();

		lbl04.setBounds(10,80,300,20);
		lbl04.setText(util.TOTAL_A);
		lbl04.setOpaque(true);;
		lbl04.setToolTipText("id004");
		contentPane.add(lbl04);

		lbl05.setBounds(10,100,300,20);
		lbl05.setText(util.TOTAL_B);
		lbl05.setOpaque(true);;
		lbl05.setToolTipText("id005");
		contentPane.add(lbl05);

		lbl06.setBounds(10,120,300,20);
		lbl06.setText(util.TOTAL_C);
		lbl06.setOpaque(true);
		lbl06.setToolTipText("id006");
		contentPane.add(lbl06);

		lbl07.setBounds(10,140,300,20);
		lbl07.setText(util.TOTAL_J);
		lbl07.setOpaque(true);
		lbl07.setToolTipText("id007");
		contentPane.add(lbl07);

		lbl08.setBounds(10,160,300,20);
		lbl08.setText(util.TOTAL_K);
		lbl08.setOpaque(true);
		lbl08.setToolTipText("id008");
		contentPane.add(lbl08);

		lbl09.setBounds(10,180,300,20);
		lbl09.setText(util.TOTAL_Z);
		lbl09.setOpaque(true);
		lbl09.setToolTipText("id009");
		contentPane.add(lbl09);

		lbl10.setBounds(10,200,300,20);
		lbl10.setText(util.TOTAL_INCLUSAO);
		lbl10.setOpaque(true);
		lbl10.setToolTipText("id010");
		contentPane.add(lbl10);

		lbl11.setBounds(10,220,300,20);
		lbl11.setText(util.TOTAL_EXCLUSAO);
		lbl11.setOpaque(true);
		lbl11.setToolTipText("id011");
		contentPane.add(lbl11);


		btProcessa = new JButton("Processa");
		btSair= new JButton("Sair");
		btProcessa.setBounds(10,300,100, 40);
		btSair.setBounds(120,300, 100, 40);
		contentPane.add(btProcessa);
		contentPane.add(btSair);


		//colocando eventlisteners nos botões
		btProcessa.addActionListener(e -> processa(contentPane,fc,lbl02, lbl03));
		btSair.addActionListener(e -> System.exit(0));

		//chama a tela
		MostraTela mt = new MostraTela();
		mt.mostra(frame);
	}

	public void processa(Container ct, JFileChooser fc, JLabel l1, JLabel l2){
		//abre o filechooser
		int returnValue = fc.showOpenDialog(null);
		if(returnValue == fc.APPROVE_OPTION)
		{
			File file = fc.getSelectedFile();
			l1.setText("Abrindo : " + file.getName() + newline);
			l2.setText("Caminho : " + file.getAbsolutePath() + newline);
			//System.out.println("Abriu o arquivo corretamente !!");
			InspecionaArquivo ia = new InspecionaArquivo();
			ia.inspeciona(ct, file, l1);
		}
		else{
			l1.setText("Erro ao abrir o arquivo !! ");
			//System.out.println("erro ao abrir o arquivo !!");
		}
	}
}