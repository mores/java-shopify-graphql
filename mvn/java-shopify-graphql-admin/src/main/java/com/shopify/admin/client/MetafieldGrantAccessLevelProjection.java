package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MetafieldGrantAccessLevelProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MetafieldGrantAccessLevelProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MetafieldGrantAccessLevel"));
  }

  public MetafieldGrantAccessLevelProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
