package Ch19.database;


import java.sql.Timestamp;

@DBTable(name = "TrainSchedule")
public class Exercise01 {
    @SQLString(30) String trainName;
    @SQLInteger Integer size;
    @SQLTimestamp(value = 6)
    Timestamp arrivalTime;
    @SQLString(value = 60,
        constraints = @Constrains(primaryKey = true))
    String trainIndex;
}
