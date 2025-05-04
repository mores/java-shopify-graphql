package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CustomerMergeProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CustomerMergeProjectionRoot() {
    super(null, null, java.util.Optional.of("CustomerMergePayload"));
  }

  public CustomerMergeProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public JobProjection<CustomerMergeProjectionRoot<PARENT, ROOT>, CustomerMergeProjectionRoot<PARENT, ROOT>> job(
      ) {
    JobProjection<CustomerMergeProjectionRoot<PARENT, ROOT>, CustomerMergeProjectionRoot<PARENT, ROOT>> projection = new JobProjection<>(this, this);    
    getFields().put("job", projection);
    return projection;
  }

  public CustomerMergeUserErrorProjection<CustomerMergeProjectionRoot<PARENT, ROOT>, CustomerMergeProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    CustomerMergeUserErrorProjection<CustomerMergeProjectionRoot<PARENT, ROOT>, CustomerMergeProjectionRoot<PARENT, ROOT>> projection = new CustomerMergeUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public CustomerMergeProjectionRoot<PARENT, ROOT> resultingCustomerId() {
    getFields().put("resultingCustomerId", null);
    return this;
  }
}
