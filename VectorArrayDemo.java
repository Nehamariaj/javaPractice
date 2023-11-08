import java.util.Vector;
public class VectorArrayDemo {
    public static void main(String[] args){
        Vector<String> mammals=new Vector<>();//to create vector mammals
        
        //using the add()method which adds element to vectors
        mammals.add("Dog");
        mammals.add("Horse");
        //using add(index,element)method to add an element to a specified position
        mammals.add(1,"Cat");
        System.out.println("vector= "+mammals);

        Vector<String> animals=new Vector<>();
        animals.add("crocodile");
        //using addall() which adds all element of a vector to another vector
        animals.addAll(mammals);
        System.out.println("New vector: "+animals);
        
        //using get(index)
        System.out.println("element at index 2: "+animals.get(2));
        //using remove(index)
        String element=animals.remove(0);
        System.out.println("removed element= "+element);
        System.out.println("New vector: "+animals);
        //using clear()-removes all elements
        animals.clear();
        System.out.println("vector after clear(): "+animals);
    }
}
