package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The fields that will be kept as part of a customer merge preview.
 */
public class CustomerMergePreviewDefaultFields {
  /**
   * The merged addresses resulting from a customer merge.
   */
  private MailingAddressConnection addresses;

  /**
   * The default address resulting from a customer merge.
   */
  private MailingAddress defaultAddress;

  /**
   * The total number of customer-specific discounts resulting from a customer merge.
   */
  private String discountNodeCount;

  /**
   * The merged customer-specific discounts resulting from a customer merge.
   */
  private DiscountNodeConnection discountNodes;

  /**
   * The full name of the customer, based on the values for `first_name` and
   * `last_name`. If `first_name` and `last_name` aren't available, then this field
   * falls back to the customer's email address. If the customer's email isn't
   * available, then this field falls back to the customer's phone number.
   */
  private String displayName;

  /**
   * The total number of merged draft orders.
   */
  private String draftOrderCount;

  /**
   * The merged draft orders resulting from a customer merge.
   */
  private DraftOrderConnection draftOrders;

  /**
   * The email state of a customer.
   */
  private CustomerEmailAddress email;

  /**
   * The first name resulting from a customer merge.
   */
  private String firstName;

  /**
   * The total number of merged gift cards.
   */
  private String giftCardCount;

  /**
   * The merged gift cards resulting from a customer merge.
   */
  private GiftCardConnection giftCards;

  /**
   * The last name resulting from a customer merge.
   */
  private String lastName;

  /**
   * The total number of merged metafields.
   */
  private String metafieldCount;

  /**
   * The merged note resulting from a customer merge.
   */
  private String note;

  /**
   * The total number of merged orders.
   */
  private String orderCount;

  /**
   * The merged orders resulting from a customer merge.
   */
  private OrderConnection orders;

  /**
   * The phone number state of a customer.
   */
  private CustomerPhoneNumber phoneNumber;

  /**
   * The merged tags resulting from a customer merge.
   */
  private List<String> tags;

  public CustomerMergePreviewDefaultFields() {
  }

  /**
   * The merged addresses resulting from a customer merge.
   */
  public MailingAddressConnection getAddresses() {
    return addresses;
  }

  public void setAddresses(MailingAddressConnection addresses) {
    this.addresses = addresses;
  }

  /**
   * The default address resulting from a customer merge.
   */
  public MailingAddress getDefaultAddress() {
    return defaultAddress;
  }

  public void setDefaultAddress(MailingAddress defaultAddress) {
    this.defaultAddress = defaultAddress;
  }

  /**
   * The total number of customer-specific discounts resulting from a customer merge.
   */
  public String getDiscountNodeCount() {
    return discountNodeCount;
  }

  public void setDiscountNodeCount(String discountNodeCount) {
    this.discountNodeCount = discountNodeCount;
  }

  /**
   * The merged customer-specific discounts resulting from a customer merge.
   */
  public DiscountNodeConnection getDiscountNodes() {
    return discountNodes;
  }

  public void setDiscountNodes(DiscountNodeConnection discountNodes) {
    this.discountNodes = discountNodes;
  }

  /**
   * The full name of the customer, based on the values for `first_name` and
   * `last_name`. If `first_name` and `last_name` aren't available, then this field
   * falls back to the customer's email address. If the customer's email isn't
   * available, then this field falls back to the customer's phone number.
   */
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  /**
   * The total number of merged draft orders.
   */
  public String getDraftOrderCount() {
    return draftOrderCount;
  }

  public void setDraftOrderCount(String draftOrderCount) {
    this.draftOrderCount = draftOrderCount;
  }

  /**
   * The merged draft orders resulting from a customer merge.
   */
  public DraftOrderConnection getDraftOrders() {
    return draftOrders;
  }

  public void setDraftOrders(DraftOrderConnection draftOrders) {
    this.draftOrders = draftOrders;
  }

  /**
   * The email state of a customer.
   */
  public CustomerEmailAddress getEmail() {
    return email;
  }

  public void setEmail(CustomerEmailAddress email) {
    this.email = email;
  }

  /**
   * The first name resulting from a customer merge.
   */
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  /**
   * The total number of merged gift cards.
   */
  public String getGiftCardCount() {
    return giftCardCount;
  }

  public void setGiftCardCount(String giftCardCount) {
    this.giftCardCount = giftCardCount;
  }

  /**
   * The merged gift cards resulting from a customer merge.
   */
  public GiftCardConnection getGiftCards() {
    return giftCards;
  }

  public void setGiftCards(GiftCardConnection giftCards) {
    this.giftCards = giftCards;
  }

