package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.types.DiscountCodeSortKeys;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;

public class DiscountCodeFreeShippingFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public DiscountCodeFreeShippingFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DiscountCodeFreeShipping"));
  }

  public DiscountCodeFreeShippingFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DiscountRedeemCodeConnectionProjection<DiscountCodeFreeShippingFragmentProjection<PARENT, ROOT>, ROOT> codes(
      ) {
     DiscountRedeemCodeConnectionProjection<DiscountCodeFreeShippingFragmentProjection<PARENT, ROOT>, ROOT> projection = new DiscountRedeemCodeConnectionProjection<>(this, getRoot());
     getFields().put("codes", projection);
     return projection;
  }

  public DiscountRedeemCodeConnectionProjection<DiscountCodeFreeShippingFragmentProjection<PARENT, ROOT>, ROOT> codes(
      Integer first, String after, Integer last, String before, Boolean reverse,
      DiscountCodeSortKeys sortKey, String query, String savedSearchId) {
    DiscountRedeemCodeConnectionProjection<DiscountCodeFreeShippingFragmentProjection<PARENT, ROOT>, ROOT> projection = new DiscountRedeemCodeConnectionProjection<>(this, getRoot());    
    getFields().put("codes", projection);
    getInputArguments().computeIfAbsent("codes", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("codes").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("codes").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("codes").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("codes").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("codes").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("codes").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("codes").add(queryArg);
    InputArgument savedSearchIdArg = new InputArgument("savedSearchId", savedSearchId);
    getInputArguments().get("codes").add(savedSearchIdArg);
    return projection;
  }

  public CountProjection<DiscountCodeFreeShippingFragmentProjection<PARENT, ROOT>, ROOT> codesCount(
      ) {
     CountProjection<DiscountCodeFreeShippingFragmentProjection<PARENT, ROOT>, ROOT> projection = new CountProjection<>(this, getRoot());
     getFields().put("codesCount", projection);
     return projection;
  }

  public DiscountCombinesWithProjection<DiscountCodeFreeShippingFragmentProjection<PARENT, ROOT>, ROOT> combinesWith(
      ) {
     DiscountCombinesWithProjection<DiscountCodeFreeShippingFragmentProjection<PARENT, ROOT>, ROOT> projection = new DiscountCombinesWithProjection<>(this, getRoot());
     getFields().put("combinesWith", projection);
     return projection;
  }

  public DiscountCustomerSelectionProjection<DiscountCodeFreeShippingFragmentProjection<PARENT, ROOT>, ROOT> customerSelection(
      ) {
     DiscountCustomerSelectionProjection<DiscountCodeFreeShippingFragmentProjection<PARENT, ROOT>, ROOT> projection = new DiscountCustomerSelectionProjection<>(this, getRoot());
     getFields().put("customerSelection", projection);
     return projection;
  }

  public DiscountShippingDestinationSelectionProjection<DiscountCodeFreeShippingFragmentProjection<PARENT, ROOT>, ROOT> destinationSelection(
      ) {
     DiscountShippingDestinationSelectionProjection<DiscountCodeFreeShippingFragmentProjection<PARENT, ROOT>, ROOT> projection = new DiscountShippingDestinationSelectionProjection<>(this, getRoot());
     getFields().put("destinationSelection", projection);
     return projection;
  }

  public ShippingDiscountClassProjection<DiscountCodeFreeShippingFragmentProjection<PARENT, ROOT>, ROOT> discountClass(
      ) {
     ShippingDiscountClassProjection<DiscountCodeFreeShippingFragmentProjection<PARENT, ROOT>, ROOT> projection = new ShippingDiscountClassProjection<>(this, getRoot());
     getFields().put("discountClass", projection);
     return projection;
  }

  public MoneyV2Projection<DiscountCodeFreeShippingFragmentProjection<PARENT, ROOT>, ROOT> maximumShippingPrice(
      ) {
     MoneyV2Projection<DiscountCodeFreeShippingFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("maximumShippingPrice", projection);
     return projection;
  }

  public DiscountMinimumRequirementProjection<DiscountCodeFreeShippingFragmentProjection<PARENT, ROOT>, ROOT> minimumRequirement(
      ) {
     DiscountMinimumRequirementProjection<DiscountCodeFreeShippingFragmentProjection<PARENT, ROOT>, ROOT> projection = new DiscountMinimumRequirementProjection<>(this, getRoot());
     getFields().put("minimumRequirement", projection);
     return projection;
  }

  public DiscountShareableUrlProjection<DiscountCodeFreeShippingFragmentProjection<PARENT, ROOT>, ROOT> shareableUrls(
      ) {
     DiscountShareableUrlProjection<DiscountCodeFreeShippingFragmentProjection<PARENT, ROOT>, ROOT> projection = new DiscountShareableUrlProjection<>(this, getRoot());
     getFields().put("shareableUrls", projection);
     return projection;
  }

  public DiscountStatusProjection<DiscountCodeFreeShippingFragmentProjection<PARENT, ROOT>, ROOT> status(
      ) {
     DiscountStatusProjection<DiscountCodeFreeShippingFragmentProjection<PARENT, ROOT>, ROOT> projection = new DiscountStatusProjection<>(this, getRoot());
     getFields().put("status", projection);
     return projection;
  }

  public MoneyV2Projection<DiscountCodeFreeShippingFragmentProjection<PARENT, ROOT>, ROOT> totalSales(
      ) {
     MoneyV2Projection<DiscountCodeFreeShippingFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("totalSales", projection);
     return projection;
  }

  public DiscountCodeFreeShippingFragmentProjection<PARENT, ROOT> appliesOnOneTimePurchase() {
    getFields().put("appliesOnOneTimePurchase", null);
    return this;
  }

  public DiscountCodeFreeShippingFragmentProjection<PARENT, ROOT> appliesOnSubscription() {
    getFields().put("appliesOnSubscription", null);
    return this;
  }

  public DiscountCodeFreeShippingFragmentProjection<PARENT, ROOT> appliesOncePerCustomer() {
    getFields().put("appliesOncePerCustomer", null);
    return this;
  }

  public DiscountCodeFreeShippingFragmentProjection<PARENT, ROOT> asyncUsageCount() {
    getFields().put("asyncUsageCount", null);
    return this;
  }

  public DiscountCodeFreeShippingFragmentProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public DiscountCodeFreeShippingFragmentProjection<PARENT, ROOT> endsAt() {
    getFields().put("endsAt", null);
    return this;
  }

  public DiscountCodeFreeShippingFragmentProjection<PARENT, ROOT> hasTimelineComment() {
    getFields().put("hasTimelineComment", null);
    return this;
  }

  public DiscountCodeFreeShippingFragmentProjection<PARENT, ROOT> recurringCycleLimit() {
    getFields().put("recurringCycleLimit", null);
    return this;
  }

  public DiscountCodeFreeShippingFragmentProjection<PARENT, ROOT> shortSummary() {
    getFields().put("shortSummary", null);
    return this;
  }

  public DiscountCodeFreeShippingFragmentProjection<PARENT, ROOT> startsAt() {
    getFields().put("startsAt", null);
    return this;
  }

  public DiscountCodeFreeShippingFragmentProjection<PARENT, ROOT> summary() {
    getFields().put("summary", null);
    return this;
  }

  public DiscountCodeFreeShippingFragmentProjection<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }

  public DiscountCodeFreeShippingFragmentProjection<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }

  public DiscountCodeFreeShippingFragmentProjection<PARENT, ROOT> usageLimit() {
    getFields().put("usageLimit", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on DiscountCodeFreeShipping {");
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
