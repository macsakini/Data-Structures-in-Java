
class GetSet{
    String name;

    int age;
    public static void main(String[] args){

        GetSet a  = new GetSet();

        a.setName("Pablo");
        a.setAge(34);
        
        System.out.println(a.getAge());
        System.out.println(a.getName());

        a.printDetails();

    }
    
    //setters
    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }
    
    //getters
    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    private void printDetails() {
        System.out.println(getName() + " " + getAge());
    }
}