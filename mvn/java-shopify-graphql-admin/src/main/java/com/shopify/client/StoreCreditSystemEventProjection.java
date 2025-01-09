package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class StoreCreditSystemEventProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public StoreCreditSystemEventProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("StoreCreditSystemEvent"));
  }

  public StoreCreditSystemEventProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
