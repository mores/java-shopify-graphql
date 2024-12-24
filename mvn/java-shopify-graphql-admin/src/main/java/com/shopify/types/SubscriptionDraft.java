package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class SubscriptionDraft implements com.shopify.types.Node {
  
  private SubscriptionBillingCycle billingCycle;

  
  private SubscriptionBillingPolicy billingPolicy;

  
  private SubscriptionBillingCycleConnection concatenatedBillingCycles;

  
  private CurrencyCode currencyCode;

  
  private List<Attribute> customAttributes;

  
  private Customer customer;

  
  private CustomerPaymentMethod customerPaymentMethod;

  
  private SubscriptionDeliveryMethod deliveryMethod;

  
  private SubscriptionDeliveryOptionResult deliveryOptions;

  
  private SubscriptionDeliveryPolicy deliveryPolicy;

  
  private MoneyV2 deliveryPrice;

  
  private SubscriptionDiscountConnection discounts;

  
  private SubscriptionDiscountConnection discountsAdded;

  
  private SubscriptionDiscountConnection discountsRemoved;

  
  private SubscriptionDiscountConnection discountsUpdated;

  
  private String id;

  
  private SubscriptionLineConnection lines;

  
  private SubscriptionLineConnection linesAdded;

  
  private SubscriptionLineConnection linesRemoved;

  
  private OffsetDateTime nextBillingDate;

  
  private String note;

  
  private SubscriptionContract originalContract;

  
  private SubscriptionShippingOptionResult shippingOptions;

  
  private SubscriptionContractSubscriptionStatus status;

  public SubscriptionDraft() {
  }

  
  public SubscriptionBillingCycle getBillingCycle() {
    return billingCycle;
  }

  public void setBillingCycle(SubscriptionBillingCycle billingCycle) {
    this.billingCycle = billingCycle;
  }

  
  public SubscriptionBillingPolicy getBillingPolicy() {
    return billingPolicy;
  }

  public void setBillingPolicy(SubscriptionBillingPolicy billingPolicy) {
    this.billingPolicy = billingPolicy;
  }

  
  public SubscriptionBillingCycleConnection getConcatenatedBillingCycles() {
    return concatenatedBillingCycles;
  }

  public void setConcatenatedBillingCycles(
      SubscriptionBillingCycleConnection concatenatedBillingCycles) {
    this.concatenatedBillingCycles = concatenatedBillingCycles;
  }

  
  public CurrencyCode getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(CurrencyCode currencyCode) {
    this.currencyCode = currencyCode;
  }

  
  public List<Attribute> getCustomAttributes() {
    return customAttributes;
  }

  public void setCustomAttributes(List<Attribute> customAttributes) {
    this.customAttributes = customAttributes;
  }

  
  public Customer getCustomer() {
    return customer;
  }

  public void setCustomer(Customer customer) {
    this.customer = customer;
  }

  
  public CustomerPaymentMethod getCustomerPaymentMethod() {
    return customerPaymentMethod;
  }

  public void setCustomerPaymentMethod(CustomerPaymentMethod customerPaymentMethod) {
    this.customerPaymentMethod = customerPaymentMethod;
  }

  
  public SubscriptionDeliveryMethod getDeliveryMethod() {
    return deliveryMethod;
  }

  public void setDeliveryMethod(SubscriptionDeliveryMethod deliveryMethod) {
    this.deliveryMethod = deliveryMethod;
  }

  
  public SubscriptionDeliveryOptionResult getDeliveryOptions() {
    return deliveryOptions;
  }

  public void setDeliveryOptions(SubscriptionDeliveryOptionResult deliveryOptions) {
    this.deliveryOptions = deliveryOptions;
  }

  
  public SubscriptionDeliveryPolicy getDeliveryPolicy() {
    return deliveryPolicy;
  }

  public void setDeliveryPolicy(SubscriptionDeliveryPolicy deliveryPolicy) {
    this.deliveryPolicy = deliveryPolicy;
  }

  
  public MoneyV2 getDeliveryPrice() {
    return deliveryPrice;
  }

  public void setDeliveryPrice(MoneyV2 deliveryPrice) {
    this.deliveryPrice = deliveryPrice;
  }

  
  public SubscriptionDiscountConnection getDiscounts() {
    return discounts;
  }

  public void setDiscounts(SubscriptionDiscountConnection discounts) {
    this.discounts = discounts;
  }

  
  public SubscriptionDiscountConnection getDiscountsAdded() {
    return discountsAdded;
  }

  public void setDiscountsAdded(SubscriptionDiscountConnection discountsAdded) {
    this.discountsAdded = discountsAdded;
  }

  
  public SubscriptionDiscountConnection getDiscountsRemoved() {
    return discountsRemoved;
  }

  public void setDiscountsRemoved(SubscriptionDiscountConnection discountsRemoved) {
    this.discountsRemoved = discountsRemoved;
  }

  
  public SubscriptionDiscountConnection getDiscountsUpdated() {
    return discountsUpdated;
  }

  public void setDiscountsUpdated(SubscriptionDiscountConnection discountsUpdated) {
    this.discountsUpdated = discountsUpdated;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public SubscriptionLineConnection getLines() {
    return lines;
  }

  public void setLines(SubscriptionLineConnection lines) {
    this.lines = lines;
  }

  
  public SubscriptionLineConnection getLinesAdded() {
    return linesAdded;
  }

  public void setLinesAdded(SubscriptionLineConnection linesAdded) {
    this.linesAdded = linesAdded;
  }

  
  public SubscriptionLineConnection getLinesRemoved() {
    return linesRemoved;
  }

  public void setLinesRemoved(SubscriptionLineConnection linesRemoved) {
    this.linesRemoved = linesRemoved;
  }

  
  public OffsetDateTime getNextBillingDate() {
    return nextBillingDate;
  }

  public void setNextBillingDate(OffsetDateTime nextBillingDate) {
    this.nextBillingDate = nextBillingDate;
  }

  
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  
  public SubscriptionContract getOriginalContract() {
    return originalContract;
  }

  public void setOriginalContract(SubscriptionContract originalContract) {
    this.originalContract = originalContract;
  }

  
  public SubscriptionShippingOptionResult getShippingOptions() {
    return shippingOptions;
  }

  public void setShippingOptions(SubscriptionShippingOptionResult shippingOptions) {
    this.shippingOptions = shippingOptions;
  }

  
  public SubscriptionContractSubscriptionStatus getStatus() {
    return status;
  }

  public void setStatus(SubscriptionContractSubscriptionStatus status) {
    this.status = status;
  }

  @Override
  public String toString() {
    return "SubscriptionDraft{billingCycle='" + billingCycle + "', billingPolicy='" + billingPolicy + "', concatenatedBillingCycles='" + concatenatedBillingCycles + "', currencyCode='" + currencyCode + "', customAttributes='" + customAttributes + "', customer='" + customer + "', customerPaymentMethod='" + customerPaymentMethod + "', deliveryMethod='" + deliveryMethod + "', deliveryOptions='" + deliveryOptions + "', deliveryPolicy='" + deliveryPolicy + "', deliveryPrice='" + deliveryPrice + "', discounts='" + discounts + "', discountsAdded='" + discountsAdded + "', discountsRemoved='" + discountsRemoved + "', discountsUpdated='" + discountsUpdated + "', id='" + id + "', lines='" + lines + "', linesAdded='" + linesAdded + "', linesRemoved='" + linesRemoved + "', nextBillingDate='" + nextBillingDate + "', note='" + note + "', originalContract='" + originalContract + "', shippingOptions='" + shippingOptions + "', status='" + status + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionDraft that = (SubscriptionDraft) o;
    return Objects.equals(billingCycle, that.billingCycle) &&
        Objects.equals(billingPolicy, that.billingPolicy) &&
        Objects.equals(concatenatedBillingCycles, that.concatenatedBillingCycles) &&
        Objects.equals(currencyCode, that.currencyCode) &&
        Objects.equals(customAttributes, that.customAttributes) &&
        Objects.equals(customer, that.customer) &&
        Objects.equals(customerPaymentMethod, that.customerPaymentMethod) &&
        Objects.equals(deliveryMethod, that.deliveryMethod) &&
        Objects.equals(deliveryOptions, that.deliveryOptions) &&
        Objects.equals(deliveryPolicy, that.deliveryPolicy) &&
        Objects.equals(deliveryPrice, that.deliveryPrice) &&
        Objects.equals(discounts, that.discounts) &&
        Objects.equals(discountsAdded, that.discountsAdded) &&
        Objects.equals(discountsRemoved, that.discountsRemoved) &&
        Objects.equals(discountsUpdated, that.discountsUpdated) &&
        Objects.equals(id, that.id) &&
        Objects.equals(lines, that.lines) &&
        Objects.equals(linesAdded, that.linesAdded) &&
        Objects.equals(linesRemoved, that.linesRemoved) &&
        Objects.equals(nextBillingDate, that.nextBillingDate) &&
        Objects.equals(note, that.note) &&
        Objects.equals(originalContract, that.originalContract) &&
        Objects.equals(shippingOptions, that.shippingOptions) &&
        Objects.equals(status, that.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billingCycle, billingPolicy, concatenatedBillingCycles, currencyCode, customAttributes, customer, customerPaymentMethod, deliveryMethod, deliveryOptions, deliveryPolicy, deliveryPrice, discounts, discountsAdded, discountsRemoved, discountsUpdated, id, lines, linesAdded, linesRemoved, nextBillingDate, note, originalContract, shippingOptions, status);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private SubscriptionBillingCycle billingCycle;

    
    private SubscriptionBillingPolicy billingPolicy;

    
    private SubscriptionBillingCycleConnection concatenatedBillingCycles;

    
    private CurrencyCode currencyCode;

    
    private List<Attribute> customAttributes;

    
    private Customer customer;

    
    private CustomerPaymentMethod customerPaymentMethod;

    
    private SubscriptionDeliveryMethod deliveryMethod;

    
    private SubscriptionDeliveryOptionResult deliveryOptions;

    
    private SubscriptionDeliveryPolicy deliveryPolicy;

    
    private MoneyV2 deliveryPrice;

    
    private SubscriptionDiscountConnection discounts;

    
    private SubscriptionDiscountConnection discountsAdded;

    
    private SubscriptionDiscountConnection discountsRemoved;

    
    private SubscriptionDiscountConnection discountsUpdated;

    
    private String id;

    
    private SubscriptionLineConnection lines;

    
    private SubscriptionLineConnection linesAdded;

    
    private SubscriptionLineConnection linesRemoved;

    
    private OffsetDateTime nextBillingDate;

    
    private String note;

    
    private SubscriptionContract originalContract;

    
    private SubscriptionShippingOptionResult shippingOptions;

    
    private SubscriptionContractSubscriptionStatus status;

    public SubscriptionDraft build() {
      SubscriptionDraft result = new SubscriptionDraft();
      result.billingCycle = this.billingCycle;
      result.billingPolicy = this.billingPolicy;
      result.concatenatedBillingCycles = this.concatenatedBillingCycles;
      result.currencyCode = this.currencyCode;
      result.customAttributes = this.customAttributes;
      result.customer = this.customer;
      result.customerPaymentMethod = this.customerPaymentMethod;
      result.deliveryMethod = this.deliveryMethod;
      result.deliveryOptions = this.deliveryOptions;
      result.deliveryPolicy = this.deliveryPolicy;
      result.deliveryPrice = this.deliveryPrice;
      result.discounts = this.discounts;
      result.discountsAdded = this.discountsAdded;
      result.discountsRemoved = this.discountsRemoved;
      result.discountsUpdated = this.discountsUpdated;
      result.id = this.id;
      result.lines = this.lines;
      result.linesAdded = this.linesAdded;
      result.linesRemoved = this.linesRemoved;
      result.nextBillingDate = this.nextBillingDate;
      result.note = this.note;
      result.originalContract = this.originalContract;
      result.shippingOptions = this.shippingOptions;
      result.status = this.status;
      return result;
    }

    
    public Builder billingCycle(SubscriptionBillingCycle billingCycle) {
      this.billingCycle = billingCycle;
      return this;
    }

    
    public Builder billingPolicy(SubscriptionBillingPolicy billingPolicy) {
      this.billingPolicy = billingPolicy;
      return this;
    }

    
    public Builder concatenatedBillingCycles(
        SubscriptionBillingCycleConnection concatenatedBillingCycles) {
      this.concatenatedBillingCycles = concatenatedBillingCycles;
      return this;
    }

    
    public Builder currencyCode(CurrencyCode currencyCode) {
      this.currencyCode = currencyCode;
      return this;
    }

    
    public Builder customAttributes(List<Attribute> customAttributes) {
      this.customAttributes = customAttributes;
      return this;
    }

    
    public Builder customer(Customer customer) {
      this.customer = customer;
      return this;
    }

    
    public Builder customerPaymentMethod(CustomerPaymentMethod customerPaymentMethod) {
      this.customerPaymentMethod = customerPaymentMethod;
      return this;
    }

    
    public Builder deliveryMethod(SubscriptionDeliveryMethod deliveryMethod) {
      this.deliveryMethod = deliveryMethod;
      return this;
    }

    
    public Builder deliveryOptions(SubscriptionDeliveryOptionResult deliveryOptions) {
      this.deliveryOptions = deliveryOptions;
      return this;
    }

    
    public Builder deliveryPolicy(SubscriptionDeliveryPolicy deliveryPolicy) {
      this.deliveryPolicy = deliveryPolicy;
      return this;
    }

    
    public Builder deliveryPrice(MoneyV2 deliveryPrice) {
      this.deliveryPrice = deliveryPrice;
      return this;
    }

    
    public Builder discounts(SubscriptionDiscountConnection discounts) {
      this.discounts = discounts;
      return this;
    }

    
    public Builder discountsAdded(SubscriptionDiscountConnection discountsAdded) {
      this.discountsAdded = discountsAdded;
      return this;
    }

    
    public Builder discountsRemoved(SubscriptionDiscountConnection discountsRemoved) {
      this.discountsRemoved = discountsRemoved;
      return this;
    }

    
    public Builder discountsUpdated(SubscriptionDiscountConnection discountsUpdated) {
      this.discountsUpdated = discountsUpdated;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder lines(SubscriptionLineConnection lines) {
      this.lines = lines;
      return this;
    }

    
    public Builder linesAdded(SubscriptionLineConnection linesAdded) {
      this.linesAdded = linesAdded;
      return this;
    }

    
    public Builder linesRemoved(SubscriptionLineConnection linesRemoved) {
      this.linesRemoved = linesRemoved;
      return this;
    }

    
    public Builder nextBillingDate(OffsetDateTime nextBillingDate) {
      this.nextBillingDate = nextBillingDate;
      return this;
    }

    
    public Builder note(String note) {
      this.note = note;
      return this;
    }

    
    public Builder originalContract(SubscriptionContract originalContract) {
      this.originalContract = originalContract;
      return this;
    }

    
    public Builder shippingOptions(SubscriptionShippingOptionResult shippingOptions) {
      this.shippingOptions = shippingOptions;
      return this;
    }

    
    public Builder status(SubscriptionContractSubscriptionStatus status) {
      this.status = status;
      return this;
    }
  }
}
