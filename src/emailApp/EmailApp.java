package emailApp;

public class EmailApp {

    public static void main(String[] args)
    {
          Email eml = new Email("Tripti","Pant");
          eml.setAlternateEmail("tripti.pant@gmail.com");

          System.out.println(eml.showInfo());

    }
}
