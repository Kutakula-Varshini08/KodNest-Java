class RunTimePolymorphism{
    public static void main(String[] args){
        JavaDeveloper jd = new JavaDeveloper();
        accessMethod(jd);
        PythonDeveloper pd = new PythonDeveloper();
        accessMethod(pd);
    }
    public static void accessMethod(Developer dev){
        dev.work();
        dev.project();
    }
}
class Developer{
    void work(){
        System.out.println("Developer is working");
    }
    void project(){
        System.out.println("Developer is doing project");
    }
}
class JavaDeveloper extends Developer{
    void work(){
        System.out.println("Java Developer is working");
    }
    void project(){
        System.out.println("Java Developer is doing project");
    }
}
class PythonDeveloper extends Developer{
    void work(){
        System.out.println("Python Developer is working");
    }
    void project(){
        System.out.println("Python Developer is doing project");
    }
}