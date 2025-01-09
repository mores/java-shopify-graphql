package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields that specify all possible fields for tracking information.
 *
 * > Note:
 * > If you provide the `url` field, you should not provide the `urls` field.
 * >
 * > If you provide the `number` field, you should not provide the `numbers` field.
 * >
 * > If you provide the `url` field, you should provide the `number` field.
 * >
 * > If you provide the `urls` field, you should provide the `numbers` field.
 */
public class FulfillmentTrackingInput {
  /**
   * The tracking number of the fulfillment.
   *   
   * The tracking number will be clickable in the interface if one of the following applies
   * (the highest in the list has the highest priority):
   *   
   * * Tracking url provided in the `url` field.
   * * [Shopify-known tracking company name](https://shopify.dev/api/admin-graphql/latest/objects/FulfillmentTrackingInfo#supported-tracking-companies)
   *   specified in the `company` field.
   *   Shopify will build the tracking URL automatically based on the tracking number specified.
   * * The tracking number has a Shopify-known format.
   *   Shopify will guess the tracking provider and build the tracking url based on the tracking number format.
   *   Not all tracking carriers are supported, and multiple tracking carriers may use similarly formatted tracking numbers.
   *   This can result in an invalid tracking URL.
   *   It is highly recommended that you send the tracking company and the tracking URL.
   */
  private String number;

  /**
   * The URL to track the fulfillment.
   *   
   * The tracking URL is displayed in the merchant's admin on the order page.
   * The tracking URL is displayed in the shipping confirmation email, which can optionally be sent to the customer.
   * When accounts are enabled, it's also displayed in the customer's order history.
   *   
   * The URL must be an [RFC 3986](https://datatracker.ietf.org/doc/html/rfc3986) and
   * [RFC 3987](https://datatracker.ietf.org/doc/html/rfc3987)-compliant URI string.
   * For example, `"https://www.myshipping.com/track/?tracknumbers=TRACKING_NUMBER"` is a valid URL.
   * It includes a scheme (`https`) and a host (`myshipping.com`).
   */
  private String url;

  /**
   * The name of the tracking company.
   *   
   * If you specify a tracking company name from
   * [the list](https://shopify.dev/api/admin-graphql/latest/objects/FulfillmentTrackingInfo#supported-tracking-companies),
   * Shopify will automatically build tracking URLs for all provided tracking numbers,
   * which will make the tracking numbers clickable in the interface.
   * The same tracking company will be applied to all tracking numbers specified.
   *   
   * Additionally, for the tracking companies listed on the
   * [Shipping Carriers help page](https://help.shopify.com/manual/shipping/understanding-shipping/shipping-carriers#integrated-shipping-carriers)
   * Shopify will automatically update the fulfillment's `shipment_status` field during the fulfillment process.
   *   
   * > Note:
   * > Send the tracking company name exactly as written in
   * > [the list](https://shopify.dev/api/admin-graphql/latest/objects/FulfillmentTrackingInfo#supported-tracking-companies)
   * > (capitalization matters).
   */
  private String company;

  /**
   * The tracking numbers of the fulfillment, one or many.
   *   
   * With multiple tracking numbers, you can provide tracking information
   * for all shipments associated with the fulfillment, if there are more than one.
   * For example, if you're shipping assembly parts of one furniture item in several boxes.
   *   
   * Tracking numbers will be clickable in the interface if one of the following applies
   * (the highest in the list has the highest priority):
   *   
   * * Tracking URLs provided in the `urls` field.
   *   The tracking URLs will be matched to the tracking numbers based on their positions in the arrays.
   * * [Shopify-known tracking company name](https://shopify.dev/api/admin-graphql/latest/objects/FulfillmentTrackingInfo#supported-tracking-companies)
   *   specified in the `company` field.
   *   Shopify will build tracking URLs automatically for all tracking numbers specified.
   *   The same tracking company will be applied to all tracking numbers.
   * * Tracking numbers have a Shopify-known format.
   *   Shopify will guess tracking providers and build tracking URLs based on the tracking number formats.
   *   Not all tracking carriers are supported, and multiple tracking carriers may use similarly formatted tracking numbers.
   *   This can result in an invalid tracking URL.
   *   It is highly recommended that you send the tracking company and the tracking URLs.
   */
  private List<String> numbers;

