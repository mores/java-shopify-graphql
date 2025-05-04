package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MetafieldCustomerAccountAccessProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MetafieldCustomerAccountAccessProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MetafieldCustomerAccountAccess"));
  }

  public MetafieldCustomerAccountAccessProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
