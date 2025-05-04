package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ProductChangeStatusUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ProductChangeStatusUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ProductChangeStatusUserError"));
  }

  public ProductChangeStatusUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ProductChangeStatusUserErrorCodeProjection<ProductChangeStatusUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     ProductChangeStatusUserErrorCodeProjection<ProductChangeStatusUserErrorProjection<PARENT, ROOT>, ROOT> projection = new ProductChangeStatusUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public ProductChangeStatusUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public ProductChangeStatusUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
