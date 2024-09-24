package Classes;
import java.util.Map;
import java.util.HashMap;
public enum Priority {
    LOW(1), 
    MID(2), 
    HIGH(3);
     
    private int value;
    private static Map map = new HashMap<>();
    
    private Priority(int value){
        this.value = value;
    }

    static{
        for (Priority prior : Priority.values()) {
            map.put(prior.value, prior);
        }
    }

    public static Priority valueOf(int prior){
        return (Priority) map.get(prior);
    }

    public int getValue(){
        return value;
    }
}