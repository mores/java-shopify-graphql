package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class SellingPlanRecurringPricingPolicyFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public SellingPlanRecurringPricingPolicyFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SellingPlanRecurringPricingPolicy"));
  }

  public SellingPlanRecurringPricingPolicyFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SellingPlanPricingPolicyAdjustmentTypeProjection<SellingPlanRecurringPricingPolicyFragmentProjection<PARENT, ROOT>, ROOT> adjustmentType(
      ) {
     SellingPlanPricingPolicyAdjustmentTypeProjection<SellingPlanRecurringPricingPolicyFragmentProjection<PARENT, ROOT>, ROOT> projection = new SellingPlanPricingPolicyAdjustmentTypeProjection<>(this, getRoot());
     getFields().put("adjustmentType", projection);
     return projection;
  }

  public SellingPlanPricingPolicyAdjustmentValueProjection<SellingPlanRecurringPricingPolicyFragmentProjection<PARENT, ROOT>, ROOT> adjustmentValue(
      ) {
     SellingPlanPricingPolicyAdjustmentValueProjection<SellingPlanRecurringPricingPolicyFragmentProjection<PARENT, ROOT>, ROOT> projection = new SellingPlanPricingPolicyAdjustmentValueProjection<>(this, getRoot());
     getFields().put("adjustmentValue", projection);
     return projection;
  }

  public SellingPlanRecurringPricingPolicyFragmentProjection<PARENT, ROOT> afterCycle() {
    getFields().put("afterCycle", null);
    return this;
  }

  public SellingPlanRecurringPricingPolicyFragmentProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on SellingPlanRecurringPricingPolicy {");
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
