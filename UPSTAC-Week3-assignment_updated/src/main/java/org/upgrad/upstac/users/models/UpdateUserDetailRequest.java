package org.upgrad.upstac.users.models;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UpdateUserDetailRequest {

    @ApiModelProperty(example = "MK")
    private String firstName;


    @ApiModelProperty(example = "Gandhi")
    private String lastName;

    @ApiModelProperty(example = "newuser@upgrad.com")
    private String email="";

    @ApiModelProperty(example = "+91956567687")
    private String phoneNumber="";

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
