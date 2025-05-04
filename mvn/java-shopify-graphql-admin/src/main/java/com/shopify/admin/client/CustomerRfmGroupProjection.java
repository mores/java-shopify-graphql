package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CustomerRfmGroupProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CustomerRfmGroupProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CustomerRfmGroup"));
  }

  public CustomerRfmGroupProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
