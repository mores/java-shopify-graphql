package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class CustomerCreditCardFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public CustomerCreditCardFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CustomerCreditCard"));
  }

  public CustomerCreditCardFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CustomerCreditCardBillingAddressProjection<CustomerCreditCardFragmentProjection<PARENT, ROOT>, ROOT> billingAddress(
      ) {
     CustomerCreditCardBillingAddressProjection<CustomerCreditCardFragmentProjection<PARENT, ROOT>, ROOT> projection = new CustomerCreditCardBillingAddressProjection<>(this, getRoot());
     getFields().put("billingAddress", projection);
     return projection;
  }

  public CustomerCreditCardFragmentProjection<PARENT, ROOT> brand() {
    getFields().put("brand", null);
    return this;
  }

  public CustomerCreditCardFragmentProjection<PARENT, ROOT> expiresSoon() {
    getFields().put("expiresSoon", null);
    return this;
  }

  public CustomerCreditCardFragmentProjection<PARENT, ROOT> expiryMonth() {
    getFields().put("expiryMonth", null);
    return this;
  }

  public CustomerCreditCardFragmentProjection<PARENT, ROOT> expiryYear() {
    getFields().put("expiryYear", null);
    return this;
  }

  public CustomerCreditCardFragmentProjection<PARENT, ROOT> firstDigits() {
    getFields().put("firstDigits", null);
    return this;
  }

  public CustomerCreditCardFragmentProjection<PARENT, ROOT> isRevocable() {
    getFields().put("isRevocable", null);
    return this;
  }

  public CustomerCreditCardFragmentProjection<PARENT, ROOT> lastDigits() {
    getFields().put("lastDigits", null);
    return this;
  }

  public CustomerCreditCardFragmentProjection<PARENT, ROOT> maskedNumber() {
    getFields().put("maskedNumber", null);
    return this;
  }

  public CustomerCreditCardFragmentProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public CustomerCreditCardFragmentProjection<PARENT, ROOT> source() {
    getFields().put("source", null);
    return this;
  }

  public CustomerCreditCardFragmentProjection<PARENT, ROOT> virtualLastDigits() {
    getFields().put("virtualLastDigits", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on CustomerCreditCard {");
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
