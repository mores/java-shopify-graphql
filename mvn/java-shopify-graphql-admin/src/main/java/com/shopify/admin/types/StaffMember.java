package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Represents the data about a staff member's Shopify account. Merchants can use
 * staff member data to get more information about the staff members in their store.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class StaffMember implements com.shopify.admin.types.Node {
  /**
   * The type of account the staff member has.
   */
  private AccountType accountType;

  /**
   * Whether the staff member is active.
   */
  private boolean active;

  /**
   * The image used as the staff member's avatar in the Shopify admin.
   */
  private Image avatar;

  /**
   * The staff member's email address.
   */
  private String email;

  /**
   * Whether the staff member's account exists.
   */
  private boolean exists;

  /**
   * The staff member's first name.
   */
  private String firstName;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The staff member's initials, if available.
   */
  private List<String> initials;

  /**
   * Whether the staff member is the shop owner.
   */
  private boolean isShopOwner;

  /**
   * The staff member's last name.
   */
  private String lastName;

  /**
   * The staff member's preferred locale. Locale values use the format `language`
   * or `language-COUNTRY`, where `language` is a two-letter language code, and
   * `COUNTRY` is a two-letter country code. For example: `en` or `en-US`
   */
  private String locale;

  /**
   * The staff member's full name.
   */
  private String name;

  /**
   * The staff member's phone number.
   */
  private String phone;

  /**
   * The data used to customize the Shopify admin experience for the staff member.
   */
  private StaffMemberPrivateData privateData;

  public StaffMember() {
  }

  /**
   * The type of account the staff member has.
   */
  public AccountType getAccountType() {
    return accountType;
  }

  public void setAccountType(AccountType accountType) {
    this.accountType = accountType;
  }

  /**
   * Whether the staff member is active.
   */
  public boolean getActive() {
    return active;
  }

  public void setActive(boolean active) {
    this.active = active;
  }

  /**
   * The image used as the staff member's avatar in the Shopify admin.
   */
  public Image getAvatar() {
    return avatar;
  }

  public void setAvatar(Image avatar) {
    this.avatar = avatar;
  }

  /**
   * The staff member's email address.
   */
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * Whether the staff member's account exists.
   */
  public boolean getExists() {
    return exists;
  }

  public void setExists(boolean exists) {
    this.exists = exists;
  }

  /**
   * The staff member's first name.
   */
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  /**
   * A globally-unique ID.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The staff member's initials, if available.
   */
  public List<String> getInitials() {
    return initials;
  }

  public void setInitials(List<String> initials) {
    this.initials = initials;
  }

  /**
   * Whether the staff member is the shop owner.
   */
  public boolean getIsShopOwner() {
    return isShopOwner;
  }

  public void setIsShopOwner(boolean isShopOwner) {
    this.isShopOwner = isShopOwner;
  }

  /**
   * The staff member's last name.
   */
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  /**
   * The staff member's preferred locale. Locale values use the format `language`
   * or `language-COUNTRY`, where `language` is a two-letter language code, and
   * `COUNTRY` is a two-letter country code. For example: `en` or `en-US`
   */
  public String getLocale() {
    return locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
  }

  /**
   * The staff member's full name.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * The staff member's phone number.
   */
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  /**
   * The data used to customize the Shopify admin experience for the staff member.
   */
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
    /**
     * The type of account the staff member has.
     */
    private AccountType accountType;

    /**
     * Whether the staff member is active.
     */
    private boolean active;

    /**
     * The image used as the staff member's avatar in the Shopify admin.
     */
    private Image avatar;

    /**
     * The staff member's email address.
     */
    private String email;

    /**
     * Whether the staff member's account exists.
     */
    private boolean exists;

    /**
     * The staff member's first name.
     */
    private String firstName;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The staff member's initials, if available.
     */
    private List<String> initials;

    /**
     * Whether the staff member is the shop owner.
     */
    private boolean isShopOwner;

    /**
     * The staff member's last name.
     */
    private String lastName;

    /**
     * The staff member's preferred locale. Locale values use the format `language`
     * or `language-COUNTRY`, where `language` is a two-letter language code, and
     * `COUNTRY` is a two-letter country code. For example: `en` or `en-US`
     */
    private String locale;

    /**
     * The staff member's full name.
     */
    private String name;

    /**
     * The staff member's phone number.
     */
    private String phone;

    /**
     * The data used to customize the Shopify admin experience for the staff member.
     */
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

    /**
     * The type of account the staff member has.
     */
    public Builder accountType(AccountType accountType) {
      this.accountType = accountType;
      return this;
    }

    /**
     * Whether the staff member is active.
     */
    public Builder active(boolean active) {
      this.active = active;
      return this;
    }

    /**
     * The image used as the staff member's avatar in the Shopify admin.
     */
    public Builder avatar(Image avatar) {
      this.avatar = avatar;
      return this;
    }

    /**
     * The staff member's email address.
     */
    public Builder email(String email) {
      this.email = email;
      return this;
    }

    /**
     * Whether the staff member's account exists.
     */
    public Builder exists(boolean exists) {
      this.exists = exists;
      return this;
    }

    /**
     * The staff member's first name.
     */
    public Builder firstName(String firstName) {
      this.firstName = firstName;
      return this;
    }

    /**
     * A globally-unique ID.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The staff member's initials, if available.
     */
    public Builder initials(List<String> initials) {
      this.initials = initials;
      return this;
    }

    /**
     * Whether the staff member is the shop owner.
     */
    public Builder isShopOwner(boolean isShopOwner) {
      this.isShopOwner = isShopOwner;
      return this;
    }

    /**
     * The staff member's last name.
     */
    public Builder lastName(String lastName) {
      this.lastName = lastName;
      return this;
    }

    /**
     * The staff member's preferred locale. Locale values use the format `language`
     * or `language-COUNTRY`, where `language` is a two-letter language code, and
     * `COUNTRY` is a two-letter country code. For example: `en` or `en-US`
     */
    public Builder locale(String locale) {
      this.locale = locale;
      return this;
    }

    /**
     * The staff member's full name.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * The staff member's phone number.
     */
    public Builder phone(String phone) {
      this.phone = phone;
      return this;
    }

    /**
     * The data used to customize the Shopify admin experience for the staff member.
     */
    public Builder privateData(StaffMemberPrivateData privateData) {
      this.privateData = privateData;
      return this;
    }
  }
}
