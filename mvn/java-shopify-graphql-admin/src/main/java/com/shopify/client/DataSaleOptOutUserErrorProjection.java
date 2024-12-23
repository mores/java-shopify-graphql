package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DataSaleOptOutUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DataSaleOptOutUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DataSaleOptOutUserError"));
  }

  public DataSaleOptOutUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DataSaleOptOutUserErrorCodeProjection<DataSaleOptOutUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     DataSaleOptOutUserErrorCodeProjection<DataSaleOptOutUserErrorProjection<PARENT, ROOT>, ROOT> projection = new DataSaleOptOutUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public DataSaleOptOutUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public DataSaleOptOutUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
