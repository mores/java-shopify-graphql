package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MetafieldAdminAccessProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MetafieldAdminAccessProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MetafieldAdminAccess"));
  }

  public MetafieldAdminAccessProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
