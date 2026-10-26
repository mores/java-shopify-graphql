package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MarketRelationshipsStatusProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MarketRelationshipsStatusProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MarketRelationshipsStatus"));
  }

  public MarketRelationshipsStatusProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MarketRelationshipsStatusProjection<PARENT, ROOT> version() {
    getFields().put("version", null);
    return this;
  }
}
