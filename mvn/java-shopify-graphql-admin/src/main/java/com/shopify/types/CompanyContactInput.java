package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class CompanyContactInput {
  
  private String firstName;

  
  private String lastName;

  
  private String email;

  
  private String title;

  
  private String locale;

  
  private String phone;

  public CompanyContactInput() {
  }

  
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

  
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  
  public String getLocale() {
    return locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
  }

  
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  @Override
  public String toString() {
    return "CompanyContactInput{firstName='" + firstName + "', lastName='" + lastName + "', email='" + email + "', title='" + title + "', locale='" + locale + "', phone='" + phone + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CompanyContactInput that = (CompanyContactInput) o;
    return Objects.equals(firstName, that.firstName) &&
        Objects.equals(lastName, that.lastName) &&
        Objects.equals(email, that.email) &&
        Objects.equals(title, that.title) &&
        Objects.equals(locale, that.locale) &&
        Objects.equals(phone, that.phone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, email, title, locale, phone);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String firstName;

    
    private String lastName;

    
    private String email;

    
    private String title;

    
    private String locale;

    
    private String phone;

    public CompanyContactInput build() {
      CompanyContactInput result = new CompanyContactInput();
      result.firstName = this.firstName;
      result.lastName = this.lastName;
      result.email = this.email;
      result.title = this.title;
      result.locale = this.locale;
      result.phone = this.phone;
      return result;
    }

    
    public Builder firstName(String firstName) {
      this.firstName = firstName;
      return this;
    }

    
    public Builder lastName(String lastName) {
      this.lastName = lastName;
      return this;
    }

    
    public Builder email(String email) {
      this.email = email;
      return this;
    }

    
    public Builder title(String title) {
      this.title = title;
      return this;
    }

    
    public Builder locale(String locale) {
      this.locale = locale;
      return this;
    }

    
    public Builder phone(String phone) {
      this.phone = phone;
      return this;
    }
  }
}
