package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MarketingEventsProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MarketingEventsProjectionRoot() {
    super(null, null, java.util.Optional.of("MarketingEventConnection"));
  }

  public MarketingEventsProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MarketingEventEdgeProjection<MarketingEventsProjectionRoot<PARENT, ROOT>, MarketingEventsProjectionRoot<PARENT, ROOT>> edges(
      ) {
    MarketingEventEdgeProjection<MarketingEventsProjectionRoot<PARENT, ROOT>, MarketingEventsProjectionRoot<PARENT, ROOT>> projection = new MarketingEventEdgeProjection<>(this, this);    
    getFields().put("edges", projection);
    return projection;
  }

  public MarketingEventProjection<MarketingEventsProjectionRoot<PARENT, ROOT>, MarketingEventsProjectionRoot<PARENT, ROOT>> nodes(
      ) {
    MarketingEventProjection<MarketingEventsProjectionRoot<PARENT, ROOT>, MarketingEventsProjectionRoot<PARENT, ROOT>> projection = new MarketingEventProjection<>(this, this);    
    getFields().put("nodes", projection);
    return projection;
  }

  public PageInfoProjection<MarketingEventsProjectionRoot<PARENT, ROOT>, MarketingEventsProjectionRoot<PARENT, ROOT>> pageInfo(
      ) {
    PageInfoProjection<MarketingEventsProjectionRoot<PARENT, ROOT>, MarketingEventsProjectionRoot<PARENT, ROOT>> projection = new PageInfoProjection<>(this, this);    
    getFields().put("pageInfo", projection);
    return projection;
  }
}
