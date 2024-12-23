package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MarketingActivityCreateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MarketingActivityCreateProjectionRoot() {
    super(null, null, java.util.Optional.of("MarketingActivityCreatePayload"));
  }

  public MarketingActivityCreateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MarketingActivityProjection<MarketingActivityCreateProjectionRoot<PARENT, ROOT>, MarketingActivityCreateProjectionRoot<PARENT, ROOT>> marketingActivity(
      ) {
    MarketingActivityProjection<MarketingActivityCreateProjectionRoot<PARENT, ROOT>, MarketingActivityCreateProjectionRoot<PARENT, ROOT>> projection = new MarketingActivityProjection<>(this, this);    
    getFields().put("marketingActivity", projection);
    return projection;
  }

  public UserErrorProjection<MarketingActivityCreateProjectionRoot<PARENT, ROOT>, MarketingActivityCreateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<MarketingActivityCreateProjectionRoot<PARENT, ROOT>, MarketingActivityCreateProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public MarketingActivityCreateProjectionRoot<PARENT, ROOT> redirectPath() {
    getFields().put("redirectPath", null);
    return this;
  }
}
