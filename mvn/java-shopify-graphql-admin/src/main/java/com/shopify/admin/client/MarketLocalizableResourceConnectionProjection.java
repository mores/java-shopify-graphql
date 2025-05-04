package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MarketLocalizableResourceConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MarketLocalizableResourceConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MarketLocalizableResourceConnection"));
  }

  public MarketLocalizableResourceConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MarketLocalizableResourceEdgeProjection<MarketLocalizableResourceConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     MarketLocalizableResourceEdgeProjection<MarketLocalizableResourceConnectionProjection<PARENT, ROOT>, ROOT> projection = new MarketLocalizableResourceEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public MarketLocalizableResourceProjection<MarketLocalizableResourceConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     MarketLocalizableResourceProjection<MarketLocalizableResourceConnectionProjection<PARENT, ROOT>, ROOT> projection = new MarketLocalizableResourceProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<MarketLocalizableResourceConnectionProjection<PARENT, ROOT>, ROOT> pageInfo(
      ) {
     PageInfoProjection<MarketLocalizableResourceConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
