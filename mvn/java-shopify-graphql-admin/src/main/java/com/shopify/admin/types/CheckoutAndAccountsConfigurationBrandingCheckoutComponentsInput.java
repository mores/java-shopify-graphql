package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for customizing the Checkout components.
 */
public class CheckoutAndAccountsConfigurationBrandingCheckoutComponentsInput {
  /**
   * The footer.
   */
  private CheckoutAndAccountsConfigurationBrandingCheckoutFooterInput footer;

  /**
   * The header.
   */
  private CheckoutAndAccountsConfigurationBrandingCheckoutHeaderInput header;

  /**
   * The input for checkout cart link customizations. For example, by setting the
   * visibility field to `HIDDEN`, you can hide the cart icon in the header for
   * one-page checkout, and the cart link in breadcrumbs in three-page checkout.
   */
  private CheckoutAndAccountsConfigurationBrandingCartLinkInput cartLink;

  /**
   * The breadcrumbs that represent a buyer's journey to the checkout.
   */
  private CheckoutAndAccountsConfigurationBrandingBuyerJourneyInput buyerJourney;

  /**
   * The content container.
   */
  private CheckoutAndAccountsConfigurationBrandingContentInput content;

  /**
   * The express checkout.
   */
  private CheckoutAndAccountsConfigurationBrandingExpressCheckoutInput expressCheckout;

  /**
   * The order summary.
   */
  private CheckoutAndAccountsConfigurationBrandingOrderSummaryInput orderSummary;

  /**
   * The main area.
   */
  private CheckoutAndAccountsConfigurationBrandingMainInput main;

  public CheckoutAndAccountsConfigurationBrandingCheckoutComponentsInput() {
  }

  /**
   * The footer.
   */
  public CheckoutAndAccountsConfigurationBrandingCheckoutFooterInput getFooter() {
    return footer;
  }

  public void setFooter(CheckoutAndAccountsConfigurationBrandingCheckoutFooterInput footer) {
    this.footer = footer;
  }

  /**
   * The header.
   */
  public CheckoutAndAccountsConfigurationBrandingCheckoutHeaderInput getHeader() {
    return header;
  }

  public void setHeader(CheckoutAndAccountsConfigurationBrandingCheckoutHeaderInput header) {
    this.header = header;
  }

  /**
   * The input for checkout cart link customizations. For example, by setting the
   * visibility field to `HIDDEN`, you can hide the cart icon in the header for
   * one-page checkout, and the cart link in breadcrumbs in three-page checkout.
   */
  public CheckoutAndAccountsConfigurationBrandingCartLinkInput getCartLink() {
    return cartLink;
  }

  public void setCartLink(CheckoutAndAccountsConfigurationBrandingCartLinkInput cartLink) {
    this.cartLink = cartLink;
  }

  /**
   * The breadcrumbs that represent a buyer's journey to the checkout.
   */
  public CheckoutAndAccountsConfigurationBrandingBuyerJourneyInput getBuyerJourney() {
    return buyerJourney;
  }

  public void setBuyerJourney(
      CheckoutAndAccountsConfigurationBrandingBuyerJourneyInput buyerJourney) {
    this.buyerJourney = buyerJourney;
  }

  /**
   * The content container.
   */
  public CheckoutAndAccountsConfigurationBrandingContentInput getContent() {
    return content;
  }

  public void setContent(CheckoutAndAccountsConfigurationBrandingContentInput content) {
    this.content = content;
  }

  /**
   * The express checkout.
   */
  public CheckoutAndAccountsConfigurationBrandingExpressCheckoutInput getExpressCheckout() {
    return expressCheckout;
  }

  public void setExpressCheckout(
      CheckoutAndAccountsConfigurationBrandingExpressCheckoutInput expressCheckout) {
    this.expressCheckout = expressCheckout;
  }

  /**
   * The order summary.
   */
  public CheckoutAndAccountsConfigurationBrandingOrderSummaryInput getOrderSummary() {
    return orderSummary;
  }

  public void setOrderSummary(
      CheckoutAndAccountsConfigurationBrandingOrderSummaryInput orderSummary) {
    this.orderSummary = orderSummary;
  }

  /**
   * The main area.
   */
  public CheckoutAndAccountsConfigurationBrandingMainInput getMain() {
    return main;
  }

  public void setMain(CheckoutAndAccountsConfigurationBrandingMainInput main) {
    this.main = main;
  }

