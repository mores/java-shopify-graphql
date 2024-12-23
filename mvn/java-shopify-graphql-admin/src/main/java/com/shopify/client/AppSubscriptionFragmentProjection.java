package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class AppSubscriptionFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public AppSubscriptionFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("AppSubscription"));
  }

  public AppSubscriptionFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AppSubscriptionLineItemProjection<AppSubscriptionFragmentProjection<PARENT, ROOT>, ROOT> lineItems(
      ) {
     AppSubscriptionLineItemProjection<AppSubscriptionFragmentProjection<PARENT, ROOT>, ROOT> projection = new AppSubscriptionLineItemProjection<>(this, getRoot());
     getFields().put("lineItems", projection);
     return projection;
  }

  public AppSubscriptionStatusProjection<AppSubscriptionFragmentProjection<PARENT, ROOT>, ROOT> status(
      ) {
     AppSubscriptionStatusProjection<AppSubscriptionFragmentProjection<PARENT, ROOT>, ROOT> projection = new AppSubscriptionStatusProjection<>(this, getRoot());
     getFields().put("status", projection);
     return projection;
  }

  public AppSubscriptionFragmentProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public AppSubscriptionFragmentProjection<PARENT, ROOT> currentPeriodEnd() {
    getFields().put("currentPeriodEnd", null);
    return this;
  }

  public AppSubscriptionFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public AppSubscriptionFragmentProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public AppSubscriptionFragmentProjection<PARENT, ROOT> returnUrl() {
    getFields().put("returnUrl", null);
    return this;
  }

  public AppSubscriptionFragmentProjection<PARENT, ROOT> test() {
    getFields().put("test", null);
    return this;
  }

  public AppSubscriptionFragmentProjection<PARENT, ROOT> trialDays() {
    getFields().put("trialDays", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on AppSubscription {");
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
