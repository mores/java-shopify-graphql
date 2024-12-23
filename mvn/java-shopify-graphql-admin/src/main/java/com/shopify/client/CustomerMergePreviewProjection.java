package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CustomerMergePreviewProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CustomerMergePreviewProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CustomerMergePreview"));
  }

  public CustomerMergePreviewProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CustomerMergePreviewAlternateFieldsProjection<CustomerMergePreviewProjection<PARENT, ROOT>, ROOT> alternateFields(
      ) {
     CustomerMergePreviewAlternateFieldsProjection<CustomerMergePreviewProjection<PARENT, ROOT>, ROOT> projection = new CustomerMergePreviewAlternateFieldsProjection<>(this, getRoot());
     getFields().put("alternateFields", projection);
     return projection;
  }

  public CustomerMergePreviewBlockingFieldsProjection<CustomerMergePreviewProjection<PARENT, ROOT>, ROOT> blockingFields(
      ) {
     CustomerMergePreviewBlockingFieldsProjection<CustomerMergePreviewProjection<PARENT, ROOT>, ROOT> projection = new CustomerMergePreviewBlockingFieldsProjection<>(this, getRoot());
     getFields().put("blockingFields", projection);
     return projection;
  }

  public CustomerMergeErrorProjection<CustomerMergePreviewProjection<PARENT, ROOT>, ROOT> customerMergeErrors(
      ) {
     CustomerMergeErrorProjection<CustomerMergePreviewProjection<PARENT, ROOT>, ROOT> projection = new CustomerMergeErrorProjection<>(this, getRoot());
     getFields().put("customerMergeErrors", projection);
     return projection;
  }

  public CustomerMergePreviewDefaultFieldsProjection<CustomerMergePreviewProjection<PARENT, ROOT>, ROOT> defaultFields(
      ) {
     CustomerMergePreviewDefaultFieldsProjection<CustomerMergePreviewProjection<PARENT, ROOT>, ROOT> projection = new CustomerMergePreviewDefaultFieldsProjection<>(this, getRoot());
     getFields().put("defaultFields", projection);
     return projection;
  }

  public CustomerMergePreviewProjection<PARENT, ROOT> resultingCustomerId() {
    getFields().put("resultingCustomerId", null);
    return this;
  }
}
