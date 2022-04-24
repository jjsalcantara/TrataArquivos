package com.ocaj.chamadora;

public class Pessoa{
	private String nome;
    private int    idade;
    
    public String getNome(){
    	return nome;
    } 

    public void setNome(String nm){
    	this.nome = nm;
    }

    public int getIdade(){
    	return idade;
    } 

    public void setIdade(int ida){
    	this.idade = ida;
    }


    public void printPessoa(){
    	System.out.println("Nome : " + nome);
    	System.out.println("Idade : " + idade);
    }

}
