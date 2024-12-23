package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MarketingActivitiesProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MarketingActivitiesProjectionRoot() {
    super(null, null, java.util.Optional.of("MarketingActivityConnection"));
  }

  public MarketingActivitiesProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MarketingActivityEdgeProjection<MarketingActivitiesProjectionRoot<PARENT, ROOT>, MarketingActivitiesProjectionRoot<PARENT, ROOT>> edges(
      ) {
    MarketingActivityEdgeProjection<MarketingActivitiesProjectionRoot<PARENT, ROOT>, MarketingActivitiesProjectionRoot<PARENT, ROOT>> projection = new MarketingActivityEdgeProjection<>(this, this);    
    getFields().put("edges", projection);
    return projection;
  }

  public MarketingActivityProjection<MarketingActivitiesProjectionRoot<PARENT, ROOT>, MarketingActivitiesProjectionRoot<PARENT, ROOT>> nodes(
      ) {
    MarketingActivityProjection<MarketingActivitiesProjectionRoot<PARENT, ROOT>, MarketingActivitiesProjectionRoot<PARENT, ROOT>> projection = new MarketingActivityProjection<>(this, this);    
    getFields().put("nodes", projection);
    return projection;
  }

  public PageInfoProjection<MarketingActivitiesProjectionRoot<PARENT, ROOT>, MarketingActivitiesProjectionRoot<PARENT, ROOT>> pageInfo(
      ) {
    PageInfoProjection<MarketingActivitiesProjectionRoot<PARENT, ROOT>, MarketingActivitiesProjectionRoot<PARENT, ROOT>> projection = new PageInfoProjection<>(this, this);    
    getFields().put("pageInfo", projection);
    return projection;
  }
}