  /**
   * The URLs to track the fulfillment, one or many.
   *   
   * The tracking URLs are displayed in the merchant's admin on the order page.
   * The tracking URLs are displayed in the shipping confirmation email, which can optionally be sent to the customer.
   * When accounts are enabled, the tracking URLs are also displayed in the customer's order history.
   *   
   * If you're not specifying a
   * [Shopify-known](https://shopify.dev/api/admin-graphql/latest/objects/FulfillmentTrackingInfo#supported-tracking-companies)
   * tracking company name in the `company` field,
   * then provide tracking URLs for all tracking numbers from the `numbers` field.
   *   
   * Tracking URLs from the `urls` array field are being matched with the tracking numbers from the `numbers` array
   * field correspondingly their positions in the arrays.
   *   
   * Each URL must be an [RFC 3986](https://datatracker.ietf.org/doc/html/rfc3986) and
   * [RFC 3987](https://datatracker.ietf.org/doc/html/rfc3987)-compliant URI string.
   * For example, `"https://www.myshipping.com/track/?tracknumbers=TRACKING_NUMBER"` is a valid URL.
   * It includes a scheme (`https`) and a host (`myshipping.com`).
   */
  private List<String> urls;

  public FulfillmentTrackingInput() {
  }

  /**
   * The tracking number of the fulfillment.
   *   
   * The tracking number will be clickable in the interface if one of the following applies
   * (the highest in the list has the highest priority):
   *   
   * * Tracking url provided in the `url` field.
   * * [Shopify-known tracking company name](https://shopify.dev/api/admin-graphql/latest/objects/FulfillmentTrackingInfo#supported-tracking-companies)
   *   specified in the `company` field.
   *   Shopify will build the tracking URL automatically based on the tracking number specified.
   * * The tracking number has a Shopify-known format.
   *   Shopify will guess the tracking provider and build the tracking url based on the tracking number format.
   *   Not all tracking carriers are supported, and multiple tracking carriers may use similarly formatted tracking numbers.
   *   This can result in an invalid tracking URL.
   *   It is highly recommended that you send the tracking company and the tracking URL.
   */
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  /**
   * The URL to track the fulfillment.
   *   
   * The tracking URL is displayed in the merchant's admin on the order page.
   * The tracking URL is displayed in the shipping confirmation email, which can optionally be sent to the customer.
   * When accounts are enabled, it's also displayed in the customer's order history.
   *   
   * The URL must be an [RFC 3986](https://datatracker.ietf.org/doc/html/rfc3986) and
   * [RFC 3987](https://datatracker.ietf.org/doc/html/rfc3987)-compliant URI string.
   * For example, `"https://www.myshipping.com/track/?tracknumbers=TRACKING_NUMBER"` is a valid URL.
   * It includes a scheme (`https`) and a host (`myshipping.com`).
   */
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  /**
   * The name of the tracking company.
   *   
   * If you specify a tracking company name from
   * [the list](https://shopify.dev/api/admin-graphql/latest/objects/FulfillmentTrackingInfo#supported-tracking-companies),
   * Shopify will automatically build tracking URLs for all provided tracking numbers,
   * which will make the tracking numbers clickable in the interface.
   * The same tracking company will be applied to all tracking numbers specified.
   *   
   * Additionally, for the tracking companies listed on the
   * [Shipping Carriers help page](https://help.shopify.com/manual/shipping/understanding-shipping/shipping-carriers#integrated-shipping-carriers)
   * Shopify will automatically update the fulfillment's `shipment_status` field during the fulfillment process.
   *   
   * > Note:
   * > Send the tracking company name exactly as written in
   * > [the list](https://shopify.dev/api/admin-graphql/latest/objects/FulfillmentTrackingInfo#supported-tracking-companies)
   * > (capitalization matters).
   */
  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  /**
   * The tracking numbers of the fulfillment, one or many.
   *   
   * With multiple tracking numbers, you can provide tracking information
   * for all shipments associated with the fulfillment, if there are more than one.
   * For example, if you're shipping assembly parts of one furniture item in several boxes.
   *   
   * Tracking numbers will be clickable in the interface if one of the following applies
   * (the highest in the list has the highest priority):
   *   
   * * Tracking URLs provided in the `urls` field.
   *   The tracking URLs will be matched to the tracking numbers based on their positions in the arrays.
   * * [Shopify-known tracking company name](https://shopify.dev/api/admin-graphql/latest/objects/FulfillmentTrackingInfo#supported-tracking-companies)
   *   specified in the `company` field.
   *   Shopify will build tracking URLs automatically for all tracking numbers specified.
   *   The same tracking company will be applied to all tracking numbers.
   * * Tracking numbers have a Shopify-known format.
   *   Shopify will guess tracking providers and build tracking URLs based on the tracking number formats.
   *   Not all tracking carriers are supported, and multiple tracking carriers may use similarly formatted tracking numbers.
   *   This can result in an invalid tracking URL.
   *   It is highly recommended that you send the tracking company and the tracking URLs.
   */
  public List<String> getNumbers() {
    return numbers;
  }

