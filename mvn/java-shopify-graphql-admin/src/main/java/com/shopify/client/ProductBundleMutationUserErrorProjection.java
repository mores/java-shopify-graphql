package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ProductBundleMutationUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ProductBundleMutationUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ProductBundleMutationUserError"));
  }

  public ProductBundleMutationUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ProductBundleMutationUserErrorCodeProjection<ProductBundleMutationUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     ProductBundleMutationUserErrorCodeProjection<ProductBundleMutationUserErrorProjection<PARENT, ROOT>, ROOT> projection = new ProductBundleMutationUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public ProductBundleMutationUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public ProductBundleMutationUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
