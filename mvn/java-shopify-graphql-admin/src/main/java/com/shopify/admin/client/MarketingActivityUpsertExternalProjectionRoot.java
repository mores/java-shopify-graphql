package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MarketingActivityUpsertExternalProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MarketingActivityUpsertExternalProjectionRoot() {
    super(null, null, java.util.Optional.of("MarketingActivityUpsertExternalPayload"));
  }

  public MarketingActivityUpsertExternalProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MarketingActivityProjection<MarketingActivityUpsertExternalProjectionRoot<PARENT, ROOT>, MarketingActivityUpsertExternalProjectionRoot<PARENT, ROOT>> marketingActivity(
      ) {
    MarketingActivityProjection<MarketingActivityUpsertExternalProjectionRoot<PARENT, ROOT>, MarketingActivityUpsertExternalProjectionRoot<PARENT, ROOT>> projection = new MarketingActivityProjection<>(this, this);    
    getFields().put("marketingActivity", projection);
    return projection;
  }

  public MarketingActivityUserErrorProjection<MarketingActivityUpsertExternalProjectionRoot<PARENT, ROOT>, MarketingActivityUpsertExternalProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    MarketingActivityUserErrorProjection<MarketingActivityUpsertExternalProjectionRoot<PARENT, ROOT>, MarketingActivityUpsertExternalProjectionRoot<PARENT, ROOT>> projection = new MarketingActivityUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
