package class3;

public class BusinessDelegatePatternDemo318021 {
    public static void main(String[] args){
        BusinessDelegate318021 businessDelegate = new BusinessDelegate318021();
        businessDelegate.setServiceType("EJB");
        Client318021 client = new Client318021(businessDelegate);
        client.doTask();
        businessDelegate.setServiceType("JMS");
        client.doTask();
    }
}
