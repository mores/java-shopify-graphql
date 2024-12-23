package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CustomerMergePreviewProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CustomerMergePreviewProjectionRoot() {
    super(null, null, java.util.Optional.of("CustomerMergePreview"));
  }

  public CustomerMergePreviewProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CustomerMergePreviewAlternateFieldsProjection<CustomerMergePreviewProjectionRoot<PARENT, ROOT>, CustomerMergePreviewProjectionRoot<PARENT, ROOT>> alternateFields(
      ) {
    CustomerMergePreviewAlternateFieldsProjection<CustomerMergePreviewProjectionRoot<PARENT, ROOT>, CustomerMergePreviewProjectionRoot<PARENT, ROOT>> projection = new CustomerMergePreviewAlternateFieldsProjection<>(this, this);    
    getFields().put("alternateFields", projection);
    return projection;
  }

  public CustomerMergePreviewBlockingFieldsProjection<CustomerMergePreviewProjectionRoot<PARENT, ROOT>, CustomerMergePreviewProjectionRoot<PARENT, ROOT>> blockingFields(
      ) {
    CustomerMergePreviewBlockingFieldsProjection<CustomerMergePreviewProjectionRoot<PARENT, ROOT>, CustomerMergePreviewProjectionRoot<PARENT, ROOT>> projection = new CustomerMergePreviewBlockingFieldsProjection<>(this, this);    
    getFields().put("blockingFields", projection);
    return projection;
  }

  public CustomerMergeErrorProjection<CustomerMergePreviewProjectionRoot<PARENT, ROOT>, CustomerMergePreviewProjectionRoot<PARENT, ROOT>> customerMergeErrors(
      ) {
    CustomerMergeErrorProjection<CustomerMergePreviewProjectionRoot<PARENT, ROOT>, CustomerMergePreviewProjectionRoot<PARENT, ROOT>> projection = new CustomerMergeErrorProjection<>(this, this);    
    getFields().put("customerMergeErrors", projection);
    return projection;
  }

  public CustomerMergePreviewDefaultFieldsProjection<CustomerMergePreviewProjectionRoot<PARENT, ROOT>, CustomerMergePreviewProjectionRoot<PARENT, ROOT>> defaultFields(
      ) {
    CustomerMergePreviewDefaultFieldsProjection<CustomerMergePreviewProjectionRoot<PARENT, ROOT>, CustomerMergePreviewProjectionRoot<PARENT, ROOT>> projection = new CustomerMergePreviewDefaultFieldsProjection<>(this, this);    
    getFields().put("defaultFields", projection);
    return projection;
  }

  public CustomerMergePreviewProjectionRoot<PARENT, ROOT> resultingCustomerId() {
    getFields().put("resultingCustomerId", null);
    return this;
  }
}
