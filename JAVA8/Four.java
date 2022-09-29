import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class Four {

    public static void main(String[] args)
    {
      List<Employe> list=new ArrayList<>();
      list.add(new Employe("Muskan" ,"Lama",3772l,"Dehradun"));
      list.add(new Employe("Sofi" ," Lama",8282l,"Noida"));
      list.add(new Employe("kritika","Lama",100000l,"Delhi"));
        list.add(new Employe("Rita","Negi",10l,"Delhi"));




        //condition
        List<String> r= list.stream().filter(
                e->e.getCity().equalsIgnoreCase("Delhi") && e.getSalary()<5000)
                        .map(e-> e.getFirstName() + " " +e.getLastName()).collect(toList());
        List<String> Distinct = r.stream().distinct().collect(Collectors.toList());

        System.out.println(Distinct);






        System.out.println(Arrays.asList(1,3,32,0,23).
                stream().filter(e->e%2==0).
                collect(toList()));
    }
}
class Employe
{
    private String firstName;
    private String lastName;
   private Long salary;
    private String city;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Employe(String firstName,String lastName, Long salary, String city) {
        this.firstName=firstName;
        this.lastName=lastName;
        this.salary = salary;
        this.city = city;
    }



}