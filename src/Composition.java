import java.util.*;
class Campus{
    public String name;
    public String address;
    Campus(String name,String address){
        this.name=name;
        this.address=address;
    }
}
//University has more than one Campus.
class University{
    //reference to refer to list of Campus.
    private final List<Campus>Campuses;

    University(List<Campus> Campuses) {
        this.Campuses = Campuses;
    }
    //getting total number of Campuses
    public List<Campus>get_TotalCollages_in_University(){
        return Campuses;
    }
}
public class Composition {
    public static void main(String[] args) {
        //creating the objects of Campus class.
        Campus c1=new Campus("Trincomalle campus","Trincomalle");
        Campus c2=new Campus("Aesthetics campus","Maruthanarmadam");
        Campus c3=new Campus("Vavuniya campus","Vavuniya");

        //creating list which contains the no.of campuses.
        List<Campus>campuses=new ArrayList<Campus>();
        campuses.add(c1);
        campuses.add(c2);
        campuses.add(c3);
        for(Campus cam:campuses){
            System.out.println("Campus Name:"+cam.name+",Address:"+cam.address);
        }
    }
}
