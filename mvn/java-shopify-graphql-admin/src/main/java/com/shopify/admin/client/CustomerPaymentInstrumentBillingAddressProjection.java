package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CustomerPaymentInstrumentBillingAddressProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CustomerPaymentInstrumentBillingAddressProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CustomerPaymentInstrumentBillingAddress"));
  }

  public CustomerPaymentInstrumentBillingAddressProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CountryCodeProjection<CustomerPaymentInstrumentBillingAddressProjection<PARENT, ROOT>, ROOT> countryCode(
      ) {
     CountryCodeProjection<CustomerPaymentInstrumentBillingAddressProjection<PARENT, ROOT>, ROOT> projection = new CountryCodeProjection<>(this, getRoot());
     getFields().put("countryCode", projection);
     return projection;
  }

  public CustomerPaymentInstrumentBillingAddressProjection<PARENT, ROOT> address1() {
    getFields().put("address1", null);
    return this;
  }

  public CustomerPaymentInstrumentBillingAddressProjection<PARENT, ROOT> city() {
    getFields().put("city", null);
    return this;
  }

  public CustomerPaymentInstrumentBillingAddressProjection<PARENT, ROOT> country() {
    getFields().put("country", null);
    return this;
  }

  public CustomerPaymentInstrumentBillingAddressProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public CustomerPaymentInstrumentBillingAddressProjection<PARENT, ROOT> province() {
    getFields().put("province", null);
    return this;
  }

  public CustomerPaymentInstrumentBillingAddressProjection<PARENT, ROOT> provinceCode() {
    getFields().put("provinceCode", null);
    return this;
  }

  public CustomerPaymentInstrumentBillingAddressProjection<PARENT, ROOT> zip() {
    getFields().put("zip", null);
    return this;
  }
}
