package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class BulkOperationProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public BulkOperationProjectionRoot() {
    super(null, null, java.util.Optional.of("BulkOperation"));
  }

  public BulkOperationProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public BulkOperationErrorCodeProjection<BulkOperationProjectionRoot<PARENT, ROOT>, BulkOperationProjectionRoot<PARENT, ROOT>> errorCode(
      ) {
    BulkOperationErrorCodeProjection<BulkOperationProjectionRoot<PARENT, ROOT>, BulkOperationProjectionRoot<PARENT, ROOT>> projection = new BulkOperationErrorCodeProjection<>(this, this);    
    getFields().put("errorCode", projection);
    return projection;
  }

  public BulkOperationStatusProjection<BulkOperationProjectionRoot<PARENT, ROOT>, BulkOperationProjectionRoot<PARENT, ROOT>> status(
      ) {
    BulkOperationStatusProjection<BulkOperationProjectionRoot<PARENT, ROOT>, BulkOperationProjectionRoot<PARENT, ROOT>> projection = new BulkOperationStatusProjection<>(this, this);    
    getFields().put("status", projection);
    return projection;
  }

  public BulkOperationTypeProjection<BulkOperationProjectionRoot<PARENT, ROOT>, BulkOperationProjectionRoot<PARENT, ROOT>> type(
      ) {
    BulkOperationTypeProjection<BulkOperationProjectionRoot<PARENT, ROOT>, BulkOperationProjectionRoot<PARENT, ROOT>> projection = new BulkOperationTypeProjection<>(this, this);    
    getFields().put("type", projection);
    return projection;
  }

  public BulkOperationProjectionRoot<PARENT, ROOT> completedAt() {
    getFields().put("completedAt", null);
    return this;
  }

  public BulkOperationProjectionRoot<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public BulkOperationProjectionRoot<PARENT, ROOT> fileSize() {
    getFields().put("fileSize", null);
    return this;
  }

  public BulkOperationProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public BulkOperationProjectionRoot<PARENT, ROOT> objectCount() {
    getFields().put("objectCount", null);
    return this;
  }

  public BulkOperationProjectionRoot<PARENT, ROOT> partialDataUrl() {
    getFields().put("partialDataUrl", null);
    return this;
  }

  public BulkOperationProjectionRoot<PARENT, ROOT> query() {
    getFields().put("query", null);
    return this;
  }

  public BulkOperationProjectionRoot<PARENT, ROOT> rootObjectCount() {
    getFields().put("rootObjectCount", null);
    return this;
  }

  public BulkOperationProjectionRoot<PARENT, ROOT> url() {
    getFields().put("url", null);
    return this;
  }
}
