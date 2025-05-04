package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Represents individual products and quantities purchased in the associated order.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class LineItem implements com.shopify.admin.types.Node {
  /**
   * Whether the line item can be restocked.
   */
  private boolean canRestock;

  /**
   * The subscription contract associated with this line item.
   */
  private SubscriptionContract contract;

  /**
   * The number of units ordered, excluding refunded and removed units.
   */
  private int currentQuantity;

  /**
   * A list of attributes that represent custom features or special requests.
   */
  private List<Attribute> customAttributes;

  /**
   * The discounts that have been allocated to the line item by discount
   * applications, including discounts allocated to refunded and removed quantities.
   */
  private List<DiscountAllocation> discountAllocations;

  /**
   * The total discounted price of the line item in shop currency, including
   * refunded and removed quantities. This value doesn't include order-level discounts.
   */
  private String discountedTotal;

  /**
   * The total discounted price of the line item in shop and presentment
   * currencies, including refunded and removed quantities. This value doesn't
   * include order-level discounts. Code-based discounts aren't included by default.
   */
  private MoneyBag discountedTotalSet;

  /**
   * The approximate unit price of the line item in shop currency. This value
   * includes line-level discounts and discounts applied to refunded and removed
   * quantities. It doesn't include order-level or code-based discounts.
   */
  private String discountedUnitPrice;

  /**
   * The approximate unit price of the line item in shop and presentment
   * currencies. This value includes discounts applied to refunded and removed quantities.
   */
  private MoneyBag discountedUnitPriceAfterAllDiscountsSet;

  /**
   * The approximate unit price of the line item in shop and presentment
   * currencies. This value includes line-level discounts and discounts applied to
   * refunded and removed quantities. It doesn't include order-level or code-based discounts.
   */
  private MoneyBag discountedUnitPriceSet;

  /**
   * The duties associated with the line item.
   */
  private List<Duty> duties;

  /**
   * The total number of units to fulfill.
   */
  private int fulfillableQuantity;

  /**
   * The fulfillment service that stocks the product variant belonging to a line item.
   *   
   * This is a third-party fulfillment service in the following scenarios:
   *   
   * **Scenario 1**
   * - The product variant is stocked by a single fulfillment service.
   * - The [FulfillmentService](/api/admin-graphql/latest/objects/FulfillmentService)
   * is a third-party fulfillment service. Third-party fulfillment services don't
   * have a handle with the value `manual`.
   *   
   * **Scenario 2**
   * - Multiple fulfillment services stock the product variant.
   * - The last time that the line item was unfulfilled, it was awaiting
   * fulfillment by a third-party fulfillment service. Third-party fulfillment
   * services don't have a handle with the value `manual`.
   *   
   * If none of the above conditions are met, then the fulfillment service has the `manual` handle.
   */
  private FulfillmentService fulfillmentService;

  /**
   * The line item's fulfillment status. Returns 'fulfilled' if fulfillableQuantity >= quantity,
   * 'partial' if  fulfillableQuantity > 0, and 'unfulfilled' otherwise.
   */
  private String fulfillmentStatus;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The image associated to the line item's variant.
   */
  private Image image;

  /**
   * Whether the line item represents the purchase of a gift card.
   */
  private boolean isGiftCard;

  /**
   * The line item group associated to the line item.
   */
  private LineItemGroup lineItemGroup;

  /**
   * Whether the line item can be edited or not.
   */
  private boolean merchantEditable;

  /**
   * The title of the product, optionally appended with the title of the variant (if applicable).
   */
  private String name;

  /**
   * The total number of units that can't be fulfilled. For example, if items have
   * been refunded, or the item is not something that can be fulfilled, like a tip. Please see the [FulfillmentOrder](https://shopify.dev/api/admin-graphql/latest/objects/FulfillmentOrder)
   * object for more fulfillment details.
   */
  private int nonFulfillableQuantity;

  /**
   * In shop currency, the total price of the line item when the order was created.
   * This value doesn't include discounts.
   */
  private String originalTotal;

  /**
   * In shop and presentment currencies, the total price of the line item when the order was created.
   * This value doesn't include discounts.
   */
  private MoneyBag originalTotalSet;

  /**
   * In shop currency, the unit price of the line item when the order was created. This value doesn't include discounts.
   */
  private String originalUnitPrice;

  /**
   * In shop and presentment currencies, the unit price of the line item when the
   * order was created. This value doesn't include discounts.
   */
  private MoneyBag originalUnitPriceSet;

  /**
   * The Product object associated with this line item's variant.
   */
  private Product product;

  /**
   * The number of units ordered, including refunded and removed units.
   */
  private int quantity;

  /**
   * The number of units ordered, excluding refunded units.
   */
  private int refundableQuantity;

  /**
   * Whether physical shipping is required for the variant.
   */
  private boolean requiresShipping;

  /**
   * Whether the line item can be restocked.
   */
  private boolean restockable;

  /**
   * The selling plan details associated with the line item.
   */
  private LineItemSellingPlan sellingPlan;

  /**
   * The variant SKU number.
   */
  private String sku;

  /**
   * Staff attributed to the line item.
   */
  private StaffMember staffMember;

  /**
   * The taxes charged for the line item, including taxes charged for refunded and removed quantities.
   */
  private List<TaxLine> taxLines;

  /**
   * Whether the variant is taxable.
   */
  private boolean taxable;

  /**
   * The title of the product at time of order creation.
   */
  private String title;

  /**
   * The total discount allocated to the line item in shop currency, including the
   * total allocated to refunded and removed quantities. This value doesn't include
   * order-level discounts.
   */
  private String totalDiscount;

  /**
   * The total discount allocated to the line item in shop and presentment
   * currencies, including the total allocated to refunded and removed quantities.
   * This value doesn't include order-level discounts.
   */
  private MoneyBag totalDiscountSet;

  /**
   * In shop currency, the total discounted price of the unfulfilled quantity for the line item.
   */
  private String unfulfilledDiscountedTotal;

  /**
   * In shop and presentment currencies, the total discounted price of the unfulfilled quantity for the line item.
   */
  private MoneyBag unfulfilledDiscountedTotalSet;

  /**
   * In shop currency, the total price of the unfulfilled quantity for the line item. This value doesn't include discounts.
   */
  private String unfulfilledOriginalTotal;

  /**
   * In shop and presentment currencies, the total price of the unfulfilled
   * quantity for the line item. This value doesn't include discounts.
   */
  private MoneyBag unfulfilledOriginalTotalSet;

  /**
   * The number of units not yet fulfilled.
   */
  private int unfulfilledQuantity;

  /**
   * The Variant object associated with this line item.
   */
  private ProductVariant variant;

  /**
   * The title of the variant at time of order creation.
   */
  private String variantTitle;

  /**
   * The name of the vendor who made the variant.
   */
  private String vendor;

  public LineItem() {
  }

  /**
   * Whether the line item can be restocked.
   */
  public boolean getCanRestock() {
    return canRestock;
  }

  public void setCanRestock(boolean canRestock) {
    this.canRestock = canRestock;
  }

  /**
   * The subscription contract associated with this line item.
   */
  public SubscriptionContract getContract() {
    return contract;
  }

  public void setContract(SubscriptionContract contract) {
    this.contract = contract;
  }

  /**
   * The number of units ordered, excluding refunded and removed units.
   */
  public int getCurrentQuantity() {
    return currentQuantity;
  }

  public void setCurrentQuantity(int currentQuantity) {
    this.currentQuantity = currentQuantity;
  }

  /**
   * A list of attributes that represent custom features or special requests.
   */
  public List<Attribute> getCustomAttributes() {
    return customAttributes;
  }

  public void setCustomAttributes(List<Attribute> customAttributes) {
    this.customAttributes = customAttributes;
  }

  /**
   * The discounts that have been allocated to the line item by discount
   * applications, including discounts allocated to refunded and removed quantities.
   */
  public List<DiscountAllocation> getDiscountAllocations() {
    return discountAllocations;
  }

  public void setDiscountAllocations(List<DiscountAllocation> discountAllocations) {
    this.discountAllocations = discountAllocations;
  }

  /**
   * The total discounted price of the line item in shop currency, including
   * refunded and removed quantities. This value doesn't include order-level discounts.
   */
  public String getDiscountedTotal() {
    return discountedTotal;
  }

  public void setDiscountedTotal(String discountedTotal) {
    this.discountedTotal = discountedTotal;
  }

  /**
   * The total discounted price of the line item in shop and presentment
   * currencies, including refunded and removed quantities. This value doesn't
   * include order-level discounts. Code-based discounts aren't included by default.
   */
  public MoneyBag getDiscountedTotalSet() {
    return discountedTotalSet;
  }

  public void setDiscountedTotalSet(MoneyBag discountedTotalSet) {
    this.discountedTotalSet = discountedTotalSet;
  }

  /**
   * The approximate unit price of the line item in shop currency. This value
   * includes line-level discounts and discounts applied to refunded and removed
   * quantities. It doesn't include order-level or code-based discounts.
   */
  public String getDiscountedUnitPrice() {
    return discountedUnitPrice;
  }

  public void setDiscountedUnitPrice(String discountedUnitPrice) {
    this.discountedUnitPrice = discountedUnitPrice;
  }

  /**
   * The approximate unit price of the line item in shop and presentment
   * currencies. This value includes discounts applied to refunded and removed quantities.
   */
  public MoneyBag getDiscountedUnitPriceAfterAllDiscountsSet() {
    return discountedUnitPriceAfterAllDiscountsSet;
  }

  public void setDiscountedUnitPriceAfterAllDiscountsSet(
      MoneyBag discountedUnitPriceAfterAllDiscountsSet) {
    this.discountedUnitPriceAfterAllDiscountsSet = discountedUnitPriceAfterAllDiscountsSet;
  }

  /**
   * The approximate unit price of the line item in shop and presentment
   * currencies. This value includes line-level discounts and discounts applied to
   * refunded and removed quantities. It doesn't include order-level or code-based discounts.
   */
  public MoneyBag getDiscountedUnitPriceSet() {
    return discountedUnitPriceSet;
  }

  public void setDiscountedUnitPriceSet(MoneyBag discountedUnitPriceSet) {
    this.discountedUnitPriceSet = discountedUnitPriceSet;
  }

  /**
   * The duties associated with the line item.
   */
  public List<Duty> getDuties() {
    return duties;
  }

  public void setDuties(List<Duty> duties) {
    this.duties = duties;
  }

  /**
   * The total number of units to fulfill.
   */
  public int getFulfillableQuantity() {
    return fulfillableQuantity;
  }

  public void setFulfillableQuantity(int fulfillableQuantity) {
    this.fulfillableQuantity = fulfillableQuantity;
  }

  /**
   * The fulfillment service that stocks the product variant belonging to a line item.
   *   
   * This is a third-party fulfillment service in the following scenarios:
   *   
   * **Scenario 1**
   * - The product variant is stocked by a single fulfillment service.
   * - The [FulfillmentService](/api/admin-graphql/latest/objects/FulfillmentService)
   * is a third-party fulfillment service. Third-party fulfillment services don't
   * have a handle with the value `manual`.
   *   
   * **Scenario 2**
   * - Multiple fulfillment services stock the product variant.
   * - The last time that the line item was unfulfilled, it was awaiting
   * fulfillment by a third-party fulfillment service. Third-party fulfillment
   * services don't have a handle with the value `manual`.
   *   
   * If none of the above conditions are met, then the fulfillment service has the `manual` handle.
   */
  public FulfillmentService getFulfillmentService() {
    return fulfillmentService;
  }

  public void setFulfillmentService(FulfillmentService fulfillmentService) {
    this.fulfillmentService = fulfillmentService;
  }

  /**
   * The line item's fulfillment status. Returns 'fulfilled' if fulfillableQuantity >= quantity,
   * 'partial' if  fulfillableQuantity > 0, and 'unfulfilled' otherwise.
   */
  public String getFulfillmentStatus() {
    return fulfillmentStatus;
  }

  public void setFulfillmentStatus(String fulfillmentStatus) {
    this.fulfillmentStatus = fulfillmentStatus;
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
   * The image associated to the line item's variant.
   */
  public Image getImage() {
    return image;
  }

  public void setImage(Image image) {
    this.image = image;
  }

  /**
   * Whether the line item represents the purchase of a gift card.
   */
  public boolean getIsGiftCard() {
    return isGiftCard;
  }

  public void setIsGiftCard(boolean isGiftCard) {
    this.isGiftCard = isGiftCard;
  }

  /**
   * The line item group associated to the line item.
   */
  public LineItemGroup getLineItemGroup() {
    return lineItemGroup;
  }

  public void setLineItemGroup(LineItemGroup lineItemGroup) {
    this.lineItemGroup = lineItemGroup;
  }

  /**
   * Whether the line item can be edited or not.
   */
  public boolean getMerchantEditable() {
    return merchantEditable;
  }

  public void setMerchantEditable(boolean merchantEditable) {
    this.merchantEditable = merchantEditable;
  }

  /**
   * The title of the product, optionally appended with the title of the variant (if applicable).
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * The total number of units that can't be fulfilled. For example, if items have
   * been refunded, or the item is not something that can be fulfilled, like a tip. Please see the [FulfillmentOrder](https://shopify.dev/api/admin-graphql/latest/objects/FulfillmentOrder)
   * object for more fulfillment details.
   */
  public int getNonFulfillableQuantity() {
    return nonFulfillableQuantity;
  }

  public void setNonFulfillableQuantity(int nonFulfillableQuantity) {
    this.nonFulfillableQuantity = nonFulfillableQuantity;
  }

  /**
   * In shop currency, the total price of the line item when the order was created.
   * This value doesn't include discounts.
   */
  public String getOriginalTotal() {
    return originalTotal;
  }

  public void setOriginalTotal(String originalTotal) {
    this.originalTotal = originalTotal;
  }

  /**
   * In shop and presentment currencies, the total price of the line item when the order was created.
   * This value doesn't include discounts.
   */
  public MoneyBag getOriginalTotalSet() {
    return originalTotalSet;
  }

  public void setOriginalTotalSet(MoneyBag originalTotalSet) {
    this.originalTotalSet = originalTotalSet;
  }

  /**
   * In shop currency, the unit price of the line item when the order was created. This value doesn't include discounts.
   */
  public String getOriginalUnitPrice() {
    return originalUnitPrice;
  }

  public void setOriginalUnitPrice(String originalUnitPrice) {
    this.originalUnitPrice = originalUnitPrice;
  }

  /**
   * In shop and presentment currencies, the unit price of the line item when the
   * order was created. This value doesn't include discounts.
   */
  public MoneyBag getOriginalUnitPriceSet() {
    return originalUnitPriceSet;
  }

  public void setOriginalUnitPriceSet(MoneyBag originalUnitPriceSet) {
    this.originalUnitPriceSet = originalUnitPriceSet;
  }

  /**
   * The Product object associated with this line item's variant.
   */
  public Product getProduct() {
    return product;
  }

  public void setProduct(Product product) {
    this.product = product;
  }

  /**
   * The number of units ordered, including refunded and removed units.
   */
  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  /**
   * The number of units ordered, excluding refunded units.
   */
  public int getRefundableQuantity() {
    return refundableQuantity;
  }

  public void setRefundableQuantity(int refundableQuantity) {
    this.refundableQuantity = refundableQuantity;
  }

  /**
   * Whether physical shipping is required for the variant.
   */
  public boolean getRequiresShipping() {
    return requiresShipping;
  }

  public void setRequiresShipping(boolean requiresShipping) {
    this.requiresShipping = requiresShipping;
  }

  /**
   * Whether the line item can be restocked.
   */
  public boolean getRestockable() {
    return restockable;
  }

  public void setRestockable(boolean restockable) {
    this.restockable = restockable;
  }

  /**
   * The selling plan details associated with the line item.
   */
  public LineItemSellingPlan getSellingPlan() {
    return sellingPlan;
  }

  public void setSellingPlan(LineItemSellingPlan sellingPlan) {
    this.sellingPlan = sellingPlan;
  }

  /**
   * The variant SKU number.
   */
  public String getSku() {
    return sku;
  }

  public void setSku(String sku) {
    this.sku = sku;
  }

  /**
   * Staff attributed to the line item.
   */
  public StaffMember getStaffMember() {
    return staffMember;
  }

  public void setStaffMember(StaffMember staffMember) {
    this.staffMember = staffMember;
  }

  /**
   * The taxes charged for the line item, including taxes charged for refunded and removed quantities.
   */
  public List<TaxLine> getTaxLines() {
    return taxLines;
  }

  public void setTaxLines(List<TaxLine> taxLines) {
    this.taxLines = taxLines;
  }

  /**
   * Whether the variant is taxable.
   */
  public boolean getTaxable() {
    return taxable;
  }

  public void setTaxable(boolean taxable) {
    this.taxable = taxable;
  }

  /**
   * The title of the product at time of order creation.
   */
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * The total discount allocated to the line item in shop currency, including the
   * total allocated to refunded and removed quantities. This value doesn't include
   * order-level discounts.
   */
  public String getTotalDiscount() {
    return totalDiscount;
  }

  public void setTotalDiscount(String totalDiscount) {
    this.totalDiscount = totalDiscount;
  }

  /**
   * The total discount allocated to the line item in shop and presentment
   * currencies, including the total allocated to refunded and removed quantities.
   * This value doesn't include order-level discounts.
   */
  public MoneyBag getTotalDiscountSet() {
    return totalDiscountSet;
  }

  public void setTotalDiscountSet(MoneyBag totalDiscountSet) {
    this.totalDiscountSet = totalDiscountSet;
  }

  /**
   * In shop currency, the total discounted price of the unfulfilled quantity for the line item.
   */
  public String getUnfulfilledDiscountedTotal() {
    return unfulfilledDiscountedTotal;
  }

  public void setUnfulfilledDiscountedTotal(String unfulfilledDiscountedTotal) {
    this.unfulfilledDiscountedTotal = unfulfilledDiscountedTotal;
  }

  /**
   * In shop and presentment currencies, the total discounted price of the unfulfilled quantity for the line item.
   */
  public MoneyBag getUnfulfilledDiscountedTotalSet() {
    return unfulfilledDiscountedTotalSet;
  }

  public void setUnfulfilledDiscountedTotalSet(MoneyBag unfulfilledDiscountedTotalSet) {
    this.unfulfilledDiscountedTotalSet = unfulfilledDiscountedTotalSet;
  }

  /**
   * In shop currency, the total price of the unfulfilled quantity for the line item. This value doesn't include discounts.
   */
  public String getUnfulfilledOriginalTotal() {
    return unfulfilledOriginalTotal;
  }

  public void setUnfulfilledOriginalTotal(String unfulfilledOriginalTotal) {
    this.unfulfilledOriginalTotal = unfulfilledOriginalTotal;
  }

  /**
   * In shop and presentment currencies, the total price of the unfulfilled
   * quantity for the line item. This value doesn't include discounts.
   */
  public MoneyBag getUnfulfilledOriginalTotalSet() {
    return unfulfilledOriginalTotalSet;
  }

  public void setUnfulfilledOriginalTotalSet(MoneyBag unfulfilledOriginalTotalSet) {
    this.unfulfilledOriginalTotalSet = unfulfilledOriginalTotalSet;
  }

  /**
   * The number of units not yet fulfilled.
   */
  public int getUnfulfilledQuantity() {
    return unfulfilledQuantity;
  }

  public void setUnfulfilledQuantity(int unfulfilledQuantity) {
    this.unfulfilledQuantity = unfulfilledQuantity;
  }

  /**
   * The Variant object associated with this line item.
   */
  public ProductVariant getVariant() {
    return variant;
  }

  public void setVariant(ProductVariant variant) {
    this.variant = variant;
  }

  /**
   * The title of the variant at time of order creation.
   */
  public String getVariantTitle() {
    return variantTitle;
  }

  public void setVariantTitle(String variantTitle) {
    this.variantTitle = variantTitle;
  }

  /**
   * The name of the vendor who made the variant.
   */
  public String getVendor() {
    return vendor;
  }

  public void setVendor(String vendor) {
    this.vendor = vendor;
  }

  @Override
  public String toString() {
    return "LineItem{canRestock='" + canRestock + "', contract='" + contract + "', currentQuantity='" + currentQuantity + "', customAttributes='" + customAttributes + "', discountAllocations='" + discountAllocations + "', discountedTotal='" + discountedTotal + "', discountedTotalSet='" + discountedTotalSet + "', discountedUnitPrice='" + discountedUnitPrice + "', discountedUnitPriceAfterAllDiscountsSet='" + discountedUnitPriceAfterAllDiscountsSet + "', discountedUnitPriceSet='" + discountedUnitPriceSet + "', duties='" + duties + "', fulfillableQuantity='" + fulfillableQuantity + "', fulfillmentService='" + fulfillmentService + "', fulfillmentStatus='" + fulfillmentStatus + "', id='" + id + "', image='" + image + "', isGiftCard='" + isGiftCard + "', lineItemGroup='" + lineItemGroup + "', merchantEditable='" + merchantEditable + "', name='" + name + "', nonFulfillableQuantity='" + nonFulfillableQuantity + "', originalTotal='" + originalTotal + "', originalTotalSet='" + originalTotalSet + "', originalUnitPrice='" + originalUnitPrice + "', originalUnitPriceSet='" + originalUnitPriceSet + "', product='" + product + "', quantity='" + quantity + "', refundableQuantity='" + refundableQuantity + "', requiresShipping='" + requiresShipping + "', restockable='" + restockable + "', sellingPlan='" + sellingPlan + "', sku='" + sku + "', staffMember='" + staffMember + "', taxLines='" + taxLines + "', taxable='" + taxable + "', title='" + title + "', totalDiscount='" + totalDiscount + "', totalDiscountSet='" + totalDiscountSet + "', unfulfilledDiscountedTotal='" + unfulfilledDiscountedTotal + "', unfulfilledDiscountedTotalSet='" + unfulfilledDiscountedTotalSet + "', unfulfilledOriginalTotal='" + unfulfilledOriginalTotal + "', unfulfilledOriginalTotalSet='" + unfulfilledOriginalTotalSet + "', unfulfilledQuantity='" + unfulfilledQuantity + "', variant='" + variant + "', variantTitle='" + variantTitle + "', vendor='" + vendor + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    LineItem that = (LineItem) o;
    return canRestock == that.canRestock &&
        Objects.equals(contract, that.contract) &&
        currentQuantity == that.currentQuantity &&
        Objects.equals(customAttributes, that.customAttributes) &&
        Objects.equals(discountAllocations, that.discountAllocations) &&
        Objects.equals(discountedTotal, that.discountedTotal) &&
        Objects.equals(discountedTotalSet, that.discountedTotalSet) &&
        Objects.equals(discountedUnitPrice, that.discountedUnitPrice) &&
        Objects.equals(discountedUnitPriceAfterAllDiscountsSet, that.discountedUnitPriceAfterAllDiscountsSet) &&
        Objects.equals(discountedUnitPriceSet, that.discountedUnitPriceSet) &&
        Objects.equals(duties, that.duties) &&
        fulfillableQuantity == that.fulfillableQuantity &&
        Objects.equals(fulfillmentService, that.fulfillmentService) &&
        Objects.equals(fulfillmentStatus, that.fulfillmentStatus) &&
        Objects.equals(id, that.id) &&
        Objects.equals(image, that.image) &&
        isGiftCard == that.isGiftCard &&
        Objects.equals(lineItemGroup, that.lineItemGroup) &&
        merchantEditable == that.merchantEditable &&
        Objects.equals(name, that.name) &&
        nonFulfillableQuantity == that.nonFulfillableQuantity &&
        Objects.equals(originalTotal, that.originalTotal) &&
        Objects.equals(originalTotalSet, that.originalTotalSet) &&
        Objects.equals(originalUnitPrice, that.originalUnitPrice) &&
        Objects.equals(originalUnitPriceSet, that.originalUnitPriceSet) &&
        Objects.equals(product, that.product) &&
        quantity == that.quantity &&
        refundableQuantity == that.refundableQuantity &&
        requiresShipping == that.requiresShipping &&
        restockable == that.restockable &&
        Objects.equals(sellingPlan, that.sellingPlan) &&
        Objects.equals(sku, that.sku) &&
        Objects.equals(staffMember, that.staffMember) &&
        Objects.equals(taxLines, that.taxLines) &&
        taxable == that.taxable &&
        Objects.equals(title, that.title) &&
        Objects.equals(totalDiscount, that.totalDiscount) &&
        Objects.equals(totalDiscountSet, that.totalDiscountSet) &&
        Objects.equals(unfulfilledDiscountedTotal, that.unfulfilledDiscountedTotal) &&
        Objects.equals(unfulfilledDiscountedTotalSet, that.unfulfilledDiscountedTotalSet) &&
        Objects.equals(unfulfilledOriginalTotal, that.unfulfilledOriginalTotal) &&
        Objects.equals(unfulfilledOriginalTotalSet, that.unfulfilledOriginalTotalSet) &&
        unfulfilledQuantity == that.unfulfilledQuantity &&
        Objects.equals(variant, that.variant) &&
        Objects.equals(variantTitle, that.variantTitle) &&
        Objects.equals(vendor, that.vendor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canRestock, contract, currentQuantity, customAttributes, discountAllocations, discountedTotal, discountedTotalSet, discountedUnitPrice, discountedUnitPriceAfterAllDiscountsSet, discountedUnitPriceSet, duties, fulfillableQuantity, fulfillmentService, fulfillmentStatus, id, image, isGiftCard, lineItemGroup, merchantEditable, name, nonFulfillableQuantity, originalTotal, originalTotalSet, originalUnitPrice, originalUnitPriceSet, product, quantity, refundableQuantity, requiresShipping, restockable, sellingPlan, sku, staffMember, taxLines, taxable, title, totalDiscount, totalDiscountSet, unfulfilledDiscountedTotal, unfulfilledDiscountedTotalSet, unfulfilledOriginalTotal, unfulfilledOriginalTotalSet, unfulfilledQuantity, variant, variantTitle, vendor);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Whether the line item can be restocked.
     */
    private boolean canRestock;

    /**
     * The subscription contract associated with this line item.
     */
    private SubscriptionContract contract;

    /**
     * The number of units ordered, excluding refunded and removed units.
     */
    private int currentQuantity;

    /**
     * A list of attributes that represent custom features or special requests.
     */
    private List<Attribute> customAttributes;

    /**
     * The discounts that have been allocated to the line item by discount
     * applications, including discounts allocated to refunded and removed quantities.
     */
    private List<DiscountAllocation> discountAllocations;

    /**
     * The total discounted price of the line item in shop currency, including
     * refunded and removed quantities. This value doesn't include order-level discounts.
     */
    private String discountedTotal;

    /**
     * The total discounted price of the line item in shop and presentment
     * currencies, including refunded and removed quantities. This value doesn't
     * include order-level discounts. Code-based discounts aren't included by default.
     */
    private MoneyBag discountedTotalSet;

    /**
     * The approximate unit price of the line item in shop currency. This value
     * includes line-level discounts and discounts applied to refunded and removed
     * quantities. It doesn't include order-level or code-based discounts.
     */
    private String discountedUnitPrice;

    /**
     * The approximate unit price of the line item in shop and presentment
     * currencies. This value includes discounts applied to refunded and removed quantities.
     */
    private MoneyBag discountedUnitPriceAfterAllDiscountsSet;

    /**
     * The approximate unit price of the line item in shop and presentment
     * currencies. This value includes line-level discounts and discounts applied to
     * refunded and removed quantities. It doesn't include order-level or code-based discounts.
     */
    private MoneyBag discountedUnitPriceSet;

    /**
     * The duties associated with the line item.
     */
    private List<Duty> duties;

    /**
     * The total number of units to fulfill.
     */
    private int fulfillableQuantity;

    /**
     * The fulfillment service that stocks the product variant belonging to a line item.
     *   
     * This is a third-party fulfillment service in the following scenarios:
     *   
     * **Scenario 1**
     * - The product variant is stocked by a single fulfillment service.
     * - The [FulfillmentService](/api/admin-graphql/latest/objects/FulfillmentService)
     * is a third-party fulfillment service. Third-party fulfillment services don't
     * have a handle with the value `manual`.
     *   
     * **Scenario 2**
     * - Multiple fulfillment services stock the product variant.
     * - The last time that the line item was unfulfilled, it was awaiting
     * fulfillment by a third-party fulfillment service. Third-party fulfillment
     * services don't have a handle with the value `manual`.
     *   
     * If none of the above conditions are met, then the fulfillment service has the `manual` handle.
     */
    private FulfillmentService fulfillmentService;

    /**
     * The line item's fulfillment status. Returns 'fulfilled' if fulfillableQuantity >= quantity,
     * 'partial' if  fulfillableQuantity > 0, and 'unfulfilled' otherwise.
     */
    private String fulfillmentStatus;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The image associated to the line item's variant.
     */
    private Image image;

    /**
     * Whether the line item represents the purchase of a gift card.
     */
    private boolean isGiftCard;

    /**
     * The line item group associated to the line item.
     */
    private LineItemGroup lineItemGroup;

    /**
     * Whether the line item can be edited or not.
     */
    private boolean merchantEditable;

    /**
     * The title of the product, optionally appended with the title of the variant (if applicable).
     */
    private String name;

    /**
     * The total number of units that can't be fulfilled. For example, if items have
     * been refunded, or the item is not something that can be fulfilled, like a tip. Please see the [FulfillmentOrder](https://shopify.dev/api/admin-graphql/latest/objects/FulfillmentOrder)
     * object for more fulfillment details.
     */
    private int nonFulfillableQuantity;

    /**
     * In shop currency, the total price of the line item when the order was created.
     * This value doesn't include discounts.
     */
    private String originalTotal;

    /**
     * In shop and presentment currencies, the total price of the line item when the order was created.
     * This value doesn't include discounts.
     */
    private MoneyBag originalTotalSet;

    /**
     * In shop currency, the unit price of the line item when the order was created. This value doesn't include discounts.
     */
    private String originalUnitPrice;

    /**
     * In shop and presentment currencies, the unit price of the line item when the
     * order was created. This value doesn't include discounts.
     */
    private MoneyBag originalUnitPriceSet;

    /**
     * The Product object associated with this line item's variant.
     */
    private Product product;

    /**
     * The number of units ordered, including refunded and removed units.
     */
    private int quantity;

    /**
     * The number of units ordered, excluding refunded units.
     */
    private int refundableQuantity;

    /**
     * Whether physical shipping is required for the variant.
     */
    private boolean requiresShipping;

    /**
     * Whether the line item can be restocked.
     */
    private boolean restockable;

    /**
     * The selling plan details associated with the line item.
     */
    private LineItemSellingPlan sellingPlan;

    /**
     * The variant SKU number.
     */
    private String sku;

    /**
     * Staff attributed to the line item.
     */
    private StaffMember staffMember;

    /**
     * The taxes charged for the line item, including taxes charged for refunded and removed quantities.
     */
    private List<TaxLine> taxLines;

    /**
     * Whether the variant is taxable.
     */
    private boolean taxable;

    /**
     * The title of the product at time of order creation.
     */
    private String title;

    /**
     * The total discount allocated to the line item in shop currency, including the
     * total allocated to refunded and removed quantities. This value doesn't include
     * order-level discounts.
     */
    private String totalDiscount;

    /**
     * The total discount allocated to the line item in shop and presentment
     * currencies, including the total allocated to refunded and removed quantities.
     * This value doesn't include order-level discounts.
     */
    private MoneyBag totalDiscountSet;

    /**
     * In shop currency, the total discounted price of the unfulfilled quantity for the line item.
     */
    private String unfulfilledDiscountedTotal;

    /**
     * In shop and presentment currencies, the total discounted price of the unfulfilled quantity for the line item.
     */
    private MoneyBag unfulfilledDiscountedTotalSet;

    /**
     * In shop currency, the total price of the unfulfilled quantity for the line item. This value doesn't include discounts.
     */
    private String unfulfilledOriginalTotal;

    /**
     * In shop and presentment currencies, the total price of the unfulfilled
     * quantity for the line item. This value doesn't include discounts.
     */
    private MoneyBag unfulfilledOriginalTotalSet;

    /**
     * The number of units not yet fulfilled.
     */
    private int unfulfilledQuantity;

    /**
     * The Variant object associated with this line item.
     */
    private ProductVariant variant;

    /**
     * The title of the variant at time of order creation.
     */
    private String variantTitle;

    /**
     * The name of the vendor who made the variant.
     */
    private String vendor;

    public LineItem build() {
      LineItem result = new LineItem();
      result.canRestock = this.canRestock;
      result.contract = this.contract;
      result.currentQuantity = this.currentQuantity;
      result.customAttributes = this.customAttributes;
      result.discountAllocations = this.discountAllocations;
      result.discountedTotal = this.discountedTotal;
      result.discountedTotalSet = this.discountedTotalSet;
      result.discountedUnitPrice = this.discountedUnitPrice;
      result.discountedUnitPriceAfterAllDiscountsSet = this.discountedUnitPriceAfterAllDiscountsSet;
      result.discountedUnitPriceSet = this.discountedUnitPriceSet;
      result.duties = this.duties;
      result.fulfillableQuantity = this.fulfillableQuantity;
      result.fulfillmentService = this.fulfillmentService;
      result.fulfillmentStatus = this.fulfillmentStatus;
      result.id = this.id;
      result.image = this.image;
      result.isGiftCard = this.isGiftCard;
      result.lineItemGroup = this.lineItemGroup;
      result.merchantEditable = this.merchantEditable;
      result.name = this.name;
      result.nonFulfillableQuantity = this.nonFulfillableQuantity;
      result.originalTotal = this.originalTotal;
      result.originalTotalSet = this.originalTotalSet;
      result.originalUnitPrice = this.originalUnitPrice;
      result.originalUnitPriceSet = this.originalUnitPriceSet;
      result.product = this.product;
      result.quantity = this.quantity;
      result.refundableQuantity = this.refundableQuantity;
      result.requiresShipping = this.requiresShipping;
      result.restockable = this.restockable;
      result.sellingPlan = this.sellingPlan;
      result.sku = this.sku;
      result.staffMember = this.staffMember;
      result.taxLines = this.taxLines;
      result.taxable = this.taxable;
      result.title = this.title;
      result.totalDiscount = this.totalDiscount;
      result.totalDiscountSet = this.totalDiscountSet;
      result.unfulfilledDiscountedTotal = this.unfulfilledDiscountedTotal;
      result.unfulfilledDiscountedTotalSet = this.unfulfilledDiscountedTotalSet;
      result.unfulfilledOriginalTotal = this.unfulfilledOriginalTotal;
      result.unfulfilledOriginalTotalSet = this.unfulfilledOriginalTotalSet;
      result.unfulfilledQuantity = this.unfulfilledQuantity;
      result.variant = this.variant;
      result.variantTitle = this.variantTitle;
      result.vendor = this.vendor;
      return result;
    }

    /**
     * Whether the line item can be restocked.
     */
    public Builder canRestock(boolean canRestock) {
      this.canRestock = canRestock;
      return this;
    }

    /**
     * The subscription contract associated with this line item.
     */
    public Builder contract(SubscriptionContract contract) {
      this.contract = contract;
      return this;
    }

    /**
     * The number of units ordered, excluding refunded and removed units.
     */
    public Builder currentQuantity(int currentQuantity) {
      this.currentQuantity = currentQuantity;
      return this;
    }

    /**
     * A list of attributes that represent custom features or special requests.
     */
    public Builder customAttributes(List<Attribute> customAttributes) {
      this.customAttributes = customAttributes;
      return this;
    }

    /**
     * The discounts that have been allocated to the line item by discount
     * applications, including discounts allocated to refunded and removed quantities.
     */
    public Builder discountAllocations(List<DiscountAllocation> discountAllocations) {
      this.discountAllocations = discountAllocations;
      return this;
    }

    /**
     * The total discounted price of the line item in shop currency, including
     * refunded and removed quantities. This value doesn't include order-level discounts.
     */
    public Builder discountedTotal(String discountedTotal) {
      this.discountedTotal = discountedTotal;
      return this;
    }

    /**
     * The total discounted price of the line item in shop and presentment
     * currencies, including refunded and removed quantities. This value doesn't
     * include order-level discounts. Code-based discounts aren't included by default.
     */
    public Builder discountedTotalSet(MoneyBag discountedTotalSet) {
      this.discountedTotalSet = discountedTotalSet;
      return this;
    }

    /**
     * The approximate unit price of the line item in shop currency. This value
     * includes line-level discounts and discounts applied to refunded and removed
     * quantities. It doesn't include order-level or code-based discounts.
     */
    public Builder discountedUnitPrice(String discountedUnitPrice) {
      this.discountedUnitPrice = discountedUnitPrice;
      return this;
    }

    /**
     * The approximate unit price of the line item in shop and presentment
     * currencies. This value includes discounts applied to refunded and removed quantities.
     */
    public Builder discountedUnitPriceAfterAllDiscountsSet(
        MoneyBag discountedUnitPriceAfterAllDiscountsSet) {
      this.discountedUnitPriceAfterAllDiscountsSet = discountedUnitPriceAfterAllDiscountsSet;
      return this;
    }

    /**
     * The approximate unit price of the line item in shop and presentment
     * currencies. This value includes line-level discounts and discounts applied to
     * refunded and removed quantities. It doesn't include order-level or code-based discounts.
     */
    public Builder discountedUnitPriceSet(MoneyBag discountedUnitPriceSet) {
      this.discountedUnitPriceSet = discountedUnitPriceSet;
      return this;
    }

    /**
     * The duties associated with the line item.
     */
    public Builder duties(List<Duty> duties) {
      this.duties = duties;
      return this;
    }

    /**
     * The total number of units to fulfill.
     */
    public Builder fulfillableQuantity(int fulfillableQuantity) {
      this.fulfillableQuantity = fulfillableQuantity;
      return this;
    }

    /**
     * The fulfillment service that stocks the product variant belonging to a line item.
     *   
     * This is a third-party fulfillment service in the following scenarios:
     *   
     * **Scenario 1**
     * - The product variant is stocked by a single fulfillment service.
     * - The [FulfillmentService](/api/admin-graphql/latest/objects/FulfillmentService)
     * is a third-party fulfillment service. Third-party fulfillment services don't
     * have a handle with the value `manual`.
     *   
     * **Scenario 2**
     * - Multiple fulfillment services stock the product variant.
     * - The last time that the line item was unfulfilled, it was awaiting
     * fulfillment by a third-party fulfillment service. Third-party fulfillment
     * services don't have a handle with the value `manual`.
     *   
     * If none of the above conditions are met, then the fulfillment service has the `manual` handle.
     */
    public Builder fulfillmentService(FulfillmentService fulfillmentService) {
      this.fulfillmentService = fulfillmentService;
      return this;
    }

    /**
     * The line item's fulfillment status. Returns 'fulfilled' if fulfillableQuantity >= quantity,
     * 'partial' if  fulfillableQuantity > 0, and 'unfulfilled' otherwise.
     */
    public Builder fulfillmentStatus(String fulfillmentStatus) {
      this.fulfillmentStatus = fulfillmentStatus;
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
     * The image associated to the line item's variant.
     */
    public Builder image(Image image) {
      this.image = image;
      return this;
    }

    /**
     * Whether the line item represents the purchase of a gift card.
     */
    public Builder isGiftCard(boolean isGiftCard) {
      this.isGiftCard = isGiftCard;
      return this;
    }

    /**
     * The line item group associated to the line item.
     */
    public Builder lineItemGroup(LineItemGroup lineItemGroup) {
      this.lineItemGroup = lineItemGroup;
      return this;
    }

    /**
     * Whether the line item can be edited or not.
     */
    public Builder merchantEditable(boolean merchantEditable) {
      this.merchantEditable = merchantEditable;
      return this;
    }

    /**
     * The title of the product, optionally appended with the title of the variant (if applicable).
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * The total number of units that can't be fulfilled. For example, if items have
     * been refunded, or the item is not something that can be fulfilled, like a tip. Please see the [FulfillmentOrder](https://shopify.dev/api/admin-graphql/latest/objects/FulfillmentOrder)
     * object for more fulfillment details.
     */
    public Builder nonFulfillableQuantity(int nonFulfillableQuantity) {
      this.nonFulfillableQuantity = nonFulfillableQuantity;
      return this;
    }

    /**
     * In shop currency, the total price of the line item when the order was created.
     * This value doesn't include discounts.
     */
    public Builder originalTotal(String originalTotal) {
      this.originalTotal = originalTotal;
      return this;
    }

    /**
     * In shop and presentment currencies, the total price of the line item when the order was created.
     * This value doesn't include discounts.
     */
    public Builder originalTotalSet(MoneyBag originalTotalSet) {
      this.originalTotalSet = originalTotalSet;
      return this;
    }

    /**
     * In shop currency, the unit price of the line item when the order was created. This value doesn't include discounts.
     */
    public Builder originalUnitPrice(String originalUnitPrice) {
      this.originalUnitPrice = originalUnitPrice;
      return this;
    }

    /**
     * In shop and presentment currencies, the unit price of the line item when the
     * order was created. This value doesn't include discounts.
     */
    public Builder originalUnitPriceSet(MoneyBag originalUnitPriceSet) {
      this.originalUnitPriceSet = originalUnitPriceSet;
      return this;
    }

    /**
     * The Product object associated with this line item's variant.
     */
    public Builder product(Product product) {
      this.product = product;
      return this;
    }

    /**
     * The number of units ordered, including refunded and removed units.
     */
    public Builder quantity(int quantity) {
      this.quantity = quantity;
      return this;
    }

    /**
     * The number of units ordered, excluding refunded units.
     */
    public Builder refundableQuantity(int refundableQuantity) {
      this.refundableQuantity = refundableQuantity;
      return this;
    }

    /**
     * Whether physical shipping is required for the variant.
     */
    public Builder requiresShipping(boolean requiresShipping) {
      this.requiresShipping = requiresShipping;
      return this;
    }

    /**
     * Whether the line item can be restocked.
     */
    public Builder restockable(boolean restockable) {
      this.restockable = restockable;
      return this;
    }

    /**
     * The selling plan details associated with the line item.
     */
    public Builder sellingPlan(LineItemSellingPlan sellingPlan) {
      this.sellingPlan = sellingPlan;
      return this;
    }

    /**
     * The variant SKU number.
     */
    public Builder sku(String sku) {
      this.sku = sku;
      return this;
    }

    /**
     * Staff attributed to the line item.
     */
    public Builder staffMember(StaffMember staffMember) {
      this.staffMember = staffMember;
      return this;
    }

    /**
     * The taxes charged for the line item, including taxes charged for refunded and removed quantities.
     */
    public Builder taxLines(List<TaxLine> taxLines) {
      this.taxLines = taxLines;
      return this;
    }

    /**
     * Whether the variant is taxable.
     */
    public Builder taxable(boolean taxable) {
      this.taxable = taxable;
      return this;
    }

    /**
     * The title of the product at time of order creation.
     */
    public Builder title(String title) {
      this.title = title;
      return this;
    }

    /**
     * The total discount allocated to the line item in shop currency, including the
     * total allocated to refunded and removed quantities. This value doesn't include
     * order-level discounts.
     */
    public Builder totalDiscount(String totalDiscount) {
      this.totalDiscount = totalDiscount;
      return this;
    }

    /**
     * The total discount allocated to the line item in shop and presentment
     * currencies, including the total allocated to refunded and removed quantities.
     * This value doesn't include order-level discounts.
     */
    public Builder totalDiscountSet(MoneyBag totalDiscountSet) {
      this.totalDiscountSet = totalDiscountSet;
      return this;
    }

    /**
     * In shop currency, the total discounted price of the unfulfilled quantity for the line item.
     */
    public Builder unfulfilledDiscountedTotal(String unfulfilledDiscountedTotal) {
      this.unfulfilledDiscountedTotal = unfulfilledDiscountedTotal;
      return this;
    }

    /**
     * In shop and presentment currencies, the total discounted price of the unfulfilled quantity for the line item.
     */
    public Builder unfulfilledDiscountedTotalSet(MoneyBag unfulfilledDiscountedTotalSet) {
      this.unfulfilledDiscountedTotalSet = unfulfilledDiscountedTotalSet;
      return this;
    }

    /**
     * In shop currency, the total price of the unfulfilled quantity for the line item. This value doesn't include discounts.
     */
    public Builder unfulfilledOriginalTotal(String unfulfilledOriginalTotal) {
      this.unfulfilledOriginalTotal = unfulfilledOriginalTotal;
      return this;
    }

    /**
     * In shop and presentment currencies, the total price of the unfulfilled
     * quantity for the line item. This value doesn't include discounts.
     */
    public Builder unfulfilledOriginalTotalSet(MoneyBag unfulfilledOriginalTotalSet) {
      this.unfulfilledOriginalTotalSet = unfulfilledOriginalTotalSet;
      return this;
    }

    /**
     * The number of units not yet fulfilled.
     */
    public Builder unfulfilledQuantity(int unfulfilledQuantity) {
      this.unfulfilledQuantity = unfulfilledQuantity;
      return this;
    }

    /**
     * The Variant object associated with this line item.
     */
    public Builder variant(ProductVariant variant) {
      this.variant = variant;
      return this;
    }

    /**
     * The title of the variant at time of order creation.
     */
    public Builder variantTitle(String variantTitle) {
      this.variantTitle = variantTitle;
      return this;
    }

    /**
     * The name of the vendor who made the variant.
     */
    public Builder vendor(String vendor) {
      this.vendor = vendor;
      return this;
    }
  }
}
