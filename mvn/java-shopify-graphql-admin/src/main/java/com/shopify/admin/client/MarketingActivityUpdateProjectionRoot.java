package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MarketingActivityUpdateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MarketingActivityUpdateProjectionRoot() {
    super(null, null, java.util.Optional.of("MarketingActivityUpdatePayload"));
  }

  public MarketingActivityUpdateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MarketingActivityProjection<MarketingActivityUpdateProjectionRoot<PARENT, ROOT>, MarketingActivityUpdateProjectionRoot<PARENT, ROOT>> marketingActivity(
      ) {
    MarketingActivityProjection<MarketingActivityUpdateProjectionRoot<PARENT, ROOT>, MarketingActivityUpdateProjectionRoot<PARENT, ROOT>> projection = new MarketingActivityProjection<>(this, this);    
    getFields().put("marketingActivity", projection);
    return projection;
  }

  public UserErrorProjection<MarketingActivityUpdateProjectionRoot<PARENT, ROOT>, MarketingActivityUpdateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<MarketingActivityUpdateProjectionRoot<PARENT, ROOT>, MarketingActivityUpdateProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public MarketingActivityUpdateProjectionRoot<PARENT, ROOT> redirectPath() {
    getFields().put("redirectPath", null);
    return this;
  }
}
