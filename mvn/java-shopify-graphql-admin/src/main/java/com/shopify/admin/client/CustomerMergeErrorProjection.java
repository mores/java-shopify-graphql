package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CustomerMergeErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CustomerMergeErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CustomerMergeError"));
  }

  public CustomerMergeErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CustomerMergeErrorFieldTypeProjection<CustomerMergeErrorProjection<PARENT, ROOT>, ROOT> errorFields(
      ) {
     CustomerMergeErrorFieldTypeProjection<CustomerMergeErrorProjection<PARENT, ROOT>, ROOT> projection = new CustomerMergeErrorFieldTypeProjection<>(this, getRoot());
     getFields().put("errorFields", projection);
     return projection;
  }

  public CustomerMergeErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
