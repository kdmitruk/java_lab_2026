import java.util.HashMap;
import java.util.Map;

public class DeathCauseStatistic {
    private final String code;
    private Map<Range, Integer> deaths = new HashMap<>();

    private DeathCauseStatistic(String code) {
        this.code = code;
    }

    public static record AgeBracketDeaths(int begin, int end, int deathCount) {};

    public String getCode() {
        return code;
    }

    public static record Range(int begin, int end){}

    public AgeBracketDeaths getAge(int age) {
        int begin = Math.floorDiv(age,5)*5;
        int end = begin + 4;
        return new AgeBracketDeaths(begin, end, deaths.get(new Range(begin, end)));
    }

    public static DeathCauseStatistic fromCsvLine(String line){
        String[] data = line/*.replace("-", "0")*/.split(",");
        DeathCauseStatistic statistic = new DeathCauseStatistic(data[0].trim());
        int begin = 0;
        int end = 4;
        for(int i=2; i<data.length; i++){
            int number;
            try{number = Integer.parseInt(data[i]);} catch (NumberFormatException e) {
                number = 0;
            }
            statistic.deaths.put(new Range(begin, end), number);
            begin += 5;
            end += 5;
        }
        return statistic;
    }

}
