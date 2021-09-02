package object_mapping;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class GetPostcodesDes {

    private final ObjectMapper objectMapper = new ObjectMapper();

    public GetPostcodesDTO getPostcodesData(File json_file_location){

        try {
            return objectMapper.readValue(json_file_location, GetPostcodesDTO.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public GetPostcodesDTO getPostcodesData(String json_string){

        try {
            return objectMapper.readValue(json_string, GetPostcodesDTO.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
