package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class SellingPlanRecurringBillingPolicyFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public SellingPlanRecurringBillingPolicyFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SellingPlanRecurringBillingPolicy"));
  }

  public SellingPlanRecurringBillingPolicyFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SellingPlanAnchorProjection<SellingPlanRecurringBillingPolicyFragmentProjection<PARENT, ROOT>, ROOT> anchors(
      ) {
     SellingPlanAnchorProjection<SellingPlanRecurringBillingPolicyFragmentProjection<PARENT, ROOT>, ROOT> projection = new SellingPlanAnchorProjection<>(this, getRoot());
     getFields().put("anchors", projection);
     return projection;
  }

  public SellingPlanIntervalProjection<SellingPlanRecurringBillingPolicyFragmentProjection<PARENT, ROOT>, ROOT> interval(
      ) {
     SellingPlanIntervalProjection<SellingPlanRecurringBillingPolicyFragmentProjection<PARENT, ROOT>, ROOT> projection = new SellingPlanIntervalProjection<>(this, getRoot());
     getFields().put("interval", projection);
     return projection;
  }

  public SellingPlanRecurringBillingPolicyFragmentProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public SellingPlanRecurringBillingPolicyFragmentProjection<PARENT, ROOT> intervalCount() {
    getFields().put("intervalCount", null);
    return this;
  }

  public SellingPlanRecurringBillingPolicyFragmentProjection<PARENT, ROOT> maxCycles() {
    getFields().put("maxCycles", null);
    return this;
  }

  public SellingPlanRecurringBillingPolicyFragmentProjection<PARENT, ROOT> minCycles() {
    getFields().put("minCycles", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on SellingPlanRecurringBillingPolicy {");
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
