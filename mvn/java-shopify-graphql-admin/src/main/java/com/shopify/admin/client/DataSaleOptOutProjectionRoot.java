package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DataSaleOptOutProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DataSaleOptOutProjectionRoot() {
    super(null, null, java.util.Optional.of("DataSaleOptOutPayload"));
  }

  public DataSaleOptOutProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DataSaleOptOutUserErrorProjection<DataSaleOptOutProjectionRoot<PARENT, ROOT>, DataSaleOptOutProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    DataSaleOptOutUserErrorProjection<DataSaleOptOutProjectionRoot<PARENT, ROOT>, DataSaleOptOutProjectionRoot<PARENT, ROOT>> projection = new DataSaleOptOutUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public DataSaleOptOutProjectionRoot<PARENT, ROOT> customerId() {
    getFields().put("customerId", null);
    return this;
  }
}
