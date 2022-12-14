package by.smirnov.wizardbot.botapi.handlers.fillingprofile;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserProfileData {
    String name;
    String gender;
    String color;
    String movie;
    String song;
    int age;
    int number;
}
