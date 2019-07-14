package pl.sda.builder;


public class App {


    public static void main(String[] args) {


    User user = new User.Builder()
            .name("Testo")
            .lastName("Viron")
            .active(false)
            .city("Chicago")
            .password("jpdgmd")
            .postalCode("2137")
            .build();

        System.out.println(user);

    }
}
