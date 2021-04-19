public class ClientA1_18021 implements Client_18021 {
    Service_18021 service;

    public ClientA1_18021(Service_18021 service) {

    }

    public void ClientA1(Service_18021 service) {
        this.service = service;
    }

    @Override
    public void doSomething() {
        String info = service.getInfo();
        System.out.println("Info : " + info);
    }

    public void setService(Service_18021 service) {
        this.service = service;
    }
}
