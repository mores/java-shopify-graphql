package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class BulkOperationProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public BulkOperationProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("BulkOperation"));
  }

  public BulkOperationProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public BulkOperationErrorCodeProjection<BulkOperationProjection<PARENT, ROOT>, ROOT> errorCode() {
     BulkOperationErrorCodeProjection<BulkOperationProjection<PARENT, ROOT>, ROOT> projection = new BulkOperationErrorCodeProjection<>(this, getRoot());
     getFields().put("errorCode", projection);
     return projection;
  }

  public BulkOperationStatusProjection<BulkOperationProjection<PARENT, ROOT>, ROOT> status() {
     BulkOperationStatusProjection<BulkOperationProjection<PARENT, ROOT>, ROOT> projection = new BulkOperationStatusProjection<>(this, getRoot());
     getFields().put("status", projection);
     return projection;
  }

  public BulkOperationTypeProjection<BulkOperationProjection<PARENT, ROOT>, ROOT> type() {
     BulkOperationTypeProjection<BulkOperationProjection<PARENT, ROOT>, ROOT> projection = new BulkOperationTypeProjection<>(this, getRoot());
     getFields().put("type", projection);
     return projection;
  }

  public BulkOperationProjection<PARENT, ROOT> completedAt() {
    getFields().put("completedAt", null);
    return this;
  }

  public BulkOperationProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public BulkOperationProjection<PARENT, ROOT> fileSize() {
    getFields().put("fileSize", null);
    return this;
  }

  public BulkOperationProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public BulkOperationProjection<PARENT, ROOT> objectCount() {
    getFields().put("objectCount", null);
    return this;
  }

  public BulkOperationProjection<PARENT, ROOT> partialDataUrl() {
    getFields().put("partialDataUrl", null);
    return this;
  }

  public BulkOperationProjection<PARENT, ROOT> query() {
    getFields().put("query", null);
    return this;
  }

  public BulkOperationProjection<PARENT, ROOT> rootObjectCount() {
    getFields().put("rootObjectCount", null);
    return this;
  }

  public BulkOperationProjection<PARENT, ROOT> url() {
    getFields().put("url", null);
    return this;
  }
}
