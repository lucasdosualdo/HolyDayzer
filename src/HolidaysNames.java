import java.util.List;
import java.util.Arrays;

public class HolidaysNames {
    private List<String> names;

    public HolidaysNames() {

        this.names = Arrays.asList(
           "Confraternização mundial",
            "Carnaval",
            "Páscoa",
           "Tiradentes",
           "Dia do trabalho",
           "Corpus Christi",
          "Independência do Brasil",
          "Nossa Senhora Aparecida",
            "Finados",
           "Proclamação da República",
           "Natal"
        );
    }

    public List<String> getNames() {
        return names;
    }
}
