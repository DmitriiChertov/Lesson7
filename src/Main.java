import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        String phone = "+9604157537";
        phone = phone.replace("-", "");
        phone = phone.replace(" ", "");
        phone = phone.replace("+", "");
        if (phone.length() == 10) {
//            phone = '7' + phone;
        } else if (phone.length() > 11) {
            throw new RuntimeException("Телефон слишком длинный");
        } else if (phone.length() < 10) {
            throw new RuntimeException("Телефон слишком короткий");
        } else if (phone.length() == 11 && phone.charAt(0) != '7') {
            throw new RuntimeException("Среди нас посторонний");
        }
        System.out.println("phone = " + phone);
        String expextedPhone = "79604157537";
        if (phone.equals(expextedPhone)) {
            System.out.println("Успех");
        } else {
            System.out.println("Неудача");
        }
        System.out.println();
        String firsrName = "Семён" + " ";
        String middleName = "Семёнович" + " ";
        String lastName = "Иванов" + " ";
        String fullName = firsrName + middleName + lastName;
        String uppFullName = fullName.toUpperCase();
        fullName = fullName.replace("ё", "е");
        {
            System.out.println("Данные ФИО сотрудника - " + fullName);
            System.out.println(uppFullName);
        }
    }
}
