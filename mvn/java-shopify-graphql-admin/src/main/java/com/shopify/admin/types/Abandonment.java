package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Double;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * A browse, cart, or checkout that was abandoned by a customer.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class Abandonment implements com.shopify.admin.types.Node {
  /**
   * The abandonment payload for the abandoned checkout.
   */
  private AbandonedCheckout abandonedCheckoutPayload;

  /**
   * The abandonment type.
   */
  private AbandonmentAbandonmentType abandonmentType;

  /**
   * The app associated with an abandoned checkout.
   */
  private App app;

  /**
   * Permalink to the cart page.
   */
  private String cartUrl;

  /**
   * The date and time when the abandonment was created.
   */
  private OffsetDateTime createdAt;

  /**
   * The customer who abandoned this event.
   */
  private Customer customer;

  /**
   * Whether the customer has a draft order since this abandonment has been abandoned.
   */
  private boolean customerHasNoDraftOrderSinceAbandonment;

  /**
   * Whether the customer has completed an order since this checkout has been abandoned.
   */
  private boolean customerHasNoOrderSinceAbandonment;

  /**
   * The number of days since the last abandonment email was sent to the customer.
   */
  private int daysSinceLastAbandonmentEmail;

  /**
   * When the email was sent, if that's the case.
   */
  private OffsetDateTime emailSentAt;

  /**
   * The email state (e.g., sent or not sent).
   */
  private AbandonmentEmailState emailState;

  /**
   * The number of hours since the customer has last abandoned a checkout.
   */
  private Double hoursSinceLastAbandonedCheckout;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * Whether the products in abandonment are available.
   */
  private boolean inventoryAvailable;

  /**
   * Whether the abandonment event comes from a custom storefront channel.
   */
  private boolean isFromCustomStorefront;

  /**
   * Whether the abandonment event comes from the Online Store sales channel.
   */
  private boolean isFromOnlineStore;

  /**
   * Whether the abandonment event comes from the Shop app sales channel.
   */
  private boolean isFromShopApp;

  /**
   * Whether the abandonment event comes from Shop Pay.
   */
  private boolean isFromShopPay;

  /**
   * Whether the customer didn't complete another most significant step since this abandonment.
   */
  private boolean isMostSignificantAbandonment;

  /**
   * The date for the latest browse abandonment.
   */
  private OffsetDateTime lastBrowseAbandonmentDate;

  /**
   * The date for the latest cart abandonment.
   */
  private OffsetDateTime lastCartAbandonmentDate;

  /**
   * The date for the latest checkout abandonment.
   */
  private OffsetDateTime lastCheckoutAbandonmentDate;

  /**
   * The most recent step type.
   */
  private AbandonmentAbandonmentType mostRecentStep;

  /**
   * The products added to the cart during the customer abandoned visit.
   */
  private CustomerVisitProductInfoConnection productsAddedToCart;

  /**
   * The products viewed during the customer abandoned visit.
   */
  private CustomerVisitProductInfoConnection productsViewed;

  /**
   * The date and time when the visit started.
   */
  private OffsetDateTime visitStartedAt;

  public Abandonment() {
  }

  /**
   * The abandonment payload for the abandoned checkout.
   */
  public AbandonedCheckout getAbandonedCheckoutPayload() {
    return abandonedCheckoutPayload;
  }

  public void setAbandonedCheckoutPayload(AbandonedCheckout abandonedCheckoutPayload) {
    this.abandonedCheckoutPayload = abandonedCheckoutPayload;
  }

  /**
   * The abandonment type.
   */
  public AbandonmentAbandonmentType getAbandonmentType() {
    return abandonmentType;
  }

  public void setAbandonmentType(AbandonmentAbandonmentType abandonmentType) {
    this.abandonmentType = abandonmentType;
  }

  /**
   * The app associated with an abandoned checkout.
   */
  public App getApp() {
    return app;
  }

  public void setApp(App app) {
    this.app = app;
  }

  /**
   * Permalink to the cart page.
   */
  public String getCartUrl() {
    return cartUrl;
  }

  public void setCartUrl(String cartUrl) {
    this.cartUrl = cartUrl;
  }

  /**
   * The date and time when the abandonment was created.
   */
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * The customer who abandoned this event.
   */
  public Customer getCustomer() {
    return customer;
  }

  public void setCustomer(Customer customer) {
    this.customer = customer;
  }

  /**
   * Whether the customer has a draft order since this abandonment has been abandoned.
   */
  public boolean getCustomerHasNoDraftOrderSinceAbandonment() {
    return customerHasNoDraftOrderSinceAbandonment;
  }

  public void setCustomerHasNoDraftOrderSinceAbandonment(
      boolean customerHasNoDraftOrderSinceAbandonment) {
    this.customerHasNoDraftOrderSinceAbandonment = customerHasNoDraftOrderSinceAbandonment;
  }

  /**
   * Whether the customer has completed an order since this checkout has been abandoned.
   */
  public boolean getCustomerHasNoOrderSinceAbandonment() {
    return customerHasNoOrderSinceAbandonment;
  }

  public void setCustomerHasNoOrderSinceAbandonment(boolean customerHasNoOrderSinceAbandonment) {
    this.customerHasNoOrderSinceAbandonment = customerHasNoOrderSinceAbandonment;
  }

  /**
   * The number of days since the last abandonment email was sent to the customer.
   */
  public int getDaysSinceLastAbandonmentEmail() {
    return daysSinceLastAbandonmentEmail;
  }

  public void setDaysSinceLastAbandonmentEmail(int daysSinceLastAbandonmentEmail) {
    this.daysSinceLastAbandonmentEmail = daysSinceLastAbandonmentEmail;
  }

  /**
   * When the email was sent, if that's the case.
   */
  public OffsetDateTime getEmailSentAt() {
    return emailSentAt;
  }

  public void setEmailSentAt(OffsetDateTime emailSentAt) {
    this.emailSentAt = emailSentAt;
  }

  /**
   * The email state (e.g., sent or not sent).
   */
  public AbandonmentEmailState getEmailState() {
    return emailState;
  }

  public void setEmailState(AbandonmentEmailState emailState) {
    this.emailState = emailState;
  }

  /**
   * The number of hours since the customer has last abandoned a checkout.
   */
  public Double getHoursSinceLastAbandonedCheckout() {
    return hoursSinceLastAbandonedCheckout;
  }

  public void setHoursSinceLastAbandonedCheckout(Double hoursSinceLastAbandonedCheckout) {
    this.hoursSinceLastAbandonedCheckout = hoursSinceLastAbandonedCheckout;
  }

  /**
   * A globally-unique ID.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * Whether the products in abandonment are available.
   */
  public boolean getInventoryAvailable() {
    return inventoryAvailable;
  }

  public void setInventoryAvailable(boolean inventoryAvailable) {
    this.inventoryAvailable = inventoryAvailable;
  }

  /**
   * Whether the abandonment event comes from a custom storefront channel.
   */
  public boolean getIsFromCustomStorefront() {
    return isFromCustomStorefront;
  }

  public void setIsFromCustomStorefront(boolean isFromCustomStorefront) {
    this.isFromCustomStorefront = isFromCustomStorefront;
  }

  /**
   * Whether the abandonment event comes from the Online Store sales channel.
   */
  public boolean getIsFromOnlineStore() {
    return isFromOnlineStore;
  }

  public void setIsFromOnlineStore(boolean isFromOnlineStore) {
    this.isFromOnlineStore = isFromOnlineStore;
  }

  /**
   * Whether the abandonment event comes from the Shop app sales channel.
   */
  public boolean getIsFromShopApp() {
    return isFromShopApp;
  }

  public void setIsFromShopApp(boolean isFromShopApp) {
    this.isFromShopApp = isFromShopApp;
  }

  /**
   * Whether the abandonment event comes from Shop Pay.
   */
  public boolean getIsFromShopPay() {
    return isFromShopPay;
  }

  public void setIsFromShopPay(boolean isFromShopPay) {
    this.isFromShopPay = isFromShopPay;
  }

  /**
   * Whether the customer didn't complete another most significant step since this abandonment.
   */
  public boolean getIsMostSignificantAbandonment() {
    return isMostSignificantAbandonment;
  }

  public void setIsMostSignificantAbandonment(boolean isMostSignificantAbandonment) {
    this.isMostSignificantAbandonment = isMostSignificantAbandonment;
  }

  /**
   * The date for the latest browse abandonment.
   */
  public OffsetDateTime getLastBrowseAbandonmentDate() {
    return lastBrowseAbandonmentDate;
  }

  public void setLastBrowseAbandonmentDate(OffsetDateTime lastBrowseAbandonmentDate) {
    this.lastBrowseAbandonmentDate = lastBrowseAbandonmentDate;
  }

  /**
   * The date for the latest cart abandonment.
   */
  public OffsetDateTime getLastCartAbandonmentDate() {
    return lastCartAbandonmentDate;
  }

  public void setLastCartAbandonmentDate(OffsetDateTime lastCartAbandonmentDate) {
    this.lastCartAbandonmentDate = lastCartAbandonmentDate;
  }

  /**
   * The date for the latest checkout abandonment.
   */
  public OffsetDateTime getLastCheckoutAbandonmentDate() {
    return lastCheckoutAbandonmentDate;
  }

  public void setLastCheckoutAbandonmentDate(OffsetDateTime lastCheckoutAbandonmentDate) {
    this.lastCheckoutAbandonmentDate = lastCheckoutAbandonmentDate;
  }

  /**
   * The most recent step type.
   */
  public AbandonmentAbandonmentType getMostRecentStep() {
    return mostRecentStep;
  }

  public void setMostRecentStep(AbandonmentAbandonmentType mostRecentStep) {
    this.mostRecentStep = mostRecentStep;
  }

  /**
   * The products added to the cart during the customer abandoned visit.
   */
  public CustomerVisitProductInfoConnection getProductsAddedToCart() {
    return productsAddedToCart;
  }

  public void setProductsAddedToCart(CustomerVisitProductInfoConnection productsAddedToCart) {
    this.productsAddedToCart = productsAddedToCart;
  }

  /**
   * The products viewed during the customer abandoned visit.
   */
  public CustomerVisitProductInfoConnection getProductsViewed() {
    return productsViewed;
  }

  public void setProductsViewed(CustomerVisitProductInfoConnection productsViewed) {
    this.productsViewed = productsViewed;
  }

  /**
   * The date and time when the visit started.
   */
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
    /**
     * The abandonment payload for the abandoned checkout.
     */
    private AbandonedCheckout abandonedCheckoutPayload;

    /**
     * The abandonment type.
     */
    private AbandonmentAbandonmentType abandonmentType;

    /**
     * The app associated with an abandoned checkout.
     */
    private App app;

    /**
     * Permalink to the cart page.
     */
    private String cartUrl;

    /**
     * The date and time when the abandonment was created.
     */
    private OffsetDateTime createdAt;

    /**
     * The customer who abandoned this event.
     */
    private Customer customer;

    /**
     * Whether the customer has a draft order since this abandonment has been abandoned.
     */
    private boolean customerHasNoDraftOrderSinceAbandonment;

    /**
     * Whether the customer has completed an order since this checkout has been abandoned.
     */
    private boolean customerHasNoOrderSinceAbandonment;

    /**
     * The number of days since the last abandonment email was sent to the customer.
     */
    private int daysSinceLastAbandonmentEmail;

    /**
     * When the email was sent, if that's the case.
     */
    private OffsetDateTime emailSentAt;

    /**
     * The email state (e.g., sent or not sent).
     */
    private AbandonmentEmailState emailState;

    /**
     * The number of hours since the customer has last abandoned a checkout.
     */
    private Double hoursSinceLastAbandonedCheckout;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * Whether the products in abandonment are available.
     */
    private boolean inventoryAvailable;

    /**
     * Whether the abandonment event comes from a custom storefront channel.
     */
    private boolean isFromCustomStorefront;

    /**
     * Whether the abandonment event comes from the Online Store sales channel.
     */
    private boolean isFromOnlineStore;

    /**
     * Whether the abandonment event comes from the Shop app sales channel.
     */
    private boolean isFromShopApp;

    /**
     * Whether the abandonment event comes from Shop Pay.
     */
    private boolean isFromShopPay;

    /**
     * Whether the customer didn't complete another most significant step since this abandonment.
     */
    private boolean isMostSignificantAbandonment;

    /**
     * The date for the latest browse abandonment.
     */
    private OffsetDateTime lastBrowseAbandonmentDate;

    /**
     * The date for the latest cart abandonment.
     */
    private OffsetDateTime lastCartAbandonmentDate;

    /**
     * The date for the latest checkout abandonment.
     */
    private OffsetDateTime lastCheckoutAbandonmentDate;

    /**
     * The most recent step type.
     */
    private AbandonmentAbandonmentType mostRecentStep;

    /**
     * The products added to the cart during the customer abandoned visit.
     */
    private CustomerVisitProductInfoConnection productsAddedToCart;

    /**
     * The products viewed during the customer abandoned visit.
     */
    private CustomerVisitProductInfoConnection productsViewed;

    /**
     * The date and time when the visit started.
     */
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

    /**
     * The abandonment payload for the abandoned checkout.
     */
    public Builder abandonedCheckoutPayload(AbandonedCheckout abandonedCheckoutPayload) {
      this.abandonedCheckoutPayload = abandonedCheckoutPayload;
      return this;
    }

    /**
     * The abandonment type.
     */
    public Builder abandonmentType(AbandonmentAbandonmentType abandonmentType) {
      this.abandonmentType = abandonmentType;
      return this;
    }

    /**
     * The app associated with an abandoned checkout.
     */
    public Builder app(App app) {
      this.app = app;
      return this;
    }

    /**
     * Permalink to the cart page.
     */
    public Builder cartUrl(String cartUrl) {
      this.cartUrl = cartUrl;
      return this;
    }

    /**
     * The date and time when the abandonment was created.
     */
    public Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    /**
     * The customer who abandoned this event.
     */
    public Builder customer(Customer customer) {
      this.customer = customer;
      return this;
    }

    /**
     * Whether the customer has a draft order since this abandonment has been abandoned.
     */
    public Builder customerHasNoDraftOrderSinceAbandonment(
        boolean customerHasNoDraftOrderSinceAbandonment) {
      this.customerHasNoDraftOrderSinceAbandonment = customerHasNoDraftOrderSinceAbandonment;
      return this;
    }

    /**
     * Whether the customer has completed an order since this checkout has been abandoned.
     */
    public Builder customerHasNoOrderSinceAbandonment(boolean customerHasNoOrderSinceAbandonment) {
      this.customerHasNoOrderSinceAbandonment = customerHasNoOrderSinceAbandonment;
      return this;
    }

    /**
     * The number of days since the last abandonment email was sent to the customer.
     */
    public Builder daysSinceLastAbandonmentEmail(int daysSinceLastAbandonmentEmail) {
      this.daysSinceLastAbandonmentEmail = daysSinceLastAbandonmentEmail;
      return this;
    }

    /**
     * When the email was sent, if that's the case.
     */
    public Builder emailSentAt(OffsetDateTime emailSentAt) {
      this.emailSentAt = emailSentAt;
      return this;
    }

    /**
     * The email state (e.g., sent or not sent).
     */
    public Builder emailState(AbandonmentEmailState emailState) {
      this.emailState = emailState;
      return this;
    }

    /**
     * The number of hours since the customer has last abandoned a checkout.
     */
    public Builder hoursSinceLastAbandonedCheckout(Double hoursSinceLastAbandonedCheckout) {
      this.hoursSinceLastAbandonedCheckout = hoursSinceLastAbandonedCheckout;
      return this;
    }

    /**
     * A globally-unique ID.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Whether the products in abandonment are available.
     */
    public Builder inventoryAvailable(boolean inventoryAvailable) {
      this.inventoryAvailable = inventoryAvailable;
      return this;
    }

    /**
     * Whether the abandonment event comes from a custom storefront channel.
     */
    public Builder isFromCustomStorefront(boolean isFromCustomStorefront) {
      this.isFromCustomStorefront = isFromCustomStorefront;
      return this;
    }

    /**
     * Whether the abandonment event comes from the Online Store sales channel.
     */
    public Builder isFromOnlineStore(boolean isFromOnlineStore) {
      this.isFromOnlineStore = isFromOnlineStore;
      return this;
    }

    /**
     * Whether the abandonment event comes from the Shop app sales channel.
     */
    public Builder isFromShopApp(boolean isFromShopApp) {
      this.isFromShopApp = isFromShopApp;
      return this;
    }

    /**
     * Whether the abandonment event comes from Shop Pay.
     */
    public Builder isFromShopPay(boolean isFromShopPay) {
      this.isFromShopPay = isFromShopPay;
      return this;
    }

    /**
     * Whether the customer didn't complete another most significant step since this abandonment.
     */
    public Builder isMostSignificantAbandonment(boolean isMostSignificantAbandonment) {
      this.isMostSignificantAbandonment = isMostSignificantAbandonment;
      return this;
    }

    /**
     * The date for the latest browse abandonment.
     */
    public Builder lastBrowseAbandonmentDate(OffsetDateTime lastBrowseAbandonmentDate) {
      this.lastBrowseAbandonmentDate = lastBrowseAbandonmentDate;
      return this;
    }

    /**
     * The date for the latest cart abandonment.
     */
    public Builder lastCartAbandonmentDate(OffsetDateTime lastCartAbandonmentDate) {
      this.lastCartAbandonmentDate = lastCartAbandonmentDate;
      return this;
    }

    /**
     * The date for the latest checkout abandonment.
     */
    public Builder lastCheckoutAbandonmentDate(OffsetDateTime lastCheckoutAbandonmentDate) {
      this.lastCheckoutAbandonmentDate = lastCheckoutAbandonmentDate;
      return this;
    }

    /**
     * The most recent step type.
     */
    public Builder mostRecentStep(AbandonmentAbandonmentType mostRecentStep) {
      this.mostRecentStep = mostRecentStep;
      return this;
    }

    /**
     * The products added to the cart during the customer abandoned visit.
     */
    public Builder productsAddedToCart(CustomerVisitProductInfoConnection productsAddedToCart) {
      this.productsAddedToCart = productsAddedToCart;
      return this;
    }

    /**
     * The products viewed during the customer abandoned visit.
     */
    public Builder productsViewed(CustomerVisitProductInfoConnection productsViewed) {
      this.productsViewed = productsViewed;
      return this;
    }

    /**
     * The date and time when the visit started.
     */
    public Builder visitStartedAt(OffsetDateTime visitStartedAt) {
      this.visitStartedAt = visitStartedAt;
      return this;
    }
  }
}
