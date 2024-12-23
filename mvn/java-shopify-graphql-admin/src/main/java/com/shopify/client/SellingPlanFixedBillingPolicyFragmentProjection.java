package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class SellingPlanFixedBillingPolicyFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public SellingPlanFixedBillingPolicyFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SellingPlanFixedBillingPolicy"));
  }

  public SellingPlanFixedBillingPolicyFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SellingPlanCheckoutChargeProjection<SellingPlanFixedBillingPolicyFragmentProjection<PARENT, ROOT>, ROOT> checkoutCharge(
      ) {
     SellingPlanCheckoutChargeProjection<SellingPlanFixedBillingPolicyFragmentProjection<PARENT, ROOT>, ROOT> projection = new SellingPlanCheckoutChargeProjection<>(this, getRoot());
     getFields().put("checkoutCharge", projection);
     return projection;
  }

  public SellingPlanRemainingBalanceChargeTriggerProjection<SellingPlanFixedBillingPolicyFragmentProjection<PARENT, ROOT>, ROOT> remainingBalanceChargeTrigger(
      ) {
     SellingPlanRemainingBalanceChargeTriggerProjection<SellingPlanFixedBillingPolicyFragmentProjection<PARENT, ROOT>, ROOT> projection = new SellingPlanRemainingBalanceChargeTriggerProjection<>(this, getRoot());
     getFields().put("remainingBalanceChargeTrigger", projection);
     return projection;
  }

  public SellingPlanFixedBillingPolicyFragmentProjection<PARENT, ROOT> remainingBalanceChargeExactTime(
      ) {
    getFields().put("remainingBalanceChargeExactTime", null);
    return this;
  }

  public SellingPlanFixedBillingPolicyFragmentProjection<PARENT, ROOT> remainingBalanceChargeTimeAfterCheckout(
      ) {
    getFields().put("remainingBalanceChargeTimeAfterCheckout", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on SellingPlanFixedBillingPolicy {");
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
