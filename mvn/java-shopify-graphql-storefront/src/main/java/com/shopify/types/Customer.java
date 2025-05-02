package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;

/**
 * A customer represents a customer account with the shop. Customer accounts store
 * contact information for the customer, saving logged-in customers the trouble of
 * having to provide it at every checkout.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class Customer implements MetafieldParentResource, com.shopify.types.HasMetafields {
  /**
   * Indicates whether the customer has consented to be sent marketing material via email.
   */
  private boolean acceptsMarketing;

  /**
   * A list of addresses for the customer.
   */
  private MailingAddressConnection addresses;

  /**
   * The date and time when the customer was created.
   */
  private OffsetDateTime createdAt;

  /**
   * The customer’s default address.
   */
  private MailingAddress defaultAddress;

  /**
   * The customer’s name, email or phone number.
   */
  private String displayName;

  /**
   * The customer’s email address.
   */
  private String email;

  /**
   * The customer’s first name.
   */
  private String firstName;

  /**
   * A unique ID for the customer.
   */
  private String id;

  /**
   * The customer’s last name.
   */
  private String lastName;

  /**
   * A [custom field](https://shopify.dev/docs/apps/build/custom-data), including
   * its `namespace` and `key`, that's associated with a Shopify resource for the
   * purposes of adding and storing additional information.
   */
  private Metafield metafield;

  /**
   * A list of [custom fields](/docs/apps/build/custom-data) that a merchant associates with a Shopify resource.
   */
  private List<Metafield> metafields;

  /**
   * The number of orders that the customer has made at the store in their lifetime.
   */
  private String numberOfOrders;

  /**
   * The orders associated with the customer.
   */
  private OrderConnection orders;

  /**
   * The customer’s phone number.
   */
  private String phone;

  /**
   * A comma separated list of tags that have been added to the customer.
   * Additional access scope required: unauthenticated_read_customer_tags.
   */
  private List<String> tags;

  /**
   * The date and time when the customer information was updated.
   */
  private OffsetDateTime updatedAt;

  public Customer() {
  }

  /**
   * Indicates whether the customer has consented to be sent marketing material via email.
   */
  public boolean getAcceptsMarketing() {
    return acceptsMarketing;
  }

  public void setAcceptsMarketing(boolean acceptsMarketing) {
    this.acceptsMarketing = acceptsMarketing;
  }

  /**
   * A list of addresses for the customer.
   */
  public MailingAddressConnection getAddresses() {
    return addresses;
  }

  public void setAddresses(MailingAddressConnection addresses) {
    this.addresses = addresses;
  }

  /**
   * The date and time when the customer was created.
   */
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * The customer’s default address.
   */
  public MailingAddress getDefaultAddress() {
    return defaultAddress;
  }

  public void setDefaultAddress(MailingAddress defaultAddress) {
    this.defaultAddress = defaultAddress;
  }

  /**
   * The customer’s name, email or phone number.
   */
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  /**
   * The customer’s email address.
   */
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * The customer’s first name.
   */
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  /**
   * A unique ID for the customer.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The customer’s last name.
   */
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  /**
   * A [custom field](https://shopify.dev/docs/apps/build/custom-data), including
   * its `namespace` and `key`, that's associated with a Shopify resource for the
   * purposes of adding and storing additional information.
   */
  public Metafield getMetafield() {
    return metafield;
  }

  public void setMetafield(Metafield metafield) {
    this.metafield = metafield;
  }

  /**
   * A list of [custom fields](/docs/apps/build/custom-data) that a merchant associates with a Shopify resource.
   */
  public List<Metafield> getMetafields() {
    return metafields;
  }

  public void setMetafields(List<Metafield> metafields) {
    this.metafields = metafields;
  }

  /**
   * The number of orders that the customer has made at the store in their lifetime.
   */
  public String getNumberOfOrders() {
    return numberOfOrders;
  }

  public void setNumberOfOrders(String numberOfOrders) {
    this.numberOfOrders = numberOfOrders;
  }

  /**
   * The orders associated with the customer.
   */
  public OrderConnection getOrders() {
    return orders;
  }

  public void setOrders(OrderConnection orders) {
    this.orders = orders;
  }

  /**
   * The customer’s phone number.
   */
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  /**
   * A comma separated list of tags that have been added to the customer.
   * Additional access scope required: unauthenticated_read_customer_tags.
   */
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  /**
   * The date and time when the customer information was updated.
   */
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  @Override
  public String toString() {
    return "Customer{acceptsMarketing='" + acceptsMarketing + "', addresses='" + addresses + "', createdAt='" + createdAt + "', defaultAddress='" + defaultAddress + "', displayName='" + displayName + "', email='" + email + "', firstName='" + firstName + "', id='" + id + "', lastName='" + lastName + "', metafield='" + metafield + "', metafields='" + metafields + "', numberOfOrders='" + numberOfOrders + "', orders='" + orders + "', phone='" + phone + "', tags='" + tags + "', updatedAt='" + updatedAt + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Customer that = (Customer) o;
    return acceptsMarketing == that.acceptsMarketing &&
        Objects.equals(addresses, that.addresses) &&
        Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(defaultAddress, that.defaultAddress) &&
        Objects.equals(displayName, that.displayName) &&
        Objects.equals(email, that.email) &&
        Objects.equals(firstName, that.firstName) &&
        Objects.equals(id, that.id) &&
        Objects.equals(lastName, that.lastName) &&
        Objects.equals(metafield, that.metafield) &&
        Objects.equals(metafields, that.metafields) &&
        Objects.equals(numberOfOrders, that.numberOfOrders) &&
        Objects.equals(orders, that.orders) &&
        Objects.equals(phone, that.phone) &&
        Objects.equals(tags, that.tags) &&
        Objects.equals(updatedAt, that.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acceptsMarketing, addresses, createdAt, defaultAddress, displayName, email, firstName, id, lastName, metafield, metafields, numberOfOrders, orders, phone, tags, updatedAt);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Indicates whether the customer has consented to be sent marketing material via email.
     */
    private boolean acceptsMarketing;

    /**
     * A list of addresses for the customer.
     */
    private MailingAddressConnection addresses;

    /**
     * The date and time when the customer was created.
     */
    private OffsetDateTime createdAt;

    /**
     * The customer’s default address.
     */
    private MailingAddress defaultAddress;

    /**
     * The customer’s name, email or phone number.
     */
    private String displayName;

    /**
     * The customer’s email address.
     */
    private String email;

    /**
     * The customer’s first name.
     */
    private String firstName;

    /**
     * A unique ID for the customer.
     */
    private String id;

    /**
     * The customer’s last name.
     */
    private String lastName;

    /**
     * A [custom field](https://shopify.dev/docs/apps/build/custom-data), including
     * its `namespace` and `key`, that's associated with a Shopify resource for the
     * purposes of adding and storing additional information.
     */
    private Metafield metafield;

    /**
     * A list of [custom fields](/docs/apps/build/custom-data) that a merchant associates with a Shopify resource.
     */
    private List<Metafield> metafields;

    /**
     * The number of orders that the customer has made at the store in their lifetime.
     */
    private String numberOfOrders;

    /**
     * The orders associated with the customer.
     */
    private OrderConnection orders;

    /**
     * The customer’s phone number.
     */
    private String phone;

    /**
     * A comma separated list of tags that have been added to the customer.
     * Additional access scope required: unauthenticated_read_customer_tags.
     */
    private List<String> tags;

    /**
     * The date and time when the customer information was updated.
     */
    private OffsetDateTime updatedAt;

    public Customer build() {
      Customer result = new Customer();
      result.acceptsMarketing = this.acceptsMarketing;
      result.addresses = this.addresses;
      result.createdAt = this.createdAt;
      result.defaultAddress = this.defaultAddress;
      result.displayName = this.displayName;
      result.email = this.email;
      result.firstName = this.firstName;
      result.id = this.id;
      result.lastName = this.lastName;
      result.metafield = this.metafield;
      result.metafields = this.metafields;
      result.numberOfOrders = this.numberOfOrders;
      result.orders = this.orders;
      result.phone = this.phone;
      result.tags = this.tags;
      result.updatedAt = this.updatedAt;
      return result;
    }

    /**
     * Indicates whether the customer has consented to be sent marketing material via email.
     */
    public Builder acceptsMarketing(boolean acceptsMarketing) {
      this.acceptsMarketing = acceptsMarketing;
      return this;
    }

    /**
     * A list of addresses for the customer.
     */
    public Builder addresses(MailingAddressConnection addresses) {
      this.addresses = addresses;
      return this;
    }

    /**
     * The date and time when the customer was created.
     */
    public Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    /**
     * The customer’s default address.
     */
    public Builder defaultAddress(MailingAddress defaultAddress) {
      this.defaultAddress = defaultAddress;
      return this;
    }

    /**
     * The customer’s name, email or phone number.
     */
    public Builder displayName(String displayName) {
      this.displayName = displayName;
      return this;
    }

    /**
     * The customer’s email address.
     */
    public Builder email(String email) {
      this.email = email;
      return this;
    }

    /**
     * The customer’s first name.
     */
    public Builder firstName(String firstName) {
      this.firstName = firstName;
      return this;
    }

    /**
     * A unique ID for the customer.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The customer’s last name.
     */
    public Builder lastName(String lastName) {
      this.lastName = lastName;
      return this;
    }

    /**
     * A [custom field](https://shopify.dev/docs/apps/build/custom-data), including
     * its `namespace` and `key`, that's associated with a Shopify resource for the
     * purposes of adding and storing additional information.
     */
    public Builder metafield(Metafield metafield) {
      this.metafield = metafield;
      return this;
    }

    /**
     * A list of [custom fields](/docs/apps/build/custom-data) that a merchant associates with a Shopify resource.
     */
    public Builder metafields(List<Metafield> metafields) {
      this.metafields = metafields;
      return this;
    }

    /**
     * The number of orders that the customer has made at the store in their lifetime.
     */
    public Builder numberOfOrders(String numberOfOrders) {
      this.numberOfOrders = numberOfOrders;
      return this;
    }

    /**
     * The orders associated with the customer.
     */
    public Builder orders(OrderConnection orders) {
      this.orders = orders;
      return this;
    }

    /**
     * The customer’s phone number.
     */
    public Builder phone(String phone) {
      this.phone = phone;
      return this;
    }

    /**
     * A comma separated list of tags that have been added to the customer.
     * Additional access scope required: unauthenticated_read_customer_tags.
     */
    public Builder tags(List<String> tags) {
      this.tags = tags;
      return this;
    }

    /**
     * The date and time when the customer information was updated.
     */
    public Builder updatedAt(OffsetDateTime updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }
  }
}
