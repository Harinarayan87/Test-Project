//Constructer
class Cons {
    int id;
    String name;
    Cons(){
     id=5;
     name="Harry";
    }
    void show()
    {
    System.out.println("Id="+id+" "+"Name="+name);
    }
}
class Main{
    public static void main(String args[]){
        Cons main=new Cons();
        main.show();
    }
}
