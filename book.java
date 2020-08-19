/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package library.Pack1;
import java.util.Scanner;

/**
 *
 * @author aparna
 */
public class book {
    int id=0;
    int an=0;
    String bn="";
    String An="";
    int p=0;
    Scanner obj=new Scanner(System.in);
            void bk()
            {
                System.out.println("enter book id");
                id=obj.nextInt();
               System.out.println("enter accession no.:");
               an=obj.nextInt();
                System.out.println("enter book name:");
                bn=obj.next();
                System.out.println("enter author name:");
                An=obj.next();
                System.out.println("enter publication date:");
                p=obj.nextInt();
            }
            void tostring()
            {
                System.out.println("name:"+bn+"id:"+id+"author name:"+An+);
            }
}
   public void display()
        {
            System.out.println("enter the number of books to be printed: ");
              int n=obj.nextInt();
              book obj2[]=new book[50];
              for(int i=0;i<n;i++)
                {
                    obj2[i]=new book();
                     obj2[i].bk();
                }
System.out.println("enter the book number:");
int s=obj.nextInt();
i=s;
System.out.println(+(obj2[i]));
}
}
 

             




                
                

    public book() {
        this.an = " ";
    }
   
        }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
