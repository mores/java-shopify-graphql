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
public class SubscriptionContract implements com.shopify.types.Node, com.shopify.types.SubscriptionContractBase {
  
  private App app;

  
  private String appAdminUrl;

  
  private SubscriptionBillingAttemptConnection billingAttempts;

  
  private SubscriptionBillingPolicy billingPolicy;

  
  private OffsetDateTime createdAt;

  
  private CurrencyCode currencyCode;

  
  private List<Attribute> customAttributes;

  
  private Customer customer;

  
  private CustomerPaymentMethod customerPaymentMethod;

  
  private SubscriptionDeliveryMethod deliveryMethod;

  
  private SubscriptionDeliveryPolicy deliveryPolicy;

  
  private MoneyV2 deliveryPrice;

  
  private SubscriptionManualDiscountConnection discounts;

  
  private String id;

  
  private SubscriptionContractLastBillingErrorType lastBillingAttemptErrorType;

  
  private SubscriptionContractLastPaymentStatus lastPaymentStatus;

  
  private int lineCount;

  
  private SubscriptionLineConnection lines;

  
  private Count linesCount;

  
  private OffsetDateTime nextBillingDate;

  
  private String note;

  
  private OrderConnection orders;

  
  private Order originOrder;

  
  private String revisionId;

  
  private SubscriptionContractSubscriptionStatus status;

  
  private OffsetDateTime updatedAt;

