package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ResourceAlertIconProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ResourceAlertIconProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ResourceAlertIcon"));
  }

  public ResourceAlertIconProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
