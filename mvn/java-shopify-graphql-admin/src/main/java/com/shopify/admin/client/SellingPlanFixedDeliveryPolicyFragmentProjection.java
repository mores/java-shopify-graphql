package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class SellingPlanFixedDeliveryPolicyFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public SellingPlanFixedDeliveryPolicyFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SellingPlanFixedDeliveryPolicy"));
  }

  public SellingPlanFixedDeliveryPolicyFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SellingPlanAnchorProjection<SellingPlanFixedDeliveryPolicyFragmentProjection<PARENT, ROOT>, ROOT> anchors(
      ) {
     SellingPlanAnchorProjection<SellingPlanFixedDeliveryPolicyFragmentProjection<PARENT, ROOT>, ROOT> projection = new SellingPlanAnchorProjection<>(this, getRoot());
     getFields().put("anchors", projection);
     return projection;
  }

  public SellingPlanFulfillmentTriggerProjection<SellingPlanFixedDeliveryPolicyFragmentProjection<PARENT, ROOT>, ROOT> fulfillmentTrigger(
      ) {
     SellingPlanFulfillmentTriggerProjection<SellingPlanFixedDeliveryPolicyFragmentProjection<PARENT, ROOT>, ROOT> projection = new SellingPlanFulfillmentTriggerProjection<>(this, getRoot());
     getFields().put("fulfillmentTrigger", projection);
     return projection;
  }

  public SellingPlanFixedDeliveryPolicyIntentProjection<SellingPlanFixedDeliveryPolicyFragmentProjection<PARENT, ROOT>, ROOT> intent(
      ) {
     SellingPlanFixedDeliveryPolicyIntentProjection<SellingPlanFixedDeliveryPolicyFragmentProjection<PARENT, ROOT>, ROOT> projection = new SellingPlanFixedDeliveryPolicyIntentProjection<>(this, getRoot());
     getFields().put("intent", projection);
     return projection;
  }

  public SellingPlanFixedDeliveryPolicyPreAnchorBehaviorProjection<SellingPlanFixedDeliveryPolicyFragmentProjection<PARENT, ROOT>, ROOT> preAnchorBehavior(
      ) {
     SellingPlanFixedDeliveryPolicyPreAnchorBehaviorProjection<SellingPlanFixedDeliveryPolicyFragmentProjection<PARENT, ROOT>, ROOT> projection = new SellingPlanFixedDeliveryPolicyPreAnchorBehaviorProjection<>(this, getRoot());
     getFields().put("preAnchorBehavior", projection);
     return projection;
  }

  public SellingPlanFixedDeliveryPolicyFragmentProjection<PARENT, ROOT> cutoff() {
    getFields().put("cutoff", null);
    return this;
  }

  public SellingPlanFixedDeliveryPolicyFragmentProjection<PARENT, ROOT> fulfillmentExactTime() {
    getFields().put("fulfillmentExactTime", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on SellingPlanFixedDeliveryPolicy {");
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
