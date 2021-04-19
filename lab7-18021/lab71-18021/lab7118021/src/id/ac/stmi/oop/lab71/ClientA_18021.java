public class ClientA_18021 {
    Service_18021 service;

    public void doSomething() {
        String info = service.getInfo();
        System.out.println("info : " + info);
    }

    public void setService(Service_18021 service) {
        this.service = service;
    }

    public static void main(String[] args) {
        Service_18021 service = new ServiceB_18021();
        Client_18021 client = new ClientA1_18021(service);
        ((ClientA1_18021) client).setService(new ServiceB_18021());
        client.doSomething();

        Client_18021 client1 = new ClientA1_18021(service);
        ((ClientA1_18021) client1).setService(new ServiceC_18021());
        client.doSomething();

        Client_18021 client2 = new ClientA1_18021(service);
        ((ClientA1_18021) client2).setService(new ServiceD_18021());
        client.doSomething();
    }
}