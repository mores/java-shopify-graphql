package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CustomersProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CustomersProjectionRoot() {
    super(null, null, java.util.Optional.of("CustomerConnection"));
  }

  public CustomersProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CustomerEdgeProjection<CustomersProjectionRoot<PARENT, ROOT>, CustomersProjectionRoot<PARENT, ROOT>> edges(
      ) {
    CustomerEdgeProjection<CustomersProjectionRoot<PARENT, ROOT>, CustomersProjectionRoot<PARENT, ROOT>> projection = new CustomerEdgeProjection<>(this, this);    
    getFields().put("edges", projection);
    return projection;
  }

  public CustomerProjection<CustomersProjectionRoot<PARENT, ROOT>, CustomersProjectionRoot<PARENT, ROOT>> nodes(
      ) {
    CustomerProjection<CustomersProjectionRoot<PARENT, ROOT>, CustomersProjectionRoot<PARENT, ROOT>> projection = new CustomerProjection<>(this, this);    
    getFields().put("nodes", projection);
    return projection;
  }

  public PageInfoProjection<CustomersProjectionRoot<PARENT, ROOT>, CustomersProjectionRoot<PARENT, ROOT>> pageInfo(
      ) {
    PageInfoProjection<CustomersProjectionRoot<PARENT, ROOT>, CustomersProjectionRoot<PARENT, ROOT>> projection = new PageInfoProjection<>(this, this);    
    getFields().put("pageInfo", projection);
    return projection;
  }
}
