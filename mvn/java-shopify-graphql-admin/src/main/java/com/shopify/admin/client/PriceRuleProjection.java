package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.admin.types.DiscountCodeSortKeys;
import com.shopify.admin.types.EventSortKeys;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;

public class PriceRuleProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PriceRuleProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("PriceRule"));
  }

  public PriceRuleProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PriceRuleAllocationMethodProjection<PriceRuleProjection<PARENT, ROOT>, ROOT> allocationMethod(
      ) {
     PriceRuleAllocationMethodProjection<PriceRuleProjection<PARENT, ROOT>, ROOT> projection = new PriceRuleAllocationMethodProjection<>(this, getRoot());
     getFields().put("allocationMethod", projection);
     return projection;
  }

  public AppProjection<PriceRuleProjection<PARENT, ROOT>, ROOT> app() {
     AppProjection<PriceRuleProjection<PARENT, ROOT>, ROOT> projection = new AppProjection<>(this, getRoot());
     getFields().put("app", projection);
     return projection;
  }

  public DiscountCombinesWithProjection<PriceRuleProjection<PARENT, ROOT>, ROOT> combinesWith() {
     DiscountCombinesWithProjection<PriceRuleProjection<PARENT, ROOT>, ROOT> projection = new DiscountCombinesWithProjection<>(this, getRoot());
     getFields().put("combinesWith", projection);
     return projection;
  }

  public PriceRuleCustomerSelectionProjection<PriceRuleProjection<PARENT, ROOT>, ROOT> customerSelection(
      ) {
     PriceRuleCustomerSelectionProjection<PriceRuleProjection<PARENT, ROOT>, ROOT> projection = new PriceRuleCustomerSelectionProjection<>(this, getRoot());
     getFields().put("customerSelection", projection);
     return projection;
  }

  public DiscountClassProjection<PriceRuleProjection<PARENT, ROOT>, ROOT> discountClass() {
     DiscountClassProjection<PriceRuleProjection<PARENT, ROOT>, ROOT> projection = new DiscountClassProjection<>(this, getRoot());
     getFields().put("discountClass", projection);
     return projection;
  }

  public DiscountClassProjection<PriceRuleProjection<PARENT, ROOT>, ROOT> discountClasses() {
     DiscountClassProjection<PriceRuleProjection<PARENT, ROOT>, ROOT> projection = new DiscountClassProjection<>(this, getRoot());
     getFields().put("discountClasses", projection);
     return projection;
  }

  public PriceRuleDiscountCodeConnectionProjection<PriceRuleProjection<PARENT, ROOT>, ROOT> discountCodes(
      ) {
     PriceRuleDiscountCodeConnectionProjection<PriceRuleProjection<PARENT, ROOT>, ROOT> projection = new PriceRuleDiscountCodeConnectionProjection<>(this, getRoot());
     getFields().put("discountCodes", projection);
     return projection;
  }

  public PriceRuleDiscountCodeConnectionProjection<PriceRuleProjection<PARENT, ROOT>, ROOT> discountCodes(
      Integer first, String after, Integer last, String before, Boolean reverse,
      DiscountCodeSortKeys sortKey, String query, String savedSearchId) {
    PriceRuleDiscountCodeConnectionProjection<PriceRuleProjection<PARENT, ROOT>, ROOT> projection = new PriceRuleDiscountCodeConnectionProjection<>(this, getRoot());    
    getFields().put("discountCodes", projection);
    getInputArguments().computeIfAbsent("discountCodes", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("discountCodes").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("discountCodes").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("discountCodes").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("discountCodes").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("discountCodes").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("discountCodes").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("discountCodes").add(queryArg);
    InputArgument savedSearchIdArg = new InputArgument("savedSearchId", savedSearchId);
    getInputArguments().get("discountCodes").add(savedSearchIdArg);
    return projection;
  }

  public CountProjection<PriceRuleProjection<PARENT, ROOT>, ROOT> discountCodesCount() {
     CountProjection<PriceRuleProjection<PARENT, ROOT>, ROOT> projection = new CountProjection<>(this, getRoot());
     getFields().put("discountCodesCount", projection);
     return projection;
  }

  public PriceRuleEntitlementToPrerequisiteQuantityRatioProjection<PriceRuleProjection<PARENT, ROOT>, ROOT> entitlementToPrerequisiteQuantityRatio(
      ) {
     PriceRuleEntitlementToPrerequisiteQuantityRatioProjection<PriceRuleProjection<PARENT, ROOT>, ROOT> projection = new PriceRuleEntitlementToPrerequisiteQuantityRatioProjection<>(this, getRoot());
     getFields().put("entitlementToPrerequisiteQuantityRatio", projection);
     return projection;
  }

  public EventConnectionProjection<PriceRuleProjection<PARENT, ROOT>, ROOT> events() {
     EventConnectionProjection<PriceRuleProjection<PARENT, ROOT>, ROOT> projection = new EventConnectionProjection<>(this, getRoot());
     getFields().put("events", projection);
     return projection;
  }

  public EventConnectionProjection<PriceRuleProjection<PARENT, ROOT>, ROOT> events(Integer first,
      String after, Integer last, String before, Boolean reverse, EventSortKeys sortKey,
      String query) {
    EventConnectionProjection<PriceRuleProjection<PARENT, ROOT>, ROOT> projection = new EventConnectionProjection<>(this, getRoot());    
    getFields().put("events", projection);
    getInputArguments().computeIfAbsent("events", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("events").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("events").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("events").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("events").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("events").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("events").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("events").add(queryArg);
    return projection;
  }

  public PriceRuleFeatureProjection<PriceRuleProjection<PARENT, ROOT>, ROOT> features() {
     PriceRuleFeatureProjection<PriceRuleProjection<PARENT, ROOT>, ROOT> projection = new PriceRuleFeatureProjection<>(this, getRoot());
     getFields().put("features", projection);
     return projection;
  }

  public PriceRuleItemEntitlementsProjection<PriceRuleProjection<PARENT, ROOT>, ROOT> itemEntitlements(
      ) {
     PriceRuleItemEntitlementsProjection<PriceRuleProjection<PARENT, ROOT>, ROOT> projection = new PriceRuleItemEntitlementsProjection<>(this, getRoot());
     getFields().put("itemEntitlements", projection);
     return projection;
  }

  public PriceRuleLineItemPrerequisitesProjection<PriceRuleProjection<PARENT, ROOT>, ROOT> itemPrerequisites(
      ) {
     PriceRuleLineItemPrerequisitesProjection<PriceRuleProjection<PARENT, ROOT>, ROOT> projection = new PriceRuleLineItemPrerequisitesProjection<>(this, getRoot());
     getFields().put("itemPrerequisites", projection);
     return projection;
  }

  public PriceRuleQuantityRangeProjection<PriceRuleProjection<PARENT, ROOT>, ROOT> prerequisiteQuantityRange(
      ) {
     PriceRuleQuantityRangeProjection<PriceRuleProjection<PARENT, ROOT>, ROOT> projection = new PriceRuleQuantityRangeProjection<>(this, getRoot());
     getFields().put("prerequisiteQuantityRange", projection);
     return projection;
  }

  public PriceRuleMoneyRangeProjection<PriceRuleProjection<PARENT, ROOT>, ROOT> prerequisiteShippingPriceRange(
      ) {
     PriceRuleMoneyRangeProjection<PriceRuleProjection<PARENT, ROOT>, ROOT> projection = new PriceRuleMoneyRangeProjection<>(this, getRoot());
     getFields().put("prerequisiteShippingPriceRange", projection);
     return projection;
  }

  public PriceRuleMoneyRangeProjection<PriceRuleProjection<PARENT, ROOT>, ROOT> prerequisiteSubtotalRange(
      ) {
     PriceRuleMoneyRangeProjection<PriceRuleProjection<PARENT, ROOT>, ROOT> projection = new PriceRuleMoneyRangeProjection<>(this, getRoot());
     getFields().put("prerequisiteSubtotalRange", projection);
     return projection;
  }

  public PriceRulePrerequisiteToEntitlementQuantityRatioProjection<PriceRuleProjection<PARENT, ROOT>, ROOT> prerequisiteToEntitlementQuantityRatio(
      ) {
     PriceRulePrerequisiteToEntitlementQuantityRatioProjection<PriceRuleProjection<PARENT, ROOT>, ROOT> projection = new PriceRulePrerequisiteToEntitlementQuantityRatioProjection<>(this, getRoot());
     getFields().put("prerequisiteToEntitlementQuantityRatio", projection);
     return projection;
  }

  public PriceRuleShareableUrlProjection<PriceRuleProjection<PARENT, ROOT>, ROOT> shareableUrls() {
     PriceRuleShareableUrlProjection<PriceRuleProjection<PARENT, ROOT>, ROOT> projection = new PriceRuleShareableUrlProjection<>(this, getRoot());
     getFields().put("shareableUrls", projection);
     return projection;
  }

  public PriceRuleShippingLineEntitlementsProjection<PriceRuleProjection<PARENT, ROOT>, ROOT> shippingEntitlements(
      ) {
     PriceRuleShippingLineEntitlementsProjection<PriceRuleProjection<PARENT, ROOT>, ROOT> projection = new PriceRuleShippingLineEntitlementsProjection<>(this, getRoot());
     getFields().put("shippingEntitlements", projection);
     return projection;
  }

  public PriceRuleStatusProjection<PriceRuleProjection<PARENT, ROOT>, ROOT> status() {
     PriceRuleStatusProjection<PriceRuleProjection<PARENT, ROOT>, ROOT> projection = new PriceRuleStatusProjection<>(this, getRoot());
     getFields().put("status", projection);
     return projection;
  }

  public PriceRuleTargetProjection<PriceRuleProjection<PARENT, ROOT>, ROOT> target() {
     PriceRuleTargetProjection<PriceRuleProjection<PARENT, ROOT>, ROOT> projection = new PriceRuleTargetProjection<>(this, getRoot());
     getFields().put("target", projection);
     return projection;
  }

  public MoneyV2Projection<PriceRuleProjection<PARENT, ROOT>, ROOT> totalSales() {
     MoneyV2Projection<PriceRuleProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("totalSales", projection);
     return projection;
  }

  public PriceRuleTraitProjection<PriceRuleProjection<PARENT, ROOT>, ROOT> traits() {
     PriceRuleTraitProjection<PriceRuleProjection<PARENT, ROOT>, ROOT> projection = new PriceRuleTraitProjection<>(this, getRoot());
     getFields().put("traits", projection);
     return projection;
  }

  public PriceRuleValidityPeriodProjection<PriceRuleProjection<PARENT, ROOT>, ROOT> validityPeriod(
      ) {
     PriceRuleValidityPeriodProjection<PriceRuleProjection<PARENT, ROOT>, ROOT> projection = new PriceRuleValidityPeriodProjection<>(this, getRoot());
     getFields().put("validityPeriod", projection);
     return projection;
  }

  public PriceRuleValueProjection<PriceRuleProjection<PARENT, ROOT>, ROOT> value() {
     PriceRuleValueProjection<PriceRuleProjection<PARENT, ROOT>, ROOT> projection = new PriceRuleValueProjection<>(this, getRoot());
     getFields().put("value", projection);
     return projection;
  }

  public PricingValueProjection<PriceRuleProjection<PARENT, ROOT>, ROOT> valueV2() {
     PricingValueProjection<PriceRuleProjection<PARENT, ROOT>, ROOT> projection = new PricingValueProjection<>(this, getRoot());
     getFields().put("valueV2", projection);
     return projection;
  }

  public PriceRuleProjection<PARENT, ROOT> allocationLimit() {
    getFields().put("allocationLimit", null);
    return this;
  }

  public PriceRuleProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public PriceRuleProjection<PARENT, ROOT> endsAt() {
    getFields().put("endsAt", null);
    return this;
  }

  public PriceRuleProjection<PARENT, ROOT> hasTimelineComment() {
    getFields().put("hasTimelineComment", null);
    return this;
  }

  public PriceRuleProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public PriceRuleProjection<PARENT, ROOT> legacyResourceId() {
    getFields().put("legacyResourceId", null);
    return this;
  }

  public PriceRuleProjection<PARENT, ROOT> oncePerCustomer() {
    getFields().put("oncePerCustomer", null);
    return this;
  }

  public PriceRuleProjection<PARENT, ROOT> startsAt() {
    getFields().put("startsAt", null);
    return this;
  }

  public PriceRuleProjection<PARENT, ROOT> summary() {
    getFields().put("summary", null);
    return this;
  }

  public PriceRuleProjection<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }

  public PriceRuleProjection<PARENT, ROOT> usageCount() {
    getFields().put("usageCount", null);
    return this;
  }

  public PriceRuleProjection<PARENT, ROOT> usageLimit() {
    getFields().put("usageLimit", null);
    return this;
  }
}
