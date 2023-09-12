package main;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;
import lombok.Getter;

import java.io.FileNotFoundException;
import java.io.FileReader;

@Getter
public class ProfileClass {

    private String email;
    private String firstName;
    private String lastName;
    private String password;
    private String zipCode;

    public static ProfileClass createProfileFromJson(String path) throws FileNotFoundException {
        Gson builder = new GsonBuilder().create();

        return builder.fromJson(new JsonReader(new FileReader(path)),
                ProfileClass.class);
    }
}
