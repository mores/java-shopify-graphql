package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class BulkOperationFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public BulkOperationFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("BulkOperation"));
  }

  public BulkOperationFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public BulkOperationErrorCodeProjection<BulkOperationFragmentProjection<PARENT, ROOT>, ROOT> errorCode(
      ) {
     BulkOperationErrorCodeProjection<BulkOperationFragmentProjection<PARENT, ROOT>, ROOT> projection = new BulkOperationErrorCodeProjection<>(this, getRoot());
     getFields().put("errorCode", projection);
     return projection;
  }

  public BulkOperationStatusProjection<BulkOperationFragmentProjection<PARENT, ROOT>, ROOT> status(
      ) {
     BulkOperationStatusProjection<BulkOperationFragmentProjection<PARENT, ROOT>, ROOT> projection = new BulkOperationStatusProjection<>(this, getRoot());
     getFields().put("status", projection);
     return projection;
  }

  public BulkOperationTypeProjection<BulkOperationFragmentProjection<PARENT, ROOT>, ROOT> type() {
     BulkOperationTypeProjection<BulkOperationFragmentProjection<PARENT, ROOT>, ROOT> projection = new BulkOperationTypeProjection<>(this, getRoot());
     getFields().put("type", projection);
     return projection;
  }

  public BulkOperationFragmentProjection<PARENT, ROOT> completedAt() {
    getFields().put("completedAt", null);
    return this;
  }

  public BulkOperationFragmentProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public BulkOperationFragmentProjection<PARENT, ROOT> fileSize() {
    getFields().put("fileSize", null);
    return this;
  }

  public BulkOperationFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public BulkOperationFragmentProjection<PARENT, ROOT> objectCount() {
    getFields().put("objectCount", null);
    return this;
  }

  public BulkOperationFragmentProjection<PARENT, ROOT> partialDataUrl() {
    getFields().put("partialDataUrl", null);
    return this;
  }

  public BulkOperationFragmentProjection<PARENT, ROOT> query() {
    getFields().put("query", null);
    return this;
  }

  public BulkOperationFragmentProjection<PARENT, ROOT> rootObjectCount() {
    getFields().put("rootObjectCount", null);
    return this;
  }

  public BulkOperationFragmentProjection<PARENT, ROOT> url() {
    getFields().put("url", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on BulkOperation {");
    getFields().forEach((k, v) -> {
        builder.append(" ").append(k);
        if(v != null) {
            builder.append(" ").append(v.toString());
        }
    });
    builder.append("}");
     
    return builder.toString();
  }
}
