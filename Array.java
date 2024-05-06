public class Array{
     String[] arr=new String[6]; //array and array size decleration

    public static void main(String args[]) {
        String[] arr={"Diya","Harry","Umesh","Manisha","Sristi","Sadikshya",};
        System.out.println(arr.length);//to get the length of array
        for(String i:arr)   //foreach loop syntax:for(datatype variable : arrayname)
        System.out.println(i);
        
    }
}
