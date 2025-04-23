package storage;

public class JsonFormatter {

    public static String toJson(Object obj){
        return "{ \"type\": \"" + obj.getClass().getSimpleName() + "\", \"value\": \"" + obj.toString() + "\" }";
    }
}
