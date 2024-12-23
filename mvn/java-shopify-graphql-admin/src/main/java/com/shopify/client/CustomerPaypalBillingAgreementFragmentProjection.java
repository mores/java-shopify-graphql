package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class CustomerPaypalBillingAgreementFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public CustomerPaypalBillingAgreementFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CustomerPaypalBillingAgreement"));
  }

  public CustomerPaypalBillingAgreementFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CustomerPaymentInstrumentBillingAddressProjection<CustomerPaypalBillingAgreementFragmentProjection<PARENT, ROOT>, ROOT> billingAddress(
      ) {
     CustomerPaymentInstrumentBillingAddressProjection<CustomerPaypalBillingAgreementFragmentProjection<PARENT, ROOT>, ROOT> projection = new CustomerPaymentInstrumentBillingAddressProjection<>(this, getRoot());
     getFields().put("billingAddress", projection);
     return projection;
  }

  public CustomerPaypalBillingAgreementFragmentProjection<PARENT, ROOT> inactive() {
    getFields().put("inactive", null);
    return this;
  }

  public CustomerPaypalBillingAgreementFragmentProjection<PARENT, ROOT> isRevocable() {
    getFields().put("isRevocable", null);
    return this;
  }

  public CustomerPaypalBillingAgreementFragmentProjection<PARENT, ROOT> paypalAccountEmail() {
    getFields().put("paypalAccountEmail", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on CustomerPaypalBillingAgreement {");
    getFields().forEach((k, v) -> {
        builder.append(" ").append(k);
        if(v != null) {
            builder.append(" ").append(v.toString());
        }
    });
    builder.append("}");
     
    return builder.toString();
  }
}
