package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Specifies the input fields to update the buyer information associated with a cart.
 * Buyer identity is used to determine
 * [international pricing](https://shopify.dev/custom-storefronts/internationalization/international-pricing)
 * and should match the customer's shipping address.
 */
public class CartBuyerIdentityInput {
  /**
   * The company location of the buyer that is interacting with the cart.
   */
  private String companyLocationId;

  /**
   * The country where the buyer is located.
   */
  private CountryCode countryCode;

  /**
   * The access token used to identify the customer associated with the cart.
   */
  private String customerAccessToken;

  /**
   * The email address of the buyer that is interacting with the cart.
   */
  private String email;

  /**
   * The phone number of the buyer that is interacting with the cart.
   */
  private String phone;

  /**
   * A set of preferences tied to the buyer interacting with the cart. Preferences
   * are used to prefill fields in at checkout to streamline information collection.
   * Preferences are not synced back to the cart if they are overwritten.
   */
  private CartPreferencesInput preferences;

  public CartBuyerIdentityInput() {
  }

  /**
   * The company location of the buyer that is interacting with the cart.
   */
  public String getCompanyLocationId() {
    return companyLocationId;
  }

  public void setCompanyLocationId(String companyLocationId) {
    this.companyLocationId = companyLocationId;
  }

  /**
   * The country where the buyer is located.
   */
  public CountryCode getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(CountryCode countryCode) {
    this.countryCode = countryCode;
  }

  /**
   * The access token used to identify the customer associated with the cart.
   */
  public String getCustomerAccessToken() {
    return customerAccessToken;
  }

  public void setCustomerAccessToken(String customerAccessToken) {
    this.customerAccessToken = customerAccessToken;
  }

  /**
   * The email address of the buyer that is interacting with the cart.
   */
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * The phone number of the buyer that is interacting with the cart.
   */
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  /**
   * A set of preferences tied to the buyer interacting with the cart. Preferences
   * are used to prefill fields in at checkout to streamline information collection.
   * Preferences are not synced back to the cart if they are overwritten.
   */
  public CartPreferencesInput getPreferences() {
    return preferences;
  }

  public void setPreferences(CartPreferencesInput preferences) {
    this.preferences = preferences;
  }

  @Override
  public String toString() {
    return "CartBuyerIdentityInput{companyLocationId='" + companyLocationId + "', countryCode='" + countryCode + "', customerAccessToken='" + customerAccessToken + "', email='" + email + "', phone='" + phone + "', preferences='" + preferences + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CartBuyerIdentityInput that = (CartBuyerIdentityInput) o;
    return Objects.equals(companyLocationId, that.companyLocationId) &&
        Objects.equals(countryCode, that.countryCode) &&
        Objects.equals(customerAccessToken, that.customerAccessToken) &&
        Objects.equals(email, that.email) &&
        Objects.equals(phone, that.phone) &&
        Objects.equals(preferences, that.preferences);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyLocationId, countryCode, customerAccessToken, email, phone, preferences);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The company location of the buyer that is interacting with the cart.
     */
    private String companyLocationId;

    /**
     * The country where the buyer is located.
     */
    private CountryCode countryCode;

    /**
     * The access token used to identify the customer associated with the cart.
     */
    private String customerAccessToken;

    /**
     * The email address of the buyer that is interacting with the cart.
     */
    private String email;

    /**
     * The phone number of the buyer that is interacting with the cart.
     */
    private String phone;

    /**
     * A set of preferences tied to the buyer interacting with the cart. Preferences
     * are used to prefill fields in at checkout to streamline information collection.
     * Preferences are not synced back to the cart if they are overwritten.
     */
    private CartPreferencesInput preferences;

    public CartBuyerIdentityInput build() {
      CartBuyerIdentityInput result = new CartBuyerIdentityInput();
      result.companyLocationId = this.companyLocationId;
      result.countryCode = this.countryCode;
      result.customerAccessToken = this.customerAccessToken;
      result.email = this.email;
      result.phone = this.phone;
      result.preferences = this.preferences;
      return result;
    }

    /**
     * The company location of the buyer that is interacting with the cart.
     */
    public Builder companyLocationId(String companyLocationId) {
      this.companyLocationId = companyLocationId;
      return this;
    }

    /**
     * The country where the buyer is located.
     */
    public Builder countryCode(CountryCode countryCode) {
      this.countryCode = countryCode;
      return this;
    }

    /**
     * The access token used to identify the customer associated with the cart.
     */
    public Builder customerAccessToken(String customerAccessToken) {
      this.customerAccessToken = customerAccessToken;
      return this;
    }

    /**
     * The email address of the buyer that is interacting with the cart.
     */
    public Builder email(String email) {
      this.email = email;
      return this;
    }

    /**
     * The phone number of the buyer that is interacting with the cart.
     */
    public Builder phone(String phone) {
      this.phone = phone;
      return this;
    }

    /**
     * A set of preferences tied to the buyer interacting with the cart. Preferences
     * are used to prefill fields in at checkout to streamline information collection.
     * Preferences are not synced back to the cart if they are overwritten.
     */
    public Builder preferences(CartPreferencesInput preferences) {
      this.preferences = preferences;
      return this;
    }
  }
}
