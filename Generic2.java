import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Generic2 {

    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<String>();

        List<String> list2 = new ArrayList<String>();
        // List is an interface, and ArrayList is a class that implements List,
        // so we can use a List reference to point to an ArrayList object.

        Collection<String> list3 = new ArrayList<String >();
        //Collection is the parent of list and list is the parent of Arraylist, so we can
        //give Collection as reference of Arraylist

        //ArrayList<int> list4= new ArrayList<int>(); Error bcoz we can't pass primitive data
        //we can give ref or object ref but can't give primitive data.
        System.out.println("*****************************");

        Gen<Integer> g = new Gen<Integer>(10);
        g.dist();
        g.getObj();
    }
}
// here we are applying generic on ArrayList and List. Now lets apply on our own classes------
class Gen<T>{ // here we have define generic of type T
    T obj; // means T type obj.

    public Gen(T obj)  //constructor, which will accept T type object
    {
        this.obj=obj;
    }
    void dist()
    {
        System.out.println("The type of data is" + obj.getClass().getName());
    }
    //lets generate a getter
    public T getObj()
    {
        return obj;
    }

}

