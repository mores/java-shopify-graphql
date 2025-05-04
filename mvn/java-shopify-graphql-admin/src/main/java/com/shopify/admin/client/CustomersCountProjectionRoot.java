package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CustomersCountProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CustomersCountProjectionRoot() {
    super(null, null, java.util.Optional.of("Count"));
  }

  public CustomersCountProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CountPrecisionProjection<CustomersCountProjectionRoot<PARENT, ROOT>, CustomersCountProjectionRoot<PARENT, ROOT>> precision(
      ) {
    CountPrecisionProjection<CustomersCountProjectionRoot<PARENT, ROOT>, CustomersCountProjectionRoot<PARENT, ROOT>> projection = new CountPrecisionProjection<>(this, this);    
    getFields().put("precision", projection);
    return projection;
  }

  public CustomersCountProjectionRoot<PARENT, ROOT> count() {
    getFields().put("count", null);
    return this;
  }
}
