package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class StringEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public StringEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("StringEdge"));
  }

  public StringEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public StringEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }

  public StringEdgeProjection<PARENT, ROOT> node() {
    getFields().put("node", null);
    return this;
  }
}
