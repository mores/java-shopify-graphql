package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ProductOptionUpdateUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ProductOptionUpdateUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ProductOptionUpdateUserError"));
  }

  public ProductOptionUpdateUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ProductOptionUpdateUserErrorCodeProjection<ProductOptionUpdateUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     ProductOptionUpdateUserErrorCodeProjection<ProductOptionUpdateUserErrorProjection<PARENT, ROOT>, ROOT> projection = new ProductOptionUpdateUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public ProductOptionUpdateUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public ProductOptionUpdateUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
