package br.edu.ifsp.spo.lp1a3.sp3013324.cap3;
import java.util.Date;
import java.util.Scanner;

public class ex316 {
    public static void main(String args[]){
        int idade;
        int constante = 220;
        double min;
        double max;

        Scanner x = new Scanner(System.in);
        Date d = new Date();
        HeartHates a = new HeartHates(x);
        idade = a.calculaidade(a.ano, a.mes);
        int freqmax = a.batimentoCardiacoMax(idade,constante);
        min = a.batimentoCardiaco1(freqmax);
        max = a.batimentoCardiaco2(freqmax);
        System.out.println("Nome: " + a.nome + a.sobrenome);
        System.out.println("Data de Nascimento:" + a.dia + "/" + a.mes + "/" + a.ano);
        System.out.println("Idade: " + idade);
        System.out.println("Frequencia máxima:" + freqmax);
        System.out.println("A frequencia deve estar entre " + min + " e " + max);

    }

}
