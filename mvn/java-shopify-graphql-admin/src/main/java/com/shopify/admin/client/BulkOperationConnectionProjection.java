package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class BulkOperationConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public BulkOperationConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("BulkOperationConnection"));
  }

  public BulkOperationConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public BulkOperationEdgeProjection<BulkOperationConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     BulkOperationEdgeProjection<BulkOperationConnectionProjection<PARENT, ROOT>, ROOT> projection = new BulkOperationEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public BulkOperationProjection<BulkOperationConnectionProjection<PARENT, ROOT>, ROOT> nodes() {
     BulkOperationProjection<BulkOperationConnectionProjection<PARENT, ROOT>, ROOT> projection = new BulkOperationProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<BulkOperationConnectionProjection<PARENT, ROOT>, ROOT> pageInfo() {
     PageInfoProjection<BulkOperationConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
