import java.util.*;

public class comparelinelength {
   public static void main(String[] args) {


                      int a1,a2,a3,a4,b1,b2,b3,b4;
                      double length1,length2;
                      Scanner sc= new Scanner(System.in);

                              System.out.println("Enter a1 ");
                                      a1=sc.nextInt();
                              System.out.println("Enter a2 ");
                                      a2=sc.nextInt();
                              System.out.println("Enter a3 ");
                                      a3=sc.nextInt();
                              System.out.println("Enter a4 ");
                                      a4=sc.nextInt();
                              System.out.println("Enter b1 ");
                                      b1=sc.nextInt();
                              System.out.println("Enter b2 ");
                                      b2=sc.nextInt();
                              System.out.println("Enter b3 ");
                                      b3=sc.nextInt();
                              System.out.println("Enter b4 ");
                                      b4=sc.nextInt();
                      length1 = Math.sqrt((a2-a1)*(a2-a1)+(b2-b1)*(b2-b1));
                      length2 = Math.sqrt((a4-a3)*(a4-a3)+(b4-b3)*(b4-b3));
                      if(length1 == length2) {
                              System.out.print("Length are same ");
                      }
                      else if(length1 > length2) {
                              System.out.print(" distance1 is greater ");
                      }
                      else {
                              System.out.print(" distance2 is greater ");
                      }
              }
      }

