public class App {
    public static void main(String[] args) throws Exception {
        login o = new login("José", "150");
        loginProxy proxy = new loginProxy(o);
        System.out.println("Login com id seguro: ");
        proxy.novoIDseguro("698");

        System.out.println("Login com id proibido");
        proxy.novoIDseguro("789");

    }
}
