package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Represents the shipping details that the customer chose for their order.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class ShippingLine implements DraftOrderPlatformDiscountAllocationTarget {
  /**
   * A reference to the carrier service that provided the rate.
   * Present when the rate was computed by a third-party carrier service.
   */
  private String carrierIdentifier;

  /**
   * A reference to the shipping method.
   */
  private String code;

  /**
   * The current shipping price after applying refunds, after applying discounts.
   * If the parent `order.taxesIncluded`` field is true, then this price includes
   * taxes. Otherwise, this field is the pre-tax price.
   */
  private MoneyBag currentDiscountedPriceSet;

  /**
   * Whether the shipping line is custom or not.
   */
  private boolean custom;

  /**
   * The general classification of the delivery method.
   */
  private String deliveryCategory;

  /**
   * The discounts that have been allocated to the shipping line.
   */
  private List<DiscountAllocation> discountAllocations;

  /**
   * The pre-tax shipping price with discounts applied.
   * As of API version 2024-07, this will be calculated including cart level discounts, such as the free shipping discount.
   */
  private MoneyV2 discountedPrice;

  /**
   * The shipping price after applying discounts. If the parent order.taxesIncluded
   * field is true, then this price includes taxes. If not, it's the pre-tax price.
   * As of API version 2024-07, this will be calculated including cart level discounts, such as the free shipping discount.
   */
  private MoneyBag discountedPriceSet;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * Whether the shipping line has been removed.
   */
  private boolean isRemoved;

  /**
   * The pre-tax shipping price without any discounts applied.
   */
  private MoneyV2 originalPrice;

  /**
   * The pre-tax shipping price without any discounts applied.
   */
  private MoneyBag originalPriceSet;

  /**
   * The phone number at the shipping address.
   */
  private String phone;

  /**
   * Returns the price of the shipping line.
   */
  private String price;

  /**
   * The fulfillment service requested for the shipping method.
   * Present if the shipping method requires processing by a third party fulfillment service.
   */
  private FulfillmentService requestedFulfillmentService;

  /**
   * A unique identifier for the shipping rate. The format can change without notice and isn't meant to be shown to users.
   */
  private String shippingRateHandle;

  /**
   * Returns the rate source for the shipping line.
   */
  private String source;

  /**
   * The TaxLine objects connected to this shipping line.
   */
  private List<TaxLine> taxLines;

  /**
   * Returns the title of the shipping line.
   */
  private String title;

  public ShippingLine() {
  }

  /**
   * A reference to the carrier service that provided the rate.
   * Present when the rate was computed by a third-party carrier service.
   */
  public String getCarrierIdentifier() {
    return carrierIdentifier;
  }

  public void setCarrierIdentifier(String carrierIdentifier) {
    this.carrierIdentifier = carrierIdentifier;
  }

  /**
   * A reference to the shipping method.
   */
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  /**
   * The current shipping price after applying refunds, after applying discounts.
   * If the parent `order.taxesIncluded`` field is true, then this price includes
   * taxes. Otherwise, this field is the pre-tax price.
   */
  public MoneyBag getCurrentDiscountedPriceSet() {
    return currentDiscountedPriceSet;
  }

  public void setCurrentDiscountedPriceSet(MoneyBag currentDiscountedPriceSet) {
    this.currentDiscountedPriceSet = currentDiscountedPriceSet;
  }

  /**
   * Whether the shipping line is custom or not.
   */
  public boolean getCustom() {
    return custom;
  }

  public void setCustom(boolean custom) {
    this.custom = custom;
  }

  /**
   * The general classification of the delivery method.
   */
  public String getDeliveryCategory() {
    return deliveryCategory;
  }

  public void setDeliveryCategory(String deliveryCategory) {
    this.deliveryCategory = deliveryCategory;
  }

  /**
   * The discounts that have been allocated to the shipping line.
   */
  public List<DiscountAllocation> getDiscountAllocations() {
    return discountAllocations;
  }

  public void setDiscountAllocations(List<DiscountAllocation> discountAllocations) {
    this.discountAllocations = discountAllocations;
  }

  /**
   * The pre-tax shipping price with discounts applied.
   * As of API version 2024-07, this will be calculated including cart level discounts, such as the free shipping discount.
   */
  public MoneyV2 getDiscountedPrice() {
    return discountedPrice;
  }

  public void setDiscountedPrice(MoneyV2 discountedPrice) {
    this.discountedPrice = discountedPrice;
  }

  /**
   * The shipping price after applying discounts. If the parent order.taxesIncluded
   * field is true, then this price includes taxes. If not, it's the pre-tax price.
   * As of API version 2024-07, this will be calculated including cart level discounts, such as the free shipping discount.
   */
  public MoneyBag getDiscountedPriceSet() {
    return discountedPriceSet;
  }

  public void setDiscountedPriceSet(MoneyBag discountedPriceSet) {
    this.discountedPriceSet = discountedPriceSet;
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
   * Whether the shipping line has been removed.
   */
  public boolean getIsRemoved() {
    return isRemoved;
  }

  public void setIsRemoved(boolean isRemoved) {
    this.isRemoved = isRemoved;
  }

  /**
   * The pre-tax shipping price without any discounts applied.
   */
  public MoneyV2 getOriginalPrice() {
    return originalPrice;
  }

  public void setOriginalPrice(MoneyV2 originalPrice) {
    this.originalPrice = originalPrice;
  }

  /**
   * The pre-tax shipping price without any discounts applied.
   */
  public MoneyBag getOriginalPriceSet() {
    return originalPriceSet;
  }

  public void setOriginalPriceSet(MoneyBag originalPriceSet) {
    this.originalPriceSet = originalPriceSet;
  }

  /**
   * The phone number at the shipping address.
   */
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  /**
   * Returns the price of the shipping line.
   */
  public String getPrice() {
    return price;
  }

  public void setPrice(String price) {
    this.price = price;
  }

  /**
   * The fulfillment service requested for the shipping method.
   * Present if the shipping method requires processing by a third party fulfillment service.
   */
  public FulfillmentService getRequestedFulfillmentService() {
    return requestedFulfillmentService;
  }

  public void setRequestedFulfillmentService(FulfillmentService requestedFulfillmentService) {
    this.requestedFulfillmentService = requestedFulfillmentService;
  }

  /**
   * A unique identifier for the shipping rate. The format can change without notice and isn't meant to be shown to users.
   */
  public String getShippingRateHandle() {
    return shippingRateHandle;
  }

  public void setShippingRateHandle(String shippingRateHandle) {
    this.shippingRateHandle = shippingRateHandle;
  }

  /**
   * Returns the rate source for the shipping line.
   */
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  /**
   * The TaxLine objects connected to this shipping line.
   */
  public List<TaxLine> getTaxLines() {
    return taxLines;
  }

  public void setTaxLines(List<TaxLine> taxLines) {
    this.taxLines = taxLines;
  }

  /**
   * Returns the title of the shipping line.
   */
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  @Override
  public String toString() {
    return "ShippingLine{carrierIdentifier='" + carrierIdentifier + "', code='" + code + "', currentDiscountedPriceSet='" + currentDiscountedPriceSet + "', custom='" + custom + "', deliveryCategory='" + deliveryCategory + "', discountAllocations='" + discountAllocations + "', discountedPrice='" + discountedPrice + "', discountedPriceSet='" + discountedPriceSet + "', id='" + id + "', isRemoved='" + isRemoved + "', originalPrice='" + originalPrice + "', originalPriceSet='" + originalPriceSet + "', phone='" + phone + "', price='" + price + "', requestedFulfillmentService='" + requestedFulfillmentService + "', shippingRateHandle='" + shippingRateHandle + "', source='" + source + "', taxLines='" + taxLines + "', title='" + title + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShippingLine that = (ShippingLine) o;
    return Objects.equals(carrierIdentifier, that.carrierIdentifier) &&
        Objects.equals(code, that.code) &&
        Objects.equals(currentDiscountedPriceSet, that.currentDiscountedPriceSet) &&
        custom == that.custom &&
        Objects.equals(deliveryCategory, that.deliveryCategory) &&
        Objects.equals(discountAllocations, that.discountAllocations) &&
        Objects.equals(discountedPrice, that.discountedPrice) &&
        Objects.equals(discountedPriceSet, that.discountedPriceSet) &&
        Objects.equals(id, that.id) &&
        isRemoved == that.isRemoved &&
        Objects.equals(originalPrice, that.originalPrice) &&
        Objects.equals(originalPriceSet, that.originalPriceSet) &&
        Objects.equals(phone, that.phone) &&
        Objects.equals(price, that.price) &&
        Objects.equals(requestedFulfillmentService, that.requestedFulfillmentService) &&
        Objects.equals(shippingRateHandle, that.shippingRateHandle) &&
        Objects.equals(source, that.source) &&
        Objects.equals(taxLines, that.taxLines) &&
        Objects.equals(title, that.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(carrierIdentifier, code, currentDiscountedPriceSet, custom, deliveryCategory, discountAllocations, discountedPrice, discountedPriceSet, id, isRemoved, originalPrice, originalPriceSet, phone, price, requestedFulfillmentService, shippingRateHandle, source, taxLines, title);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * A reference to the carrier service that provided the rate.
     * Present when the rate was computed by a third-party carrier service.
     */
    private String carrierIdentifier;

    /**
     * A reference to the shipping method.
     */
    private String code;

    /**
     * The current shipping price after applying refunds, after applying discounts.
     * If the parent `order.taxesIncluded`` field is true, then this price includes
     * taxes. Otherwise, this field is the pre-tax price.
     */
    private MoneyBag currentDiscountedPriceSet;

    /**
     * Whether the shipping line is custom or not.
     */
    private boolean custom;

    /**
     * The general classification of the delivery method.
     */
    private String deliveryCategory;

    /**
     * The discounts that have been allocated to the shipping line.
     */
    private List<DiscountAllocation> discountAllocations;

    /**
     * The pre-tax shipping price with discounts applied.
     * As of API version 2024-07, this will be calculated including cart level discounts, such as the free shipping discount.
     */
    private MoneyV2 discountedPrice;

    /**
     * The shipping price after applying discounts. If the parent order.taxesIncluded
     * field is true, then this price includes taxes. If not, it's the pre-tax price.
     * As of API version 2024-07, this will be calculated including cart level discounts, such as the free shipping discount.
     */
    private MoneyBag discountedPriceSet;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * Whether the shipping line has been removed.
     */
    private boolean isRemoved;

    /**
     * The pre-tax shipping price without any discounts applied.
     */
    private MoneyV2 originalPrice;

    /**
     * The pre-tax shipping price without any discounts applied.
     */
    private MoneyBag originalPriceSet;

    /**
     * The phone number at the shipping address.
     */
    private String phone;

    /**
     * Returns the price of the shipping line.
     */
    private String price;

    /**
     * The fulfillment service requested for the shipping method.
     * Present if the shipping method requires processing by a third party fulfillment service.
     */
    private FulfillmentService requestedFulfillmentService;

    /**
     * A unique identifier for the shipping rate. The format can change without notice and isn't meant to be shown to users.
     */
    private String shippingRateHandle;

    /**
     * Returns the rate source for the shipping line.
     */
    private String source;

    /**
     * The TaxLine objects connected to this shipping line.
     */
    private List<TaxLine> taxLines;

    /**
     * Returns the title of the shipping line.
     */
    private String title;

    public ShippingLine build() {
      ShippingLine result = new ShippingLine();
      result.carrierIdentifier = this.carrierIdentifier;
      result.code = this.code;
      result.currentDiscountedPriceSet = this.currentDiscountedPriceSet;
      result.custom = this.custom;
      result.deliveryCategory = this.deliveryCategory;
      result.discountAllocations = this.discountAllocations;
      result.discountedPrice = this.discountedPrice;
      result.discountedPriceSet = this.discountedPriceSet;
      result.id = this.id;
      result.isRemoved = this.isRemoved;
      result.originalPrice = this.originalPrice;
      result.originalPriceSet = this.originalPriceSet;
      result.phone = this.phone;
      result.price = this.price;
      result.requestedFulfillmentService = this.requestedFulfillmentService;
      result.shippingRateHandle = this.shippingRateHandle;
      result.source = this.source;
      result.taxLines = this.taxLines;
      result.title = this.title;
      return result;
    }

    /**
     * A reference to the carrier service that provided the rate.
     * Present when the rate was computed by a third-party carrier service.
     */
    public Builder carrierIdentifier(String carrierIdentifier) {
      this.carrierIdentifier = carrierIdentifier;
      return this;
    }

    /**
     * A reference to the shipping method.
     */
    public Builder code(String code) {
      this.code = code;
      return this;
    }

    /**
     * The current shipping price after applying refunds, after applying discounts.
     * If the parent `order.taxesIncluded`` field is true, then this price includes
     * taxes. Otherwise, this field is the pre-tax price.
     */
    public Builder currentDiscountedPriceSet(MoneyBag currentDiscountedPriceSet) {
      this.currentDiscountedPriceSet = currentDiscountedPriceSet;
      return this;
    }

    /**
     * Whether the shipping line is custom or not.
     */
    public Builder custom(boolean custom) {
      this.custom = custom;
      return this;
    }

    /**
     * The general classification of the delivery method.
     */
    public Builder deliveryCategory(String deliveryCategory) {
      this.deliveryCategory = deliveryCategory;
      return this;
    }

    /**
     * The discounts that have been allocated to the shipping line.
     */
    public Builder discountAllocations(List<DiscountAllocation> discountAllocations) {
      this.discountAllocations = discountAllocations;
      return this;
    }

    /**
     * The pre-tax shipping price with discounts applied.
     * As of API version 2024-07, this will be calculated including cart level discounts, such as the free shipping discount.
     */
    public Builder discountedPrice(MoneyV2 discountedPrice) {
      this.discountedPrice = discountedPrice;
      return this;
    }

    /**
     * The shipping price after applying discounts. If the parent order.taxesIncluded
     * field is true, then this price includes taxes. If not, it's the pre-tax price.
     * As of API version 2024-07, this will be calculated including cart level discounts, such as the free shipping discount.
     */
    public Builder discountedPriceSet(MoneyBag discountedPriceSet) {
      this.discountedPriceSet = discountedPriceSet;
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
     * Whether the shipping line has been removed.
     */
    public Builder isRemoved(boolean isRemoved) {
      this.isRemoved = isRemoved;
      return this;
    }

    /**
     * The pre-tax shipping price without any discounts applied.
     */
    public Builder originalPrice(MoneyV2 originalPrice) {
      this.originalPrice = originalPrice;
      return this;
    }

    /**
     * The pre-tax shipping price without any discounts applied.
     */
    public Builder originalPriceSet(MoneyBag originalPriceSet) {
      this.originalPriceSet = originalPriceSet;
      return this;
    }

    /**
     * The phone number at the shipping address.
     */
    public Builder phone(String phone) {
      this.phone = phone;
      return this;
    }

    /**
     * Returns the price of the shipping line.
     */
    public Builder price(String price) {
      this.price = price;
      return this;
    }

    /**
     * The fulfillment service requested for the shipping method.
     * Present if the shipping method requires processing by a third party fulfillment service.
     */
    public Builder requestedFulfillmentService(FulfillmentService requestedFulfillmentService) {
      this.requestedFulfillmentService = requestedFulfillmentService;
      return this;
    }

    /**
     * A unique identifier for the shipping rate. The format can change without notice and isn't meant to be shown to users.
     */
    public Builder shippingRateHandle(String shippingRateHandle) {
      this.shippingRateHandle = shippingRateHandle;
      return this;
    }

    /**
     * Returns the rate source for the shipping line.
     */
    public Builder source(String source) {
      this.source = source;
      return this;
    }

    /**
     * The TaxLine objects connected to this shipping line.
     */
    public Builder taxLines(List<TaxLine> taxLines) {
      this.taxLines = taxLines;
      return this;
    }

    /**
     * Returns the title of the shipping line.
     */
    public Builder title(String title) {
      this.title = title;
      return this;
    }
  }
}
