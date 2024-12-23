package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class LinkedMetafieldProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public LinkedMetafieldProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("LinkedMetafield"));
  }

  public LinkedMetafieldProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public LinkedMetafieldProjection<PARENT, ROOT> key() {
    getFields().put("key", null);
    return this;
  }

  public LinkedMetafieldProjection<PARENT, ROOT> namespace() {
    getFields().put("namespace", null);
    return this;
  }
}
