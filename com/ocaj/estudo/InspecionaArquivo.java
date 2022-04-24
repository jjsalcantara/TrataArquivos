package com.ocaj.estudo;
import java.io.File;
import java.io.InputStream;
import java.io.BufferedReader;
import java.io.IOException;
import javax.swing.JLabel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.InputStreamReader;
import javax.swing.JFrame;
import java.awt.Component;
import java.awt.Container;
import javax.swing.JButton;
import com.ocaj.estudo.Utilidades;

public class InspecionaArquivo {

		String line = null;
		int i = 1;
		int tipoA, tipoB, tipoC, tipoJ, tipoK, tipoZ, tipoI, tipoE;
		String letra = null;

		public void inspeciona(Container ct, File fl, JLabel l){

			String loc = fl.getAbsolutePath();
			Path local = Paths.get(loc);
			try{
				InputStream in = Files.newInputStream(local);
				BufferedReader rd = new BufferedReader (new InputStreamReader(in));
				while(( line = rd.readLine()) != null)
				{	//  método que irá contabilizar os tipos de registro
					contabiliza(line);
				}
			}
			catch (IOException e){
				System.err.println(e);
			}

			atualizaTotais(ct);

		}


		private void contabiliza(String linha)
		{
			letra = linha.substring(0,1);
			switch (letra)
			{
				case "A":
					tipoA++;
					break;
				case "B":
					//System.out.println("tipo : " + linha.substring(6,7));
					tipoB++;
					break;
				case "C":
					tipoC++;
					break;
				case "J":
					tipoJ++;
					break;
				case "K":
					tipoK++;
					break;
				case "Z":
					tipoZ++;
					break;
			}

			String tipo = linha.substring(6,7);
			switch (tipo)
			{
				case "I":
					tipoI++;
					break;
				case "E":
					tipoE++;
					break;
			}

		}

		private void atualizaTotais(Container ct)
		{
			Component[] comp = ct.getComponents();
			JLabel[] lbs = new JLabel[comp.length];

			Utilidades util = new Utilidades();

	        for(Component c : comp)
	        {
	        	if(c.getClass() == JLabel.class){
	        		lbs[i] = (JLabel) c;
	        		if(lbs[i].getToolTipText().toString().equalsIgnoreCase("id004"))
	        		{
	        			lbs[i].setText(util.TOTAL_A+tipoA);
	        		}
	         		if(lbs[i].getToolTipText().equalsIgnoreCase("id005"))
	        		{
	        			lbs[i].setText(util.TOTAL_B+tipoB);
	        		}
	          		if(lbs[i].getToolTipText().equalsIgnoreCase("id006"))
	        		{
	        			lbs[i].setText(util.TOTAL_C+tipoC);
	        		}

	          		if(lbs[i].getToolTipText().equalsIgnoreCase("id007"))
	        		{
	        			lbs[i].setText(util.TOTAL_J+tipoJ);
	        		}

	          		if(lbs[i].getToolTipText().equalsIgnoreCase("id008"))
	        		{
	        			lbs[i].setText(util.TOTAL_K+tipoK);
	        		}

	          		if(lbs[i].getToolTipText().equalsIgnoreCase("id009"))
	        		{
	        			lbs[i].setText(util.TOTAL_Z+tipoZ);
	        		}

	          		if(lbs[i].getToolTipText().equalsIgnoreCase("id010"))
	        		{
	        			lbs[i].setText(util.TOTAL_INCLUSAO+tipoI);
	        		}

	          		if(lbs[i].getToolTipText().equalsIgnoreCase("id011"))
	        		{
	        			lbs[i].setText(util.TOTAL_EXCLUSAO+tipoE);
	        		}

	        		i++;
	        	}      	
	        }

	/*		System.out.println("a -> " + tipoA);
			System.out.println("b -> " + tipoB);
			System.out.println("c -> " + tipoC);
			System.out.println("j -> " + tipoJ);
			System.out.println("k -> " + tipoK);
			System.out.println("z -> " + tipoZ);	
			System.out.println("i -> " + tipoI);
			System.out.println("e -> " + tipoE);	*/
		}

}