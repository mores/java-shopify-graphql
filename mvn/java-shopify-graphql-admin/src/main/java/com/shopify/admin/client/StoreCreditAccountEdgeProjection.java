package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class StoreCreditAccountEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public StoreCreditAccountEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("StoreCreditAccountEdge"));
  }

  public StoreCreditAccountEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public StoreCreditAccountProjection<StoreCreditAccountEdgeProjection<PARENT, ROOT>, ROOT> node() {
     StoreCreditAccountProjection<StoreCreditAccountEdgeProjection<PARENT, ROOT>, ROOT> projection = new StoreCreditAccountProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public StoreCreditAccountEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
