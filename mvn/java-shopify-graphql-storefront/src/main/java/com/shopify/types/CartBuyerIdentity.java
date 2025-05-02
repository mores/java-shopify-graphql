package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Represents information about the buyer that is interacting with the cart.
 */
public class CartBuyerIdentity {
  /**
   * The country where the buyer is located.
   */
  private CountryCode countryCode;

  /**
   * The customer account associated with the cart.
   */
  private Customer customer;

  /**
   * An ordered set of delivery addresses tied to the buyer that is interacting with the cart.
   * The rank of the preferences is determined by the order of the addresses in the array. Preferences
   * can be used to populate relevant fields in the checkout flow.
   *   
   * As of the `2025-01` release, `buyerIdentity.deliveryAddressPreferences` is deprecated.
   * Delivery addresses are now part of the `CartDelivery` object and managed with three new mutations:
   * - `cartDeliveryAddressAdd`
   * - `cartDeliveryAddressUpdate`
   * - `cartDeliveryAddressDelete`
   */
  private List<DeliveryAddress> deliveryAddressPreferences;

  /**
   * The email address of the buyer that's interacting with the cart.
   */
  private String email;

  /**
   * The phone number of the buyer that's interacting with the cart.
   */
  private String phone;

  /**
   * A set of preferences tied to the buyer interacting with the cart. Preferences
   * are used to prefill fields in at checkout to streamline information collection.
   * Preferences are not synced back to the cart if they are overwritten.
   */
  private CartPreferences preferences;

  /**
   * The purchasing company associated with the cart.
   */
  private PurchasingCompany purchasingCompany;

  public CartBuyerIdentity() {
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
   * The customer account associated with the cart.
   */
  public Customer getCustomer() {
    return customer;
  }

  public void setCustomer(Customer customer) {
    this.customer = customer;
  }

  /**
   * An ordered set of delivery addresses tied to the buyer that is interacting with the cart.
   * The rank of the preferences is determined by the order of the addresses in the array. Preferences
   * can be used to populate relevant fields in the checkout flow.
   *   
   * As of the `2025-01` release, `buyerIdentity.deliveryAddressPreferences` is deprecated.
   * Delivery addresses are now part of the `CartDelivery` object and managed with three new mutations:
   * - `cartDeliveryAddressAdd`
   * - `cartDeliveryAddressUpdate`
   * - `cartDeliveryAddressDelete`
   */
  public List<DeliveryAddress> getDeliveryAddressPreferences() {
    return deliveryAddressPreferences;
  }

  public void setDeliveryAddressPreferences(List<DeliveryAddress> deliveryAddressPreferences) {
    this.deliveryAddressPreferences = deliveryAddressPreferences;
  }

  /**
   * The email address of the buyer that's interacting with the cart.
   */
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * The phone number of the buyer that's interacting with the cart.
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
  public CartPreferences getPreferences() {
    return preferences;
  }

  public void setPreferences(CartPreferences preferences) {
    this.preferences = preferences;
  }

  /**
   * The purchasing company associated with the cart.
   */
  public PurchasingCompany getPurchasingCompany() {
    return purchasingCompany;
  }

  public void setPurchasingCompany(PurchasingCompany purchasingCompany) {
    this.purchasingCompany = purchasingCompany;
  }

  @Override
  public String toString() {
    return "CartBuyerIdentity{countryCode='" + countryCode + "', customer='" + customer + "', deliveryAddressPreferences='" + deliveryAddressPreferences + "', email='" + email + "', phone='" + phone + "', preferences='" + preferences + "', purchasingCompany='" + purchasingCompany + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CartBuyerIdentity that = (CartBuyerIdentity) o;
    return Objects.equals(countryCode, that.countryCode) &&
        Objects.equals(customer, that.customer) &&
        Objects.equals(deliveryAddressPreferences, that.deliveryAddressPreferences) &&
        Objects.equals(email, that.email) &&
        Objects.equals(phone, that.phone) &&
        Objects.equals(preferences, that.preferences) &&
        Objects.equals(purchasingCompany, that.purchasingCompany);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countryCode, customer, deliveryAddressPreferences, email, phone, preferences, purchasingCompany);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The country where the buyer is located.
     */
    private CountryCode countryCode;

    /**
     * The customer account associated with the cart.
     */
    private Customer customer;

    /**
     * An ordered set of delivery addresses tied to the buyer that is interacting with the cart.
     * The rank of the preferences is determined by the order of the addresses in the array. Preferences
     * can be used to populate relevant fields in the checkout flow.
     *   
     * As of the `2025-01` release, `buyerIdentity.deliveryAddressPreferences` is deprecated.
     * Delivery addresses are now part of the `CartDelivery` object and managed with three new mutations:
     * - `cartDeliveryAddressAdd`
     * - `cartDeliveryAddressUpdate`
     * - `cartDeliveryAddressDelete`
     */
    private List<DeliveryAddress> deliveryAddressPreferences;

    /**
     * The email address of the buyer that's interacting with the cart.
     */
    private String email;

    /**
     * The phone number of the buyer that's interacting with the cart.
     */
    private String phone;

    /**
     * A set of preferences tied to the buyer interacting with the cart. Preferences
     * are used to prefill fields in at checkout to streamline information collection.
     * Preferences are not synced back to the cart if they are overwritten.
     */
    private CartPreferences preferences;

    /**
     * The purchasing company associated with the cart.
     */
    private PurchasingCompany purchasingCompany;

    public CartBuyerIdentity build() {
      CartBuyerIdentity result = new CartBuyerIdentity();
      result.countryCode = this.countryCode;
      result.customer = this.customer;
      result.deliveryAddressPreferences = this.deliveryAddressPreferences;
      result.email = this.email;
      result.phone = this.phone;
      result.preferences = this.preferences;
      result.purchasingCompany = this.purchasingCompany;
      return result;
    }

    /**
     * The country where the buyer is located.
     */
    public Builder countryCode(CountryCode countryCode) {
      this.countryCode = countryCode;
      return this;
    }

    /**
     * The customer account associated with the cart.
     */
    public Builder customer(Customer customer) {
      this.customer = customer;
      return this;
    }

    /**
     * An ordered set of delivery addresses tied to the buyer that is interacting with the cart.
     * The rank of the preferences is determined by the order of the addresses in the array. Preferences
     * can be used to populate relevant fields in the checkout flow.
     *   
     * As of the `2025-01` release, `buyerIdentity.deliveryAddressPreferences` is deprecated.
     * Delivery addresses are now part of the `CartDelivery` object and managed with three new mutations:
     * - `cartDeliveryAddressAdd`
     * - `cartDeliveryAddressUpdate`
     * - `cartDeliveryAddressDelete`
     */
    public Builder deliveryAddressPreferences(List<DeliveryAddress> deliveryAddressPreferences) {
      this.deliveryAddressPreferences = deliveryAddressPreferences;
      return this;
    }

    /**
     * The email address of the buyer that's interacting with the cart.
     */
    public Builder email(String email) {
      this.email = email;
      return this;
    }

    /**
     * The phone number of the buyer that's interacting with the cart.
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
    public Builder preferences(CartPreferences preferences) {
      this.preferences = preferences;
      return this;
    }

    /**
     * The purchasing company associated with the cart.
     */
    public Builder purchasingCompany(PurchasingCompany purchasingCompany) {
      this.purchasingCompany = purchasingCompany;
      return this;
    }
  }
}
