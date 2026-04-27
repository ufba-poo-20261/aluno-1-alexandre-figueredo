package br.ufba.poo.lista2;
public class Aluno{
    private final String matricula;
    private String nome;
    public Aluno(String matricula,String nome){
        this.matricula=matricula;
        this.nome=nome;
    }
    public String getMatricula(){
        return matricula;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public boolean equals(Object o){
        if(this==o)return true;
        if(o==null||getClass()!=o.getClass())return false;
        Aluno a=(Aluno)o;
        return matricula.equals(a.matricula);
    }
}