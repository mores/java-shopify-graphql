package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class DiscountAutomaticAppFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public DiscountAutomaticAppFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DiscountAutomaticApp"));
  }

  public DiscountAutomaticAppFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AppDiscountTypeProjection<DiscountAutomaticAppFragmentProjection<PARENT, ROOT>, ROOT> appDiscountType(
      ) {
     AppDiscountTypeProjection<DiscountAutomaticAppFragmentProjection<PARENT, ROOT>, ROOT> projection = new AppDiscountTypeProjection<>(this, getRoot());
     getFields().put("appDiscountType", projection);
     return projection;
  }

  public DiscountCombinesWithProjection<DiscountAutomaticAppFragmentProjection<PARENT, ROOT>, ROOT> combinesWith(
      ) {
     DiscountCombinesWithProjection<DiscountAutomaticAppFragmentProjection<PARENT, ROOT>, ROOT> projection = new DiscountCombinesWithProjection<>(this, getRoot());
     getFields().put("combinesWith", projection);
     return projection;
  }

  public DiscountClassProjection<DiscountAutomaticAppFragmentProjection<PARENT, ROOT>, ROOT> discountClass(
      ) {
     DiscountClassProjection<DiscountAutomaticAppFragmentProjection<PARENT, ROOT>, ROOT> projection = new DiscountClassProjection<>(this, getRoot());
     getFields().put("discountClass", projection);
     return projection;
  }

  public FunctionsErrorHistoryProjection<DiscountAutomaticAppFragmentProjection<PARENT, ROOT>, ROOT> errorHistory(
      ) {
     FunctionsErrorHistoryProjection<DiscountAutomaticAppFragmentProjection<PARENT, ROOT>, ROOT> projection = new FunctionsErrorHistoryProjection<>(this, getRoot());
     getFields().put("errorHistory", projection);
     return projection;
  }

  public DiscountStatusProjection<DiscountAutomaticAppFragmentProjection<PARENT, ROOT>, ROOT> status(
      ) {
     DiscountStatusProjection<DiscountAutomaticAppFragmentProjection<PARENT, ROOT>, ROOT> projection = new DiscountStatusProjection<>(this, getRoot());
     getFields().put("status", projection);
     return projection;
  }

  public DiscountAutomaticAppFragmentProjection<PARENT, ROOT> appliesOnOneTimePurchase() {
    getFields().put("appliesOnOneTimePurchase", null);
    return this;
  }

  public DiscountAutomaticAppFragmentProjection<PARENT, ROOT> appliesOnSubscription() {
    getFields().put("appliesOnSubscription", null);
    return this;
  }

  public DiscountAutomaticAppFragmentProjection<PARENT, ROOT> asyncUsageCount() {
    getFields().put("asyncUsageCount", null);
    return this;
  }

  public DiscountAutomaticAppFragmentProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public DiscountAutomaticAppFragmentProjection<PARENT, ROOT> discountId() {
    getFields().put("discountId", null);
    return this;
  }

  public DiscountAutomaticAppFragmentProjection<PARENT, ROOT> endsAt() {
    getFields().put("endsAt", null);
    return this;
  }

  public DiscountAutomaticAppFragmentProjection<PARENT, ROOT> recurringCycleLimit() {
    getFields().put("recurringCycleLimit", null);
    return this;
  }

  public DiscountAutomaticAppFragmentProjection<PARENT, ROOT> startsAt() {
    getFields().put("startsAt", null);
    return this;
  }

  public DiscountAutomaticAppFragmentProjection<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }

  public DiscountAutomaticAppFragmentProjection<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on DiscountAutomaticApp {");
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
