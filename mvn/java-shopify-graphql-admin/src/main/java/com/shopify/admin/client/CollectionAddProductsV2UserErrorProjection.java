package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CollectionAddProductsV2UserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CollectionAddProductsV2UserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CollectionAddProductsV2UserError"));
  }

  public CollectionAddProductsV2UserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CollectionAddProductsV2UserErrorCodeProjection<CollectionAddProductsV2UserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     CollectionAddProductsV2UserErrorCodeProjection<CollectionAddProductsV2UserErrorProjection<PARENT, ROOT>, ROOT> projection = new CollectionAddProductsV2UserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public CollectionAddProductsV2UserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public CollectionAddProductsV2UserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
