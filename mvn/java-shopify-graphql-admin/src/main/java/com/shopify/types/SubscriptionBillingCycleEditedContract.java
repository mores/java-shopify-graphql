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
public class SubscriptionBillingCycleEditedContract implements com.shopify.types.SubscriptionContractBase {
  
  private App app;

  
  private String appAdminUrl;

  
  private SubscriptionBillingCycleConnection billingCycles;

  
  private OffsetDateTime createdAt;

  
  private CurrencyCode currencyCode;

  
  private List<Attribute> customAttributes;

  
  private Customer customer;

  
  private CustomerPaymentMethod customerPaymentMethod;

  
  private SubscriptionDeliveryMethod deliveryMethod;

  
  private MoneyV2 deliveryPrice;

  
  private SubscriptionManualDiscountConnection discounts;

  
  private int lineCount;

  
  private SubscriptionLineConnection lines;

  
  private Count linesCount;

  
  private String note;

  
  private OrderConnection orders;

  
  private OffsetDateTime updatedAt;

  public SubscriptionBillingCycleEditedContract() {
  }

  
  public App getApp() {
    return app;
  }

  public void setApp(App app) {
    this.app = app;
  }

  
  public String getAppAdminUrl() {
    return appAdminUrl;
  }

  public void setAppAdminUrl(String appAdminUrl) {
    this.appAdminUrl = appAdminUrl;
  }

  
  public SubscriptionBillingCycleConnection getBillingCycles() {
    return billingCycles;
  }

  public void setBillingCycles(SubscriptionBillingCycleConnection billingCycles) {
    this.billingCycles = billingCycles;
  }

  
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
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

  
  public MoneyV2 getDeliveryPrice() {
    return deliveryPrice;
  }

  public void setDeliveryPrice(MoneyV2 deliveryPrice) {
    this.deliveryPrice = deliveryPrice;
  }

  
  public SubscriptionManualDiscountConnection getDiscounts() {
    return discounts;
  }

  public void setDiscounts(SubscriptionManualDiscountConnection discounts) {
    this.discounts = discounts;
  }

  
  public int getLineCount() {
    return lineCount;
  }

  public void setLineCount(int lineCount) {
    this.lineCount = lineCount;
  }

  
  public SubscriptionLineConnection getLines() {
    return lines;
  }

  public void setLines(SubscriptionLineConnection lines) {
    this.lines = lines;
  }

  
  public Count getLinesCount() {
    return linesCount;
  }

  public void setLinesCount(Count linesCount) {
    this.linesCount = linesCount;
  }

  
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  
  public OrderConnection getOrders() {
    return orders;
  }

  public void setOrders(OrderConnection orders) {
    this.orders = orders;
  }

  
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  @Override
  public String toString() {
    return "SubscriptionBillingCycleEditedContract{app='" + app + "', appAdminUrl='" + appAdminUrl + "', billingCycles='" + billingCycles + "', createdAt='" + createdAt + "', currencyCode='" + currencyCode + "', customAttributes='" + customAttributes + "', customer='" + customer + "', customerPaymentMethod='" + customerPaymentMethod + "', deliveryMethod='" + deliveryMethod + "', deliveryPrice='" + deliveryPrice + "', discounts='" + discounts + "', lineCount='" + lineCount + "', lines='" + lines + "', linesCount='" + linesCount + "', note='" + note + "', orders='" + orders + "', updatedAt='" + updatedAt + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionBillingCycleEditedContract that = (SubscriptionBillingCycleEditedContract) o;
    return Objects.equals(app, that.app) &&
        Objects.equals(appAdminUrl, that.appAdminUrl) &&
        Objects.equals(billingCycles, that.billingCycles) &&
        Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(currencyCode, that.currencyCode) &&
        Objects.equals(customAttributes, that.customAttributes) &&
        Objects.equals(customer, that.customer) &&
        Objects.equals(customerPaymentMethod, that.customerPaymentMethod) &&
        Objects.equals(deliveryMethod, that.deliveryMethod) &&
        Objects.equals(deliveryPrice, that.deliveryPrice) &&
        Objects.equals(discounts, that.discounts) &&
        lineCount == that.lineCount &&
        Objects.equals(lines, that.lines) &&
        Objects.equals(linesCount, that.linesCount) &&
        Objects.equals(note, that.note) &&
        Objects.equals(orders, that.orders) &&
        Objects.equals(updatedAt, that.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(app, appAdminUrl, billingCycles, createdAt, currencyCode, customAttributes, customer, customerPaymentMethod, deliveryMethod, deliveryPrice, discounts, lineCount, lines, linesCount, note, orders, updatedAt);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private App app;

    
    private String appAdminUrl;

    
    private SubscriptionBillingCycleConnection billingCycles;

    
    private OffsetDateTime createdAt;

    
    private CurrencyCode currencyCode;

    
    private List<Attribute> customAttributes;

    
    private Customer customer;

    
    private CustomerPaymentMethod customerPaymentMethod;

    
    private SubscriptionDeliveryMethod deliveryMethod;

    
    private MoneyV2 deliveryPrice;

    
    private SubscriptionManualDiscountConnection discounts;

    
    private int lineCount;

    
    private SubscriptionLineConnection lines;

    
    private Count linesCount;

    
    private String note;

    
    private OrderConnection orders;

    
    private OffsetDateTime updatedAt;

    public SubscriptionBillingCycleEditedContract build() {
      SubscriptionBillingCycleEditedContract result = new SubscriptionBillingCycleEditedContract();
      result.app = this.app;
      result.appAdminUrl = this.appAdminUrl;
      result.billingCycles = this.billingCycles;
      result.createdAt = this.createdAt;
      result.currencyCode = this.currencyCode;
      result.customAttributes = this.customAttributes;
      result.customer = this.customer;
      result.customerPaymentMethod = this.customerPaymentMethod;
      result.deliveryMethod = this.deliveryMethod;
      result.deliveryPrice = this.deliveryPrice;
      result.discounts = this.discounts;
      result.lineCount = this.lineCount;
      result.lines = this.lines;
      result.linesCount = this.linesCount;
      result.note = this.note;
      result.orders = this.orders;
      result.updatedAt = this.updatedAt;
      return result;
    }

    
    public Builder app(App app) {
      this.app = app;
      return this;
    }

    
    public Builder appAdminUrl(String appAdminUrl) {
      this.appAdminUrl = appAdminUrl;
      return this;
    }

    
    public Builder billingCycles(SubscriptionBillingCycleConnection billingCycles) {
      this.billingCycles = billingCycles;
      return this;
    }

    
    public Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
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

    
    public Builder deliveryPrice(MoneyV2 deliveryPrice) {
      this.deliveryPrice = deliveryPrice;
      return this;
    }

    
    public Builder discounts(SubscriptionManualDiscountConnection discounts) {
      this.discounts = discounts;
      return this;
    }

    
    public Builder lineCount(int lineCount) {
      this.lineCount = lineCount;
      return this;
    }

    
    public Builder lines(SubscriptionLineConnection lines) {
      this.lines = lines;
      return this;
    }

    
    public Builder linesCount(Count linesCount) {
      this.linesCount = linesCount;
      return this;
    }

    
    public Builder note(String note) {
      this.note = note;
      return this;
    }

    
    public Builder orders(OrderConnection orders) {
      this.orders = orders;
      return this;
    }

    
    public Builder updatedAt(OffsetDateTime updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }
  }
}
