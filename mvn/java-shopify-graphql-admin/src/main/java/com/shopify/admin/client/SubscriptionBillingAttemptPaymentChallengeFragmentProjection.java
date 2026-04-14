package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class SubscriptionBillingAttemptPaymentChallengeFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public SubscriptionBillingAttemptPaymentChallengeFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SubscriptionBillingAttemptPaymentChallenge"));
  }

  public SubscriptionBillingAttemptPaymentChallengeFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SubscriptionBillingAttemptPaymentChallengeStatusProjection<SubscriptionBillingAttemptPaymentChallengeFragmentProjection<PARENT, ROOT>, ROOT> status(
      ) {
     SubscriptionBillingAttemptPaymentChallengeStatusProjection<SubscriptionBillingAttemptPaymentChallengeFragmentProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionBillingAttemptPaymentChallengeStatusProjection<>(this, getRoot());
     getFields().put("status", projection);
     return projection;
  }

  public SubscriptionBillingAttemptPaymentChallengeFragmentProjection<PARENT, ROOT> nextActionUrl(
      ) {
    getFields().put("nextActionUrl", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on SubscriptionBillingAttemptPaymentChallenge {");
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
