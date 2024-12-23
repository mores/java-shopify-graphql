package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class DiscountAutomaticBasicFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public DiscountAutomaticBasicFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DiscountAutomaticBasic"));
  }

  public DiscountAutomaticBasicFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DiscountCombinesWithProjection<DiscountAutomaticBasicFragmentProjection<PARENT, ROOT>, ROOT> combinesWith(
      ) {
     DiscountCombinesWithProjection<DiscountAutomaticBasicFragmentProjection<PARENT, ROOT>, ROOT> projection = new DiscountCombinesWithProjection<>(this, getRoot());
     getFields().put("combinesWith", projection);
     return projection;
  }

  public DiscountCustomerGetsProjection<DiscountAutomaticBasicFragmentProjection<PARENT, ROOT>, ROOT> customerGets(
      ) {
     DiscountCustomerGetsProjection<DiscountAutomaticBasicFragmentProjection<PARENT, ROOT>, ROOT> projection = new DiscountCustomerGetsProjection<>(this, getRoot());
     getFields().put("customerGets", projection);
     return projection;
  }

  public MerchandiseDiscountClassProjection<DiscountAutomaticBasicFragmentProjection<PARENT, ROOT>, ROOT> discountClass(
      ) {
     MerchandiseDiscountClassProjection<DiscountAutomaticBasicFragmentProjection<PARENT, ROOT>, ROOT> projection = new MerchandiseDiscountClassProjection<>(this, getRoot());
     getFields().put("discountClass", projection);
     return projection;
  }

  public DiscountMinimumRequirementProjection<DiscountAutomaticBasicFragmentProjection<PARENT, ROOT>, ROOT> minimumRequirement(
      ) {
     DiscountMinimumRequirementProjection<DiscountAutomaticBasicFragmentProjection<PARENT, ROOT>, ROOT> projection = new DiscountMinimumRequirementProjection<>(this, getRoot());
     getFields().put("minimumRequirement", projection);
     return projection;
  }

  public DiscountStatusProjection<DiscountAutomaticBasicFragmentProjection<PARENT, ROOT>, ROOT> status(
      ) {
     DiscountStatusProjection<DiscountAutomaticBasicFragmentProjection<PARENT, ROOT>, ROOT> projection = new DiscountStatusProjection<>(this, getRoot());
     getFields().put("status", projection);
     return projection;
  }

  public DiscountAutomaticBasicFragmentProjection<PARENT, ROOT> asyncUsageCount() {
    getFields().put("asyncUsageCount", null);
    return this;
  }

  public DiscountAutomaticBasicFragmentProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public DiscountAutomaticBasicFragmentProjection<PARENT, ROOT> endsAt() {
    getFields().put("endsAt", null);
    return this;
  }

  public DiscountAutomaticBasicFragmentProjection<PARENT, ROOT> recurringCycleLimit() {
    getFields().put("recurringCycleLimit", null);
    return this;
  }

  public DiscountAutomaticBasicFragmentProjection<PARENT, ROOT> shortSummary() {
    getFields().put("shortSummary", null);
    return this;
  }

  public DiscountAutomaticBasicFragmentProjection<PARENT, ROOT> startsAt() {
    getFields().put("startsAt", null);
    return this;
  }

  public DiscountAutomaticBasicFragmentProjection<PARENT, ROOT> summary() {
    getFields().put("summary", null);
    return this;
  }

  public DiscountAutomaticBasicFragmentProjection<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }

  public DiscountAutomaticBasicFragmentProjection<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }

  public DiscountAutomaticBasicFragmentProjection<PARENT, ROOT> usageCount() {
    getFields().put("usageCount", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on DiscountAutomaticBasic {");
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
