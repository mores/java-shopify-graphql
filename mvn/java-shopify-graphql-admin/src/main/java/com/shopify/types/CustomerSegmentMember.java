package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class CustomerSegmentMember implements com.shopify.types.HasMetafields {
  
  private MoneyV2 amountSpent;

  
  private MailingAddress defaultAddress;

  
  private CustomerEmailAddress defaultEmailAddress;

  
  private CustomerPhoneNumber defaultPhoneNumber;

  
  private String displayName;

  
  private String firstName;

  
  private String id;

  
  private String lastName;

  
  private String lastOrderId;

  
  private CustomerMergeable mergeable;

  
  private Metafield metafield;

  
  private MetafieldConnection metafields;

  
  private String note;

  
  private String numberOfOrders;

  
  private PrivateMetafield privateMetafield;

  
  private PrivateMetafieldConnection privateMetafields;

  public CustomerSegmentMember() {
  }

  
  public MoneyV2 getAmountSpent() {
    return amountSpent;
  }

  public void setAmountSpent(MoneyV2 amountSpent) {
    this.amountSpent = amountSpent;
  }

  
  public MailingAddress getDefaultAddress() {
    return defaultAddress;
  }

  public void setDefaultAddress(MailingAddress defaultAddress) {
    this.defaultAddress = defaultAddress;
  }

  
  public CustomerEmailAddress getDefaultEmailAddress() {
    return defaultEmailAddress;
  }

  public void setDefaultEmailAddress(CustomerEmailAddress defaultEmailAddress) {
    this.defaultEmailAddress = defaultEmailAddress;
  }

  
  public CustomerPhoneNumber getDefaultPhoneNumber() {
    return defaultPhoneNumber;
  }

  public void setDefaultPhoneNumber(CustomerPhoneNumber defaultPhoneNumber) {
    this.defaultPhoneNumber = defaultPhoneNumber;
  }

  
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
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

  
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  
  public String getLastOrderId() {
    return lastOrderId;
  }

  public void setLastOrderId(String lastOrderId) {
    this.lastOrderId = lastOrderId;
  }

  
  public CustomerMergeable getMergeable() {
    return mergeable;
  }

  public void setMergeable(CustomerMergeable mergeable) {
    this.mergeable = mergeable;
  }

  
  public Metafield getMetafield() {
    return metafield;
  }

  public void setMetafield(Metafield metafield) {
    this.metafield = metafield;
  }

  
  public MetafieldConnection getMetafields() {
    return metafields;
  }

  public void setMetafields(MetafieldConnection metafields) {
    this.metafields = metafields;
  }

  
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  
  public String getNumberOfOrders() {
    return numberOfOrders;
  }

  public void setNumberOfOrders(String numberOfOrders) {
    this.numberOfOrders = numberOfOrders;
  }

  
  public PrivateMetafield getPrivateMetafield() {
    return privateMetafield;
  }

  public void setPrivateMetafield(PrivateMetafield privateMetafield) {
    this.privateMetafield = privateMetafield;
  }

  
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
    
    private MoneyV2 amountSpent;

    
    private MailingAddress defaultAddress;

    
    private CustomerEmailAddress defaultEmailAddress;

    
    private CustomerPhoneNumber defaultPhoneNumber;

    
    private String displayName;

    
    private String firstName;

    
    private String id;

    
    private String lastName;

    
    private String lastOrderId;

    
    private CustomerMergeable mergeable;

    
    private Metafield metafield;

    
    private MetafieldConnection metafields;

    
    private String note;

    
    private String numberOfOrders;

    
    private PrivateMetafield privateMetafield;

    
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

    
    public Builder amountSpent(MoneyV2 amountSpent) {
      this.amountSpent = amountSpent;
      return this;
    }

    
    public Builder defaultAddress(MailingAddress defaultAddress) {
      this.defaultAddress = defaultAddress;
      return this;
    }

    
    public Builder defaultEmailAddress(CustomerEmailAddress defaultEmailAddress) {
      this.defaultEmailAddress = defaultEmailAddress;
      return this;
    }

    
    public Builder defaultPhoneNumber(CustomerPhoneNumber defaultPhoneNumber) {
      this.defaultPhoneNumber = defaultPhoneNumber;
      return this;
    }

    
    public Builder displayName(String displayName) {
      this.displayName = displayName;
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

    
    public Builder lastName(String lastName) {
      this.lastName = lastName;
      return this;
    }

    
    public Builder lastOrderId(String lastOrderId) {
      this.lastOrderId = lastOrderId;
      return this;
    }

    
    public Builder mergeable(CustomerMergeable mergeable) {
      this.mergeable = mergeable;
      return this;
    }

    
    public Builder metafield(Metafield metafield) {
      this.metafield = metafield;
      return this;
    }

    
    public Builder metafields(MetafieldConnection metafields) {
      this.metafields = metafields;
      return this;
    }

    
    public Builder note(String note) {
      this.note = note;
      return this;
    }

    
    public Builder numberOfOrders(String numberOfOrders) {
      this.numberOfOrders = numberOfOrders;
      return this;
    }

    
    public Builder privateMetafield(PrivateMetafield privateMetafield) {
      this.privateMetafield = privateMetafield;
      return this;
    }

    
    public Builder privateMetafields(PrivateMetafieldConnection privateMetafields) {
      this.privateMetafields = privateMetafields;
      return this;
    }
  }
}
