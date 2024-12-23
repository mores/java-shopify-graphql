package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class TypedAttributeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public TypedAttributeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("TypedAttribute"));
  }

  public TypedAttributeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public TypedAttributeProjection<PARENT, ROOT> key() {
    getFields().put("key", null);
    return this;
  }

  public TypedAttributeProjection<PARENT, ROOT> value() {
    getFields().put("value", null);
    return this;
  }
}
