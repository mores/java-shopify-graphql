package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CustomerAccountPagesProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CustomerAccountPagesProjectionRoot() {
    super(null, null, java.util.Optional.of("CustomerAccountPageConnection"));
  }

  public CustomerAccountPagesProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CustomerAccountPageEdgeProjection<CustomerAccountPagesProjectionRoot<PARENT, ROOT>, CustomerAccountPagesProjectionRoot<PARENT, ROOT>> edges(
      ) {
    CustomerAccountPageEdgeProjection<CustomerAccountPagesProjectionRoot<PARENT, ROOT>, CustomerAccountPagesProjectionRoot<PARENT, ROOT>> projection = new CustomerAccountPageEdgeProjection<>(this, this);    
    getFields().put("edges", projection);
    return projection;
  }

  public CustomerAccountPageProjection<CustomerAccountPagesProjectionRoot<PARENT, ROOT>, CustomerAccountPagesProjectionRoot<PARENT, ROOT>> nodes(
      ) {
    CustomerAccountPageProjection<CustomerAccountPagesProjectionRoot<PARENT, ROOT>, CustomerAccountPagesProjectionRoot<PARENT, ROOT>> projection = new CustomerAccountPageProjection<>(this, this);    
    getFields().put("nodes", projection);
    return projection;
  }

  public PageInfoProjection<CustomerAccountPagesProjectionRoot<PARENT, ROOT>, CustomerAccountPagesProjectionRoot<PARENT, ROOT>> pageInfo(
      ) {
    PageInfoProjection<CustomerAccountPagesProjectionRoot<PARENT, ROOT>, CustomerAccountPagesProjectionRoot<PARENT, ROOT>> projection = new PageInfoProjection<>(this, this);    
    getFields().put("pageInfo", projection);
    return projection;
  }
}
