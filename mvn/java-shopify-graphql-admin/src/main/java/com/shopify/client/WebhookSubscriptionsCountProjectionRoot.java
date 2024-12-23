package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class WebhookSubscriptionsCountProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public WebhookSubscriptionsCountProjectionRoot() {
    super(null, null, java.util.Optional.of("Count"));
  }

  public WebhookSubscriptionsCountProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CountPrecisionProjection<WebhookSubscriptionsCountProjectionRoot<PARENT, ROOT>, WebhookSubscriptionsCountProjectionRoot<PARENT, ROOT>> precision(
      ) {
    CountPrecisionProjection<WebhookSubscriptionsCountProjectionRoot<PARENT, ROOT>, WebhookSubscriptionsCountProjectionRoot<PARENT, ROOT>> projection = new CountPrecisionProjection<>(this, this);    
    getFields().put("precision", projection);
    return projection;
  }

  public WebhookSubscriptionsCountProjectionRoot<PARENT, ROOT> count() {
    getFields().put("count", null);
    return this;
  }
}
