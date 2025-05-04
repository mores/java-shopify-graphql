package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class AttributeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public AttributeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("Attribute"));
  }

  public AttributeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AttributeProjection<PARENT, ROOT> key() {
    getFields().put("key", null);
    return this;
  }

  public AttributeProjection<PARENT, ROOT> value() {
    getFields().put("value", null);
    return this;
  }
}
