package proxy;

public class ProxyExample {

    public static void main(String[] args){
        IImage image1 = new ProxyImage("Hires_10MB_Photo1");
        IImage image2 = new ProxyImage("Hires_10MB_Photo2");

        image1.displayImage();
        image1.displayImage();
        image2.displayImage();
        image2.displayImage();
        image1.displayImage();
    }
}
