package main;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;
import lombok.Getter;
import lombok.SneakyThrows;
import java.io.FileReader;

@Getter
public class ProfileClass {

    private String email;
    private String firstName;
    private String lastName;
    private String password;
    private String zipCode;

    @SneakyThrows
    public static ProfileClass createProfileFromJson(String path) {
        Gson builder = new GsonBuilder().create();

        return builder.fromJson(new JsonReader(new FileReader(path)),
                ProfileClass.class);
    }
}
