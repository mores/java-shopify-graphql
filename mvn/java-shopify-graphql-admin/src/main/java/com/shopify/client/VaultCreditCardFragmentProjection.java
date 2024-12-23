package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class VaultCreditCardFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public VaultCreditCardFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("VaultCreditCard"));
  }

  public VaultCreditCardFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CustomerCreditCardBillingAddressProjection<VaultCreditCardFragmentProjection<PARENT, ROOT>, ROOT> billingAddress(
      ) {
     CustomerCreditCardBillingAddressProjection<VaultCreditCardFragmentProjection<PARENT, ROOT>, ROOT> projection = new CustomerCreditCardBillingAddressProjection<>(this, getRoot());
     getFields().put("billingAddress", projection);
     return projection;
  }

  public VaultCreditCardFragmentProjection<PARENT, ROOT> brand() {
    getFields().put("brand", null);
    return this;
  }

  public VaultCreditCardFragmentProjection<PARENT, ROOT> expired() {
    getFields().put("expired", null);
    return this;
  }

  public VaultCreditCardFragmentProjection<PARENT, ROOT> expiryMonth() {
    getFields().put("expiryMonth", null);
    return this;
  }

  public VaultCreditCardFragmentProjection<PARENT, ROOT> expiryYear() {
    getFields().put("expiryYear", null);
    return this;
  }

  public VaultCreditCardFragmentProjection<PARENT, ROOT> lastDigits() {
    getFields().put("lastDigits", null);
    return this;
  }

  public VaultCreditCardFragmentProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on VaultCreditCard {");
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
