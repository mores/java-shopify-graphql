package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class AppSubscriptionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public AppSubscriptionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("AppSubscription"));
  }

  public AppSubscriptionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AppSubscriptionLineItemProjection<AppSubscriptionProjection<PARENT, ROOT>, ROOT> lineItems(
      ) {
     AppSubscriptionLineItemProjection<AppSubscriptionProjection<PARENT, ROOT>, ROOT> projection = new AppSubscriptionLineItemProjection<>(this, getRoot());
     getFields().put("lineItems", projection);
     return projection;
  }

  public AppSubscriptionStatusProjection<AppSubscriptionProjection<PARENT, ROOT>, ROOT> status() {
     AppSubscriptionStatusProjection<AppSubscriptionProjection<PARENT, ROOT>, ROOT> projection = new AppSubscriptionStatusProjection<>(this, getRoot());
     getFields().put("status", projection);
     return projection;
  }

  public AppSubscriptionProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public AppSubscriptionProjection<PARENT, ROOT> currentPeriodEnd() {
    getFields().put("currentPeriodEnd", null);
    return this;
  }

  public AppSubscriptionProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public AppSubscriptionProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public AppSubscriptionProjection<PARENT, ROOT> returnUrl() {
    getFields().put("returnUrl", null);
    return this;
  }

  public AppSubscriptionProjection<PARENT, ROOT> test() {
    getFields().put("test", null);
    return this;
  }

  public AppSubscriptionProjection<PARENT, ROOT> trialDays() {
    getFields().put("trialDays", null);
    return this;
  }
}
