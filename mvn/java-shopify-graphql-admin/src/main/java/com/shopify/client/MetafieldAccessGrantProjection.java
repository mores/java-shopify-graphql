package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MetafieldAccessGrantProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MetafieldAccessGrantProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MetafieldAccessGrant"));
  }

  public MetafieldAccessGrantProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MetafieldGrantAccessLevelProjection<MetafieldAccessGrantProjection<PARENT, ROOT>, ROOT> access(
      ) {
     MetafieldGrantAccessLevelProjection<MetafieldAccessGrantProjection<PARENT, ROOT>, ROOT> projection = new MetafieldGrantAccessLevelProjection<>(this, getRoot());
     getFields().put("access", projection);
     return projection;
  }

  public MetafieldAccessGrantProjection<PARENT, ROOT> grantee() {
    getFields().put("grantee", null);
    return this;
  }
}
