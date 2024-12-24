package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class CustomerMergePreviewDefaultFields {
  
  private MailingAddressConnection addresses;

  
  private MailingAddress defaultAddress;

  
  private String discountNodeCount;

  
  private DiscountNodeConnection discountNodes;

  
  private String displayName;

  
  private String draftOrderCount;

  
  private DraftOrderConnection draftOrders;

  
  private CustomerEmailAddress email;

  
  private String firstName;

  
  private String giftCardCount;

  
  private GiftCardConnection giftCards;

  
  private String lastName;

  
  private String metafieldCount;

  
  private String note;

  
  private String orderCount;

  
  private OrderConnection orders;

  
  private CustomerPhoneNumber phoneNumber;

  
  private List<String> tags;

  public CustomerMergePreviewDefaultFields() {
  }

  
  public MailingAddressConnection getAddresses() {
    return addresses;
  }

  public void setAddresses(MailingAddressConnection addresses) {
    this.addresses = addresses;
  }

  
  public MailingAddress getDefaultAddress() {
    return defaultAddress;
  }

  public void setDefaultAddress(MailingAddress defaultAddress) {
    this.defaultAddress = defaultAddress;
  }

  
  public String getDiscountNodeCount() {
    return discountNodeCount;
  }

  public void setDiscountNodeCount(String discountNodeCount) {
    this.discountNodeCount = discountNodeCount;
  }

  
  public DiscountNodeConnection getDiscountNodes() {
    return discountNodes;
  }

  public void setDiscountNodes(DiscountNodeConnection discountNodes) {
    this.discountNodes = discountNodes;
  }

  
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  
  public String getDraftOrderCount() {
    return draftOrderCount;
  }

  public void setDraftOrderCount(String draftOrderCount) {
    this.draftOrderCount = draftOrderCount;
  }

  
  public DraftOrderConnection getDraftOrders() {
    return draftOrders;
  }

  public void setDraftOrders(DraftOrderConnection draftOrders) {
    this.draftOrders = draftOrders;
  }

  
  public CustomerEmailAddress getEmail() {
    return email;
  }

  public void setEmail(CustomerEmailAddress email) {
    this.email = email;
  }

  
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  
  public String getGiftCardCount() {
    return giftCardCount;
  }

  public void setGiftCardCount(String giftCardCount) {
    this.giftCardCount = giftCardCount;
  }

  
  public GiftCardConnection getGiftCards() {
    return giftCards;
  }

  public void setGiftCards(GiftCardConnection giftCards) {
    this.giftCards = giftCards;
  }

  
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  
  public String getMetafieldCount() {
    return metafieldCount;
  }

  public void setMetafieldCount(String metafieldCount) {
    this.metafieldCount = metafieldCount;
  }

  
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  
  public String getOrderCount() {
    return orderCount;
  }

  public void setOrderCount(String orderCount) {
    this.orderCount = orderCount;
  }

  
  public OrderConnection getOrders() {
    return orders;
  }

  public void setOrders(OrderConnection orders) {
    this.orders = orders;
  }

  
  public CustomerPhoneNumber getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(CustomerPhoneNumber phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  
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
    
    private MailingAddressConnection addresses;

    
    private MailingAddress defaultAddress;

    
    private String discountNodeCount;

    
    private DiscountNodeConnection discountNodes;

    
    private String displayName;

    
    private String draftOrderCount;

    
    private DraftOrderConnection draftOrders;

    
    private CustomerEmailAddress email;

    
    private String firstName;

    
    private String giftCardCount;

    
    private GiftCardConnection giftCards;

    
    private String lastName;

    
    private String metafieldCount;

    
    private String note;

    
    private String orderCount;

    
    private OrderConnection orders;

    
    private CustomerPhoneNumber phoneNumber;

    
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

    
    public Builder addresses(MailingAddressConnection addresses) {
      this.addresses = addresses;
      return this;
    }

    
    public Builder defaultAddress(MailingAddress defaultAddress) {
      this.defaultAddress = defaultAddress;
      return this;
    }

    
    public Builder discountNodeCount(String discountNodeCount) {
      this.discountNodeCount = discountNodeCount;
      return this;
    }

    
    public Builder discountNodes(DiscountNodeConnection discountNodes) {
      this.discountNodes = discountNodes;
      return this;
    }

    
    public Builder displayName(String displayName) {
      this.displayName = displayName;
      return this;
    }

    
    public Builder draftOrderCount(String draftOrderCount) {
      this.draftOrderCount = draftOrderCount;
      return this;
    }

    
    public Builder draftOrders(DraftOrderConnection draftOrders) {
      this.draftOrders = draftOrders;
      return this;
    }

    
    public Builder email(CustomerEmailAddress email) {
      this.email = email;
      return this;
    }

    
    public Builder firstName(String firstName) {
      this.firstName = firstName;
      return this;
    }

    
    public Builder giftCardCount(String giftCardCount) {
      this.giftCardCount = giftCardCount;
      return this;
    }

    
    public Builder giftCards(GiftCardConnection giftCards) {
      this.giftCards = giftCards;
      return this;
    }

    
    public Builder lastName(String lastName) {
      this.lastName = lastName;
      return this;
    }

    
    public Builder metafieldCount(String metafieldCount) {
      this.metafieldCount = metafieldCount;
      return this;
    }

    
    public Builder note(String note) {
      this.note = note;
      return this;
    }

    
    public Builder orderCount(String orderCount) {
      this.orderCount = orderCount;
      return this;
    }

    
    public Builder orders(OrderConnection orders) {
      this.orders = orders;
      return this;
    }

    
    public Builder phoneNumber(CustomerPhoneNumber phoneNumber) {
      this.phoneNumber = phoneNumber;
      return this;
    }

    
    public Builder tags(List<String> tags) {
      this.tags = tags;
      return this;
    }
  }
}
