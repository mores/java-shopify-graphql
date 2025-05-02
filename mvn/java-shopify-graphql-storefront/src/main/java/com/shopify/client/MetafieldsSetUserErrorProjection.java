package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MetafieldsSetUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MetafieldsSetUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MetafieldsSetUserError"));
  }

  public MetafieldsSetUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MetafieldsSetUserErrorCodeProjection<MetafieldsSetUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     MetafieldsSetUserErrorCodeProjection<MetafieldsSetUserErrorProjection<PARENT, ROOT>, ROOT> projection = new MetafieldsSetUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public MetafieldsSetUserErrorProjection<PARENT, ROOT> elementIndex() {
    getFields().put("elementIndex", null);
    return this;
  }

  public MetafieldsSetUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public MetafieldsSetUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
