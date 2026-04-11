package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The checkout-specific component customizations.
 */
public class CheckoutAndAccountsConfigurationBrandingCheckoutComponents {
  /**
   * The customizations for the breadcrumbs that represent a buyer's journey to the checkout.
   */
  private CheckoutAndAccountsConfigurationBrandingBuyerJourney buyerJourney;

  /**
   * The checkout cart link customizations. For example, by setting the visibility
   * field to `HIDDEN`, you can hide the cart icon in the header for one-page
   * checkout, and the cart link in breadcrumbs in three-page checkout.
   */
  private CheckoutAndAccountsConfigurationBrandingCartLink cartLink;

  /**
   * The content container customizations.
   */
  private CheckoutAndAccountsConfigurationBrandingContent content;

  /**
   * The express checkout customizations.
   */
  private CheckoutAndAccountsConfigurationBrandingExpressCheckout expressCheckout;

  /**
   * The checkout footer customizations.
   */
  private CheckoutAndAccountsConfigurationBrandingCheckoutFooter footer;

  /**
   * The checkout header customizations.
   */
  private CheckoutAndAccountsConfigurationBrandingCheckoutHeader header;

  /**
   * The main checkout customizations.
   */
  private CheckoutAndAccountsConfigurationBrandingMain main;

  /**
   * The order summary customizations.
   */
  private CheckoutAndAccountsConfigurationBrandingOrderSummary orderSummary;

  public CheckoutAndAccountsConfigurationBrandingCheckoutComponents() {
  }

  /**
   * The customizations for the breadcrumbs that represent a buyer's journey to the checkout.
   */
  public CheckoutAndAccountsConfigurationBrandingBuyerJourney getBuyerJourney() {
    return buyerJourney;
  }

  public void setBuyerJourney(CheckoutAndAccountsConfigurationBrandingBuyerJourney buyerJourney) {
    this.buyerJourney = buyerJourney;
  }

  /**
   * The checkout cart link customizations. For example, by setting the visibility
   * field to `HIDDEN`, you can hide the cart icon in the header for one-page
   * checkout, and the cart link in breadcrumbs in three-page checkout.
   */
  public CheckoutAndAccountsConfigurationBrandingCartLink getCartLink() {
    return cartLink;
  }

  public void setCartLink(CheckoutAndAccountsConfigurationBrandingCartLink cartLink) {
    this.cartLink = cartLink;
  }

  /**
   * The content container customizations.
   */
  public CheckoutAndAccountsConfigurationBrandingContent getContent() {
    return content;
  }

  public void setContent(CheckoutAndAccountsConfigurationBrandingContent content) {
    this.content = content;
  }

  /**
   * The express checkout customizations.
   */
  public CheckoutAndAccountsConfigurationBrandingExpressCheckout getExpressCheckout() {
    return expressCheckout;
  }

  public void setExpressCheckout(
      CheckoutAndAccountsConfigurationBrandingExpressCheckout expressCheckout) {
    this.expressCheckout = expressCheckout;
  }

  /**
   * The checkout footer customizations.
   */
  public CheckoutAndAccountsConfigurationBrandingCheckoutFooter getFooter() {
    return footer;
  }

  public void setFooter(CheckoutAndAccountsConfigurationBrandingCheckoutFooter footer) {
    this.footer = footer;
  }

  /**
   * The checkout header customizations.
   */
  public CheckoutAndAccountsConfigurationBrandingCheckoutHeader getHeader() {
    return header;
  }

  public void setHeader(CheckoutAndAccountsConfigurationBrandingCheckoutHeader header) {
    this.header = header;
  }

  /**
   * The main checkout customizations.
   */
  public CheckoutAndAccountsConfigurationBrandingMain getMain() {
    return main;
  }

  public void setMain(CheckoutAndAccountsConfigurationBrandingMain main) {
    this.main = main;
  }

  /**
   * The order summary customizations.
   */
  public CheckoutAndAccountsConfigurationBrandingOrderSummary getOrderSummary() {
    return orderSummary;
  }

  public void setOrderSummary(CheckoutAndAccountsConfigurationBrandingOrderSummary orderSummary) {
    this.orderSummary = orderSummary;
  }

