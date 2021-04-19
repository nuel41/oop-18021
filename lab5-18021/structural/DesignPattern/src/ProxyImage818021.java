public class ProxyImage818021 implements Image818021 {
    private RealImage818021 realImage;
    private String fileName;
    public ProxyImage818021(String fileName) {
        this.fileName = fileName;
    }
    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage818021(fileName);
        }
        realImage.display();
    }
}