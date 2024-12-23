package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class SellingPlanRecurringDeliveryPolicyFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public SellingPlanRecurringDeliveryPolicyFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SellingPlanRecurringDeliveryPolicy"));
  }

  public SellingPlanRecurringDeliveryPolicyFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SellingPlanAnchorProjection<SellingPlanRecurringDeliveryPolicyFragmentProjection<PARENT, ROOT>, ROOT> anchors(
      ) {
     SellingPlanAnchorProjection<SellingPlanRecurringDeliveryPolicyFragmentProjection<PARENT, ROOT>, ROOT> projection = new SellingPlanAnchorProjection<>(this, getRoot());
     getFields().put("anchors", projection);
     return projection;
  }

  public SellingPlanRecurringDeliveryPolicyIntentProjection<SellingPlanRecurringDeliveryPolicyFragmentProjection<PARENT, ROOT>, ROOT> intent(
      ) {
     SellingPlanRecurringDeliveryPolicyIntentProjection<SellingPlanRecurringDeliveryPolicyFragmentProjection<PARENT, ROOT>, ROOT> projection = new SellingPlanRecurringDeliveryPolicyIntentProjection<>(this, getRoot());
     getFields().put("intent", projection);
     return projection;
  }

  public SellingPlanIntervalProjection<SellingPlanRecurringDeliveryPolicyFragmentProjection<PARENT, ROOT>, ROOT> interval(
      ) {
     SellingPlanIntervalProjection<SellingPlanRecurringDeliveryPolicyFragmentProjection<PARENT, ROOT>, ROOT> projection = new SellingPlanIntervalProjection<>(this, getRoot());
     getFields().put("interval", projection);
     return projection;
  }

  public SellingPlanRecurringDeliveryPolicyPreAnchorBehaviorProjection<SellingPlanRecurringDeliveryPolicyFragmentProjection<PARENT, ROOT>, ROOT> preAnchorBehavior(
      ) {
     SellingPlanRecurringDeliveryPolicyPreAnchorBehaviorProjection<SellingPlanRecurringDeliveryPolicyFragmentProjection<PARENT, ROOT>, ROOT> projection = new SellingPlanRecurringDeliveryPolicyPreAnchorBehaviorProjection<>(this, getRoot());
     getFields().put("preAnchorBehavior", projection);
     return projection;
  }

  public SellingPlanRecurringDeliveryPolicyFragmentProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public SellingPlanRecurringDeliveryPolicyFragmentProjection<PARENT, ROOT> cutoff() {
    getFields().put("cutoff", null);
    return this;
  }

  public SellingPlanRecurringDeliveryPolicyFragmentProjection<PARENT, ROOT> intervalCount() {
    getFields().put("intervalCount", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on SellingPlanRecurringDeliveryPolicy {");
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