  /**
   * The last name resulting from a customer merge.
   */
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  /**
   * The total number of merged metafields.
   */
  public String getMetafieldCount() {
    return metafieldCount;
  }

  public void setMetafieldCount(String metafieldCount) {
    this.metafieldCount = metafieldCount;
  }

  /**
   * The merged note resulting from a customer merge.
   */
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  /**
   * The total number of merged orders.
   */
  public String getOrderCount() {
    return orderCount;
  }

  public void setOrderCount(String orderCount) {
    this.orderCount = orderCount;
  }

  /**
   * The merged orders resulting from a customer merge.
   */
  public OrderConnection getOrders() {
    return orders;
  }

  public void setOrders(OrderConnection orders) {
    this.orders = orders;
  }

  /**
   * The phone number state of a customer.
   */
  public CustomerPhoneNumber getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(CustomerPhoneNumber phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  /**
   * The merged tags resulting from a customer merge.
   */
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  @Override
  public String toString() {
    return "CustomerMergePreviewDefaultFields{addresses='" + addresses + "', defaultAddress='" + defaultAddress + "', discountNodeCount='" + discountNodeCount + "', discountNodes='" + discountNodes + "', displayName='" + displayName + "', draftOrderCount='" + draftOrderCount + "', draftOrders='" + draftOrders + "', email='" + email + "', firstName='" + firstName + "', giftCardCount='" + giftCardCount + "', giftCards='" + giftCards + "', lastName='" + lastName + "', metafieldCount='" + metafieldCount + "', note='" + note + "', orderCount='" + orderCount + "', orders='" + orders + "', phoneNumber='" + phoneNumber + "', tags='" + tags + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomerMergePreviewDefaultFields that = (CustomerMergePreviewDefaultFields) o;
    return Objects.equals(addresses, that.addresses) &&
        Objects.equals(defaultAddress, that.defaultAddress) &&
        Objects.equals(discountNodeCount, that.discountNodeCount) &&
        Objects.equals(discountNodes, that.discountNodes) &&
        Objects.equals(displayName, that.displayName) &&
        Objects.equals(draftOrderCount, that.draftOrderCount) &&
        Objects.equals(draftOrders, that.draftOrders) &&
        Objects.equals(email, that.email) &&
        Objects.equals(firstName, that.firstName) &&
        Objects.equals(giftCardCount, that.giftCardCount) &&
        Objects.equals(giftCards, that.giftCards) &&
        Objects.equals(lastName, that.lastName) &&
        Objects.equals(metafieldCount, that.metafieldCount) &&
        Objects.equals(note, that.note) &&
        Objects.equals(orderCount, that.orderCount) &&
        Objects.equals(orders, that.orders) &&
        Objects.equals(phoneNumber, that.phoneNumber) &&
        Objects.equals(tags, that.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addresses, defaultAddress, discountNodeCount, discountNodes, displayName, draftOrderCount, draftOrders, email, firstName, giftCardCount, giftCards, lastName, metafieldCount, note, orderCount, orders, phoneNumber, tags);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The merged addresses resulting from a customer merge.
     */
    private MailingAddressConnection addresses;

    /**
     * The default address resulting from a customer merge.
     */
    private MailingAddress defaultAddress;

    /**
     * The total number of customer-specific discounts resulting from a customer merge.
     */
    private String discountNodeCount;

    /**
     * The merged customer-specific discounts resulting from a customer merge.
     */
    private DiscountNodeConnection discountNodes;

    /**
     * The full name of the customer, based on the values for `first_name` and
     * `last_name`. If `first_name` and `last_name` aren't available, then this field
     * falls back to the customer's email address. If the customer's email isn't
     * available, then this field falls back to the customer's phone number.
     */
    private String displayName;

    /**
     * The total number of merged draft orders.
     */
    private String draftOrderCount;

    /**
     * The merged draft orders resulting from a customer merge.
     */
    private DraftOrderConnection draftOrders;

    /**
     * The email state of a customer.
     */
    private CustomerEmailAddress email;

    /**
     * The first name resulting from a customer merge.
     */
    private String firstName;

    /**
     * The total number of merged gift cards.
     */
    private String giftCardCount;

    /**
     * The merged gift cards resulting from a customer merge.
     */
    private GiftCardConnection giftCards;

    /**
     * The last name resulting from a customer merge.
     */
    private String lastName;

    /**
     * The total number of merged metafields.
     */
    private String metafieldCount;

    /**
     * The merged note resulting from a customer merge.
     */
    private String note;

    /**
     * The total number of merged orders.
     */
    private String orderCount;

    /**
     * The merged orders resulting from a customer merge.
     */
    private OrderConnection orders;

    /**
     * The phone number state of a customer.
     */
    private CustomerPhoneNumber phoneNumber;

    /**
     * The merged tags resulting from a customer merge.
     */
    private List<String> tags;

    public CustomerMergePreviewDefaultFields build() {
      CustomerMergePreviewDefaultFields result = new CustomerMergePreviewDefaultFields();
      result.addresses = this.addresses;
      result.defaultAddress = this.defaultAddress;
      result.discountNodeCount = this.discountNodeCount;
      result.discountNodes = this.discountNodes;
      result.displayName = this.displayName;
      result.draftOrderCount = this.draftOrderCount;
      result.draftOrders = this.draftOrders;
      result.email = this.email;
      result.firstName = this.firstName;
      result.giftCardCount = this.giftCardCount;
      result.giftCards = this.giftCards;
      result.lastName = this.lastName;
      result.metafieldCount = this.metafieldCount;
      result.note = this.note;
      result.orderCount = this.orderCount;
      result.orders = this.orders;
      result.phoneNumber = this.phoneNumber;
      result.tags = this.tags;
      return result;
    }

    /**
     * The merged addresses resulting from a customer merge.
     */
    public Builder addresses(MailingAddressConnection addresses) {
      this.addresses = addresses;
      return this;
    }

    /**
     * The default address resulting from a customer merge.
     */
    public Builder defaultAddress(MailingAddress defaultAddress) {
      this.defaultAddress = defaultAddress;
      return this;
    }

    /**
     * The total number of customer-specific discounts resulting from a customer merge.
     */
    public Builder discountNodeCount(String discountNodeCount) {
      this.discountNodeCount = discountNodeCount;
      return this;
    }

    /**
     * The merged customer-specific discounts resulting from a customer merge.
     */
    public Builder discountNodes(DiscountNodeConnection discountNodes) {
      this.discountNodes = discountNodes;
      return this;
    }

    /**
     * The full name of the customer, based on the values for `first_name` and
     * `last_name`. If `first_name` and `last_name` aren't available, then this field
     * falls back to the customer's email address. If the customer's email isn't
     * available, then this field falls back to the customer's phone number.
     */
    public Builder displayName(String displayName) {
      this.displayName = displayName;
      return this;
    }

    /**
     * The total number of merged draft orders.
     */
    public Builder draftOrderCount(String draftOrderCount) {
      this.draftOrderCount = draftOrderCount;
      return this;
    }

    /**
     * The merged draft orders resulting from a customer merge.
     */
    public Builder draftOrders(DraftOrderConnection draftOrders) {
      this.draftOrders = draftOrders;
      return this;
    }

    /**
     * The email state of a customer.
     */
    public Builder email(CustomerEmailAddress email) {
      this.email = email;
      return this;
    }

    /**
     * The first name resulting from a customer merge.
     */
    public Builder firstName(String firstName) {
      this.firstName = firstName;
      return this;
    }

    /**
     * The total number of merged gift cards.
     */
    public Builder giftCardCount(String giftCardCount) {
      this.giftCardCount = giftCardCount;
      return this;
    }

    /**
     * The merged gift cards resulting from a customer merge.
     */
    public Builder giftCards(GiftCardConnection giftCards) {
      this.giftCards = giftCards;
      return this;
    }

    /**
     * The last name resulting from a customer merge.
     */
    public Builder lastName(String lastName) {
      this.lastName = lastName;
      return this;
    }

    /**
     * The total number of merged metafields.
     */
    public Builder metafieldCount(String metafieldCount) {
      this.metafieldCount = metafieldCount;
      return this;
    }

    /**
     * The merged note resulting from a customer merge.
     */
    public Builder note(String note) {
      this.note = note;
      return this;
    }

    /**
     * The total number of merged orders.
     */
    public Builder orderCount(String orderCount) {
      this.orderCount = orderCount;
      return this;
    }

    /**
     * The merged orders resulting from a customer merge.
     */
    public Builder orders(OrderConnection orders) {
      this.orders = orders;
      return this;
    }

    /**
     * The phone number state of a customer.
     */
    public Builder phoneNumber(CustomerPhoneNumber phoneNumber) {
      this.phoneNumber = phoneNumber;
      return this;
    }

    /**
     * The merged tags resulting from a customer merge.
     */
    public Builder tags(List<String> tags) {
      this.tags = tags;
      return this;
    }
  }
}
