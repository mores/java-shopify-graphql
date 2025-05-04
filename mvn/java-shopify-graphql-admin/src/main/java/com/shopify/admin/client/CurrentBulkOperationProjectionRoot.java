package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CurrentBulkOperationProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CurrentBulkOperationProjectionRoot() {
    super(null, null, java.util.Optional.of("BulkOperation"));
  }

  public CurrentBulkOperationProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public BulkOperationErrorCodeProjection<CurrentBulkOperationProjectionRoot<PARENT, ROOT>, CurrentBulkOperationProjectionRoot<PARENT, ROOT>> errorCode(
      ) {
    BulkOperationErrorCodeProjection<CurrentBulkOperationProjectionRoot<PARENT, ROOT>, CurrentBulkOperationProjectionRoot<PARENT, ROOT>> projection = new BulkOperationErrorCodeProjection<>(this, this);    
    getFields().put("errorCode", projection);
    return projection;
  }

  public BulkOperationStatusProjection<CurrentBulkOperationProjectionRoot<PARENT, ROOT>, CurrentBulkOperationProjectionRoot<PARENT, ROOT>> status(
      ) {
    BulkOperationStatusProjection<CurrentBulkOperationProjectionRoot<PARENT, ROOT>, CurrentBulkOperationProjectionRoot<PARENT, ROOT>> projection = new BulkOperationStatusProjection<>(this, this);    
    getFields().put("status", projection);
    return projection;
  }

  public BulkOperationTypeProjection<CurrentBulkOperationProjectionRoot<PARENT, ROOT>, CurrentBulkOperationProjectionRoot<PARENT, ROOT>> type(
      ) {
    BulkOperationTypeProjection<CurrentBulkOperationProjectionRoot<PARENT, ROOT>, CurrentBulkOperationProjectionRoot<PARENT, ROOT>> projection = new BulkOperationTypeProjection<>(this, this);    
    getFields().put("type", projection);
    return projection;
  }

  public CurrentBulkOperationProjectionRoot<PARENT, ROOT> completedAt() {
    getFields().put("completedAt", null);
    return this;
  }

  public CurrentBulkOperationProjectionRoot<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public CurrentBulkOperationProjectionRoot<PARENT, ROOT> fileSize() {
    getFields().put("fileSize", null);
    return this;
  }

  public CurrentBulkOperationProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public CurrentBulkOperationProjectionRoot<PARENT, ROOT> objectCount() {
    getFields().put("objectCount", null);
    return this;
  }

  public CurrentBulkOperationProjectionRoot<PARENT, ROOT> partialDataUrl() {
    getFields().put("partialDataUrl", null);
    return this;
  }

  public CurrentBulkOperationProjectionRoot<PARENT, ROOT> query() {
    getFields().put("query", null);
    return this;
  }

  public CurrentBulkOperationProjectionRoot<PARENT, ROOT> rootObjectCount() {
    getFields().put("rootObjectCount", null);
    return this;
  }

  public CurrentBulkOperationProjectionRoot<PARENT, ROOT> url() {
    getFields().put("url", null);
    return this;
  }
}
