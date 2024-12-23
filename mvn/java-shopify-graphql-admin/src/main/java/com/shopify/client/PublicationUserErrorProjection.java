package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PublicationUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PublicationUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("PublicationUserError"));
  }

  public PublicationUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PublicationUserErrorCodeProjection<PublicationUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     PublicationUserErrorCodeProjection<PublicationUserErrorProjection<PARENT, ROOT>, ROOT> projection = new PublicationUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public PublicationUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public PublicationUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
