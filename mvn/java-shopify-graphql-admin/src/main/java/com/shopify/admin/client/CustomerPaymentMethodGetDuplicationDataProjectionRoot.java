package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CustomerPaymentMethodGetDuplicationDataProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CustomerPaymentMethodGetDuplicationDataProjectionRoot() {
    super(null, null, java.util.Optional.of("CustomerPaymentMethodGetDuplicationDataPayload"));
  }

  public CustomerPaymentMethodGetDuplicationDataProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CustomerPaymentMethodGetDuplicationDataUserErrorProjection<CustomerPaymentMethodGetDuplicationDataProjectionRoot<PARENT, ROOT>, CustomerPaymentMethodGetDuplicationDataProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    CustomerPaymentMethodGetDuplicationDataUserErrorProjection<CustomerPaymentMethodGetDuplicationDataProjectionRoot<PARENT, ROOT>, CustomerPaymentMethodGetDuplicationDataProjectionRoot<PARENT, ROOT>> projection = new CustomerPaymentMethodGetDuplicationDataUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public CustomerPaymentMethodGetDuplicationDataProjectionRoot<PARENT, ROOT> encryptedDuplicationData(
      ) {
    getFields().put("encryptedDuplicationData", null);
    return this;
  }
}
