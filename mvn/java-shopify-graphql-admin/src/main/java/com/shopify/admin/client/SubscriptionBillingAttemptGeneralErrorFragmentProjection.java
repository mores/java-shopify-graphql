package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class SubscriptionBillingAttemptGeneralErrorFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public SubscriptionBillingAttemptGeneralErrorFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SubscriptionBillingAttemptGeneralError"));
  }

  public SubscriptionBillingAttemptGeneralErrorFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SubscriptionBillingAttemptGeneralErrorCodeProjection<SubscriptionBillingAttemptGeneralErrorFragmentProjection<PARENT, ROOT>, ROOT> code(
      ) {
     SubscriptionBillingAttemptGeneralErrorCodeProjection<SubscriptionBillingAttemptGeneralErrorFragmentProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionBillingAttemptGeneralErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on SubscriptionBillingAttemptGeneralError {");
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
