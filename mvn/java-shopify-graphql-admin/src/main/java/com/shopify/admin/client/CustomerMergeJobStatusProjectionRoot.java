package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CustomerMergeJobStatusProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CustomerMergeJobStatusProjectionRoot() {
    super(null, null, java.util.Optional.of("CustomerMergeRequest"));
  }

  public CustomerMergeJobStatusProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CustomerMergeErrorProjection<CustomerMergeJobStatusProjectionRoot<PARENT, ROOT>, CustomerMergeJobStatusProjectionRoot<PARENT, ROOT>> customerMergeErrors(
      ) {
    CustomerMergeErrorProjection<CustomerMergeJobStatusProjectionRoot<PARENT, ROOT>, CustomerMergeJobStatusProjectionRoot<PARENT, ROOT>> projection = new CustomerMergeErrorProjection<>(this, this);    
    getFields().put("customerMergeErrors", projection);
    return projection;
  }

  public CustomerMergeRequestStatusProjection<CustomerMergeJobStatusProjectionRoot<PARENT, ROOT>, CustomerMergeJobStatusProjectionRoot<PARENT, ROOT>> status(
      ) {
    CustomerMergeRequestStatusProjection<CustomerMergeJobStatusProjectionRoot<PARENT, ROOT>, CustomerMergeJobStatusProjectionRoot<PARENT, ROOT>> projection = new CustomerMergeRequestStatusProjection<>(this, this);    
    getFields().put("status", projection);
    return projection;
  }

  public CustomerMergeJobStatusProjectionRoot<PARENT, ROOT> jobId() {
    getFields().put("jobId", null);
    return this;
  }

  public CustomerMergeJobStatusProjectionRoot<PARENT, ROOT> resultingCustomerId() {
    getFields().put("resultingCustomerId", null);
    return this;
  }
}
