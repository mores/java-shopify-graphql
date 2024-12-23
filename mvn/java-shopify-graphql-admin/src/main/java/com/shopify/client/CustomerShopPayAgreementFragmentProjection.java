package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class CustomerShopPayAgreementFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public CustomerShopPayAgreementFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CustomerShopPayAgreement"));
  }

  public CustomerShopPayAgreementFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CustomerCreditCardBillingAddressProjection<CustomerShopPayAgreementFragmentProjection<PARENT, ROOT>, ROOT> billingAddress(
      ) {
     CustomerCreditCardBillingAddressProjection<CustomerShopPayAgreementFragmentProjection<PARENT, ROOT>, ROOT> projection = new CustomerCreditCardBillingAddressProjection<>(this, getRoot());
     getFields().put("billingAddress", projection);
     return projection;
  }

  public CustomerShopPayAgreementFragmentProjection<PARENT, ROOT> expiresSoon() {
    getFields().put("expiresSoon", null);
    return this;
  }

  public CustomerShopPayAgreementFragmentProjection<PARENT, ROOT> expiryMonth() {
    getFields().put("expiryMonth", null);
    return this;
  }

  public CustomerShopPayAgreementFragmentProjection<PARENT, ROOT> expiryYear() {
    getFields().put("expiryYear", null);
    return this;
  }

  public CustomerShopPayAgreementFragmentProjection<PARENT, ROOT> inactive() {
    getFields().put("inactive", null);
    return this;
  }

  public CustomerShopPayAgreementFragmentProjection<PARENT, ROOT> isRevocable() {
    getFields().put("isRevocable", null);
    return this;
  }

  public CustomerShopPayAgreementFragmentProjection<PARENT, ROOT> lastDigits() {
    getFields().put("lastDigits", null);
    return this;
  }

  public CustomerShopPayAgreementFragmentProjection<PARENT, ROOT> maskedNumber() {
    getFields().put("maskedNumber", null);
    return this;
  }

  public CustomerShopPayAgreementFragmentProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on CustomerShopPayAgreement {");
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
