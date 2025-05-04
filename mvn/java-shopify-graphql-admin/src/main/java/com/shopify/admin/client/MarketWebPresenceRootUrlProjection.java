package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MarketWebPresenceRootUrlProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MarketWebPresenceRootUrlProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MarketWebPresenceRootUrl"));
  }

  public MarketWebPresenceRootUrlProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MarketWebPresenceRootUrlProjection<PARENT, ROOT> locale() {
    getFields().put("locale", null);
    return this;
  }

  public MarketWebPresenceRootUrlProjection<PARENT, ROOT> url() {
    getFields().put("url", null);
    return this;
  }
}
