public class main {
    public static void main(String[] args) {
        Application context = new ClassPathXmlApplicationContext("xml/services.xml", "xml/daos.xml");

    }
}