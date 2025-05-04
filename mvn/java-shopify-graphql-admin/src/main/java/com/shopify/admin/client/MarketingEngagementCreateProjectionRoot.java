package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MarketingEngagementCreateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MarketingEngagementCreateProjectionRoot() {
    super(null, null, java.util.Optional.of("MarketingEngagementCreatePayload"));
  }

  public MarketingEngagementCreateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MarketingEngagementProjection<MarketingEngagementCreateProjectionRoot<PARENT, ROOT>, MarketingEngagementCreateProjectionRoot<PARENT, ROOT>> marketingEngagement(
      ) {
    MarketingEngagementProjection<MarketingEngagementCreateProjectionRoot<PARENT, ROOT>, MarketingEngagementCreateProjectionRoot<PARENT, ROOT>> projection = new MarketingEngagementProjection<>(this, this);    
    getFields().put("marketingEngagement", projection);
    return projection;
  }

  public MarketingActivityUserErrorProjection<MarketingEngagementCreateProjectionRoot<PARENT, ROOT>, MarketingEngagementCreateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    MarketingActivityUserErrorProjection<MarketingEngagementCreateProjectionRoot<PARENT, ROOT>, MarketingEngagementCreateProjectionRoot<PARENT, ROOT>> projection = new MarketingActivityUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
