package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class SellingPlanFixedPricingPolicyFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public SellingPlanFixedPricingPolicyFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SellingPlanFixedPricingPolicy"));
  }

  public SellingPlanFixedPricingPolicyFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SellingPlanPricingPolicyAdjustmentTypeProjection<SellingPlanFixedPricingPolicyFragmentProjection<PARENT, ROOT>, ROOT> adjustmentType(
      ) {
     SellingPlanPricingPolicyAdjustmentTypeProjection<SellingPlanFixedPricingPolicyFragmentProjection<PARENT, ROOT>, ROOT> projection = new SellingPlanPricingPolicyAdjustmentTypeProjection<>(this, getRoot());
     getFields().put("adjustmentType", projection);
     return projection;
  }

  public SellingPlanPricingPolicyAdjustmentValueProjection<SellingPlanFixedPricingPolicyFragmentProjection<PARENT, ROOT>, ROOT> adjustmentValue(
      ) {
     SellingPlanPricingPolicyAdjustmentValueProjection<SellingPlanFixedPricingPolicyFragmentProjection<PARENT, ROOT>, ROOT> projection = new SellingPlanPricingPolicyAdjustmentValueProjection<>(this, getRoot());
     getFields().put("adjustmentValue", projection);
     return projection;
  }

  public SellingPlanFixedPricingPolicyFragmentProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on SellingPlanFixedPricingPolicy {");
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
