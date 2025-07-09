public class Types_constructor{
        public static void main(String[] args) {
            student s1=new student();
            s1.name="raji";
            s1.password="abvcc";
            s1.marks[0]=67;
            s1.marks[1]=78;
            s1.marks[2]=98;
            student s2=new student(s1);
            s1.marks[0]=100;//This is for seen the changes is s2 but also occur s2 beacause copy references
            s2.password="abcde";
            System.out.println(s2.name);
            for(int i=0;i<3;i++)
            {
                System.out.println(s2.marks[i]);
            }
            // System.out.println(s1.name);
        }
  }  
    class student{
        String name;
        int roll;
        int marks[];
        String password;

        // student(student s1)// shallow copy constructor       
        // {
        //     marks=new int[3];
        //     this.name=s1.name;
        //     this.roll=s1.roll;
        //     this.marks=s1.marks;
        // }
        
        //Deep copy constructor
        student(student s1)
        {
            marks= new int[3];
            this.name=s1.name;
            this.roll=s1.roll;
            for(int i=0;i<3;i++)
            {
                this.marks[i]=s1.marks[i];
            }
        }
        student()//null
        {
            marks=new int[3];
            System.out.println("this is non paramitarized constructor: ");
        }
        
    
        student(String name)// paramiterized constructor
        {
            marks=new int[3];
            this.name=name;
            // this.roll=roll;
        }
    }
    

