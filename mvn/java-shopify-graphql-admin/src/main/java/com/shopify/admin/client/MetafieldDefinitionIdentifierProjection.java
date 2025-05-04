package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MetafieldDefinitionIdentifierProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MetafieldDefinitionIdentifierProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MetafieldDefinitionIdentifier"));
  }

  public MetafieldDefinitionIdentifierProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MetafieldOwnerTypeProjection<MetafieldDefinitionIdentifierProjection<PARENT, ROOT>, ROOT> ownerType(
      ) {
     MetafieldOwnerTypeProjection<MetafieldDefinitionIdentifierProjection<PARENT, ROOT>, ROOT> projection = new MetafieldOwnerTypeProjection<>(this, getRoot());
     getFields().put("ownerType", projection);
     return projection;
  }

  public MetafieldDefinitionIdentifierProjection<PARENT, ROOT> key() {
    getFields().put("key", null);
    return this;
  }

  public MetafieldDefinitionIdentifierProjection<PARENT, ROOT> namespace() {
    getFields().put("namespace", null);
    return this;
  }
}
