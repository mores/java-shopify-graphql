package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class SubscriptionBillingAttemptActionRequiredStateFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public SubscriptionBillingAttemptActionRequiredStateFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SubscriptionBillingAttemptActionRequiredState"));
  }

  public SubscriptionBillingAttemptActionRequiredStateFragmentProjection<PARENT, ROOT> __typename(
      ) {
    getFields().put("__typename", null);
    return this;
  }

  public SubscriptionBillingAttemptActionProjection<SubscriptionBillingAttemptActionRequiredStateFragmentProjection<PARENT, ROOT>, ROOT> action(
      ) {
     SubscriptionBillingAttemptActionProjection<SubscriptionBillingAttemptActionRequiredStateFragmentProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionBillingAttemptActionProjection<>(this, getRoot());
     getFields().put("action", projection);
     return projection;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on SubscriptionBillingAttemptActionRequiredState {");
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
