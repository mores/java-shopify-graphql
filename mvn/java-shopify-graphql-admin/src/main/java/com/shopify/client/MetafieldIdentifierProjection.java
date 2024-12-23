package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MetafieldIdentifierProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MetafieldIdentifierProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MetafieldIdentifier"));
  }

  public MetafieldIdentifierProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MetafieldIdentifierProjection<PARENT, ROOT> key() {
    getFields().put("key", null);
    return this;
  }

  public MetafieldIdentifierProjection<PARENT, ROOT> namespace() {
    getFields().put("namespace", null);
    return this;
  }

  public MetafieldIdentifierProjection<PARENT, ROOT> ownerId() {
    getFields().put("ownerId", null);
    return this;
  }
}