  public void setNumbers(List<String> numbers) {
    this.numbers = numbers;
  }

  /**
   * The URLs to track the fulfillment, one or many.
   *   
   * The tracking URLs are displayed in the merchant's admin on the order page.
   * The tracking URLs are displayed in the shipping confirmation email, which can optionally be sent to the customer.
   * When accounts are enabled, the tracking URLs are also displayed in the customer's order history.
   *   
   * If you're not specifying a
   * [Shopify-known](https://shopify.dev/api/admin-graphql/latest/objects/FulfillmentTrackingInfo#supported-tracking-companies)
   * tracking company name in the `company` field,
   * then provide tracking URLs for all tracking numbers from the `numbers` field.
   *   
   * Tracking URLs from the `urls` array field are being matched with the tracking numbers from the `numbers` array
   * field correspondingly their positions in the arrays.
   *   
   * Each URL must be an [RFC 3986](https://datatracker.ietf.org/doc/html/rfc3986) and
   * [RFC 3987](https://datatracker.ietf.org/doc/html/rfc3987)-compliant URI string.
   * For example, `"https://www.myshipping.com/track/?tracknumbers=TRACKING_NUMBER"` is a valid URL.
   * It includes a scheme (`https`) and a host (`myshipping.com`).
   */
  public List<String> getUrls() {
    return urls;
  }

  public void setUrls(List<String> urls) {
    this.urls = urls;
  }

