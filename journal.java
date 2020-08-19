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
 * 
 */
class jrnl
{
    int ji=0;
    Scanner obj=new Scanner(System.in);
    String n="";
void j()
{
    System.out.println("enter the journal id:");
    ji=obj.nextInt();
    System.out.println("enter the journal name:");
    n=obj.next();
}
    
void tostring(){
    System.out.println("id"+ji+"journal name"+n+);
}

}
    
    
}
public class journal {
    public void display(){
        System.out.println("enter the number of journal printed:");
    }
    int jo=obj.nextInt();
    jrnl obj3[]=new jrnl[50];
    for (int g=0;g<jo;g++)
    {
        obj3[g]=new jrnl();
        obj3[i].j();
    }
        System.out.println("enter the journal no.:");
        int z=obj.nextInt();
        g=z;
        System.out.println(+(obj3[g]));
}
}


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
