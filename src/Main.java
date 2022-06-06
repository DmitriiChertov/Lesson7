import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        System.out.println();
        String firsrName = "Семён" + " ";
        String middleName = "Семёнович" + " ";
        String lastName = "Семёнов" + " ";
        String fullName = firsrName + middleName + lastName;
        fullName = fullName.replace("ё", "е");
        String uppFullName = fullName.toUpperCase();
        System.out.println();
        System.out.println("Данные ФИО сотрудника - " + fullName);
        System.out.println(uppFullName);

    }
}
