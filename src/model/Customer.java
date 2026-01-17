package Java_Projects.JavaBankEngine.src.model;


public class Customer {
    private String  id ;
    private String  name;

    public Customer(String id , String name){
        this.id=id;
        this.name=name;
    }
    String getId(){
        return id;
    }
    String getName(){
        return name;
    }
//    @Override
//    public String toSting(){
//        return "Customer{id ='" + id + "', name '" + name + '"}";
//    }
}
