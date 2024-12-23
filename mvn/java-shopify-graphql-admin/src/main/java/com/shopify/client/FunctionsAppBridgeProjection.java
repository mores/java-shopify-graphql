package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class FunctionsAppBridgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public FunctionsAppBridgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("FunctionsAppBridge"));
  }

  public FunctionsAppBridgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public FunctionsAppBridgeProjection<PARENT, ROOT> createPath() {
    getFields().put("createPath", null);
    return this;
  }

  public FunctionsAppBridgeProjection<PARENT, ROOT> detailsPath() {
    getFields().put("detailsPath", null);
    return this;
  }
}
