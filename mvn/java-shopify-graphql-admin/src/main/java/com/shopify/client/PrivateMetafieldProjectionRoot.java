package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PrivateMetafieldProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PrivateMetafieldProjectionRoot() {
    super(null, null, java.util.Optional.of("PrivateMetafield"));
  }

  public PrivateMetafieldProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PrivateMetafieldValueTypeProjection<PrivateMetafieldProjectionRoot<PARENT, ROOT>, PrivateMetafieldProjectionRoot<PARENT, ROOT>> valueType(
      ) {
    PrivateMetafieldValueTypeProjection<PrivateMetafieldProjectionRoot<PARENT, ROOT>, PrivateMetafieldProjectionRoot<PARENT, ROOT>> projection = new PrivateMetafieldValueTypeProjection<>(this, this);    
    getFields().put("valueType", projection);
    return projection;
  }

  public PrivateMetafieldProjectionRoot<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public PrivateMetafieldProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public PrivateMetafieldProjectionRoot<PARENT, ROOT> key() {
    getFields().put("key", null);
    return this;
  }

  public PrivateMetafieldProjectionRoot<PARENT, ROOT> namespace() {
    getFields().put("namespace", null);
    return this;
  }

  public PrivateMetafieldProjectionRoot<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }

  public PrivateMetafieldProjectionRoot<PARENT, ROOT> value() {
    getFields().put("value", null);
    return this;
  }
}
