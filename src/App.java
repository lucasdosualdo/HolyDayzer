import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

       Holidays holidays = new Holidays();

       List<String> holidaysList = holidays.getHolidaysList();

       System.out.println("Lista com todos os feriados: ");

       for (int i = 0; i < holidaysList.size(); i++) {
        System.out.println(holidaysList.get(i));
       }

       Scanner inputDate = new Scanner(System.in);
       System.out.println("digite a data do feriado:");
       String date = inputDate.nextLine();
       holidays.searchFromHolidayByDate(date);

    }
}   
