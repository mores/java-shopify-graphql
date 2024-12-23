package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MarketLocalizableResourcesProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MarketLocalizableResourcesProjectionRoot() {
    super(null, null, java.util.Optional.of("MarketLocalizableResourceConnection"));
  }

  public MarketLocalizableResourcesProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MarketLocalizableResourceEdgeProjection<MarketLocalizableResourcesProjectionRoot<PARENT, ROOT>, MarketLocalizableResourcesProjectionRoot<PARENT, ROOT>> edges(
      ) {
    MarketLocalizableResourceEdgeProjection<MarketLocalizableResourcesProjectionRoot<PARENT, ROOT>, MarketLocalizableResourcesProjectionRoot<PARENT, ROOT>> projection = new MarketLocalizableResourceEdgeProjection<>(this, this);    
    getFields().put("edges", projection);
    return projection;
  }

  public MarketLocalizableResourceProjection<MarketLocalizableResourcesProjectionRoot<PARENT, ROOT>, MarketLocalizableResourcesProjectionRoot<PARENT, ROOT>> nodes(
      ) {
    MarketLocalizableResourceProjection<MarketLocalizableResourcesProjectionRoot<PARENT, ROOT>, MarketLocalizableResourcesProjectionRoot<PARENT, ROOT>> projection = new MarketLocalizableResourceProjection<>(this, this);    
    getFields().put("nodes", projection);
    return projection;
  }

  public PageInfoProjection<MarketLocalizableResourcesProjectionRoot<PARENT, ROOT>, MarketLocalizableResourcesProjectionRoot<PARENT, ROOT>> pageInfo(
      ) {
    PageInfoProjection<MarketLocalizableResourcesProjectionRoot<PARENT, ROOT>, MarketLocalizableResourcesProjectionRoot<PARENT, ROOT>> projection = new PageInfoProjection<>(this, this);    
    getFields().put("pageInfo", projection);
    return projection;
  }
}
