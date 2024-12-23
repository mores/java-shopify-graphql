package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.types.DiscountCodeSortKeys;
import com.shopify.types.EventSortKeys;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;

public class PriceRuleFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public PriceRuleFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("PriceRule"));
  }

  public PriceRuleFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PriceRuleAllocationMethodProjection<PriceRuleFragmentProjection<PARENT, ROOT>, ROOT> allocationMethod(
      ) {
     PriceRuleAllocationMethodProjection<PriceRuleFragmentProjection<PARENT, ROOT>, ROOT> projection = new PriceRuleAllocationMethodProjection<>(this, getRoot());
     getFields().put("allocationMethod", projection);
     return projection;
  }

  public AppProjection<PriceRuleFragmentProjection<PARENT, ROOT>, ROOT> app() {
     AppProjection<PriceRuleFragmentProjection<PARENT, ROOT>, ROOT> projection = new AppProjection<>(this, getRoot());
     getFields().put("app", projection);
     return projection;
  }

  public DiscountCombinesWithProjection<PriceRuleFragmentProjection<PARENT, ROOT>, ROOT> combinesWith(
      ) {
     DiscountCombinesWithProjection<PriceRuleFragmentProjection<PARENT, ROOT>, ROOT> projection = new DiscountCombinesWithProjection<>(this, getRoot());
     getFields().put("combinesWith", projection);
     return projection;
  }

  public PriceRuleCustomerSelectionProjection<PriceRuleFragmentProjection<PARENT, ROOT>, ROOT> customerSelection(
      ) {
     PriceRuleCustomerSelectionProjection<PriceRuleFragmentProjection<PARENT, ROOT>, ROOT> projection = new PriceRuleCustomerSelectionProjection<>(this, getRoot());
     getFields().put("customerSelection", projection);
     return projection;
  }

  public DiscountClassProjection<PriceRuleFragmentProjection<PARENT, ROOT>, ROOT> discountClass() {
     DiscountClassProjection<PriceRuleFragmentProjection<PARENT, ROOT>, ROOT> projection = new DiscountClassProjection<>(this, getRoot());
     getFields().put("discountClass", projection);
     return projection;
  }

  public PriceRuleDiscountCodeConnectionProjection<PriceRuleFragmentProjection<PARENT, ROOT>, ROOT> discountCodes(
      ) {
     PriceRuleDiscountCodeConnectionProjection<PriceRuleFragmentProjection<PARENT, ROOT>, ROOT> projection = new PriceRuleDiscountCodeConnectionProjection<>(this, getRoot());
     getFields().put("discountCodes", projection);
     return projection;
  }

  public PriceRuleDiscountCodeConnectionProjection<PriceRuleFragmentProjection<PARENT, ROOT>, ROOT> discountCodes(
      Integer first, String after, Integer last, String before, Boolean reverse,
      DiscountCodeSortKeys sortKey, String query, String savedSearchId) {
    PriceRuleDiscountCodeConnectionProjection<PriceRuleFragmentProjection<PARENT, ROOT>, ROOT> projection = new PriceRuleDiscountCodeConnectionProjection<>(this, getRoot());    
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

  public CountProjection<PriceRuleFragmentProjection<PARENT, ROOT>, ROOT> discountCodesCount() {
     CountProjection<PriceRuleFragmentProjection<PARENT, ROOT>, ROOT> projection = new CountProjection<>(this, getRoot());
     getFields().put("discountCodesCount", projection);
     return projection;
  }

  public PriceRuleEntitlementToPrerequisiteQuantityRatioProjection<PriceRuleFragmentProjection<PARENT, ROOT>, ROOT> entitlementToPrerequisiteQuantityRatio(
      ) {
     PriceRuleEntitlementToPrerequisiteQuantityRatioProjection<PriceRuleFragmentProjection<PARENT, ROOT>, ROOT> projection = new PriceRuleEntitlementToPrerequisiteQuantityRatioProjection<>(this, getRoot());
     getFields().put("entitlementToPrerequisiteQuantityRatio", projection);
     return projection;
  }

  public EventConnectionProjection<PriceRuleFragmentProjection<PARENT, ROOT>, ROOT> events() {
     EventConnectionProjection<PriceRuleFragmentProjection<PARENT, ROOT>, ROOT> projection = new EventConnectionProjection<>(this, getRoot());
     getFields().put("events", projection);
     return projection;
  }

  public EventConnectionProjection<PriceRuleFragmentProjection<PARENT, ROOT>, ROOT> events(
      Integer first, String after, Integer last, String before, Boolean reverse,
      EventSortKeys sortKey, String query) {
    EventConnectionProjection<PriceRuleFragmentProjection<PARENT, ROOT>, ROOT> projection = new EventConnectionProjection<>(this, getRoot());    
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

  public PriceRuleFeatureProjection<PriceRuleFragmentProjection<PARENT, ROOT>, ROOT> features() {
     PriceRuleFeatureProjection<PriceRuleFragmentProjection<PARENT, ROOT>, ROOT> projection = new PriceRuleFeatureProjection<>(this, getRoot());
     getFields().put("features", projection);
     return projection;
  }

  public PriceRuleItemEntitlementsProjection<PriceRuleFragmentProjection<PARENT, ROOT>, ROOT> itemEntitlements(
      ) {
     PriceRuleItemEntitlementsProjection<PriceRuleFragmentProjection<PARENT, ROOT>, ROOT> projection = new PriceRuleItemEntitlementsProjection<>(this, getRoot());
     getFields().put("itemEntitlements", projection);
     return projection;
  }

  public PriceRuleLineItemPrerequisitesProjection<PriceRuleFragmentProjection<PARENT, ROOT>, ROOT> itemPrerequisites(
      ) {
     PriceRuleLineItemPrerequisitesProjection<PriceRuleFragmentProjection<PARENT, ROOT>, ROOT> projection = new PriceRuleLineItemPrerequisitesProjection<>(this, getRoot());
     getFields().put("itemPrerequisites", projection);
     return projection;
  }

  public PriceRuleQuantityRangeProjection<PriceRuleFragmentProjection<PARENT, ROOT>, ROOT> prerequisiteQuantityRange(
      ) {
     PriceRuleQuantityRangeProjection<PriceRuleFragmentProjection<PARENT, ROOT>, ROOT> projection = new PriceRuleQuantityRangeProjection<>(this, getRoot());
     getFields().put("prerequisiteQuantityRange", projection);
     return projection;
  }

  public PriceRuleMoneyRangeProjection<PriceRuleFragmentProjection<PARENT, ROOT>, ROOT> prerequisiteShippingPriceRange(
      ) {
     PriceRuleMoneyRangeProjection<PriceRuleFragmentProjection<PARENT, ROOT>, ROOT> projection = new PriceRuleMoneyRangeProjection<>(this, getRoot());
     getFields().put("prerequisiteShippingPriceRange", projection);
     return projection;
  }

  public PriceRuleMoneyRangeProjection<PriceRuleFragmentProjection<PARENT, ROOT>, ROOT> prerequisiteSubtotalRange(
      ) {
     PriceRuleMoneyRangeProjection<PriceRuleFragmentProjection<PARENT, ROOT>, ROOT> projection = new PriceRuleMoneyRangeProjection<>(this, getRoot());
     getFields().put("prerequisiteSubtotalRange", projection);
     return projection;
  }

  public PriceRulePrerequisiteToEntitlementQuantityRatioProjection<PriceRuleFragmentProjection<PARENT, ROOT>, ROOT> prerequisiteToEntitlementQuantityRatio(
      ) {
     PriceRulePrerequisiteToEntitlementQuantityRatioProjection<PriceRuleFragmentProjection<PARENT, ROOT>, ROOT> projection = new PriceRulePrerequisiteToEntitlementQuantityRatioProjection<>(this, getRoot());
     getFields().put("prerequisiteToEntitlementQuantityRatio", projection);
     return projection;
  }

  public PriceRuleShareableUrlProjection<PriceRuleFragmentProjection<PARENT, ROOT>, ROOT> shareableUrls(
      ) {
     PriceRuleShareableUrlProjection<PriceRuleFragmentProjection<PARENT, ROOT>, ROOT> projection = new PriceRuleShareableUrlProjection<>(this, getRoot());
     getFields().put("shareableUrls", projection);
     return projection;
  }

  public PriceRuleShippingLineEntitlementsProjection<PriceRuleFragmentProjection<PARENT, ROOT>, ROOT> shippingEntitlements(
      ) {
     PriceRuleShippingLineEntitlementsProjection<PriceRuleFragmentProjection<PARENT, ROOT>, ROOT> projection = new PriceRuleShippingLineEntitlementsProjection<>(this, getRoot());
     getFields().put("shippingEntitlements", projection);
     return projection;
  }

  public PriceRuleStatusProjection<PriceRuleFragmentProjection<PARENT, ROOT>, ROOT> status() {
     PriceRuleStatusProjection<PriceRuleFragmentProjection<PARENT, ROOT>, ROOT> projection = new PriceRuleStatusProjection<>(this, getRoot());
     getFields().put("status", projection);
     return projection;
  }

  public PriceRuleTargetProjection<PriceRuleFragmentProjection<PARENT, ROOT>, ROOT> target() {
     PriceRuleTargetProjection<PriceRuleFragmentProjection<PARENT, ROOT>, ROOT> projection = new PriceRuleTargetProjection<>(this, getRoot());
     getFields().put("target", projection);
     return projection;
  }

  public MoneyV2Projection<PriceRuleFragmentProjection<PARENT, ROOT>, ROOT> totalSales() {
     MoneyV2Projection<PriceRuleFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("totalSales", projection);
     return projection;
  }

  public PriceRuleTraitProjection<PriceRuleFragmentProjection<PARENT, ROOT>, ROOT> traits() {
     PriceRuleTraitProjection<PriceRuleFragmentProjection<PARENT, ROOT>, ROOT> projection = new PriceRuleTraitProjection<>(this, getRoot());
     getFields().put("traits", projection);
     return projection;
  }

  public PriceRuleValidityPeriodProjection<PriceRuleFragmentProjection<PARENT, ROOT>, ROOT> validityPeriod(
      ) {
     PriceRuleValidityPeriodProjection<PriceRuleFragmentProjection<PARENT, ROOT>, ROOT> projection = new PriceRuleValidityPeriodProjection<>(this, getRoot());
     getFields().put("validityPeriod", projection);
     return projection;
  }

  public PriceRuleValueProjection<PriceRuleFragmentProjection<PARENT, ROOT>, ROOT> value() {
     PriceRuleValueProjection<PriceRuleFragmentProjection<PARENT, ROOT>, ROOT> projection = new PriceRuleValueProjection<>(this, getRoot());
     getFields().put("value", projection);
     return projection;
  }

  public PricingValueProjection<PriceRuleFragmentProjection<PARENT, ROOT>, ROOT> valueV2() {
     PricingValueProjection<PriceRuleFragmentProjection<PARENT, ROOT>, ROOT> projection = new PricingValueProjection<>(this, getRoot());
     getFields().put("valueV2", projection);
     return projection;
  }

  public PriceRuleFragmentProjection<PARENT, ROOT> allocationLimit() {
    getFields().put("allocationLimit", null);
    return this;
  }

  public PriceRuleFragmentProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public PriceRuleFragmentProjection<PARENT, ROOT> endsAt() {
    getFields().put("endsAt", null);
    return this;
  }

  public PriceRuleFragmentProjection<PARENT, ROOT> hasTimelineComment() {
    getFields().put("hasTimelineComment", null);
    return this;
  }

  public PriceRuleFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public PriceRuleFragmentProjection<PARENT, ROOT> legacyResourceId() {
    getFields().put("legacyResourceId", null);
    return this;
  }

  public PriceRuleFragmentProjection<PARENT, ROOT> oncePerCustomer() {
    getFields().put("oncePerCustomer", null);
    return this;
  }

  public PriceRuleFragmentProjection<PARENT, ROOT> startsAt() {
    getFields().put("startsAt", null);
    return this;
  }

  public PriceRuleFragmentProjection<PARENT, ROOT> summary() {
    getFields().put("summary", null);
    return this;
  }

  public PriceRuleFragmentProjection<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }

  public PriceRuleFragmentProjection<PARENT, ROOT> usageCount() {
    getFields().put("usageCount", null);
    return this;
  }

  public PriceRuleFragmentProjection<PARENT, ROOT> usageLimit() {
    getFields().put("usageLimit", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on PriceRule {");
    getFields().forEach((k, v) -> {
        builder.append(" ").append(k);
        if(v != null) {
            builder.append(" ").append(v.toString());
        }
    });
    builder.append("}");
     
    return builder.toString();
  }
}
