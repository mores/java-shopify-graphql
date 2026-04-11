package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CollectionReorderProductsUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CollectionReorderProductsUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CollectionReorderProductsUserError"));
  }

  public CollectionReorderProductsUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CollectionReorderProductsUserErrorCodeProjection<CollectionReorderProductsUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     CollectionReorderProductsUserErrorCodeProjection<CollectionReorderProductsUserErrorProjection<PARENT, ROOT>, ROOT> projection = new CollectionReorderProductsUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public CollectionReorderProductsUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public CollectionReorderProductsUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
