package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MetaobjectStorefrontAccessProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MetaobjectStorefrontAccessProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MetaobjectStorefrontAccess"));
  }

  public MetaobjectStorefrontAccessProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
