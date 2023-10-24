package br.com.bcndeveight.Exemples.singleton;

public class Main2 {
    public static void main(String[] args) {
        var sing  = Singleton.getInstance();
        System.out.println(Singleton.getInstance());
        System.out.println(sing);

        sing.doSomething();
    }
}
