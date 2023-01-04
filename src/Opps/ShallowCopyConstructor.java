package Opps;

public class ShallowCopyConstructor {
    public static void main(String[] args) {
        Employee s1=new Employee("Rakesh",10);
        System.out.println(s1.empName);

        Employee s2=new Employee(s1);
        System.out.println(s2.empName);
    }
   static class Employee{
        String empName;
        int empId;

        Employee(String name,int id){
            this.empName=name;
            this.empId=id;
        }
        Employee(Employee emp1){
            this.empName=emp1.empName;
            this.empId=emp1.empId;
        }

    }

}
