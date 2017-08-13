package powtorka;

/**
 * Created by arabk on 12.08.2017.
 */
public class Company {

    public static void main(String[] args) {
        Showable em1 = new Employee("Franek","As",32,Gender.MALE);
        Employee em2 = new Employee("Marek","Nil",30,Gender.MALE);
        Employee em3 = new Employee();
        em3.setName("Asia");
        em3.setSurname("Kor");
        em3.setAge(21);
        em3.setGender(Gender.FEMALE);
        System.out.println(em1.show());
        System.out.println(em2.show());
        System.out.println(em3.show());
    }
}
