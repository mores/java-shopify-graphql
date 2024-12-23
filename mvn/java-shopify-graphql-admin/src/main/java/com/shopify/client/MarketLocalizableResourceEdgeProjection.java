package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MarketLocalizableResourceEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MarketLocalizableResourceEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MarketLocalizableResourceEdge"));
  }

  public MarketLocalizableResourceEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MarketLocalizableResourceProjection<MarketLocalizableResourceEdgeProjection<PARENT, ROOT>, ROOT> node(
      ) {
     MarketLocalizableResourceProjection<MarketLocalizableResourceEdgeProjection<PARENT, ROOT>, ROOT> projection = new MarketLocalizableResourceProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public MarketLocalizableResourceEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
