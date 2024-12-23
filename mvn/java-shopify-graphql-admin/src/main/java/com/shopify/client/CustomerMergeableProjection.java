package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CustomerMergeableProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CustomerMergeableProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CustomerMergeable"));
  }

  public CustomerMergeableProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CustomerMergeErrorFieldTypeProjection<CustomerMergeableProjection<PARENT, ROOT>, ROOT> errorFields(
      ) {
     CustomerMergeErrorFieldTypeProjection<CustomerMergeableProjection<PARENT, ROOT>, ROOT> projection = new CustomerMergeErrorFieldTypeProjection<>(this, getRoot());
     getFields().put("errorFields", projection);
     return projection;
  }

  public CustomerMergeRequestProjection<CustomerMergeableProjection<PARENT, ROOT>, ROOT> mergeInProgress(
      ) {
     CustomerMergeRequestProjection<CustomerMergeableProjection<PARENT, ROOT>, ROOT> projection = new CustomerMergeRequestProjection<>(this, getRoot());
     getFields().put("mergeInProgress", projection);
     return projection;
  }

  public CustomerMergeableProjection<PARENT, ROOT> isMergeable() {
    getFields().put("isMergeable", null);
    return this;
  }

  public CustomerMergeableProjection<PARENT, ROOT> reason() {
    getFields().put("reason", null);
    return this;
  }
}