  @Override
  public String toString() {
    return "CheckoutAndAccountsConfigurationBrandingCheckoutComponentsInput{footer='" + footer + "', header='" + header + "', cartLink='" + cartLink + "', buyerJourney='" + buyerJourney + "', content='" + content + "', expressCheckout='" + expressCheckout + "', orderSummary='" + orderSummary + "', main='" + main + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutAndAccountsConfigurationBrandingCheckoutComponentsInput that = (CheckoutAndAccountsConfigurationBrandingCheckoutComponentsInput) o;
    return Objects.equals(footer, that.footer) &&
        Objects.equals(header, that.header) &&
        Objects.equals(cartLink, that.cartLink) &&
        Objects.equals(buyerJourney, that.buyerJourney) &&
        Objects.equals(content, that.content) &&
        Objects.equals(expressCheckout, that.expressCheckout) &&
        Objects.equals(orderSummary, that.orderSummary) &&
        Objects.equals(main, that.main);
  }

  @Override
  public int hashCode() {
    return Objects.hash(footer, header, cartLink, buyerJourney, content, expressCheckout, orderSummary, main);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The footer.
     */
    private CheckoutAndAccountsConfigurationBrandingCheckoutFooterInput footer;

    /**
     * The header.
     */
    private CheckoutAndAccountsConfigurationBrandingCheckoutHeaderInput header;

    /**
     * The input for checkout cart link customizations. For example, by setting the
     * visibility field to `HIDDEN`, you can hide the cart icon in the header for
     * one-page checkout, and the cart link in breadcrumbs in three-page checkout.
     */
    private CheckoutAndAccountsConfigurationBrandingCartLinkInput cartLink;

    /**
     * The breadcrumbs that represent a buyer's journey to the checkout.
     */
    private CheckoutAndAccountsConfigurationBrandingBuyerJourneyInput buyerJourney;

    /**
     * The content container.
     */
    private CheckoutAndAccountsConfigurationBrandingContentInput content;

    /**
     * The express checkout.
     */
    private CheckoutAndAccountsConfigurationBrandingExpressCheckoutInput expressCheckout;

    /**
     * The order summary.
     */
    private CheckoutAndAccountsConfigurationBrandingOrderSummaryInput orderSummary;

    /**
     * The main area.
     */
    private CheckoutAndAccountsConfigurationBrandingMainInput main;

    public CheckoutAndAccountsConfigurationBrandingCheckoutComponentsInput build() {
      CheckoutAndAccountsConfigurationBrandingCheckoutComponentsInput result = new CheckoutAndAccountsConfigurationBrandingCheckoutComponentsInput();
      result.footer = this.footer;
      result.header = this.header;
      result.cartLink = this.cartLink;
      result.buyerJourney = this.buyerJourney;
      result.content = this.content;
      result.expressCheckout = this.expressCheckout;
      result.orderSummary = this.orderSummary;
      result.main = this.main;
      return result;
    }

    /**
     * The footer.
     */
    public Builder footer(CheckoutAndAccountsConfigurationBrandingCheckoutFooterInput footer) {
      this.footer = footer;
      return this;
    }

    /**
     * The header.
     */
    public Builder header(CheckoutAndAccountsConfigurationBrandingCheckoutHeaderInput header) {
      this.header = header;
      return this;
    }

    /**
     * The input for checkout cart link customizations. For example, by setting the
     * visibility field to `HIDDEN`, you can hide the cart icon in the header for
     * one-page checkout, and the cart link in breadcrumbs in three-page checkout.
     */
    public Builder cartLink(CheckoutAndAccountsConfigurationBrandingCartLinkInput cartLink) {
      this.cartLink = cartLink;
      return this;
    }

    /**
     * The breadcrumbs that represent a buyer's journey to the checkout.
     */
    public Builder buyerJourney(
        CheckoutAndAccountsConfigurationBrandingBuyerJourneyInput buyerJourney) {
      this.buyerJourney = buyerJourney;
      return this;
    }

    /**
     * The content container.
     */
    public Builder content(CheckoutAndAccountsConfigurationBrandingContentInput content) {
      this.content = content;
      return this;
    }

    /**
     * The express checkout.
     */
    public Builder expressCheckout(
        CheckoutAndAccountsConfigurationBrandingExpressCheckoutInput expressCheckout) {
      this.expressCheckout = expressCheckout;
      return this;
    }

    /**
     * The order summary.
     */
    public Builder orderSummary(
        CheckoutAndAccountsConfigurationBrandingOrderSummaryInput orderSummary) {
      this.orderSummary = orderSummary;
      return this;
    }

    /**
     * The main area.
     */
    public Builder main(CheckoutAndAccountsConfigurationBrandingMainInput main) {
      this.main = main;
      return this;
    }
  }
}
