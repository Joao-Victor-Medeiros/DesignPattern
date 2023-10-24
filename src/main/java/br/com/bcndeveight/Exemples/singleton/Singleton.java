package br.com.bcndeveight.Exemples.singleton;

public class Singleton {

    private static volatile Singleton uniqueInstance;

    private Singleton() {
    }

    public static synchronized Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

    public void doSomething() {
        System.out.println("conectando com o banco");
    }

    public void connectingToGatewayServer() {
        System.out.println("conectando ao NGINX");
    }

    //explanation
    /*
    Este singleton é implementado usando os seguintes princípios:

    .O construtor é privado para evitar que outras classes criem instâncias do singleton.
    .Um campo estático armazena a única instância do singleton.
    .Um método estático retorna a única instância do singleton.

    Deve ser usado para forçar a aplicação a não instanciar uma classe, ela faz a checagem para saber se ha instâmcia,
    se não houver será criado e disponibilizado
     */
}
