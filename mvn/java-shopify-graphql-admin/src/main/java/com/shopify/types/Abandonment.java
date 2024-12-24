package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Double;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class Abandonment implements com.shopify.types.Node {
  
  private AbandonedCheckout abandonedCheckoutPayload;

  
  private AbandonmentAbandonmentType abandonmentType;

  
  private App app;

  
  private String cartUrl;

  
  private OffsetDateTime createdAt;

  
  private Customer customer;

  
  private boolean customerHasNoDraftOrderSinceAbandonment;

  
  private boolean customerHasNoOrderSinceAbandonment;

  
  private int daysSinceLastAbandonmentEmail;

  
  private OffsetDateTime emailSentAt;

  
  private AbandonmentEmailState emailState;

  
  private Double hoursSinceLastAbandonedCheckout;

  
  private String id;

  
  private boolean inventoryAvailable;

  
  private boolean isFromCustomStorefront;

  
  private boolean isFromOnlineStore;

  
  private boolean isFromShopApp;

  
  private boolean isFromShopPay;

  
  private boolean isMostSignificantAbandonment;

  
  private OffsetDateTime lastBrowseAbandonmentDate;

  
  private OffsetDateTime lastCartAbandonmentDate;

  
  private OffsetDateTime lastCheckoutAbandonmentDate;

  
  private AbandonmentAbandonmentType mostRecentStep;

  
  private CustomerVisitProductInfoConnection productsAddedToCart;

  
  private CustomerVisitProductInfoConnection productsViewed;

  
  private OffsetDateTime visitStartedAt;

  public Abandonment() {
  }

  
  public AbandonedCheckout getAbandonedCheckoutPayload() {
    return abandonedCheckoutPayload;
  }

  public void setAbandonedCheckoutPayload(AbandonedCheckout abandonedCheckoutPayload) {
    this.abandonedCheckoutPayload = abandonedCheckoutPayload;
  }

  
  public AbandonmentAbandonmentType getAbandonmentType() {
    return abandonmentType;
  }

  public void setAbandonmentType(AbandonmentAbandonmentType abandonmentType) {
    this.abandonmentType = abandonmentType;
  }

  
  public App getApp() {
    return app;
  }

  public void setApp(App app) {
    this.app = app;
  }

  
  public String getCartUrl() {
    return cartUrl;
  }

  public void setCartUrl(String cartUrl) {
    this.cartUrl = cartUrl;
  }

  
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  
  public Customer getCustomer() {
    return customer;
  }

  public void setCustomer(Customer customer) {
    this.customer = customer;
  }

  
  public boolean getCustomerHasNoDraftOrderSinceAbandonment() {
    return customerHasNoDraftOrderSinceAbandonment;
  }

  public void setCustomerHasNoDraftOrderSinceAbandonment(
      boolean customerHasNoDraftOrderSinceAbandonment) {
    this.customerHasNoDraftOrderSinceAbandonment = customerHasNoDraftOrderSinceAbandonment;
  }

  
  public boolean getCustomerHasNoOrderSinceAbandonment() {
    return customerHasNoOrderSinceAbandonment;
  }

  public void setCustomerHasNoOrderSinceAbandonment(boolean customerHasNoOrderSinceAbandonment) {
    this.customerHasNoOrderSinceAbandonment = customerHasNoOrderSinceAbandonment;
  }

  
  public int getDaysSinceLastAbandonmentEmail() {
    return daysSinceLastAbandonmentEmail;
  }

  public void setDaysSinceLastAbandonmentEmail(int daysSinceLastAbandonmentEmail) {
    this.daysSinceLastAbandonmentEmail = daysSinceLastAbandonmentEmail;
  }

  
  public OffsetDateTime getEmailSentAt() {
    return emailSentAt;
  }

  public void setEmailSentAt(OffsetDateTime emailSentAt) {
    this.emailSentAt = emailSentAt;
  }

  
  public AbandonmentEmailState getEmailState() {
    return emailState;
  }

  public void setEmailState(AbandonmentEmailState emailState) {
    this.emailState = emailState;
  }

  
  public Double getHoursSinceLastAbandonedCheckout() {
    return hoursSinceLastAbandonedCheckout;
  }

  public void setHoursSinceLastAbandonedCheckout(Double hoursSinceLastAbandonedCheckout) {
    this.hoursSinceLastAbandonedCheckout = hoursSinceLastAbandonedCheckout;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public boolean getInventoryAvailable() {
    return inventoryAvailable;
  }

  public void setInventoryAvailable(boolean inventoryAvailable) {
    this.inventoryAvailable = inventoryAvailable;
  }

  
  public boolean getIsFromCustomStorefront() {
    return isFromCustomStorefront;
  }

  public void setIsFromCustomStorefront(boolean isFromCustomStorefront) {
    this.isFromCustomStorefront = isFromCustomStorefront;
  }

  
  public boolean getIsFromOnlineStore() {
    return isFromOnlineStore;
  }

  public void setIsFromOnlineStore(boolean isFromOnlineStore) {
    this.isFromOnlineStore = isFromOnlineStore;
  }

  
  public boolean getIsFromShopApp() {
    return isFromShopApp;
  }

  public void setIsFromShopApp(boolean isFromShopApp) {
    this.isFromShopApp = isFromShopApp;
  }

  
  public boolean getIsFromShopPay() {
    return isFromShopPay;
  }

  public void setIsFromShopPay(boolean isFromShopPay) {
    this.isFromShopPay = isFromShopPay;
  }

  
  public boolean getIsMostSignificantAbandonment() {
    return isMostSignificantAbandonment;
  }

  public void setIsMostSignificantAbandonment(boolean isMostSignificantAbandonment) {
    this.isMostSignificantAbandonment = isMostSignificantAbandonment;
  }

  
  public OffsetDateTime getLastBrowseAbandonmentDate() {
    return lastBrowseAbandonmentDate;
  }

  public void setLastBrowseAbandonmentDate(OffsetDateTime lastBrowseAbandonmentDate) {
    this.lastBrowseAbandonmentDate = lastBrowseAbandonmentDate;
  }

  
  public OffsetDateTime getLastCartAbandonmentDate() {
    return lastCartAbandonmentDate;
  }

  public void setLastCartAbandonmentDate(OffsetDateTime lastCartAbandonmentDate) {
    this.lastCartAbandonmentDate = lastCartAbandonmentDate;
  }

  
  public OffsetDateTime getLastCheckoutAbandonmentDate() {
    return lastCheckoutAbandonmentDate;
  }

  public void setLastCheckoutAbandonmentDate(OffsetDateTime lastCheckoutAbandonmentDate) {
    this.lastCheckoutAbandonmentDate = lastCheckoutAbandonmentDate;
  }

  
  public AbandonmentAbandonmentType getMostRecentStep() {
    return mostRecentStep;
  }

  public void setMostRecentStep(AbandonmentAbandonmentType mostRecentStep) {
    this.mostRecentStep = mostRecentStep;
  }

  
  public CustomerVisitProductInfoConnection getProductsAddedToCart() {
    return productsAddedToCart;
  }

  public void setProductsAddedToCart(CustomerVisitProductInfoConnection productsAddedToCart) {
    this.productsAddedToCart = productsAddedToCart;
  }

  
  public CustomerVisitProductInfoConnection getProductsViewed() {
    return productsViewed;
  }

  public void setProductsViewed(CustomerVisitProductInfoConnection productsViewed) {
    this.productsViewed = productsViewed;
  }

  
  public OffsetDateTime getVisitStartedAt() {
    return visitStartedAt;
  }

  public void setVisitStartedAt(OffsetDateTime visitStartedAt) {
    this.visitStartedAt = visitStartedAt;
  }

  @Override
  public String toString() {
    return "Abandonment{abandonedCheckoutPayload='" + abandonedCheckoutPayload + "', abandonmentType='" + abandonmentType + "', app='" + app + "', cartUrl='" + cartUrl + "', createdAt='" + createdAt + "', customer='" + customer + "', customerHasNoDraftOrderSinceAbandonment='" + customerHasNoDraftOrderSinceAbandonment + "', customerHasNoOrderSinceAbandonment='" + customerHasNoOrderSinceAbandonment + "', daysSinceLastAbandonmentEmail='" + daysSinceLastAbandonmentEmail + "', emailSentAt='" + emailSentAt + "', emailState='" + emailState + "', hoursSinceLastAbandonedCheckout='" + hoursSinceLastAbandonedCheckout + "', id='" + id + "', inventoryAvailable='" + inventoryAvailable + "', isFromCustomStorefront='" + isFromCustomStorefront + "', isFromOnlineStore='" + isFromOnlineStore + "', isFromShopApp='" + isFromShopApp + "', isFromShopPay='" + isFromShopPay + "', isMostSignificantAbandonment='" + isMostSignificantAbandonment + "', lastBrowseAbandonmentDate='" + lastBrowseAbandonmentDate + "', lastCartAbandonmentDate='" + lastCartAbandonmentDate + "', lastCheckoutAbandonmentDate='" + lastCheckoutAbandonmentDate + "', mostRecentStep='" + mostRecentStep + "', productsAddedToCart='" + productsAddedToCart + "', productsViewed='" + productsViewed + "', visitStartedAt='" + visitStartedAt + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Abandonment that = (Abandonment) o;
    return Objects.equals(abandonedCheckoutPayload, that.abandonedCheckoutPayload) &&
        Objects.equals(abandonmentType, that.abandonmentType) &&
        Objects.equals(app, that.app) &&
        Objects.equals(cartUrl, that.cartUrl) &&
        Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(customer, that.customer) &&
        customerHasNoDraftOrderSinceAbandonment == that.customerHasNoDraftOrderSinceAbandonment &&
        customerHasNoOrderSinceAbandonment == that.customerHasNoOrderSinceAbandonment &&
        daysSinceLastAbandonmentEmail == that.daysSinceLastAbandonmentEmail &&
        Objects.equals(emailSentAt, that.emailSentAt) &&
        Objects.equals(emailState, that.emailState) &&
        Objects.equals(hoursSinceLastAbandonedCheckout, that.hoursSinceLastAbandonedCheckout) &&
        Objects.equals(id, that.id) &&
        inventoryAvailable == that.inventoryAvailable &&
        isFromCustomStorefront == that.isFromCustomStorefront &&
        isFromOnlineStore == that.isFromOnlineStore &&
        isFromShopApp == that.isFromShopApp &&
        isFromShopPay == that.isFromShopPay &&
        isMostSignificantAbandonment == that.isMostSignificantAbandonment &&
        Objects.equals(lastBrowseAbandonmentDate, that.lastBrowseAbandonmentDate) &&
        Objects.equals(lastCartAbandonmentDate, that.lastCartAbandonmentDate) &&
        Objects.equals(lastCheckoutAbandonmentDate, that.lastCheckoutAbandonmentDate) &&
        Objects.equals(mostRecentStep, that.mostRecentStep) &&
        Objects.equals(productsAddedToCart, that.productsAddedToCart) &&
        Objects.equals(productsViewed, that.productsViewed) &&
        Objects.equals(visitStartedAt, that.visitStartedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(abandonedCheckoutPayload, abandonmentType, app, cartUrl, createdAt, customer, customerHasNoDraftOrderSinceAbandonment, customerHasNoOrderSinceAbandonment, daysSinceLastAbandonmentEmail, emailSentAt, emailState, hoursSinceLastAbandonedCheckout, id, inventoryAvailable, isFromCustomStorefront, isFromOnlineStore, isFromShopApp, isFromShopPay, isMostSignificantAbandonment, lastBrowseAbandonmentDate, lastCartAbandonmentDate, lastCheckoutAbandonmentDate, mostRecentStep, productsAddedToCart, productsViewed, visitStartedAt);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private AbandonedCheckout abandonedCheckoutPayload;

    
    private AbandonmentAbandonmentType abandonmentType;

    
    private App app;

    
    private String cartUrl;

    
    private OffsetDateTime createdAt;

    
    private Customer customer;

    
    private boolean customerHasNoDraftOrderSinceAbandonment;

    
    private boolean customerHasNoOrderSinceAbandonment;

    
    private int daysSinceLastAbandonmentEmail;

    
    private OffsetDateTime emailSentAt;

    
    private AbandonmentEmailState emailState;

    
    private Double hoursSinceLastAbandonedCheckout;

    
    private String id;

    
    private boolean inventoryAvailable;

    
    private boolean isFromCustomStorefront;

    
    private boolean isFromOnlineStore;

    
    private boolean isFromShopApp;

    
    private boolean isFromShopPay;

    
    private boolean isMostSignificantAbandonment;

    
    private OffsetDateTime lastBrowseAbandonmentDate;

    
    private OffsetDateTime lastCartAbandonmentDate;

    
    private OffsetDateTime lastCheckoutAbandonmentDate;

    
    private AbandonmentAbandonmentType mostRecentStep;

    
    private CustomerVisitProductInfoConnection productsAddedToCart;

    
    private CustomerVisitProductInfoConnection productsViewed;

    
    private OffsetDateTime visitStartedAt;

    public Abandonment build() {
      Abandonment result = new Abandonment();
      result.abandonedCheckoutPayload = this.abandonedCheckoutPayload;
      result.abandonmentType = this.abandonmentType;
      result.app = this.app;
      result.cartUrl = this.cartUrl;
      result.createdAt = this.createdAt;
      result.customer = this.customer;
      result.customerHasNoDraftOrderSinceAbandonment = this.customerHasNoDraftOrderSinceAbandonment;
      result.customerHasNoOrderSinceAbandonment = this.customerHasNoOrderSinceAbandonment;
      result.daysSinceLastAbandonmentEmail = this.daysSinceLastAbandonmentEmail;
      result.emailSentAt = this.emailSentAt;
      result.emailState = this.emailState;
      result.hoursSinceLastAbandonedCheckout = this.hoursSinceLastAbandonedCheckout;
      result.id = this.id;
      result.inventoryAvailable = this.inventoryAvailable;
      result.isFromCustomStorefront = this.isFromCustomStorefront;
      result.isFromOnlineStore = this.isFromOnlineStore;
      result.isFromShopApp = this.isFromShopApp;
      result.isFromShopPay = this.isFromShopPay;
      result.isMostSignificantAbandonment = this.isMostSignificantAbandonment;
      result.lastBrowseAbandonmentDate = this.lastBrowseAbandonmentDate;
      result.lastCartAbandonmentDate = this.lastCartAbandonmentDate;
      result.lastCheckoutAbandonmentDate = this.lastCheckoutAbandonmentDate;
      result.mostRecentStep = this.mostRecentStep;
      result.productsAddedToCart = this.productsAddedToCart;
      result.productsViewed = this.productsViewed;
      result.visitStartedAt = this.visitStartedAt;
      return result;
    }

    
    public Builder abandonedCheckoutPayload(AbandonedCheckout abandonedCheckoutPayload) {
      this.abandonedCheckoutPayload = abandonedCheckoutPayload;
      return this;
    }

    
    public Builder abandonmentType(AbandonmentAbandonmentType abandonmentType) {
      this.abandonmentType = abandonmentType;
      return this;
    }

    
    public Builder app(App app) {
      this.app = app;
      return this;
    }

    
    public Builder cartUrl(String cartUrl) {
      this.cartUrl = cartUrl;
      return this;
    }

    
    public Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    
    public Builder customer(Customer customer) {
      this.customer = customer;
      return this;
    }

    
    public Builder customerHasNoDraftOrderSinceAbandonment(
        boolean customerHasNoDraftOrderSinceAbandonment) {
      this.customerHasNoDraftOrderSinceAbandonment = customerHasNoDraftOrderSinceAbandonment;
      return this;
    }

    
    public Builder customerHasNoOrderSinceAbandonment(boolean customerHasNoOrderSinceAbandonment) {
      this.customerHasNoOrderSinceAbandonment = customerHasNoOrderSinceAbandonment;
      return this;
    }

    
    public Builder daysSinceLastAbandonmentEmail(int daysSinceLastAbandonmentEmail) {
      this.daysSinceLastAbandonmentEmail = daysSinceLastAbandonmentEmail;
      return this;
    }

    
    public Builder emailSentAt(OffsetDateTime emailSentAt) {
      this.emailSentAt = emailSentAt;
      return this;
    }

    
    public Builder emailState(AbandonmentEmailState emailState) {
      this.emailState = emailState;
      return this;
    }

    
    public Builder hoursSinceLastAbandonedCheckout(Double hoursSinceLastAbandonedCheckout) {
      this.hoursSinceLastAbandonedCheckout = hoursSinceLastAbandonedCheckout;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder inventoryAvailable(boolean inventoryAvailable) {
      this.inventoryAvailable = inventoryAvailable;
      return this;
    }

    
    public Builder isFromCustomStorefront(boolean isFromCustomStorefront) {
      this.isFromCustomStorefront = isFromCustomStorefront;
      return this;
    }

    
    public Builder isFromOnlineStore(boolean isFromOnlineStore) {
      this.isFromOnlineStore = isFromOnlineStore;
      return this;
    }

    
    public Builder isFromShopApp(boolean isFromShopApp) {
      this.isFromShopApp = isFromShopApp;
      return this;
    }

    
    public Builder isFromShopPay(boolean isFromShopPay) {
      this.isFromShopPay = isFromShopPay;
      return this;
    }

    
    public Builder isMostSignificantAbandonment(boolean isMostSignificantAbandonment) {
      this.isMostSignificantAbandonment = isMostSignificantAbandonment;
      return this;
    }

    
    public Builder lastBrowseAbandonmentDate(OffsetDateTime lastBrowseAbandonmentDate) {
      this.lastBrowseAbandonmentDate = lastBrowseAbandonmentDate;
      return this;
    }

    
    public Builder lastCartAbandonmentDate(OffsetDateTime lastCartAbandonmentDate) {
      this.lastCartAbandonmentDate = lastCartAbandonmentDate;
      return this;
    }

    
    public Builder lastCheckoutAbandonmentDate(OffsetDateTime lastCheckoutAbandonmentDate) {
      this.lastCheckoutAbandonmentDate = lastCheckoutAbandonmentDate;
      return this;
    }

    
    public Builder mostRecentStep(AbandonmentAbandonmentType mostRecentStep) {
      this.mostRecentStep = mostRecentStep;
      return this;
    }

    
    public Builder productsAddedToCart(CustomerVisitProductInfoConnection productsAddedToCart) {
      this.productsAddedToCart = productsAddedToCart;
      return this;
    }

    
    public Builder productsViewed(CustomerVisitProductInfoConnection productsViewed) {
      this.productsViewed = productsViewed;
      return this;
    }

    
    public Builder visitStartedAt(OffsetDateTime visitStartedAt) {
      this.visitStartedAt = visitStartedAt;
      return this;
    }
  }
}
