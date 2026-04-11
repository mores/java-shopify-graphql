package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MetaobjectCustomerAccountAccessProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MetaobjectCustomerAccountAccessProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MetaobjectCustomerAccountAccess"));
  }

  public MetaobjectCustomerAccountAccessProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
