package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ProductFullSyncUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ProductFullSyncUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ProductFullSyncUserError"));
  }

  public ProductFullSyncUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ProductFullSyncUserErrorCodeProjection<ProductFullSyncUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     ProductFullSyncUserErrorCodeProjection<ProductFullSyncUserErrorProjection<PARENT, ROOT>, ROOT> projection = new ProductFullSyncUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public ProductFullSyncUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public ProductFullSyncUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
