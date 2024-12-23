package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CustomerMergeRequestProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CustomerMergeRequestProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CustomerMergeRequest"));
  }

  public CustomerMergeRequestProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CustomerMergeErrorProjection<CustomerMergeRequestProjection<PARENT, ROOT>, ROOT> customerMergeErrors(
      ) {
     CustomerMergeErrorProjection<CustomerMergeRequestProjection<PARENT, ROOT>, ROOT> projection = new CustomerMergeErrorProjection<>(this, getRoot());
     getFields().put("customerMergeErrors", projection);
     return projection;
  }

  public CustomerMergeRequestStatusProjection<CustomerMergeRequestProjection<PARENT, ROOT>, ROOT> status(
      ) {
     CustomerMergeRequestStatusProjection<CustomerMergeRequestProjection<PARENT, ROOT>, ROOT> projection = new CustomerMergeRequestStatusProjection<>(this, getRoot());
     getFields().put("status", projection);
     return projection;
  }

  public CustomerMergeRequestProjection<PARENT, ROOT> jobId() {
    getFields().put("jobId", null);
    return this;
  }

  public CustomerMergeRequestProjection<PARENT, ROOT> resultingCustomerId() {
    getFields().put("resultingCustomerId", null);
    return this;
  }
}
