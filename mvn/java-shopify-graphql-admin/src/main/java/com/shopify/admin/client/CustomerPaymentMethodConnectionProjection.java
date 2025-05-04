package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CustomerPaymentMethodConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CustomerPaymentMethodConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CustomerPaymentMethodConnection"));
  }

  public CustomerPaymentMethodConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CustomerPaymentMethodEdgeProjection<CustomerPaymentMethodConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     CustomerPaymentMethodEdgeProjection<CustomerPaymentMethodConnectionProjection<PARENT, ROOT>, ROOT> projection = new CustomerPaymentMethodEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public CustomerPaymentMethodProjection<CustomerPaymentMethodConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     CustomerPaymentMethodProjection<CustomerPaymentMethodConnectionProjection<PARENT, ROOT>, ROOT> projection = new CustomerPaymentMethodProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<CustomerPaymentMethodConnectionProjection<PARENT, ROOT>, ROOT> pageInfo(
      ) {
     PageInfoProjection<CustomerPaymentMethodConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
