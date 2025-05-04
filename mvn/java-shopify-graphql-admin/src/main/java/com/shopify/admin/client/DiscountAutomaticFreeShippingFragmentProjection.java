package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class DiscountAutomaticFreeShippingFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public DiscountAutomaticFreeShippingFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DiscountAutomaticFreeShipping"));
  }

  public DiscountAutomaticFreeShippingFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DiscountCombinesWithProjection<DiscountAutomaticFreeShippingFragmentProjection<PARENT, ROOT>, ROOT> combinesWith(
      ) {
     DiscountCombinesWithProjection<DiscountAutomaticFreeShippingFragmentProjection<PARENT, ROOT>, ROOT> projection = new DiscountCombinesWithProjection<>(this, getRoot());
     getFields().put("combinesWith", projection);
     return projection;
  }

  public DiscountShippingDestinationSelectionProjection<DiscountAutomaticFreeShippingFragmentProjection<PARENT, ROOT>, ROOT> destinationSelection(
      ) {
     DiscountShippingDestinationSelectionProjection<DiscountAutomaticFreeShippingFragmentProjection<PARENT, ROOT>, ROOT> projection = new DiscountShippingDestinationSelectionProjection<>(this, getRoot());
     getFields().put("destinationSelection", projection);
     return projection;
  }

  public ShippingDiscountClassProjection<DiscountAutomaticFreeShippingFragmentProjection<PARENT, ROOT>, ROOT> discountClass(
      ) {
     ShippingDiscountClassProjection<DiscountAutomaticFreeShippingFragmentProjection<PARENT, ROOT>, ROOT> projection = new ShippingDiscountClassProjection<>(this, getRoot());
     getFields().put("discountClass", projection);
     return projection;
  }

  public DiscountClassProjection<DiscountAutomaticFreeShippingFragmentProjection<PARENT, ROOT>, ROOT> discountClasses(
      ) {
     DiscountClassProjection<DiscountAutomaticFreeShippingFragmentProjection<PARENT, ROOT>, ROOT> projection = new DiscountClassProjection<>(this, getRoot());
     getFields().put("discountClasses", projection);
     return projection;
  }

  public MoneyV2Projection<DiscountAutomaticFreeShippingFragmentProjection<PARENT, ROOT>, ROOT> maximumShippingPrice(
      ) {
     MoneyV2Projection<DiscountAutomaticFreeShippingFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("maximumShippingPrice", projection);
     return projection;
  }

  public DiscountMinimumRequirementProjection<DiscountAutomaticFreeShippingFragmentProjection<PARENT, ROOT>, ROOT> minimumRequirement(
      ) {
     DiscountMinimumRequirementProjection<DiscountAutomaticFreeShippingFragmentProjection<PARENT, ROOT>, ROOT> projection = new DiscountMinimumRequirementProjection<>(this, getRoot());
     getFields().put("minimumRequirement", projection);
     return projection;
  }

  public DiscountStatusProjection<DiscountAutomaticFreeShippingFragmentProjection<PARENT, ROOT>, ROOT> status(
      ) {
     DiscountStatusProjection<DiscountAutomaticFreeShippingFragmentProjection<PARENT, ROOT>, ROOT> projection = new DiscountStatusProjection<>(this, getRoot());
     getFields().put("status", projection);
     return projection;
  }

  public MoneyV2Projection<DiscountAutomaticFreeShippingFragmentProjection<PARENT, ROOT>, ROOT> totalSales(
      ) {
     MoneyV2Projection<DiscountAutomaticFreeShippingFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("totalSales", projection);
     return projection;
  }

  public DiscountAutomaticFreeShippingFragmentProjection<PARENT, ROOT> appliesOnOneTimePurchase() {
    getFields().put("appliesOnOneTimePurchase", null);
    return this;
  }

  public DiscountAutomaticFreeShippingFragmentProjection<PARENT, ROOT> appliesOnSubscription() {
    getFields().put("appliesOnSubscription", null);
    return this;
  }

  public DiscountAutomaticFreeShippingFragmentProjection<PARENT, ROOT> asyncUsageCount() {
    getFields().put("asyncUsageCount", null);
    return this;
  }

  public DiscountAutomaticFreeShippingFragmentProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public DiscountAutomaticFreeShippingFragmentProjection<PARENT, ROOT> endsAt() {
    getFields().put("endsAt", null);
    return this;
  }

  public DiscountAutomaticFreeShippingFragmentProjection<PARENT, ROOT> hasTimelineComment() {
    getFields().put("hasTimelineComment", null);
    return this;
  }

  public DiscountAutomaticFreeShippingFragmentProjection<PARENT, ROOT> recurringCycleLimit() {
    getFields().put("recurringCycleLimit", null);
    return this;
  }

  public DiscountAutomaticFreeShippingFragmentProjection<PARENT, ROOT> shortSummary() {
    getFields().put("shortSummary", null);
    return this;
  }

  public DiscountAutomaticFreeShippingFragmentProjection<PARENT, ROOT> startsAt() {
    getFields().put("startsAt", null);
    return this;
  }

  public DiscountAutomaticFreeShippingFragmentProjection<PARENT, ROOT> summary() {
    getFields().put("summary", null);
    return this;
  }

  public DiscountAutomaticFreeShippingFragmentProjection<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }

  public DiscountAutomaticFreeShippingFragmentProjection<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on DiscountAutomaticFreeShipping {");
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
