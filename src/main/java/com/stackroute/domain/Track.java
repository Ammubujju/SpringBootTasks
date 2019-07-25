package com.stackroute.domain;

import io.swagger.annotations.ApiModelProperty;
//import jdk.jfr.DataAmount;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
// Implementing Lombok with required annotations
/*
Internally it generates setters,getters,toString...reduces the hard code for users
@Data,@NoArgsConstructor,@AllArgsConstructor,@Builder
 */
@Entity
@Data
public class Track
{
    // Declaration of fields in table
    @Id
    @Value("${app.id}")
    int id;
    @Value("${app.firstName}")
    String firstName;
    @Value("${app.lastName}")
    String lastName;
    @Value("${app.age}")
    int age;



    public Track()
    {
    }

    public Track(int id, String firstName, String lastName, int age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

