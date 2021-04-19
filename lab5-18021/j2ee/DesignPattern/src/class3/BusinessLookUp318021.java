package class3;

public class BusinessLookUp318021 {
    public BusinessService318021 getBusinessService(String serviceType){
        if (serviceType.equalsIgnoreCase("EJB")){
            return new EJBService318021();
        } else{
            return new JMSService318021();
        }
    }
}
