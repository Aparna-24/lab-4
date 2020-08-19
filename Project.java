/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package package1;
import package1.text.*;

/**
 *
 * @author aparna
 */
public class Project {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        art s1=new art();
        s1.sum(10, 6);
        subpackage1 obj=new subpackage1();
        obj.hello();
        Demo S=new Demo();
        S.box();

        
        
        
        
        // TODO code application logic here
    }
}

class art
{
    art()
    {
            System.out.println("welcome to netbeans");
    }
    void sum(int a,int b)
    {
        System.out.println("the sum of given two number is:"+a+b);
    }
            
}
