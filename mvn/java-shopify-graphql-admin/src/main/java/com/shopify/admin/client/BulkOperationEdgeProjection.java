package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class BulkOperationEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public BulkOperationEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("BulkOperationEdge"));
  }

  public BulkOperationEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public BulkOperationProjection<BulkOperationEdgeProjection<PARENT, ROOT>, ROOT> node() {
     BulkOperationProjection<BulkOperationEdgeProjection<PARENT, ROOT>, ROOT> projection = new BulkOperationProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public BulkOperationEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
