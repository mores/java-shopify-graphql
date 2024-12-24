package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class PriceRule implements com.shopify.types.CommentEventSubject, com.shopify.types.HasEvents, com.shopify.types.LegacyInteroperability, com.shopify.types.Node {
  
  private Integer allocationLimit;

  
  private PriceRuleAllocationMethod allocationMethod;

  
  private App app;

  
  private DiscountCombinesWith combinesWith;

  
  private OffsetDateTime createdAt;

  
  private PriceRuleCustomerSelection customerSelection;

  
  private DiscountClass discountClass;

  
  private PriceRuleDiscountCodeConnection discountCodes;

  
  private Count discountCodesCount;

  
  private OffsetDateTime endsAt;

  
  private PriceRuleEntitlementToPrerequisiteQuantityRatio entitlementToPrerequisiteQuantityRatio;

  
  private EventConnection events;

  
  private List<PriceRuleFeature> features;

  
  private boolean hasTimelineComment;

  
  private String id;

  
  private PriceRuleItemEntitlements itemEntitlements;

  
  private PriceRuleLineItemPrerequisites itemPrerequisites;

  
  private String legacyResourceId;

  
  private boolean oncePerCustomer;

  
  private PriceRuleQuantityRange prerequisiteQuantityRange;

  
  private PriceRuleMoneyRange prerequisiteShippingPriceRange;

  
  private PriceRuleMoneyRange prerequisiteSubtotalRange;

  
  private PriceRulePrerequisiteToEntitlementQuantityRatio prerequisiteToEntitlementQuantityRatio;

  
  private List<PriceRuleShareableUrl> shareableUrls;

  
  private PriceRuleShippingLineEntitlements shippingEntitlements;

  
  private OffsetDateTime startsAt;

  
  private PriceRuleStatus status;

  
  private String summary;

  
  private PriceRuleTarget target;

  
  private String title;

  
  private MoneyV2 totalSales;

  
  private List<PriceRuleTrait> traits;

  
  private int usageCount;

  
  private Integer usageLimit;

  
  private PriceRuleValidityPeriod validityPeriod;

  
  private PriceRuleValue value;

  
  private PricingValue valueV2;

  public PriceRule() {
  }

  
  public Integer getAllocationLimit() {
    return allocationLimit;
  }

  public void setAllocationLimit(Integer allocationLimit) {
    this.allocationLimit = allocationLimit;
  }

  
  public PriceRuleAllocationMethod getAllocationMethod() {
    return allocationMethod;
  }

  public void setAllocationMethod(PriceRuleAllocationMethod allocationMethod) {
    this.allocationMethod = allocationMethod;
  }

  
  public App getApp() {
    return app;
  }

  public void setApp(App app) {
    this.app = app;
  }

  
  public DiscountCombinesWith getCombinesWith() {
    return combinesWith;
  }

  public void setCombinesWith(DiscountCombinesWith combinesWith) {
    this.combinesWith = combinesWith;
  }

  
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  
  public PriceRuleCustomerSelection getCustomerSelection() {
    return customerSelection;
  }

  public void setCustomerSelection(PriceRuleCustomerSelection customerSelection) {
    this.customerSelection = customerSelection;
  }

  
  public DiscountClass getDiscountClass() {
    return discountClass;
  }

  public void setDiscountClass(DiscountClass discountClass) {
    this.discountClass = discountClass;
  }

  
  public PriceRuleDiscountCodeConnection getDiscountCodes() {
    return discountCodes;
  }

  public void setDiscountCodes(PriceRuleDiscountCodeConnection discountCodes) {
    this.discountCodes = discountCodes;
  }

  
  public Count getDiscountCodesCount() {
    return discountCodesCount;
  }

  public void setDiscountCodesCount(Count discountCodesCount) {
    this.discountCodesCount = discountCodesCount;
  }

  
  public OffsetDateTime getEndsAt() {
    return endsAt;
  }

  public void setEndsAt(OffsetDateTime endsAt) {
    this.endsAt = endsAt;
  }

  
  public PriceRuleEntitlementToPrerequisiteQuantityRatio getEntitlementToPrerequisiteQuantityRatio(
      ) {
    return entitlementToPrerequisiteQuantityRatio;
  }

  public void setEntitlementToPrerequisiteQuantityRatio(
      PriceRuleEntitlementToPrerequisiteQuantityRatio entitlementToPrerequisiteQuantityRatio) {
    this.entitlementToPrerequisiteQuantityRatio = entitlementToPrerequisiteQuantityRatio;
  }

  
  public EventConnection getEvents() {
    return events;
  }

  public void setEvents(EventConnection events) {
    this.events = events;
  }

  
  public List<PriceRuleFeature> getFeatures() {
    return features;
  }

  public void setFeatures(List<PriceRuleFeature> features) {
    this.features = features;
  }

  
  public boolean getHasTimelineComment() {
    return hasTimelineComment;
  }

  public void setHasTimelineComment(boolean hasTimelineComment) {
    this.hasTimelineComment = hasTimelineComment;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public PriceRuleItemEntitlements getItemEntitlements() {
    return itemEntitlements;
  }

  public void setItemEntitlements(PriceRuleItemEntitlements itemEntitlements) {
    this.itemEntitlements = itemEntitlements;
  }

  
  public PriceRuleLineItemPrerequisites getItemPrerequisites() {
    return itemPrerequisites;
  }

  public void setItemPrerequisites(PriceRuleLineItemPrerequisites itemPrerequisites) {
    this.itemPrerequisites = itemPrerequisites;
  }

  
  public String getLegacyResourceId() {
    return legacyResourceId;
  }

  public void setLegacyResourceId(String legacyResourceId) {
    this.legacyResourceId = legacyResourceId;
  }

  
  public boolean getOncePerCustomer() {
    return oncePerCustomer;
  }

  public void setOncePerCustomer(boolean oncePerCustomer) {
    this.oncePerCustomer = oncePerCustomer;
  }

  
  public PriceRuleQuantityRange getPrerequisiteQuantityRange() {
    return prerequisiteQuantityRange;
  }

  public void setPrerequisiteQuantityRange(PriceRuleQuantityRange prerequisiteQuantityRange) {
    this.prerequisiteQuantityRange = prerequisiteQuantityRange;
  }

  
  public PriceRuleMoneyRange getPrerequisiteShippingPriceRange() {
    return prerequisiteShippingPriceRange;
  }

  public void setPrerequisiteShippingPriceRange(
      PriceRuleMoneyRange prerequisiteShippingPriceRange) {
    this.prerequisiteShippingPriceRange = prerequisiteShippingPriceRange;
  }

  
  public PriceRuleMoneyRange getPrerequisiteSubtotalRange() {
    return prerequisiteSubtotalRange;
  }

  public void setPrerequisiteSubtotalRange(PriceRuleMoneyRange prerequisiteSubtotalRange) {
    this.prerequisiteSubtotalRange = prerequisiteSubtotalRange;
  }

  
  public PriceRulePrerequisiteToEntitlementQuantityRatio getPrerequisiteToEntitlementQuantityRatio(
      ) {
    return prerequisiteToEntitlementQuantityRatio;
  }

  public void setPrerequisiteToEntitlementQuantityRatio(
      PriceRulePrerequisiteToEntitlementQuantityRatio prerequisiteToEntitlementQuantityRatio) {
    this.prerequisiteToEntitlementQuantityRatio = prerequisiteToEntitlementQuantityRatio;
  }

  
  public List<PriceRuleShareableUrl> getShareableUrls() {
    return shareableUrls;
  }

  public void setShareableUrls(List<PriceRuleShareableUrl> shareableUrls) {
    this.shareableUrls = shareableUrls;
  }

  
  public PriceRuleShippingLineEntitlements getShippingEntitlements() {
    return shippingEntitlements;
  }

  public void setShippingEntitlements(PriceRuleShippingLineEntitlements shippingEntitlements) {
    this.shippingEntitlements = shippingEntitlements;
  }

  
  public OffsetDateTime getStartsAt() {
    return startsAt;
  }

  public void setStartsAt(OffsetDateTime startsAt) {
    this.startsAt = startsAt;
  }

  
  public PriceRuleStatus getStatus() {
    return status;
  }

  public void setStatus(PriceRuleStatus status) {
    this.status = status;
  }

  
  public String getSummary() {
    return summary;
  }

  public void setSummary(String summary) {
    this.summary = summary;
  }

  
  public PriceRuleTarget getTarget() {
    return target;
  }

  public void setTarget(PriceRuleTarget target) {
    this.target = target;
  }

  
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  
  public MoneyV2 getTotalSales() {
    return totalSales;
  }

  public void setTotalSales(MoneyV2 totalSales) {
    this.totalSales = totalSales;
  }

  
  public List<PriceRuleTrait> getTraits() {
    return traits;
  }

  public void setTraits(List<PriceRuleTrait> traits) {
    this.traits = traits;
  }

  
  public int getUsageCount() {
    return usageCount;
  }

  public void setUsageCount(int usageCount) {
    this.usageCount = usageCount;
  }

  
  public Integer getUsageLimit() {
    return usageLimit;
  }

  public void setUsageLimit(Integer usageLimit) {
    this.usageLimit = usageLimit;
  }

  
  public PriceRuleValidityPeriod getValidityPeriod() {
    return validityPeriod;
  }

  public void setValidityPeriod(PriceRuleValidityPeriod validityPeriod) {
    this.validityPeriod = validityPeriod;
  }

  
  public PriceRuleValue getValue() {
    return value;
  }

  public void setValue(PriceRuleValue value) {
    this.value = value;
  }

  
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
    
    private Integer allocationLimit;

    
    private PriceRuleAllocationMethod allocationMethod;

    
    private App app;

    
    private DiscountCombinesWith combinesWith;

    
    private OffsetDateTime createdAt;

    
    private PriceRuleCustomerSelection customerSelection;

    
    private DiscountClass discountClass;

    
    private PriceRuleDiscountCodeConnection discountCodes;

    
    private Count discountCodesCount;

    
    private OffsetDateTime endsAt;

    
    private PriceRuleEntitlementToPrerequisiteQuantityRatio entitlementToPrerequisiteQuantityRatio;

    
    private EventConnection events;

    
    private List<PriceRuleFeature> features;

    
    private boolean hasTimelineComment;

    
    private String id;

    
    private PriceRuleItemEntitlements itemEntitlements;

    
    private PriceRuleLineItemPrerequisites itemPrerequisites;

    
    private String legacyResourceId;

    
    private boolean oncePerCustomer;

    
    private PriceRuleQuantityRange prerequisiteQuantityRange;

    
    private PriceRuleMoneyRange prerequisiteShippingPriceRange;

    
    private PriceRuleMoneyRange prerequisiteSubtotalRange;

    
    private PriceRulePrerequisiteToEntitlementQuantityRatio prerequisiteToEntitlementQuantityRatio;

    
    private List<PriceRuleShareableUrl> shareableUrls;

    
    private PriceRuleShippingLineEntitlements shippingEntitlements;

    
    private OffsetDateTime startsAt;

    
    private PriceRuleStatus status;

    
    private String summary;

    
    private PriceRuleTarget target;

    
    private String title;

    
    private MoneyV2 totalSales;

    
    private List<PriceRuleTrait> traits;

    
    private int usageCount;

    
    private Integer usageLimit;

    
    private PriceRuleValidityPeriod validityPeriod;

    
    private PriceRuleValue value;

    
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

    
    public Builder allocationLimit(Integer allocationLimit) {
      this.allocationLimit = allocationLimit;
      return this;
    }

    
    public Builder allocationMethod(PriceRuleAllocationMethod allocationMethod) {
      this.allocationMethod = allocationMethod;
      return this;
    }

    
    public Builder app(App app) {
      this.app = app;
      return this;
    }

    
    public Builder combinesWith(DiscountCombinesWith combinesWith) {
      this.combinesWith = combinesWith;
      return this;
    }

    
    public Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    
    public Builder customerSelection(PriceRuleCustomerSelection customerSelection) {
      this.customerSelection = customerSelection;
      return this;
    }

    
    public Builder discountClass(DiscountClass discountClass) {
      this.discountClass = discountClass;
      return this;
    }

    
    public Builder discountCodes(PriceRuleDiscountCodeConnection discountCodes) {
      this.discountCodes = discountCodes;
      return this;
    }

    
    public Builder discountCodesCount(Count discountCodesCount) {
      this.discountCodesCount = discountCodesCount;
      return this;
    }

    
    public Builder endsAt(OffsetDateTime endsAt) {
      this.endsAt = endsAt;
      return this;
    }

    
    public Builder entitlementToPrerequisiteQuantityRatio(
        PriceRuleEntitlementToPrerequisiteQuantityRatio entitlementToPrerequisiteQuantityRatio) {
      this.entitlementToPrerequisiteQuantityRatio = entitlementToPrerequisiteQuantityRatio;
      return this;
    }

    
    public Builder events(EventConnection events) {
      this.events = events;
      return this;
    }

    
    public Builder features(List<PriceRuleFeature> features) {
      this.features = features;
      return this;
    }

    
    public Builder hasTimelineComment(boolean hasTimelineComment) {
      this.hasTimelineComment = hasTimelineComment;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder itemEntitlements(PriceRuleItemEntitlements itemEntitlements) {
      this.itemEntitlements = itemEntitlements;
      return this;
    }

    
    public Builder itemPrerequisites(PriceRuleLineItemPrerequisites itemPrerequisites) {
      this.itemPrerequisites = itemPrerequisites;
      return this;
    }

    
    public Builder legacyResourceId(String legacyResourceId) {
      this.legacyResourceId = legacyResourceId;
      return this;
    }

    
    public Builder oncePerCustomer(boolean oncePerCustomer) {
      this.oncePerCustomer = oncePerCustomer;
      return this;
    }

    
    public Builder prerequisiteQuantityRange(PriceRuleQuantityRange prerequisiteQuantityRange) {
      this.prerequisiteQuantityRange = prerequisiteQuantityRange;
      return this;
    }

    
    public Builder prerequisiteShippingPriceRange(
        PriceRuleMoneyRange prerequisiteShippingPriceRange) {
      this.prerequisiteShippingPriceRange = prerequisiteShippingPriceRange;
      return this;
    }

    
    public Builder prerequisiteSubtotalRange(PriceRuleMoneyRange prerequisiteSubtotalRange) {
      this.prerequisiteSubtotalRange = prerequisiteSubtotalRange;
      return this;
    }

    
    public Builder prerequisiteToEntitlementQuantityRatio(
        PriceRulePrerequisiteToEntitlementQuantityRatio prerequisiteToEntitlementQuantityRatio) {
      this.prerequisiteToEntitlementQuantityRatio = prerequisiteToEntitlementQuantityRatio;
      return this;
    }

    
    public Builder shareableUrls(List<PriceRuleShareableUrl> shareableUrls) {
      this.shareableUrls = shareableUrls;
      return this;
    }

    
    public Builder shippingEntitlements(PriceRuleShippingLineEntitlements shippingEntitlements) {
      this.shippingEntitlements = shippingEntitlements;
      return this;
    }

    
    public Builder startsAt(OffsetDateTime startsAt) {
      this.startsAt = startsAt;
      return this;
    }

    
    public Builder status(PriceRuleStatus status) {
      this.status = status;
      return this;
    }

    
    public Builder summary(String summary) {
      this.summary = summary;
      return this;
    }

    
    public Builder target(PriceRuleTarget target) {
      this.target = target;
      return this;
    }

    
    public Builder title(String title) {
      this.title = title;
      return this;
    }

    
    public Builder totalSales(MoneyV2 totalSales) {
      this.totalSales = totalSales;
      return this;
    }

    
    public Builder traits(List<PriceRuleTrait> traits) {
      this.traits = traits;
      return this;
    }

    
    public Builder usageCount(int usageCount) {
      this.usageCount = usageCount;
      return this;
    }

    
    public Builder usageLimit(Integer usageLimit) {
      this.usageLimit = usageLimit;
      return this;
    }

    
    public Builder validityPeriod(PriceRuleValidityPeriod validityPeriod) {
      this.validityPeriod = validityPeriod;
      return this;
    }

    
    public Builder value(PriceRuleValue value) {
      this.value = value;
      return this;
    }

    
    public Builder valueV2(PricingValue valueV2) {
      this.valueV2 = valueV2;
      return this;
    }
  }
}
