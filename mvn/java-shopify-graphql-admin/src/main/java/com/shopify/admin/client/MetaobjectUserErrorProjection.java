package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MetaobjectUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MetaobjectUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MetaobjectUserError"));
  }

  public MetaobjectUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MetaobjectUserErrorCodeProjection<MetaobjectUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     MetaobjectUserErrorCodeProjection<MetaobjectUserErrorProjection<PARENT, ROOT>, ROOT> projection = new MetaobjectUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public MetaobjectUserErrorProjection<PARENT, ROOT> elementIndex() {
    getFields().put("elementIndex", null);
    return this;
  }

  public MetaobjectUserErrorProjection<PARENT, ROOT> elementKey() {
    getFields().put("elementKey", null);
    return this;
  }

  public MetaobjectUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public MetaobjectUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
