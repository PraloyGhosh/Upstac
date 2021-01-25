package org.upgrad.upstac.testrequests;

import lombok.Data;
import org.upgrad.upstac.users.models.Gender;

import javax.validation.constraints.NotNull;

@Data

public class CreateTestRequest {



    private String name;
    private Gender gender;
    private String address;
    private Integer age;

    private String email;

    private String phoneNumber;


    private Integer pinCode;


    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public String getAddress() {
        return address;
    }

    public Integer getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Integer getPinCode() {
        return pinCode;
    }
}
