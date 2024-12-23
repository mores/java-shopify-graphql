package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CustomerCreditCardBillingAddressProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CustomerCreditCardBillingAddressProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CustomerCreditCardBillingAddress"));
  }

  public CustomerCreditCardBillingAddressProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CountryCodeProjection<CustomerCreditCardBillingAddressProjection<PARENT, ROOT>, ROOT> countryCode(
      ) {
     CountryCodeProjection<CustomerCreditCardBillingAddressProjection<PARENT, ROOT>, ROOT> projection = new CountryCodeProjection<>(this, getRoot());
     getFields().put("countryCode", projection);
     return projection;
  }

  public CustomerCreditCardBillingAddressProjection<PARENT, ROOT> address1() {
    getFields().put("address1", null);
    return this;
  }

  public CustomerCreditCardBillingAddressProjection<PARENT, ROOT> city() {
    getFields().put("city", null);
    return this;
  }

  public CustomerCreditCardBillingAddressProjection<PARENT, ROOT> country() {
    getFields().put("country", null);
    return this;
  }

  public CustomerCreditCardBillingAddressProjection<PARENT, ROOT> firstName() {
    getFields().put("firstName", null);
    return this;
  }

  public CustomerCreditCardBillingAddressProjection<PARENT, ROOT> lastName() {
    getFields().put("lastName", null);
    return this;
  }

  public CustomerCreditCardBillingAddressProjection<PARENT, ROOT> province() {
    getFields().put("province", null);
    return this;
  }

  public CustomerCreditCardBillingAddressProjection<PARENT, ROOT> provinceCode() {
    getFields().put("provinceCode", null);
    return this;
  }

  public CustomerCreditCardBillingAddressProjection<PARENT, ROOT> zip() {
    getFields().put("zip", null);
    return this;
  }
}
