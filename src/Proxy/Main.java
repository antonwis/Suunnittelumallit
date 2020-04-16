package Proxy;


import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Image> album = Arrays.asList(new ProxyImage("coronaS.jpg"), new ProxyImage("1350.png"));
        album.forEach(Image::showData);
        album.forEach(Image::displayImage);
    }

}
