package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;

/**
 * Price rules are a set of conditions, including entitlements and prerequisites,
 * that must be met in order for a discount code to apply.
 *
 * We recommend using the types and queries detailed at [Getting started with discounts](https://shopify.dev/docs/apps/selling-strategies/discounts/getting-started)
 * instead. These will replace the GraphQL `PriceRule` object and REST Admin
 * `PriceRule` and `DiscountCode` resources.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class PriceRule implements com.shopify.types.CommentEventSubject, com.shopify.types.HasEvents, com.shopify.types.LegacyInteroperability, com.shopify.types.Node {
  /**
   * The maximum number of times that the price rule can be allocated onto an order.
   */
  private Integer allocationLimit;

  /**
   * The method by which the price rule's value is allocated to its entitled items.
   */
  private PriceRuleAllocationMethod allocationMethod;

  /**
   * The application that created the price rule.
   */
  private App app;

  /**
   * The
   * [discount classes](https://help.shopify.com/manual/discounts/combining-discounts/discount-combinations)
   * that you can use in combination with
   * [Shopify discount types](https://help.shopify.com/manual/discounts/discount-types).
   */
  private DiscountCombinesWith combinesWith;

  /**
   * The date and time when the price rule was created.
   */
  private OffsetDateTime createdAt;

  /**
   * The customers that can use this price rule.
   */
  private PriceRuleCustomerSelection customerSelection;

  /**
   * The
   * [discount class](https://help.shopify.com/manual/discounts/combining-discounts/discount-combinations)
   * that's used to control how discounts can be combined.
   */
  private DiscountClass discountClass;

  /**
   * List of the price rule's discount codes.
   */
  private PriceRuleDiscountCodeConnection discountCodes;

  /**
   * How many discount codes associated with the price rule.
   */
  private Count discountCodesCount;

  /**
   * The date and time when the price rule ends. For open-ended price rules, use `null`.
   */
  private OffsetDateTime endsAt;

  /**
   * Quantity of prerequisite items required for the price rule to be applicable,  compared to quantity of entitled items.
   */
  private PriceRuleEntitlementToPrerequisiteQuantityRatio entitlementToPrerequisiteQuantityRatio;

  /**
   * The paginated list of events associated with the price rule.
   */
  private EventConnection events;

  /**
   * A list of the price rule's features.
   */
  private List<PriceRuleFeature> features;

  /**
   * Indicates whether there are any timeline comments on the price rule.
   */
  private boolean hasTimelineComment;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The items to which the price rule applies.
   */
  private PriceRuleItemEntitlements itemEntitlements;

  /**
   * The items required for the price rule to be applicable.
   */
  private PriceRuleLineItemPrerequisites itemPrerequisites;

  /**
   * The ID of the corresponding resource in the REST Admin API.
   */
  private String legacyResourceId;

  /**
   * Whether the price rule can be applied only once per customer.
   */
  private boolean oncePerCustomer;

  /**
   * The number of the entitled items must fall within this range for the price rule to be applicable.
   */
  private PriceRuleQuantityRange prerequisiteQuantityRange;

  /**
   * The shipping cost must fall within this range for the price rule to be applicable.
   */
  private PriceRuleMoneyRange prerequisiteShippingPriceRange;

  /**
   * The sum of the entitled items subtotal prices must fall within this range for the price rule to be applicable.
   */
  private PriceRuleMoneyRange prerequisiteSubtotalRange;

  /**
   * Quantity of prerequisite items required for the price rule to be applicable,  compared to quantity of entitled items.
   */
  private PriceRulePrerequisiteToEntitlementQuantityRatio prerequisiteToEntitlementQuantityRatio;

  /**
   * URLs that can be used to share the discount.
   */
  private List<PriceRuleShareableUrl> shareableUrls;

  /**
   * The shipping lines to which the price rule applies.
   */
  private PriceRuleShippingLineEntitlements shippingEntitlements;

  /**
   * The date and time when the price rule starts.
   */
  private OffsetDateTime startsAt;

  /**
   * The status of the price rule.
   */
  private PriceRuleStatus status;

  /**
   * A detailed summary of the price rule.
   */
  private String summary;

  /**
   * The type of lines (line_item or shipping_line) to which the price rule applies.
   */
  private PriceRuleTarget target;

  /**
   * The title of the price rule.
   */
  private String title;

  /**
   * The total sales from orders where the price rule was used.
   */
  private MoneyV2 totalSales;

  /**
   * A list of the price rule's features.
   */
  private List<PriceRuleTrait> traits;

  /**
   * The number of times that the price rule has been used. This value is updated
   * asynchronously and can be different than the actual usage count.
   */
  private int usageCount;

  /**
   * The maximum number of times that the price rule can be used in total.
   */
  private Integer usageLimit;

  /**
   * A time period during which a price rule is applicable.
   */
  private PriceRuleValidityPeriod validityPeriod;

  /**
   * The value of the price rule.
   */
  private PriceRuleValue value;

  /**
   * The value of the price rule.
   */
  private PricingValue valueV2;

  public PriceRule() {
  }

  /**
   * The maximum number of times that the price rule can be allocated onto an order.
   */
  public Integer getAllocationLimit() {
    return allocationLimit;
  }

  public void setAllocationLimit(Integer allocationLimit) {
    this.allocationLimit = allocationLimit;
  }

  /**
   * The method by which the price rule's value is allocated to its entitled items.
   */
  public PriceRuleAllocationMethod getAllocationMethod() {
    return allocationMethod;
  }

  public void setAllocationMethod(PriceRuleAllocationMethod allocationMethod) {
    this.allocationMethod = allocationMethod;
  }

  /**
   * The application that created the price rule.
   */
  public App getApp() {
    return app;
  }

  public void setApp(App app) {
    this.app = app;
  }

  /**
   * The
   * [discount classes](https://help.shopify.com/manual/discounts/combining-discounts/discount-combinations)
   * that you can use in combination with
   * [Shopify discount types](https://help.shopify.com/manual/discounts/discount-types).
   */
  public DiscountCombinesWith getCombinesWith() {
    return combinesWith;
  }

  public void setCombinesWith(DiscountCombinesWith combinesWith) {
    this.combinesWith = combinesWith;
  }

  /**
   * The date and time when the price rule was created.
   */
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * The customers that can use this price rule.
   */
  public PriceRuleCustomerSelection getCustomerSelection() {
    return customerSelection;
  }

  public void setCustomerSelection(PriceRuleCustomerSelection customerSelection) {
    this.customerSelection = customerSelection;
  }

  /**
   * The
   * [discount class](https://help.shopify.com/manual/discounts/combining-discounts/discount-combinations)
   * that's used to control how discounts can be combined.
   */
  public DiscountClass getDiscountClass() {
    return discountClass;
  }

  public void setDiscountClass(DiscountClass discountClass) {
    this.discountClass = discountClass;
  }

  /**
   * List of the price rule's discount codes.
   */
  public PriceRuleDiscountCodeConnection getDiscountCodes() {
    return discountCodes;
  }

  public void setDiscountCodes(PriceRuleDiscountCodeConnection discountCodes) {
    this.discountCodes = discountCodes;
  }

  /**
   * How many discount codes associated with the price rule.
   */
  public Count getDiscountCodesCount() {
    return discountCodesCount;
  }

  public void setDiscountCodesCount(Count discountCodesCount) {
    this.discountCodesCount = discountCodesCount;
  }

  /**
   * The date and time when the price rule ends. For open-ended price rules, use `null`.
   */
  public OffsetDateTime getEndsAt() {
    return endsAt;
  }

  public void setEndsAt(OffsetDateTime endsAt) {
    this.endsAt = endsAt;
  }

  /**
   * Quantity of prerequisite items required for the price rule to be applicable,  compared to quantity of entitled items.
   */
  public PriceRuleEntitlementToPrerequisiteQuantityRatio getEntitlementToPrerequisiteQuantityRatio(
      ) {
    return entitlementToPrerequisiteQuantityRatio;
  }

  public void setEntitlementToPrerequisiteQuantityRatio(
      PriceRuleEntitlementToPrerequisiteQuantityRatio entitlementToPrerequisiteQuantityRatio) {
    this.entitlementToPrerequisiteQuantityRatio = entitlementToPrerequisiteQuantityRatio;
  }

  /**
   * The paginated list of events associated with the price rule.
   */
  public EventConnection getEvents() {
    return events;
  }

  public void setEvents(EventConnection events) {
    this.events = events;
  }

  /**
   * A list of the price rule's features.
   */
  public List<PriceRuleFeature> getFeatures() {
    return features;
  }

  public void setFeatures(List<PriceRuleFeature> features) {
    this.features = features;
  }

  /**
   * Indicates whether there are any timeline comments on the price rule.
   */
  public boolean getHasTimelineComment() {
    return hasTimelineComment;
  }

  public void setHasTimelineComment(boolean hasTimelineComment) {
    this.hasTimelineComment = hasTimelineComment;
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
   * The items to which the price rule applies.
   */
  public PriceRuleItemEntitlements getItemEntitlements() {
    return itemEntitlements;
  }

  public void setItemEntitlements(PriceRuleItemEntitlements itemEntitlements) {
    this.itemEntitlements = itemEntitlements;
  }

  /**
   * The items required for the price rule to be applicable.
   */
  public PriceRuleLineItemPrerequisites getItemPrerequisites() {
    return itemPrerequisites;
  }

  public void setItemPrerequisites(PriceRuleLineItemPrerequisites itemPrerequisites) {
    this.itemPrerequisites = itemPrerequisites;
  }

  /**
   * The ID of the corresponding resource in the REST Admin API.
   */
  public String getLegacyResourceId() {
    return legacyResourceId;
  }

  public void setLegacyResourceId(String legacyResourceId) {
    this.legacyResourceId = legacyResourceId;
  }

  /**
   * Whether the price rule can be applied only once per customer.
   */
  public boolean getOncePerCustomer() {
    return oncePerCustomer;
  }

  public void setOncePerCustomer(boolean oncePerCustomer) {
    this.oncePerCustomer = oncePerCustomer;
  }

  /**
   * The number of the entitled items must fall within this range for the price rule to be applicable.
   */
  public PriceRuleQuantityRange getPrerequisiteQuantityRange() {
    return prerequisiteQuantityRange;
  }

  public void setPrerequisiteQuantityRange(PriceRuleQuantityRange prerequisiteQuantityRange) {
    this.prerequisiteQuantityRange = prerequisiteQuantityRange;
  }

  /**
   * The shipping cost must fall within this range for the price rule to be applicable.
   */
  public PriceRuleMoneyRange getPrerequisiteShippingPriceRange() {
    return prerequisiteShippingPriceRange;
  }

  public void setPrerequisiteShippingPriceRange(
      PriceRuleMoneyRange prerequisiteShippingPriceRange) {
    this.prerequisiteShippingPriceRange = prerequisiteShippingPriceRange;
  }

  /**
   * The sum of the entitled items subtotal prices must fall within this range for the price rule to be applicable.
   */
  public PriceRuleMoneyRange getPrerequisiteSubtotalRange() {
    return prerequisiteSubtotalRange;
  }

  public void setPrerequisiteSubtotalRange(PriceRuleMoneyRange prerequisiteSubtotalRange) {
    this.prerequisiteSubtotalRange = prerequisiteSubtotalRange;
  }

  /**
   * Quantity of prerequisite items required for the price rule to be applicable,  compared to quantity of entitled items.
   */
  public PriceRulePrerequisiteToEntitlementQuantityRatio getPrerequisiteToEntitlementQuantityRatio(
      ) {
    return prerequisiteToEntitlementQuantityRatio;
  }

  public void setPrerequisiteToEntitlementQuantityRatio(
      PriceRulePrerequisiteToEntitlementQuantityRatio prerequisiteToEntitlementQuantityRatio) {
    this.prerequisiteToEntitlementQuantityRatio = prerequisiteToEntitlementQuantityRatio;
  }

  /**
   * URLs that can be used to share the discount.
   */
  public List<PriceRuleShareableUrl> getShareableUrls() {
    return shareableUrls;
  }

  public void setShareableUrls(List<PriceRuleShareableUrl> shareableUrls) {
    this.shareableUrls = shareableUrls;
  }

  /**
   * The shipping lines to which the price rule applies.
   */
  public PriceRuleShippingLineEntitlements getShippingEntitlements() {
    return shippingEntitlements;
  }

  public void setShippingEntitlements(PriceRuleShippingLineEntitlements shippingEntitlements) {
    this.shippingEntitlements = shippingEntitlements;
  }

  /**
   * The date and time when the price rule starts.
   */
  public OffsetDateTime getStartsAt() {
    return startsAt;
  }

  public void setStartsAt(OffsetDateTime startsAt) {
    this.startsAt = startsAt;
  }

  /**
   * The status of the price rule.
   */
  public PriceRuleStatus getStatus() {
    return status;
  }

  public void setStatus(PriceRuleStatus status) {
    this.status = status;
  }

  /**
   * A detailed summary of the price rule.
   */
  public String getSummary() {
    return summary;
  }

  public void setSummary(String summary) {
    this.summary = summary;
  }

  /**
   * The type of lines (line_item or shipping_line) to which the price rule applies.
   */
  public PriceRuleTarget getTarget() {
    return target;
  }

  public void setTarget(PriceRuleTarget target) {
    this.target = target;
  }

  /**
   * The title of the price rule.
   */
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * The total sales from orders where the price rule was used.
   */
  public MoneyV2 getTotalSales() {
    return totalSales;
  }

  public void setTotalSales(MoneyV2 totalSales) {
    this.totalSales = totalSales;
  }

  /**
   * A list of the price rule's features.
   */
  public List<PriceRuleTrait> getTraits() {
    return traits;
  }

  public void setTraits(List<PriceRuleTrait> traits) {
    this.traits = traits;
  }

  /**
   * The number of times that the price rule has been used. This value is updated
   * asynchronously and can be different than the actual usage count.
   */
  public int getUsageCount() {
    return usageCount;
  }

  public void setUsageCount(int usageCount) {
    this.usageCount = usageCount;
  }

  /**
   * The maximum number of times that the price rule can be used in total.
   */
  public Integer getUsageLimit() {
    return usageLimit;
  }

  public void setUsageLimit(Integer usageLimit) {
    this.usageLimit = usageLimit;
  }

  /**
   * A time period during which a price rule is applicable.
   */
  public PriceRuleValidityPeriod getValidityPeriod() {
    return validityPeriod;
  }

  public void setValidityPeriod(PriceRuleValidityPeriod validityPeriod) {
    this.validityPeriod = validityPeriod;
  }

  /**
   * The value of the price rule.
   */
  public PriceRuleValue getValue() {
    return value;
  }

  public void setValue(PriceRuleValue value) {
    this.value = value;
  }

  /**
   * The value of the price rule.
   */
  public PricingValue getValueV2() {
    return valueV2;
  }

  public void setValueV2(PricingValue valueV2) {
    this.valueV2 = valueV2;
  }

  @Override
  public String toString() {
    return "PriceRule{allocationLimit='" + allocationLimit + "', allocationMethod='" + allocationMethod + "', app='" + app + "', combinesWith='" + combinesWith + "', createdAt='" + createdAt + "', customerSelection='" + customerSelection + "', discountClass='" + discountClass + "', discountCodes='" + discountCodes + "', discountCodesCount='" + discountCodesCount + "', endsAt='" + endsAt + "', entitlementToPrerequisiteQuantityRatio='" + entitlementToPrerequisiteQuantityRatio + "', events='" + events + "', features='" + features + "', hasTimelineComment='" + hasTimelineComment + "', id='" + id + "', itemEntitlements='" + itemEntitlements + "', itemPrerequisites='" + itemPrerequisites + "', legacyResourceId='" + legacyResourceId + "', oncePerCustomer='" + oncePerCustomer + "', prerequisiteQuantityRange='" + prerequisiteQuantityRange + "', prerequisiteShippingPriceRange='" + prerequisiteShippingPriceRange + "', prerequisiteSubtotalRange='" + prerequisiteSubtotalRange + "', prerequisiteToEntitlementQuantityRatio='" + prerequisiteToEntitlementQuantityRatio + "', shareableUrls='" + shareableUrls + "', shippingEntitlements='" + shippingEntitlements + "', startsAt='" + startsAt + "', status='" + status + "', summary='" + summary + "', target='" + target + "', title='" + title + "', totalSales='" + totalSales + "', traits='" + traits + "', usageCount='" + usageCount + "', usageLimit='" + usageLimit + "', validityPeriod='" + validityPeriod + "', value='" + value + "', valueV2='" + valueV2 + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PriceRule that = (PriceRule) o;
    return Objects.equals(allocationLimit, that.allocationLimit) &&
        Objects.equals(allocationMethod, that.allocationMethod) &&
        Objects.equals(app, that.app) &&
        Objects.equals(combinesWith, that.combinesWith) &&
        Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(customerSelection, that.customerSelection) &&
        Objects.equals(discountClass, that.discountClass) &&
        Objects.equals(discountCodes, that.discountCodes) &&
        Objects.equals(discountCodesCount, that.discountCodesCount) &&
        Objects.equals(endsAt, that.endsAt) &&
        Objects.equals(entitlementToPrerequisiteQuantityRatio, that.entitlementToPrerequisiteQuantityRatio) &&
        Objects.equals(events, that.events) &&
        Objects.equals(features, that.features) &&
        hasTimelineComment == that.hasTimelineComment &&
        Objects.equals(id, that.id) &&
        Objects.equals(itemEntitlements, that.itemEntitlements) &&
        Objects.equals(itemPrerequisites, that.itemPrerequisites) &&
        Objects.equals(legacyResourceId, that.legacyResourceId) &&
        oncePerCustomer == that.oncePerCustomer &&
        Objects.equals(prerequisiteQuantityRange, that.prerequisiteQuantityRange) &&
        Objects.equals(prerequisiteShippingPriceRange, that.prerequisiteShippingPriceRange) &&
        Objects.equals(prerequisiteSubtotalRange, that.prerequisiteSubtotalRange) &&
        Objects.equals(prerequisiteToEntitlementQuantityRatio, that.prerequisiteToEntitlementQuantityRatio) &&
        Objects.equals(shareableUrls, that.shareableUrls) &&
        Objects.equals(shippingEntitlements, that.shippingEntitlements) &&
        Objects.equals(startsAt, that.startsAt) &&
        Objects.equals(status, that.status) &&
        Objects.equals(summary, that.summary) &&
        Objects.equals(target, that.target) &&
        Objects.equals(title, that.title) &&
        Objects.equals(totalSales, that.totalSales) &&
        Objects.equals(traits, that.traits) &&
        usageCount == that.usageCount &&
        Objects.equals(usageLimit, that.usageLimit) &&
        Objects.equals(validityPeriod, that.validityPeriod) &&
        Objects.equals(value, that.value) &&
        Objects.equals(valueV2, that.valueV2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allocationLimit, allocationMethod, app, combinesWith, createdAt, customerSelection, discountClass, discountCodes, discountCodesCount, endsAt, entitlementToPrerequisiteQuantityRatio, events, features, hasTimelineComment, id, itemEntitlements, itemPrerequisites, legacyResourceId, oncePerCustomer, prerequisiteQuantityRange, prerequisiteShippingPriceRange, prerequisiteSubtotalRange, prerequisiteToEntitlementQuantityRatio, shareableUrls, shippingEntitlements, startsAt, status, summary, target, title, totalSales, traits, usageCount, usageLimit, validityPeriod, value, valueV2);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The maximum number of times that the price rule can be allocated onto an order.
     */
    private Integer allocationLimit;

    /**
     * The method by which the price rule's value is allocated to its entitled items.
     */
    private PriceRuleAllocationMethod allocationMethod;

    /**
     * The application that created the price rule.
     */
    private App app;

    /**
     * The
     * [discount classes](https://help.shopify.com/manual/discounts/combining-discounts/discount-combinations)
     * that you can use in combination with
     * [Shopify discount types](https://help.shopify.com/manual/discounts/discount-types).
     */
    private DiscountCombinesWith combinesWith;

    /**
     * The date and time when the price rule was created.
     */
    private OffsetDateTime createdAt;

    /**
     * The customers that can use this price rule.
     */
    private PriceRuleCustomerSelection customerSelection;

    /**
     * The
     * [discount class](https://help.shopify.com/manual/discounts/combining-discounts/discount-combinations)
     * that's used to control how discounts can be combined.
     */
    private DiscountClass discountClass;

    /**
     * List of the price rule's discount codes.
     */
    private PriceRuleDiscountCodeConnection discountCodes;

    /**
     * How many discount codes associated with the price rule.
     */
    private Count discountCodesCount;

    /**
     * The date and time when the price rule ends. For open-ended price rules, use `null`.
     */
    private OffsetDateTime endsAt;

    /**
     * Quantity of prerequisite items required for the price rule to be applicable,  compared to quantity of entitled items.
     */
    private PriceRuleEntitlementToPrerequisiteQuantityRatio entitlementToPrerequisiteQuantityRatio;

    /**
     * The paginated list of events associated with the price rule.
     */
    private EventConnection events;

    /**
     * A list of the price rule's features.
     */
    private List<PriceRuleFeature> features;

    /**
     * Indicates whether there are any timeline comments on the price rule.
     */
    private boolean hasTimelineComment;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The items to which the price rule applies.
     */
    private PriceRuleItemEntitlements itemEntitlements;

    /**
     * The items required for the price rule to be applicable.
     */
    private PriceRuleLineItemPrerequisites itemPrerequisites;

    /**
     * The ID of the corresponding resource in the REST Admin API.
     */
    private String legacyResourceId;

    /**
     * Whether the price rule can be applied only once per customer.
     */
    private boolean oncePerCustomer;

    /**
     * The number of the entitled items must fall within this range for the price rule to be applicable.
     */
    private PriceRuleQuantityRange prerequisiteQuantityRange;

    /**
     * The shipping cost must fall within this range for the price rule to be applicable.
     */
    private PriceRuleMoneyRange prerequisiteShippingPriceRange;

    /**
     * The sum of the entitled items subtotal prices must fall within this range for the price rule to be applicable.
     */
    private PriceRuleMoneyRange prerequisiteSubtotalRange;

    /**
     * Quantity of prerequisite items required for the price rule to be applicable,  compared to quantity of entitled items.
     */
    private PriceRulePrerequisiteToEntitlementQuantityRatio prerequisiteToEntitlementQuantityRatio;

    /**
     * URLs that can be used to share the discount.
     */
    private List<PriceRuleShareableUrl> shareableUrls;

    /**
     * The shipping lines to which the price rule applies.
     */
    private PriceRuleShippingLineEntitlements shippingEntitlements;

    /**
     * The date and time when the price rule starts.
     */
    private OffsetDateTime startsAt;

    /**
     * The status of the price rule.
     */
    private PriceRuleStatus status;

    /**
     * A detailed summary of the price rule.
     */
    private String summary;

    /**
     * The type of lines (line_item or shipping_line) to which the price rule applies.
     */
    private PriceRuleTarget target;

    /**
     * The title of the price rule.
     */
    private String title;

    /**
     * The total sales from orders where the price rule was used.
     */
    private MoneyV2 totalSales;

    /**
     * A list of the price rule's features.
     */
    private List<PriceRuleTrait> traits;

    /**
     * The number of times that the price rule has been used. This value is updated
     * asynchronously and can be different than the actual usage count.
     */
    private int usageCount;

    /**
     * The maximum number of times that the price rule can be used in total.
     */
    private Integer usageLimit;

    /**
     * A time period during which a price rule is applicable.
     */
    private PriceRuleValidityPeriod validityPeriod;

    /**
     * The value of the price rule.
     */
    private PriceRuleValue value;

    /**
     * The value of the price rule.
     */
    private PricingValue valueV2;

    public PriceRule build() {
      PriceRule result = new PriceRule();
      result.allocationLimit = this.allocationLimit;
      result.allocationMethod = this.allocationMethod;
      result.app = this.app;
      result.combinesWith = this.combinesWith;
      result.createdAt = this.createdAt;
      result.customerSelection = this.customerSelection;
      result.discountClass = this.discountClass;
      result.discountCodes = this.discountCodes;
      result.discountCodesCount = this.discountCodesCount;
      result.endsAt = this.endsAt;
      result.entitlementToPrerequisiteQuantityRatio = this.entitlementToPrerequisiteQuantityRatio;
      result.events = this.events;
      result.features = this.features;
      result.hasTimelineComment = this.hasTimelineComment;
      result.id = this.id;
      result.itemEntitlements = this.itemEntitlements;
      result.itemPrerequisites = this.itemPrerequisites;
      result.legacyResourceId = this.legacyResourceId;
      result.oncePerCustomer = this.oncePerCustomer;
      result.prerequisiteQuantityRange = this.prerequisiteQuantityRange;
      result.prerequisiteShippingPriceRange = this.prerequisiteShippingPriceRange;
      result.prerequisiteSubtotalRange = this.prerequisiteSubtotalRange;
      result.prerequisiteToEntitlementQuantityRatio = this.prerequisiteToEntitlementQuantityRatio;
      result.shareableUrls = this.shareableUrls;
      result.shippingEntitlements = this.shippingEntitlements;
      result.startsAt = this.startsAt;
      result.status = this.status;
      result.summary = this.summary;
      result.target = this.target;
      result.title = this.title;
      result.totalSales = this.totalSales;
      result.traits = this.traits;
      result.usageCount = this.usageCount;
      result.usageLimit = this.usageLimit;
      result.validityPeriod = this.validityPeriod;
      result.value = this.value;
      result.valueV2 = this.valueV2;
      return result;
    }

    /**
     * The maximum number of times that the price rule can be allocated onto an order.
     */
    public Builder allocationLimit(Integer allocationLimit) {
      this.allocationLimit = allocationLimit;
      return this;
    }

    /**
     * The method by which the price rule's value is allocated to its entitled items.
     */
    public Builder allocationMethod(PriceRuleAllocationMethod allocationMethod) {
      this.allocationMethod = allocationMethod;
      return this;
    }

    /**
     * The application that created the price rule.
     */
    public Builder app(App app) {
      this.app = app;
      return this;
    }

    /**
     * The
     * [discount classes](https://help.shopify.com/manual/discounts/combining-discounts/discount-combinations)
     * that you can use in combination with
     * [Shopify discount types](https://help.shopify.com/manual/discounts/discount-types).
     */
    public Builder combinesWith(DiscountCombinesWith combinesWith) {
      this.combinesWith = combinesWith;
      return this;
    }

    /**
     * The date and time when the price rule was created.
     */
    public Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    /**
     * The customers that can use this price rule.
     */
    public Builder customerSelection(PriceRuleCustomerSelection customerSelection) {
      this.customerSelection = customerSelection;
      return this;
    }

    /**
     * The
     * [discount class](https://help.shopify.com/manual/discounts/combining-discounts/discount-combinations)
     * that's used to control how discounts can be combined.
     */
    public Builder discountClass(DiscountClass discountClass) {
      this.discountClass = discountClass;
      return this;
    }

    /**
     * List of the price rule's discount codes.
     */
    public Builder discountCodes(PriceRuleDiscountCodeConnection discountCodes) {
      this.discountCodes = discountCodes;
      return this;
    }

    /**
     * How many discount codes associated with the price rule.
     */
    public Builder discountCodesCount(Count discountCodesCount) {
      this.discountCodesCount = discountCodesCount;
      return this;
    }

    /**
     * The date and time when the price rule ends. For open-ended price rules, use `null`.
     */
    public Builder endsAt(OffsetDateTime endsAt) {
      this.endsAt = endsAt;
      return this;
    }

    /**
     * Quantity of prerequisite items required for the price rule to be applicable,  compared to quantity of entitled items.
     */
    public Builder entitlementToPrerequisiteQuantityRatio(
        PriceRuleEntitlementToPrerequisiteQuantityRatio entitlementToPrerequisiteQuantityRatio) {
      this.entitlementToPrerequisiteQuantityRatio = entitlementToPrerequisiteQuantityRatio;
      return this;
    }

    /**
     * The paginated list of events associated with the price rule.
     */
    public Builder events(EventConnection events) {
      this.events = events;
      return this;
    }

    /**
     * A list of the price rule's features.
     */
    public Builder features(List<PriceRuleFeature> features) {
      this.features = features;
      return this;
    }

    /**
     * Indicates whether there are any timeline comments on the price rule.
     */
    public Builder hasTimelineComment(boolean hasTimelineComment) {
      this.hasTimelineComment = hasTimelineComment;
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
     * The items to which the price rule applies.
     */
    public Builder itemEntitlements(PriceRuleItemEntitlements itemEntitlements) {
      this.itemEntitlements = itemEntitlements;
      return this;
    }

    /**
     * The items required for the price rule to be applicable.
     */
    public Builder itemPrerequisites(PriceRuleLineItemPrerequisites itemPrerequisites) {
      this.itemPrerequisites = itemPrerequisites;
      return this;
    }

    /**
     * The ID of the corresponding resource in the REST Admin API.
     */
    public Builder legacyResourceId(String legacyResourceId) {
      this.legacyResourceId = legacyResourceId;
      return this;
    }

    /**
     * Whether the price rule can be applied only once per customer.
     */
    public Builder oncePerCustomer(boolean oncePerCustomer) {
      this.oncePerCustomer = oncePerCustomer;
      return this;
    }

    /**
     * The number of the entitled items must fall within this range for the price rule to be applicable.
     */
    public Builder prerequisiteQuantityRange(PriceRuleQuantityRange prerequisiteQuantityRange) {
      this.prerequisiteQuantityRange = prerequisiteQuantityRange;
      return this;
    }

    /**
     * The shipping cost must fall within this range for the price rule to be applicable.
     */
    public Builder prerequisiteShippingPriceRange(
        PriceRuleMoneyRange prerequisiteShippingPriceRange) {
      this.prerequisiteShippingPriceRange = prerequisiteShippingPriceRange;
      return this;
    }

    /**
     * The sum of the entitled items subtotal prices must fall within this range for the price rule to be applicable.
     */
    public Builder prerequisiteSubtotalRange(PriceRuleMoneyRange prerequisiteSubtotalRange) {
      this.prerequisiteSubtotalRange = prerequisiteSubtotalRange;
      return this;
    }

    /**
     * Quantity of prerequisite items required for the price rule to be applicable,  compared to quantity of entitled items.
     */
    public Builder prerequisiteToEntitlementQuantityRatio(
        PriceRulePrerequisiteToEntitlementQuantityRatio prerequisiteToEntitlementQuantityRatio) {
      this.prerequisiteToEntitlementQuantityRatio = prerequisiteToEntitlementQuantityRatio;
      return this;
    }

    /**
     * URLs that can be used to share the discount.
     */
    public Builder shareableUrls(List<PriceRuleShareableUrl> shareableUrls) {
      this.shareableUrls = shareableUrls;
      return this;
    }

    /**
     * The shipping lines to which the price rule applies.
     */
    public Builder shippingEntitlements(PriceRuleShippingLineEntitlements shippingEntitlements) {
      this.shippingEntitlements = shippingEntitlements;
      return this;
    }

    /**
     * The date and time when the price rule starts.
     */
    public Builder startsAt(OffsetDateTime startsAt) {
      this.startsAt = startsAt;
      return this;
    }

    /**
     * The status of the price rule.
     */
    public Builder status(PriceRuleStatus status) {
      this.status = status;
      return this;
    }

    /**
     * A detailed summary of the price rule.
     */
    public Builder summary(String summary) {
      this.summary = summary;
      return this;
    }

    /**
     * The type of lines (line_item or shipping_line) to which the price rule applies.
     */
    public Builder target(PriceRuleTarget target) {
      this.target = target;
      return this;
    }

    /**
     * The title of the price rule.
     */
    public Builder title(String title) {
      this.title = title;
      return this;
    }

    /**
     * The total sales from orders where the price rule was used.
     */
    public Builder totalSales(MoneyV2 totalSales) {
      this.totalSales = totalSales;
      return this;
    }

    /**
     * A list of the price rule's features.
     */
    public Builder traits(List<PriceRuleTrait> traits) {
      this.traits = traits;
      return this;
    }

    /**
     * The number of times that the price rule has been used. This value is updated
     * asynchronously and can be different than the actual usage count.
     */
    public Builder usageCount(int usageCount) {
      this.usageCount = usageCount;
      return this;
    }

    /**
     * The maximum number of times that the price rule can be used in total.
     */
    public Builder usageLimit(Integer usageLimit) {
      this.usageLimit = usageLimit;
      return this;
    }

    /**
     * A time period during which a price rule is applicable.
     */
    public Builder validityPeriod(PriceRuleValidityPeriod validityPeriod) {
      this.validityPeriod = validityPeriod;
      return this;
    }

    /**
     * The value of the price rule.
     */
    public Builder value(PriceRuleValue value) {
      this.value = value;
      return this;
    }

    /**
     * The value of the price rule.
     */
    public Builder valueV2(PricingValue valueV2) {
      this.valueV2 = valueV2;
      return this;
    }
  }
}
