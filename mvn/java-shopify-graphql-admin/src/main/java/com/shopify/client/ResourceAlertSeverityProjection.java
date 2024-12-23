package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ResourceAlertSeverityProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ResourceAlertSeverityProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ResourceAlertSeverity"));
  }

  public ResourceAlertSeverityProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
