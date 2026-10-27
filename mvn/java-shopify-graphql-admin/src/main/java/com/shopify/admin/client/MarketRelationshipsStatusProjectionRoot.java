package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MarketRelationshipsStatusProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MarketRelationshipsStatusProjectionRoot() {
    super(null, null, java.util.Optional.of("MarketRelationshipsStatus"));
  }

  public MarketRelationshipsStatusProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MarketRelationshipsStatusProjectionRoot<PARENT, ROOT> version() {
    getFields().put("version", null);
    return this;
  }
}
