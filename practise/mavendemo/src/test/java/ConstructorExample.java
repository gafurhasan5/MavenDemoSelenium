public class ConstructorExample {
    ConstructorExample()
    {
        System.out.println("Default constructor called");
    }



    public String name;
    public int age;
    ConstructorExample(String name,int aage)
    {
        this.name=name;
        this.age=aage;
        //System.out.println(name +" "+ age);
        //System.out.println("name is:"+name+" "+"age is: "+age);
    }
    ConstructorExample(ConstructorExample cp)
    {
        this.name=cp.name;
        this.age=cp.age;
    }

//    public void display()
//    {
//        System.out.println(name +" "+ age);
//    }

    public  static void main(String[] args)
    {
         ConstructorExample obj=new ConstructorExample("gafur",24);
        ConstructorExample obj1=new ConstructorExample(obj);
        obj1.name="hassan";
         System.out.println(obj.name);
         System.out.println(obj1.name);
         //obj.display();
        // obj1.display();
    }
}
