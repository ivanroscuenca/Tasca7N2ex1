package N2ex1;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;

public class JSONSerializer {

    public static void serialize(Object obj) throws IOException {
        // Create an ObjectMapper instance
        ObjectMapper objectMapper = new ObjectMapper();
        // Convert the object to a JSON string
        String json = objectMapper.writeValueAsString(obj);
        //use Path
        @Path
        String directory = Path.pathName;
        //Print to check
        System.out.println(json);

        // Write the JSON string to a file in the specified directory
        File file = new File( directory+ "/" + obj.getClass().getSimpleName() + ".json");
        objectMapper.writeValue(file, obj);
    }

}