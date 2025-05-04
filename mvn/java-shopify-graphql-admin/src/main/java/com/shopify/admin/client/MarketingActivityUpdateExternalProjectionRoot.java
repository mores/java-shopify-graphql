package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MarketingActivityUpdateExternalProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MarketingActivityUpdateExternalProjectionRoot() {
    super(null, null, java.util.Optional.of("MarketingActivityUpdateExternalPayload"));
  }

  public MarketingActivityUpdateExternalProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MarketingActivityProjection<MarketingActivityUpdateExternalProjectionRoot<PARENT, ROOT>, MarketingActivityUpdateExternalProjectionRoot<PARENT, ROOT>> marketingActivity(
      ) {
    MarketingActivityProjection<MarketingActivityUpdateExternalProjectionRoot<PARENT, ROOT>, MarketingActivityUpdateExternalProjectionRoot<PARENT, ROOT>> projection = new MarketingActivityProjection<>(this, this);    
    getFields().put("marketingActivity", projection);
    return projection;
  }

  public MarketingActivityUserErrorProjection<MarketingActivityUpdateExternalProjectionRoot<PARENT, ROOT>, MarketingActivityUpdateExternalProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    MarketingActivityUserErrorProjection<MarketingActivityUpdateExternalProjectionRoot<PARENT, ROOT>, MarketingActivityUpdateExternalProjectionRoot<PARENT, ROOT>> projection = new MarketingActivityUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
