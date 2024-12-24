package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class StaffMember implements com.shopify.types.Node {
  
  private AccountType accountType;

  
  private boolean active;

  
  private Image avatar;

  
  private String email;

  
  private boolean exists;

  
  private String firstName;

  
  private String id;

  
  private List<String> initials;

  
  private boolean isShopOwner;

  
  private String lastName;

  
  private String locale;

  
  private String name;

  
  private String phone;

  
  private StaffMemberPrivateData privateData;

  public StaffMember() {
  }

  
  public AccountType getAccountType() {
    return accountType;
  }

  public void setAccountType(AccountType accountType) {
    this.accountType = accountType;
  }

  
  public boolean getActive() {
    return active;
  }

  public void setActive(boolean active) {
    this.active = active;
  }

  
  public Image getAvatar() {
    return avatar;
  }

  public void setAvatar(Image avatar) {
    this.avatar = avatar;
  }

  
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  
  public boolean getExists() {
    return exists;
  }

  public void setExists(boolean exists) {
    this.exists = exists;
  }

  
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public List<String> getInitials() {
    return initials;
  }

  public void setInitials(List<String> initials) {
    this.initials = initials;
  }

  
  public boolean getIsShopOwner() {
    return isShopOwner;
  }

  public void setIsShopOwner(boolean isShopOwner) {
    this.isShopOwner = isShopOwner;
  }

  
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  
  public String getLocale() {
    return locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
  }

  
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  
  public StaffMemberPrivateData getPrivateData() {
    return privateData;
  }

  public void setPrivateData(StaffMemberPrivateData privateData) {
    this.privateData = privateData;
  }

  @Override
  public String toString() {
    return "StaffMember{accountType='" + accountType + "', active='" + active + "', avatar='" + avatar + "', email='" + email + "', exists='" + exists + "', firstName='" + firstName + "', id='" + id + "', initials='" + initials + "', isShopOwner='" + isShopOwner + "', lastName='" + lastName + "', locale='" + locale + "', name='" + name + "', phone='" + phone + "', privateData='" + privateData + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    StaffMember that = (StaffMember) o;
    return Objects.equals(accountType, that.accountType) &&
        active == that.active &&
        Objects.equals(avatar, that.avatar) &&
        Objects.equals(email, that.email) &&
        exists == that.exists &&
        Objects.equals(firstName, that.firstName) &&
        Objects.equals(id, that.id) &&
        Objects.equals(initials, that.initials) &&
        isShopOwner == that.isShopOwner &&
        Objects.equals(lastName, that.lastName) &&
        Objects.equals(locale, that.locale) &&
        Objects.equals(name, that.name) &&
        Objects.equals(phone, that.phone) &&
        Objects.equals(privateData, that.privateData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountType, active, avatar, email, exists, firstName, id, initials, isShopOwner, lastName, locale, name, phone, privateData);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private AccountType accountType;

    
    private boolean active;

    
    private Image avatar;

    
    private String email;

    
    private boolean exists;

    
    private String firstName;

    
    private String id;

    
    private List<String> initials;

    
    private boolean isShopOwner;

    
    private String lastName;

    
    private String locale;

    
    private String name;

    
    private String phone;

    
    private StaffMemberPrivateData privateData;

    public StaffMember build() {
      StaffMember result = new StaffMember();
      result.accountType = this.accountType;
      result.active = this.active;
      result.avatar = this.avatar;
      result.email = this.email;
      result.exists = this.exists;
      result.firstName = this.firstName;
      result.id = this.id;
      result.initials = this.initials;
      result.isShopOwner = this.isShopOwner;
      result.lastName = this.lastName;
      result.locale = this.locale;
      result.name = this.name;
      result.phone = this.phone;
      result.privateData = this.privateData;
      return result;
    }

    
    public Builder accountType(AccountType accountType) {
      this.accountType = accountType;
      return this;
    }

    
    public Builder active(boolean active) {
      this.active = active;
      return this;
    }

    
    public Builder avatar(Image avatar) {
      this.avatar = avatar;
      return this;
    }

    
    public Builder email(String email) {
      this.email = email;
      return this;
    }

    
    public Builder exists(boolean exists) {
      this.exists = exists;
      return this;
    }

    
    public Builder firstName(String firstName) {
      this.firstName = firstName;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder initials(List<String> initials) {
      this.initials = initials;
      return this;
    }

    
    public Builder isShopOwner(boolean isShopOwner) {
      this.isShopOwner = isShopOwner;
      return this;
    }

    
    public Builder lastName(String lastName) {
      this.lastName = lastName;
      return this;
    }

    
    public Builder locale(String locale) {
      this.locale = locale;
      return this;
    }

    
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    
    public Builder phone(String phone) {
      this.phone = phone;
      return this;
    }

    
    public Builder privateData(StaffMemberPrivateData privateData) {
      this.privateData = privateData;
      return this;
    }
  }
}
