package OOP;

import java.util.Scanner;
import java.util.Arrays;
public class DeepCopyConstructor {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);

        //object1
        DeepCopy s1=new DeepCopy();
        s1.setStudentName("Rakesh");
        s1.setSudentId(10);
        int[] arr=new int[5];
        for (int i = 0; i <5 ; i++) {
            arr[i]=Sc.nextInt();
        }
        s1.setStudentMarks(arr);
        System.out.println(s1.studentName);
        System.out.println(s1.sudentId);

        System.out.println("Marks of student s1");
        System.out.println(Arrays.toString(s1.studentMarks));

        //object2
        //deep constructor
        DeepCopy s2=new DeepCopy(s1);

        // change values of object 1
        s1.studentMarks[0]=99;
        s1.studentMarks[1]=98;
        s1.studentMarks[2]=95;
        s1.studentMarks[3]=96;
        s1.studentMarks[4]=91;

        //now print s1 and s2 and see changes applied in s1 at above are reflected in s2 or not
        System.out.println("marks of student s1");
        System.out.println(Arrays.toString(s1.studentMarks));

        System.out.println("Marks of student s2");
        System.out.println(Arrays.toString(s2.studentMarks));

    }
    static class DeepCopy{
     private   String studentName;
      private  int sudentId;
      private int[] studentMarks=new int[5];

      //default constructor
      DeepCopy() {

      }

      //deep copy constuctor
        DeepCopy(DeepCopy object){
            for (int i = 0; i <studentMarks.length ; i++) {
                this.studentMarks[i]=object.studentMarks[i];
            }
        }

        public int[] getStudentMarks() {
            return studentMarks;
        }

        public void setStudentMarks(int[] studentMarks) {
            this.studentMarks = studentMarks;
        }

        public String getStudentName() {
            return studentName;
        }

        public void setStudentName(String studentName) {
            this.studentName = studentName;
        }

        public int getSudentId() {
            return sudentId;
        }

        public void setSudentId(int sudentId) {
            this.sudentId = sudentId;
        }






    }
}
