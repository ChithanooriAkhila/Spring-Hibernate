package com.luv2code.springdemo.mvc;


import com.luv2code.springdemo.mvc.validation.CourseCode;

import javax.validation.constraints.*;

public class Customer {

    private String firstName;

    @NotNull(message="required")
    @Size(min=1,message="required")
    private String lastName;

    @NotNull(message = "required")
    @Min(value=0,message="value should be greater than or equal to 0")
    @Max(value=10,message="value should be less than or equal to 10")
    private Integer freePasses;


    @NotNull(message = "required")
    @Pattern(regexp = "^[a-zA-Z0-9]{6}",message="only 6 chars/digits")
    private String postalCode;

    @CourseCode(value="TOPS" ,message="must start with TOPS")
    private String courseCode;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(Integer freePasses) {
        this.freePasses = freePasses;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
}