  @Override
  public String toString() {
    return "FulfillmentTrackingInput{number='" + number + "', url='" + url + "', company='" + company + "', numbers='" + numbers + "', urls='" + urls + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FulfillmentTrackingInput that = (FulfillmentTrackingInput) o;
    return Objects.equals(number, that.number) &&
        Objects.equals(url, that.url) &&
        Objects.equals(company, that.company) &&
        Objects.equals(numbers, that.numbers) &&
        Objects.equals(urls, that.urls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(number, url, company, numbers, urls);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The tracking number of the fulfillment.
     *   
     * The tracking number will be clickable in the interface if one of the following applies
     * (the highest in the list has the highest priority):
     *   
     * * Tracking url provided in the `url` field.
     * * [Shopify-known tracking company name](https://shopify.dev/api/admin-graphql/latest/objects/FulfillmentTrackingInfo#supported-tracking-companies)
     *   specified in the `company` field.
     *   Shopify will build the tracking URL automatically based on the tracking number specified.
     * * The tracking number has a Shopify-known format.
     *   Shopify will guess the tracking provider and build the tracking url based on the tracking number format.
     *   Not all tracking carriers are supported, and multiple tracking carriers may use similarly formatted tracking numbers.
     *   This can result in an invalid tracking URL.
     *   It is highly recommended that you send the tracking company and the tracking URL.
     */
    private String number;

    /**
     * The URL to track the fulfillment.
     *   
     * The tracking URL is displayed in the merchant's admin on the order page.
     * The tracking URL is displayed in the shipping confirmation email, which can optionally be sent to the customer.
     * When accounts are enabled, it's also displayed in the customer's order history.
     *   
     * The URL must be an [RFC 3986](https://datatracker.ietf.org/doc/html/rfc3986) and
     * [RFC 3987](https://datatracker.ietf.org/doc/html/rfc3987)-compliant URI string.
     * For example, `"https://www.myshipping.com/track/?tracknumbers=TRACKING_NUMBER"` is a valid URL.
     * It includes a scheme (`https`) and a host (`myshipping.com`).
     */
    private String url;

    /**
     * The name of the tracking company.
     *   
     * If you specify a tracking company name from
     * [the list](https://shopify.dev/api/admin-graphql/latest/objects/FulfillmentTrackingInfo#supported-tracking-companies),
     * Shopify will automatically build tracking URLs for all provided tracking numbers,
     * which will make the tracking numbers clickable in the interface.
     * The same tracking company will be applied to all tracking numbers specified.
     *   
     * Additionally, for the tracking companies listed on the
     * [Shipping Carriers help page](https://help.shopify.com/manual/shipping/understanding-shipping/shipping-carriers#integrated-shipping-carriers)
     * Shopify will automatically update the fulfillment's `shipment_status` field during the fulfillment process.
     *   
     * > Note:
     * > Send the tracking company name exactly as written in
     * > [the list](https://shopify.dev/api/admin-graphql/latest/objects/FulfillmentTrackingInfo#supported-tracking-companies)
     * > (capitalization matters).
     */
    private String company;

    /**
     * The tracking numbers of the fulfillment, one or many.
     *   
     * With multiple tracking numbers, you can provide tracking information
     * for all shipments associated with the fulfillment, if there are more than one.
     * For example, if you're shipping assembly parts of one furniture item in several boxes.
     *   
     * Tracking numbers will be clickable in the interface if one of the following applies
     * (the highest in the list has the highest priority):
     *   
     * * Tracking URLs provided in the `urls` field.
     *   The tracking URLs will be matched to the tracking numbers based on their positions in the arrays.
     * * [Shopify-known tracking company name](https://shopify.dev/api/admin-graphql/latest/objects/FulfillmentTrackingInfo#supported-tracking-companies)
     *   specified in the `company` field.
     *   Shopify will build tracking URLs automatically for all tracking numbers specified.
     *   The same tracking company will be applied to all tracking numbers.
     * * Tracking numbers have a Shopify-known format.
     *   Shopify will guess tracking providers and build tracking URLs based on the tracking number formats.
     *   Not all tracking carriers are supported, and multiple tracking carriers may use similarly formatted tracking numbers.
     *   This can result in an invalid tracking URL.
     *   It is highly recommended that you send the tracking company and the tracking URLs.
     */
    private List<String> numbers;

    /**
     * The URLs to track the fulfillment, one or many.
     *   
     * The tracking URLs are displayed in the merchant's admin on the order page.
     * The tracking URLs are displayed in the shipping confirmation email, which can optionally be sent to the customer.
     * When accounts are enabled, the tracking URLs are also displayed in the customer's order history.
     *   
     * If you're not specifying a
     * [Shopify-known](https://shopify.dev/api/admin-graphql/latest/objects/FulfillmentTrackingInfo#supported-tracking-companies)
     * tracking company name in the `company` field,
     * then provide tracking URLs for all tracking numbers from the `numbers` field.
     *   
     * Tracking URLs from the `urls` array field are being matched with the tracking numbers from the `numbers` array
     * field correspondingly their positions in the arrays.
     *   
     * Each URL must be an [RFC 3986](https://datatracker.ietf.org/doc/html/rfc3986) and
     * [RFC 3987](https://datatracker.ietf.org/doc/html/rfc3987)-compliant URI string.
     * For example, `"https://www.myshipping.com/track/?tracknumbers=TRACKING_NUMBER"` is a valid URL.
     * It includes a scheme (`https`) and a host (`myshipping.com`).
     */
    private List<String> urls;

    public FulfillmentTrackingInput build() {
      FulfillmentTrackingInput result = new FulfillmentTrackingInput();
      result.number = this.number;
      result.url = this.url;
      result.company = this.company;
      result.numbers = this.numbers;
      result.urls = this.urls;
      return result;
    }

    /**
     * The tracking number of the fulfillment.
     *   
     * The tracking number will be clickable in the interface if one of the following applies
     * (the highest in the list has the highest priority):
     *   
     * * Tracking url provided in the `url` field.
     * * [Shopify-known tracking company name](https://shopify.dev/api/admin-graphql/latest/objects/FulfillmentTrackingInfo#supported-tracking-companies)
     *   specified in the `company` field.
     *   Shopify will build the tracking URL automatically based on the tracking number specified.
     * * The tracking number has a Shopify-known format.
     *   Shopify will guess the tracking provider and build the tracking url based on the tracking number format.
     *   Not all tracking carriers are supported, and multiple tracking carriers may use similarly formatted tracking numbers.
     *   This can result in an invalid tracking URL.
     *   It is highly recommended that you send the tracking company and the tracking URL.
     */
    public Builder number(String number) {
      this.number = number;
      return this;
    }

    /**
     * The URL to track the fulfillment.
     *   
     * The tracking URL is displayed in the merchant's admin on the order page.
     * The tracking URL is displayed in the shipping confirmation email, which can optionally be sent to the customer.
     * When accounts are enabled, it's also displayed in the customer's order history.
     *   
     * The URL must be an [RFC 3986](https://datatracker.ietf.org/doc/html/rfc3986) and
     * [RFC 3987](https://datatracker.ietf.org/doc/html/rfc3987)-compliant URI string.
     * For example, `"https://www.myshipping.com/track/?tracknumbers=TRACKING_NUMBER"` is a valid URL.
     * It includes a scheme (`https`) and a host (`myshipping.com`).
     */
    public Builder url(String url) {
      this.url = url;
      return this;
    }

    /**
     * The name of the tracking company.
     *   
     * If you specify a tracking company name from
     * [the list](https://shopify.dev/api/admin-graphql/latest/objects/FulfillmentTrackingInfo#supported-tracking-companies),
     * Shopify will automatically build tracking URLs for all provided tracking numbers,
     * which will make the tracking numbers clickable in the interface.
     * The same tracking company will be applied to all tracking numbers specified.
     *   
     * Additionally, for the tracking companies listed on the
     * [Shipping Carriers help page](https://help.shopify.com/manual/shipping/understanding-shipping/shipping-carriers#integrated-shipping-carriers)
     * Shopify will automatically update the fulfillment's `shipment_status` field during the fulfillment process.
     *   
     * > Note:
     * > Send the tracking company name exactly as written in
     * > [the list](https://shopify.dev/api/admin-graphql/latest/objects/FulfillmentTrackingInfo#supported-tracking-companies)
     * > (capitalization matters).
     */
    public Builder company(String company) {
      this.company = company;
      return this;
    }

    /**
     * The tracking numbers of the fulfillment, one or many.
     *   
     * With multiple tracking numbers, you can provide tracking information
     * for all shipments associated with the fulfillment, if there are more than one.
     * For example, if you're shipping assembly parts of one furniture item in several boxes.
     *   
     * Tracking numbers will be clickable in the interface if one of the following applies
     * (the highest in the list has the highest priority):
     *   
     * * Tracking URLs provided in the `urls` field.
     *   The tracking URLs will be matched to the tracking numbers based on their positions in the arrays.
     * * [Shopify-known tracking company name](https://shopify.dev/api/admin-graphql/latest/objects/FulfillmentTrackingInfo#supported-tracking-companies)
     *   specified in the `company` field.
     *   Shopify will build tracking URLs automatically for all tracking numbers specified.
     *   The same tracking company will be applied to all tracking numbers.
     * * Tracking numbers have a Shopify-known format.
     *   Shopify will guess tracking providers and build tracking URLs based on the tracking number formats.
     *   Not all tracking carriers are supported, and multiple tracking carriers may use similarly formatted tracking numbers.
     *   This can result in an invalid tracking URL.
     *   It is highly recommended that you send the tracking company and the tracking URLs.
     */
    public Builder numbers(List<String> numbers) {
      this.numbers = numbers;
      return this;
    }

    /**
     * The URLs to track the fulfillment, one or many.
     *   
     * The tracking URLs are displayed in the merchant's admin on the order page.
     * The tracking URLs are displayed in the shipping confirmation email, which can optionally be sent to the customer.
     * When accounts are enabled, the tracking URLs are also displayed in the customer's order history.
     *   
     * If you're not specifying a
     * [Shopify-known](https://shopify.dev/api/admin-graphql/latest/objects/FulfillmentTrackingInfo#supported-tracking-companies)
     * tracking company name in the `company` field,
     * then provide tracking URLs for all tracking numbers from the `numbers` field.
     *   
     * Tracking URLs from the `urls` array field are being matched with the tracking numbers from the `numbers` array
     * field correspondingly their positions in the arrays.
     *   
     * Each URL must be an [RFC 3986](https://datatracker.ietf.org/doc/html/rfc3986) and
     * [RFC 3987](https://datatracker.ietf.org/doc/html/rfc3987)-compliant URI string.
     * For example, `"https://www.myshipping.com/track/?tracknumbers=TRACKING_NUMBER"` is a valid URL.
     * It includes a scheme (`https`) and a host (`myshipping.com`).
     */
    public Builder urls(List<String> urls) {
      this.urls = urls;
      return this;
    }
  }
}
