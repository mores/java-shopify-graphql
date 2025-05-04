package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MarketingActivityCreateExternalProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MarketingActivityCreateExternalProjectionRoot() {
    super(null, null, java.util.Optional.of("MarketingActivityCreateExternalPayload"));
  }

  public MarketingActivityCreateExternalProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MarketingActivityProjection<MarketingActivityCreateExternalProjectionRoot<PARENT, ROOT>, MarketingActivityCreateExternalProjectionRoot<PARENT, ROOT>> marketingActivity(
      ) {
    MarketingActivityProjection<MarketingActivityCreateExternalProjectionRoot<PARENT, ROOT>, MarketingActivityCreateExternalProjectionRoot<PARENT, ROOT>> projection = new MarketingActivityProjection<>(this, this);    
    getFields().put("marketingActivity", projection);
    return projection;
  }

  public MarketingActivityUserErrorProjection<MarketingActivityCreateExternalProjectionRoot<PARENT, ROOT>, MarketingActivityCreateExternalProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    MarketingActivityUserErrorProjection<MarketingActivityCreateExternalProjectionRoot<PARENT, ROOT>, MarketingActivityCreateExternalProjectionRoot<PARENT, ROOT>> projection = new MarketingActivityUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