  public SubscriptionContract() {
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

  
  public SubscriptionBillingAttemptConnection getBillingAttempts() {
    return billingAttempts;
  }

  public void setBillingAttempts(SubscriptionBillingAttemptConnection billingAttempts) {
    this.billingAttempts = billingAttempts;
  }

  
  public SubscriptionBillingPolicy getBillingPolicy() {
    return billingPolicy;
  }

  public void setBillingPolicy(SubscriptionBillingPolicy billingPolicy) {
    this.billingPolicy = billingPolicy;
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

  
  public SubscriptionManualDiscountConnection getDiscounts() {
    return discounts;
  }

  public void setDiscounts(SubscriptionManualDiscountConnection discounts) {
    this.discounts = discounts;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public SubscriptionContractLastBillingErrorType getLastBillingAttemptErrorType() {
    return lastBillingAttemptErrorType;
  }

  public void setLastBillingAttemptErrorType(
      SubscriptionContractLastBillingErrorType lastBillingAttemptErrorType) {
    this.lastBillingAttemptErrorType = lastBillingAttemptErrorType;
  }

  
  public SubscriptionContractLastPaymentStatus getLastPaymentStatus() {
    return lastPaymentStatus;
  }

  public void setLastPaymentStatus(SubscriptionContractLastPaymentStatus lastPaymentStatus) {
    this.lastPaymentStatus = lastPaymentStatus;
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

  
  public OrderConnection getOrders() {
    return orders;
  }

  public void setOrders(OrderConnection orders) {
    this.orders = orders;
  }

  
  public Order getOriginOrder() {
    return originOrder;
  }

  public void setOriginOrder(Order originOrder) {
    this.originOrder = originOrder;
  }

  
  public String getRevisionId() {
    return revisionId;
  }

  public void setRevisionId(String revisionId) {
    this.revisionId = revisionId;
  }

  
  public SubscriptionContractSubscriptionStatus getStatus() {
    return status;
  }

  public void setStatus(SubscriptionContractSubscriptionStatus status) {
    this.status = status;
  }

  
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  @Override
  public String toString() {
    return "SubscriptionContract{app='" + app + "', appAdminUrl='" + appAdminUrl + "', billingAttempts='" + billingAttempts + "', billingPolicy='" + billingPolicy + "', createdAt='" + createdAt + "', currencyCode='" + currencyCode + "', customAttributes='" + customAttributes + "', customer='" + customer + "', customerPaymentMethod='" + customerPaymentMethod + "', deliveryMethod='" + deliveryMethod + "', deliveryPolicy='" + deliveryPolicy + "', deliveryPrice='" + deliveryPrice + "', discounts='" + discounts + "', id='" + id + "', lastBillingAttemptErrorType='" + lastBillingAttemptErrorType + "', lastPaymentStatus='" + lastPaymentStatus + "', lineCount='" + lineCount + "', lines='" + lines + "', linesCount='" + linesCount + "', nextBillingDate='" + nextBillingDate + "', note='" + note + "', orders='" + orders + "', originOrder='" + originOrder + "', revisionId='" + revisionId + "', status='" + status + "', updatedAt='" + updatedAt + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionContract that = (SubscriptionContract) o;
    return Objects.equals(app, that.app) &&
        Objects.equals(appAdminUrl, that.appAdminUrl) &&
        Objects.equals(billingAttempts, that.billingAttempts) &&
        Objects.equals(billingPolicy, that.billingPolicy) &&
        Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(currencyCode, that.currencyCode) &&
        Objects.equals(customAttributes, that.customAttributes) &&
        Objects.equals(customer, that.customer) &&
        Objects.equals(customerPaymentMethod, that.customerPaymentMethod) &&
        Objects.equals(deliveryMethod, that.deliveryMethod) &&
        Objects.equals(deliveryPolicy, that.deliveryPolicy) &&
        Objects.equals(deliveryPrice, that.deliveryPrice) &&
        Objects.equals(discounts, that.discounts) &&
        Objects.equals(id, that.id) &&
        Objects.equals(lastBillingAttemptErrorType, that.lastBillingAttemptErrorType) &&
        Objects.equals(lastPaymentStatus, that.lastPaymentStatus) &&
        lineCount == that.lineCount &&
        Objects.equals(lines, that.lines) &&
        Objects.equals(linesCount, that.linesCount) &&
        Objects.equals(nextBillingDate, that.nextBillingDate) &&
        Objects.equals(note, that.note) &&
        Objects.equals(orders, that.orders) &&
        Objects.equals(originOrder, that.originOrder) &&
        Objects.equals(revisionId, that.revisionId) &&
        Objects.equals(status, that.status) &&
        Objects.equals(updatedAt, that.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(app, appAdminUrl, billingAttempts, billingPolicy, createdAt, currencyCode, customAttributes, customer, customerPaymentMethod, deliveryMethod, deliveryPolicy, deliveryPrice, discounts, id, lastBillingAttemptErrorType, lastPaymentStatus, lineCount, lines, linesCount, nextBillingDate, note, orders, originOrder, revisionId, status, updatedAt);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private App app;

    
    private String appAdminUrl;

    
    private SubscriptionBillingAttemptConnection billingAttempts;

    
    private SubscriptionBillingPolicy billingPolicy;

    
    private OffsetDateTime createdAt;

    
    private CurrencyCode currencyCode;

    
    private List<Attribute> customAttributes;

    
    private Customer customer;

    
    private CustomerPaymentMethod customerPaymentMethod;

    
    private SubscriptionDeliveryMethod deliveryMethod;

    
    private SubscriptionDeliveryPolicy deliveryPolicy;

    
    private MoneyV2 deliveryPrice;

    
    private SubscriptionManualDiscountConnection discounts;

    
    private String id;

    
    private SubscriptionContractLastBillingErrorType lastBillingAttemptErrorType;

    
    private SubscriptionContractLastPaymentStatus lastPaymentStatus;

    
    private int lineCount;

    
    private SubscriptionLineConnection lines;

    
    private Count linesCount;

    
    private OffsetDateTime nextBillingDate;

    
    private String note;

    
    private OrderConnection orders;

    
    private Order originOrder;

    
    private String revisionId;

    
    private SubscriptionContractSubscriptionStatus status;

    
    private OffsetDateTime updatedAt;

    public SubscriptionContract build() {
      SubscriptionContract result = new SubscriptionContract();
      result.app = this.app;
      result.appAdminUrl = this.appAdminUrl;
      result.billingAttempts = this.billingAttempts;
      result.billingPolicy = this.billingPolicy;
      result.createdAt = this.createdAt;
      result.currencyCode = this.currencyCode;
      result.customAttributes = this.customAttributes;
      result.customer = this.customer;
      result.customerPaymentMethod = this.customerPaymentMethod;
      result.deliveryMethod = this.deliveryMethod;
      result.deliveryPolicy = this.deliveryPolicy;
      result.deliveryPrice = this.deliveryPrice;
      result.discounts = this.discounts;
      result.id = this.id;
      result.lastBillingAttemptErrorType = this.lastBillingAttemptErrorType;
      result.lastPaymentStatus = this.lastPaymentStatus;
      result.lineCount = this.lineCount;
      result.lines = this.lines;
      result.linesCount = this.linesCount;
      result.nextBillingDate = this.nextBillingDate;
      result.note = this.note;
      result.orders = this.orders;
      result.originOrder = this.originOrder;
      result.revisionId = this.revisionId;
      result.status = this.status;
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

    
    public Builder billingAttempts(SubscriptionBillingAttemptConnection billingAttempts) {
      this.billingAttempts = billingAttempts;
      return this;
    }

    
    public Builder billingPolicy(SubscriptionBillingPolicy billingPolicy) {
      this.billingPolicy = billingPolicy;
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

    
    public Builder deliveryPolicy(SubscriptionDeliveryPolicy deliveryPolicy) {
      this.deliveryPolicy = deliveryPolicy;
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

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder lastBillingAttemptErrorType(
        SubscriptionContractLastBillingErrorType lastBillingAttemptErrorType) {
      this.lastBillingAttemptErrorType = lastBillingAttemptErrorType;
      return this;
    }

    
    public Builder lastPaymentStatus(SubscriptionContractLastPaymentStatus lastPaymentStatus) {
      this.lastPaymentStatus = lastPaymentStatus;
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

    
    public Builder nextBillingDate(OffsetDateTime nextBillingDate) {
      this.nextBillingDate = nextBillingDate;
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

    
    public Builder originOrder(Order originOrder) {
      this.originOrder = originOrder;
      return this;
    }

    
    public Builder revisionId(String revisionId) {
      this.revisionId = revisionId;
      return this;
    }

    
    public Builder status(SubscriptionContractSubscriptionStatus status) {
      this.status = status;
      return this;
    }

    
    public Builder updatedAt(OffsetDateTime updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }
  }
}
