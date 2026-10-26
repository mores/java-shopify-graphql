package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MarketRelationshipProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MarketRelationshipProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MarketRelationship"));
  }

  public MarketRelationshipProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MarketProjection<MarketRelationshipProjection<PARENT, ROOT>, ROOT> childMarket() {
     MarketProjection<MarketRelationshipProjection<PARENT, ROOT>, ROOT> projection = new MarketProjection<>(this, getRoot());
     getFields().put("childMarket", projection);
     return projection;
  }

  public MarketProjection<MarketRelationshipProjection<PARENT, ROOT>, ROOT> parentMarket() {
     MarketProjection<MarketRelationshipProjection<PARENT, ROOT>, ROOT> projection = new MarketProjection<>(this, getRoot());
     getFields().put("parentMarket", projection);
     return projection;
  }

  public MarketRelationshipProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }
}
