package jbr.springmvc.shopcart.model;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

public class User implements Serializable {

  private static final long serialVersionUID = 1L;

  @NotEmpty
  @Size(min = 6)
  private String username;

  @NotEmpty
  @Size(min = 8)
  private String password;

  @NotEmpty
  private String firstname;

  private String lastname;

  @DateTimeFormat(pattern = "yyyy-mm-dd")
  @Past
  private Date dob;

  private String gender;

  private String married;

  public String getMarried() {
    return married;
  }

  public void setMarried(String married) {
    this.married = married;
  }

  @NotEmpty
  @Email
  private String email;

  @NotEmpty
  private String city;

  @NotEmpty
  private String country;

  private String languages;

  public String getLanguages() {
    return languages;
  }

  public void setLanguages(String languages) {
    this.languages = languages;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getFirstname() {
    return firstname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  public Date getDob() {
    return dob;
  }

  public void setDob(Date dob) {
    this.dob = dob;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

}
