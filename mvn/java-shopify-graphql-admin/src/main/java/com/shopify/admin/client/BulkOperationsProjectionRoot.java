package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class BulkOperationsProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public BulkOperationsProjectionRoot() {
    super(null, null, java.util.Optional.of("BulkOperationConnection"));
  }

  public BulkOperationsProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public BulkOperationEdgeProjection<BulkOperationsProjectionRoot<PARENT, ROOT>, BulkOperationsProjectionRoot<PARENT, ROOT>> edges(
      ) {
    BulkOperationEdgeProjection<BulkOperationsProjectionRoot<PARENT, ROOT>, BulkOperationsProjectionRoot<PARENT, ROOT>> projection = new BulkOperationEdgeProjection<>(this, this);    
    getFields().put("edges", projection);
    return projection;
  }

  public BulkOperationProjection<BulkOperationsProjectionRoot<PARENT, ROOT>, BulkOperationsProjectionRoot<PARENT, ROOT>> nodes(
      ) {
    BulkOperationProjection<BulkOperationsProjectionRoot<PARENT, ROOT>, BulkOperationsProjectionRoot<PARENT, ROOT>> projection = new BulkOperationProjection<>(this, this);    
    getFields().put("nodes", projection);
    return projection;
  }

  public PageInfoProjection<BulkOperationsProjectionRoot<PARENT, ROOT>, BulkOperationsProjectionRoot<PARENT, ROOT>> pageInfo(
      ) {
    PageInfoProjection<BulkOperationsProjectionRoot<PARENT, ROOT>, BulkOperationsProjectionRoot<PARENT, ROOT>> projection = new PageInfoProjection<>(this, this);    
    getFields().put("pageInfo", projection);
    return projection;
  }
}
