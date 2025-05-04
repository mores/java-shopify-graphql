package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MarketLocalizableResourcesByIdsProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MarketLocalizableResourcesByIdsProjectionRoot() {
    super(null, null, java.util.Optional.of("MarketLocalizableResourceConnection"));
  }

  public MarketLocalizableResourcesByIdsProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MarketLocalizableResourceEdgeProjection<MarketLocalizableResourcesByIdsProjectionRoot<PARENT, ROOT>, MarketLocalizableResourcesByIdsProjectionRoot<PARENT, ROOT>> edges(
      ) {
    MarketLocalizableResourceEdgeProjection<MarketLocalizableResourcesByIdsProjectionRoot<PARENT, ROOT>, MarketLocalizableResourcesByIdsProjectionRoot<PARENT, ROOT>> projection = new MarketLocalizableResourceEdgeProjection<>(this, this);    
    getFields().put("edges", projection);
    return projection;
  }

  public MarketLocalizableResourceProjection<MarketLocalizableResourcesByIdsProjectionRoot<PARENT, ROOT>, MarketLocalizableResourcesByIdsProjectionRoot<PARENT, ROOT>> nodes(
      ) {
    MarketLocalizableResourceProjection<MarketLocalizableResourcesByIdsProjectionRoot<PARENT, ROOT>, MarketLocalizableResourcesByIdsProjectionRoot<PARENT, ROOT>> projection = new MarketLocalizableResourceProjection<>(this, this);    
    getFields().put("nodes", projection);
    return projection;
  }

  public PageInfoProjection<MarketLocalizableResourcesByIdsProjectionRoot<PARENT, ROOT>, MarketLocalizableResourcesByIdsProjectionRoot<PARENT, ROOT>> pageInfo(
      ) {
    PageInfoProjection<MarketLocalizableResourcesByIdsProjectionRoot<PARENT, ROOT>, MarketLocalizableResourcesByIdsProjectionRoot<PARENT, ROOT>> projection = new PageInfoProjection<>(this, this);    
    getFields().put("pageInfo", projection);
    return projection;
  }
}
