package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DiscountAutomaticAppProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DiscountAutomaticAppProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DiscountAutomaticApp"));
  }

  public DiscountAutomaticAppProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AppDiscountTypeProjection<DiscountAutomaticAppProjection<PARENT, ROOT>, ROOT> appDiscountType(
      ) {
     AppDiscountTypeProjection<DiscountAutomaticAppProjection<PARENT, ROOT>, ROOT> projection = new AppDiscountTypeProjection<>(this, getRoot());
     getFields().put("appDiscountType", projection);
     return projection;
  }

  public DiscountCombinesWithProjection<DiscountAutomaticAppProjection<PARENT, ROOT>, ROOT> combinesWith(
      ) {
     DiscountCombinesWithProjection<DiscountAutomaticAppProjection<PARENT, ROOT>, ROOT> projection = new DiscountCombinesWithProjection<>(this, getRoot());
     getFields().put("combinesWith", projection);
     return projection;
  }

  public DiscountClassProjection<DiscountAutomaticAppProjection<PARENT, ROOT>, ROOT> discountClass(
      ) {
     DiscountClassProjection<DiscountAutomaticAppProjection<PARENT, ROOT>, ROOT> projection = new DiscountClassProjection<>(this, getRoot());
     getFields().put("discountClass", projection);
     return projection;
  }

  public DiscountClassProjection<DiscountAutomaticAppProjection<PARENT, ROOT>, ROOT> discountClasses(
      ) {
     DiscountClassProjection<DiscountAutomaticAppProjection<PARENT, ROOT>, ROOT> projection = new DiscountClassProjection<>(this, getRoot());
     getFields().put("discountClasses", projection);
     return projection;
  }

  public FunctionsErrorHistoryProjection<DiscountAutomaticAppProjection<PARENT, ROOT>, ROOT> errorHistory(
      ) {
     FunctionsErrorHistoryProjection<DiscountAutomaticAppProjection<PARENT, ROOT>, ROOT> projection = new FunctionsErrorHistoryProjection<>(this, getRoot());
     getFields().put("errorHistory", projection);
     return projection;
  }

  public DiscountStatusProjection<DiscountAutomaticAppProjection<PARENT, ROOT>, ROOT> status() {
     DiscountStatusProjection<DiscountAutomaticAppProjection<PARENT, ROOT>, ROOT> projection = new DiscountStatusProjection<>(this, getRoot());
     getFields().put("status", projection);
     return projection;
  }

  public DiscountAutomaticAppProjection<PARENT, ROOT> appliesOnOneTimePurchase() {
    getFields().put("appliesOnOneTimePurchase", null);
    return this;
  }

  public DiscountAutomaticAppProjection<PARENT, ROOT> appliesOnSubscription() {
    getFields().put("appliesOnSubscription", null);
    return this;
  }

  public DiscountAutomaticAppProjection<PARENT, ROOT> asyncUsageCount() {
    getFields().put("asyncUsageCount", null);
    return this;
  }

  public DiscountAutomaticAppProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public DiscountAutomaticAppProjection<PARENT, ROOT> discountId() {
    getFields().put("discountId", null);
    return this;
  }

  public DiscountAutomaticAppProjection<PARENT, ROOT> endsAt() {
    getFields().put("endsAt", null);
    return this;
  }

  public DiscountAutomaticAppProjection<PARENT, ROOT> recurringCycleLimit() {
    getFields().put("recurringCycleLimit", null);
    return this;
  }

  public DiscountAutomaticAppProjection<PARENT, ROOT> startsAt() {
    getFields().put("startsAt", null);
    return this;
  }

  public DiscountAutomaticAppProjection<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }

  public DiscountAutomaticAppProjection<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }
}
