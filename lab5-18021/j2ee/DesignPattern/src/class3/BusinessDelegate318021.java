package class3;

public class BusinessDelegate318021 {
    private BusinessLookUp318021 lookupService = new BusinessLookUp318021();
    private BusinessService318021 businessService;
    private String serviceType;

    public void setServiceType(String serviceType){
        this.serviceType = serviceType;
    }
    public void doTask(){
        businessService = lookupService.getBusinessService(serviceType);
        businessService.doProcessing();
    }
}
