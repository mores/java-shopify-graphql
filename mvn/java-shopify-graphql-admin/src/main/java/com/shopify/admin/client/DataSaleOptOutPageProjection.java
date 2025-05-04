package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DataSaleOptOutPageProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DataSaleOptOutPageProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DataSaleOptOutPage"));
  }

  public DataSaleOptOutPageProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DataSaleOptOutPageProjection<PARENT, ROOT> autoManaged() {
    getFields().put("autoManaged", null);
    return this;
  }
}
