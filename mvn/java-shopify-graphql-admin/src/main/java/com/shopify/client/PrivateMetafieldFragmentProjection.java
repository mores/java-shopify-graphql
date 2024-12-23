package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class PrivateMetafieldFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public PrivateMetafieldFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("PrivateMetafield"));
  }

  public PrivateMetafieldFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PrivateMetafieldValueTypeProjection<PrivateMetafieldFragmentProjection<PARENT, ROOT>, ROOT> valueType(
      ) {
     PrivateMetafieldValueTypeProjection<PrivateMetafieldFragmentProjection<PARENT, ROOT>, ROOT> projection = new PrivateMetafieldValueTypeProjection<>(this, getRoot());
     getFields().put("valueType", projection);
     return projection;
  }

  public PrivateMetafieldFragmentProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public PrivateMetafieldFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public PrivateMetafieldFragmentProjection<PARENT, ROOT> key() {
    getFields().put("key", null);
    return this;
  }

  public PrivateMetafieldFragmentProjection<PARENT, ROOT> namespace() {
    getFields().put("namespace", null);
    return this;
  }

  public PrivateMetafieldFragmentProjection<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }

  public PrivateMetafieldFragmentProjection<PARENT, ROOT> value() {
    getFields().put("value", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on PrivateMetafield {");
    getFields().forEach((k, v) -> {
        builder.append(" ").append(k);
        if(v != null) {
            builder.append(" ").append(v.toString());
        }
    });
    builder.append("}");
     
    return builder.toString();
  }
}
