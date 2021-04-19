public class CompositePatternDemo418021 {
    public static void main(String[] args) {
        Employee418021 CEO = new Employee418021("John", "CEO",30000);
        Employee418021 headSales = new Employee418021("Robert", "Head Sales", 20000);
        Employee418021 headMarketing = new Employee418021("Michel", "Head Marketing", 20000);
        Employee418021 clerk1 = new Employee418021("Laura", "Marketing", 10000);
        Employee418021 clerk2 = new Employee418021("Bob", "Marketing", 10000);
        Employee418021 salesExecutive1 = new Employee418021("Richard", "Sales", 10000);
        Employee418021 salesExecutive2 = new Employee418021("Rob", "Sales", 10000);
        CEO.add(headSales);
        CEO.add(headMarketing);
        headSales.add(salesExecutive1);
        headSales.add(salesExecutive2);
        headMarketing.add(clerk1);
        headMarketing.add(clerk2);
        System.out.println(CEO);
        for (Employee418021 headEmployee : CEO.getSubordinates()) {
            System.out.println(headEmployee);
            for (Employee418021 employee : headEmployee.getSubordinates()) {
                System.out.println(employee);
            }
        }
    }
}