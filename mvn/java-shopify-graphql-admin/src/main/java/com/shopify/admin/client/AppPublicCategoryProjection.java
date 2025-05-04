package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class AppPublicCategoryProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public AppPublicCategoryProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("AppPublicCategory"));
  }

  public AppPublicCategoryProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
