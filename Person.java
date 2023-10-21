/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testperson;

/**
 *
 * @author cui
 */

    public class Person {
    private String name;
    private int age;
    public Person(String j,int o){
        this.name=j;
        this.age=o;
        //System.out.println(this.name+"\n"+this.age+" ");
    }
    public void compareAge(Person r){
        if(this.age>r.age){
            System.out.println("Person one is older than person two:");}
           else if(this.age<r.age){
                System.out.println("Person one is younger than Person two");
            }
            else{
                System.out.println("Age of person one and two is equal:");
            }    
    }
}