  @Override
  public String toString() {
    return "CheckoutAndAccountsConfigurationBrandingCheckoutComponents{buyerJourney='" + buyerJourney + "', cartLink='" + cartLink + "', content='" + content + "', expressCheckout='" + expressCheckout + "', footer='" + footer + "', header='" + header + "', main='" + main + "', orderSummary='" + orderSummary + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutAndAccountsConfigurationBrandingCheckoutComponents that = (CheckoutAndAccountsConfigurationBrandingCheckoutComponents) o;
    return Objects.equals(buyerJourney, that.buyerJourney) &&
        Objects.equals(cartLink, that.cartLink) &&
        Objects.equals(content, that.content) &&
        Objects.equals(expressCheckout, that.expressCheckout) &&
        Objects.equals(footer, that.footer) &&
        Objects.equals(header, that.header) &&
        Objects.equals(main, that.main) &&
        Objects.equals(orderSummary, that.orderSummary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(buyerJourney, cartLink, content, expressCheckout, footer, header, main, orderSummary);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The customizations for the breadcrumbs that represent a buyer's journey to the checkout.
     */
    private CheckoutAndAccountsConfigurationBrandingBuyerJourney buyerJourney;

    /**
     * The checkout cart link customizations. For example, by setting the visibility
     * field to `HIDDEN`, you can hide the cart icon in the header for one-page
     * checkout, and the cart link in breadcrumbs in three-page checkout.
     */
    private CheckoutAndAccountsConfigurationBrandingCartLink cartLink;

    /**
     * The content container customizations.
     */
    private CheckoutAndAccountsConfigurationBrandingContent content;

    /**
     * The express checkout customizations.
     */
    private CheckoutAndAccountsConfigurationBrandingExpressCheckout expressCheckout;

    /**
     * The checkout footer customizations.
     */
    private CheckoutAndAccountsConfigurationBrandingCheckoutFooter footer;

    /**
     * The checkout header customizations.
     */
    private CheckoutAndAccountsConfigurationBrandingCheckoutHeader header;

    /**
     * The main checkout customizations.
     */
    private CheckoutAndAccountsConfigurationBrandingMain main;

    /**
     * The order summary customizations.
     */
    private CheckoutAndAccountsConfigurationBrandingOrderSummary orderSummary;

    public CheckoutAndAccountsConfigurationBrandingCheckoutComponents build() {
      CheckoutAndAccountsConfigurationBrandingCheckoutComponents result = new CheckoutAndAccountsConfigurationBrandingCheckoutComponents();
      result.buyerJourney = this.buyerJourney;
      result.cartLink = this.cartLink;
      result.content = this.content;
      result.expressCheckout = this.expressCheckout;
      result.footer = this.footer;
      result.header = this.header;
      result.main = this.main;
      result.orderSummary = this.orderSummary;
      return result;
    }

    /**
     * The customizations for the breadcrumbs that represent a buyer's journey to the checkout.
     */
    public Builder buyerJourney(CheckoutAndAccountsConfigurationBrandingBuyerJourney buyerJourney) {
      this.buyerJourney = buyerJourney;
      return this;
    }

    /**
     * The checkout cart link customizations. For example, by setting the visibility
     * field to `HIDDEN`, you can hide the cart icon in the header for one-page
     * checkout, and the cart link in breadcrumbs in three-page checkout.
     */
    public Builder cartLink(CheckoutAndAccountsConfigurationBrandingCartLink cartLink) {
      this.cartLink = cartLink;
      return this;
    }

    /**
     * The content container customizations.
     */
    public Builder content(CheckoutAndAccountsConfigurationBrandingContent content) {
      this.content = content;
      return this;
    }

    /**
     * The express checkout customizations.
     */
    public Builder expressCheckout(
        CheckoutAndAccountsConfigurationBrandingExpressCheckout expressCheckout) {
      this.expressCheckout = expressCheckout;
      return this;
    }

    /**
     * The checkout footer customizations.
     */
    public Builder footer(CheckoutAndAccountsConfigurationBrandingCheckoutFooter footer) {
      this.footer = footer;
      return this;
    }

    /**
     * The checkout header customizations.
     */
    public Builder header(CheckoutAndAccountsConfigurationBrandingCheckoutHeader header) {
      this.header = header;
      return this;
    }

    /**
     * The main checkout customizations.
     */
    public Builder main(CheckoutAndAccountsConfigurationBrandingMain main) {
      this.main = main;
      return this;
    }

    /**
     * The order summary customizations.
     */
    public Builder orderSummary(CheckoutAndAccountsConfigurationBrandingOrderSummary orderSummary) {
      this.orderSummary = orderSummary;
      return this;
    }
  }
}
