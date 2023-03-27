import java.util.ArrayList;
import java.util.List;

public class Holidays {

    private List<String> holidaysList = new ArrayList<>();
    private HolidaysDates holidaysDates = new HolidaysDates();
    private HolidaysNames holidaysNames = new HolidaysNames();
    private List<String> dates;
    private List<String> names;

    public Holidays() {
        this.dates = holidaysDates.getDates();
        this.names = holidaysNames.getNames();

        for (int i = 0; i < this.dates.size(); i++) {
            this.holidaysList.add(dates.get(i) + " => " + names.get(i));
        }
    }

    public List<String> getHolidaysList() {
        return holidaysList;
    }

    
    public void searchFromHolidayByDate(String date) {
      int index = this.dates.indexOf(date);
       if (index == -1) {
        System.out.println("Não foi possível encontrar um feriado para a data escolhida.");
       } else {
        System.out.println(this.names.get(index));
       } 
    }

}
