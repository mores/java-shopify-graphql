package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CollectionDuplicateUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CollectionDuplicateUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CollectionDuplicateUserError"));
  }

  public CollectionDuplicateUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CollectionDuplicateUserErrorCodeProjection<CollectionDuplicateUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     CollectionDuplicateUserErrorCodeProjection<CollectionDuplicateUserErrorProjection<PARENT, ROOT>, ROOT> projection = new CollectionDuplicateUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public CollectionDuplicateUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public CollectionDuplicateUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
