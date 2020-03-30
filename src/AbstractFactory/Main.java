package AbstractFactory;

import AbstractFactory.Factories.AbstractFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Main {

    public static void main(String[] args) {

        Class c = null;
        AbstractFactory factory = null;

        Properties properties = new Properties();
        try {
            FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir") + "/src/AbstractFactory/factory.properties");
            properties.load(fileInputStream);
        }
        catch (IOException e) {
            System.out.println("File not found");
            e.printStackTrace();
        }

        try {
            c = Class.forName(properties.getProperty("adidas"));
            factory = (AbstractFactory)c.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Jasperin vaatteet opiskelijana:");
        System.out.println(factory.toString());

        try {
            c = Class.forName(properties.getProperty("boss"));
            factory = (AbstractFactory)c.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Jasperin vaatteet insinöörinä:");
        System.out.println(factory.toString());

    }
}
