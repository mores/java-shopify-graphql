package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The member of a segment.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class CustomerSegmentMember implements com.shopify.types.HasMetafields {
  /**
   * The total amount of money that the member has spent on orders.
   */
  private MoneyV2 amountSpent;

  /**
   * The member's default address.
   */
  private MailingAddress defaultAddress;

  /**
   * The member's default email address.
   */
  private CustomerEmailAddress defaultEmailAddress;

  /**
   * The member's default phone number.
   */
  private CustomerPhoneNumber defaultPhoneNumber;

  /**
   * The full name of the member, which is based on the values of the `first_name`
   * and `last_name` fields. If the member's first name and last name aren't
   * available, then the customer's email address is used. If the customer's email
   * address isn't available, then the customer's phone number is used.
   */
  private String displayName;

  /**
   * The member's first name.
   */
  private String firstName;

  /**
   * The member’s ID.
   */
  private String id;

  /**
   * The member's last name.
   */
  private String lastName;

  /**
   * The ID of the member's most recent order.
   */
  private String lastOrderId;

  /**
   * Whether the customer can be merged with another customer.
   */
  private CustomerMergeable mergeable;

  /**
   * A [custom field](https://shopify.dev/docs/apps/build/custom-data),
   * including its `namespace` and `key`, that's associated with a Shopify resource
   * for the purposes of adding and storing additional information.
   */
  private Metafield metafield;

  /**
   * A list of [custom fields](https://shopify.dev/docs/apps/build/custom-data)
   * that a merchant associates with a Shopify resource.
   */
  private MetafieldConnection metafields;

  /**
   * A note about the member.
   */
  private String note;

  /**
   * The total number of orders that the member has made.
   */
  private String numberOfOrders;

  /**
   * Returns a private metafield by namespace and key that belongs to the resource.
   */
  private PrivateMetafield privateMetafield;

  /**
   * List of private metafields that belong to the resource.
   */
  private PrivateMetafieldConnection privateMetafields;

  public CustomerSegmentMember() {
  }

  /**
   * The total amount of money that the member has spent on orders.
   */
  public MoneyV2 getAmountSpent() {
    return amountSpent;
  }

  public void setAmountSpent(MoneyV2 amountSpent) {
    this.amountSpent = amountSpent;
  }

  /**
   * The member's default address.
   */
  public MailingAddress getDefaultAddress() {
    return defaultAddress;
  }

  public void setDefaultAddress(MailingAddress defaultAddress) {
    this.defaultAddress = defaultAddress;
  }

  /**
   * The member's default email address.
   */
  public CustomerEmailAddress getDefaultEmailAddress() {
    return defaultEmailAddress;
  }

  public void setDefaultEmailAddress(CustomerEmailAddress defaultEmailAddress) {
    this.defaultEmailAddress = defaultEmailAddress;
  }

  /**
   * The member's default phone number.
   */
  public CustomerPhoneNumber getDefaultPhoneNumber() {
    return defaultPhoneNumber;
  }

  public void setDefaultPhoneNumber(CustomerPhoneNumber defaultPhoneNumber) {
    this.defaultPhoneNumber = defaultPhoneNumber;
  }

  /**
   * The full name of the member, which is based on the values of the `first_name`
   * and `last_name` fields. If the member's first name and last name aren't
   * available, then the customer's email address is used. If the customer's email
   * address isn't available, then the customer's phone number is used.
   */
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  /**
   * The member's first name.
   */
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  /**
   * The member’s ID.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The member's last name.
   */
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  /**
   * The ID of the member's most recent order.
   */
  public String getLastOrderId() {
    return lastOrderId;
  }

  public void setLastOrderId(String lastOrderId) {
    this.lastOrderId = lastOrderId;
  }

  /**
   * Whether the customer can be merged with another customer.
   */
  public CustomerMergeable getMergeable() {
    return mergeable;
  }

  public void setMergeable(CustomerMergeable mergeable) {
    this.mergeable = mergeable;
  }

  /**
   * A [custom field](https://shopify.dev/docs/apps/build/custom-data),
   * including its `namespace` and `key`, that's associated with a Shopify resource
   * for the purposes of adding and storing additional information.
   */
  public Metafield getMetafield() {
    return metafield;
  }

  public void setMetafield(Metafield metafield) {
    this.metafield = metafield;
  }

  /**
   * A list of [custom fields](https://shopify.dev/docs/apps/build/custom-data)
   * that a merchant associates with a Shopify resource.
   */
  public MetafieldConnection getMetafields() {
    return metafields;
  }

  public void setMetafields(MetafieldConnection metafields) {
    this.metafields = metafields;
  }

  /**
   * A note about the member.
   */
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  /**
   * The total number of orders that the member has made.
   */
  public String getNumberOfOrders() {
    return numberOfOrders;
  }

  public void setNumberOfOrders(String numberOfOrders) {
    this.numberOfOrders = numberOfOrders;
  }

  /**
   * Returns a private metafield by namespace and key that belongs to the resource.
   */
  public PrivateMetafield getPrivateMetafield() {
    return privateMetafield;
  }

  public void setPrivateMetafield(PrivateMetafield privateMetafield) {
    this.privateMetafield = privateMetafield;
  }

  /**
   * List of private metafields that belong to the resource.
   */
  public PrivateMetafieldConnection getPrivateMetafields() {
    return privateMetafields;
  }

  public void setPrivateMetafields(PrivateMetafieldConnection privateMetafields) {
    this.privateMetafields = privateMetafields;
  }

  @Override
  public String toString() {
    return "CustomerSegmentMember{amountSpent='" + amountSpent + "', defaultAddress='" + defaultAddress + "', defaultEmailAddress='" + defaultEmailAddress + "', defaultPhoneNumber='" + defaultPhoneNumber + "', displayName='" + displayName + "', firstName='" + firstName + "', id='" + id + "', lastName='" + lastName + "', lastOrderId='" + lastOrderId + "', mergeable='" + mergeable + "', metafield='" + metafield + "', metafields='" + metafields + "', note='" + note + "', numberOfOrders='" + numberOfOrders + "', privateMetafield='" + privateMetafield + "', privateMetafields='" + privateMetafields + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomerSegmentMember that = (CustomerSegmentMember) o;
    return Objects.equals(amountSpent, that.amountSpent) &&
        Objects.equals(defaultAddress, that.defaultAddress) &&
        Objects.equals(defaultEmailAddress, that.defaultEmailAddress) &&
        Objects.equals(defaultPhoneNumber, that.defaultPhoneNumber) &&
        Objects.equals(displayName, that.displayName) &&
        Objects.equals(firstName, that.firstName) &&
        Objects.equals(id, that.id) &&
        Objects.equals(lastName, that.lastName) &&
        Objects.equals(lastOrderId, that.lastOrderId) &&
        Objects.equals(mergeable, that.mergeable) &&
        Objects.equals(metafield, that.metafield) &&
        Objects.equals(metafields, that.metafields) &&
        Objects.equals(note, that.note) &&
        Objects.equals(numberOfOrders, that.numberOfOrders) &&
        Objects.equals(privateMetafield, that.privateMetafield) &&
        Objects.equals(privateMetafields, that.privateMetafields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amountSpent, defaultAddress, defaultEmailAddress, defaultPhoneNumber, displayName, firstName, id, lastName, lastOrderId, mergeable, metafield, metafields, note, numberOfOrders, privateMetafield, privateMetafields);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The total amount of money that the member has spent on orders.
     */
    private MoneyV2 amountSpent;

    /**
     * The member's default address.
     */
    private MailingAddress defaultAddress;

    /**
     * The member's default email address.
     */
    private CustomerEmailAddress defaultEmailAddress;

    /**
     * The member's default phone number.
     */
    private CustomerPhoneNumber defaultPhoneNumber;

    /**
     * The full name of the member, which is based on the values of the `first_name`
     * and `last_name` fields. If the member's first name and last name aren't
     * available, then the customer's email address is used. If the customer's email
     * address isn't available, then the customer's phone number is used.
     */
    private String displayName;

    /**
     * The member's first name.
     */
    private String firstName;

    /**
     * The member’s ID.
     */
    private String id;

    /**
     * The member's last name.
     */
    private String lastName;

    /**
     * The ID of the member's most recent order.
     */
    private String lastOrderId;

    /**
     * Whether the customer can be merged with another customer.
     */
    private CustomerMergeable mergeable;

    /**
     * A [custom field](https://shopify.dev/docs/apps/build/custom-data),
     * including its `namespace` and `key`, that's associated with a Shopify resource
     * for the purposes of adding and storing additional information.
     */
    private Metafield metafield;

    /**
     * A list of [custom fields](https://shopify.dev/docs/apps/build/custom-data)
     * that a merchant associates with a Shopify resource.
     */
    private MetafieldConnection metafields;

    /**
     * A note about the member.
     */
    private String note;

    /**
     * The total number of orders that the member has made.
     */
    private String numberOfOrders;

    /**
     * Returns a private metafield by namespace and key that belongs to the resource.
     */
    private PrivateMetafield privateMetafield;

    /**
     * List of private metafields that belong to the resource.
     */
    private PrivateMetafieldConnection privateMetafields;

    public CustomerSegmentMember build() {
      CustomerSegmentMember result = new CustomerSegmentMember();
      result.amountSpent = this.amountSpent;
      result.defaultAddress = this.defaultAddress;
      result.defaultEmailAddress = this.defaultEmailAddress;
      result.defaultPhoneNumber = this.defaultPhoneNumber;
      result.displayName = this.displayName;
      result.firstName = this.firstName;
      result.id = this.id;
      result.lastName = this.lastName;
      result.lastOrderId = this.lastOrderId;
      result.mergeable = this.mergeable;
      result.metafield = this.metafield;
      result.metafields = this.metafields;
      result.note = this.note;
      result.numberOfOrders = this.numberOfOrders;
      result.privateMetafield = this.privateMetafield;
      result.privateMetafields = this.privateMetafields;
      return result;
    }

    /**
     * The total amount of money that the member has spent on orders.
     */
    public Builder amountSpent(MoneyV2 amountSpent) {
      this.amountSpent = amountSpent;
      return this;
    }

    /**
     * The member's default address.
     */
    public Builder defaultAddress(MailingAddress defaultAddress) {
      this.defaultAddress = defaultAddress;
      return this;
    }

    /**
     * The member's default email address.
     */
    public Builder defaultEmailAddress(CustomerEmailAddress defaultEmailAddress) {
      this.defaultEmailAddress = defaultEmailAddress;
      return this;
    }

    /**
     * The member's default phone number.
     */
    public Builder defaultPhoneNumber(CustomerPhoneNumber defaultPhoneNumber) {
      this.defaultPhoneNumber = defaultPhoneNumber;
      return this;
    }

    /**
     * The full name of the member, which is based on the values of the `first_name`
     * and `last_name` fields. If the member's first name and last name aren't
     * available, then the customer's email address is used. If the customer's email
     * address isn't available, then the customer's phone number is used.
     */
    public Builder displayName(String displayName) {
      this.displayName = displayName;
      return this;
    }

    /**
     * The member's first name.
     */
    public Builder firstName(String firstName) {
      this.firstName = firstName;
      return this;
    }

    /**
     * The member’s ID.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The member's last name.
     */
    public Builder lastName(String lastName) {
      this.lastName = lastName;
      return this;
    }

    /**
     * The ID of the member's most recent order.
     */
    public Builder lastOrderId(String lastOrderId) {
      this.lastOrderId = lastOrderId;
      return this;
    }

    /**
     * Whether the customer can be merged with another customer.
     */
    public Builder mergeable(CustomerMergeable mergeable) {
      this.mergeable = mergeable;
      return this;
    }

    /**
     * A [custom field](https://shopify.dev/docs/apps/build/custom-data),
     * including its `namespace` and `key`, that's associated with a Shopify resource
     * for the purposes of adding and storing additional information.
     */
    public Builder metafield(Metafield metafield) {
      this.metafield = metafield;
      return this;
    }

    /**
     * A list of [custom fields](https://shopify.dev/docs/apps/build/custom-data)
     * that a merchant associates with a Shopify resource.
     */
    public Builder metafields(MetafieldConnection metafields) {
      this.metafields = metafields;
      return this;
    }

    /**
     * A note about the member.
     */
    public Builder note(String note) {
      this.note = note;
      return this;
    }

    /**
     * The total number of orders that the member has made.
     */
    public Builder numberOfOrders(String numberOfOrders) {
      this.numberOfOrders = numberOfOrders;
      return this;
    }

    /**
     * Returns a private metafield by namespace and key that belongs to the resource.
     */
    public Builder privateMetafield(PrivateMetafield privateMetafield) {
      this.privateMetafield = privateMetafield;
      return this;
    }

    /**
     * List of private metafields that belong to the resource.
     */
    public Builder privateMetafields(PrivateMetafieldConnection privateMetafields) {
      this.privateMetafields = privateMetafields;
      return this;
    }
  }
}
