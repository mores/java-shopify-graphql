package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SubscriptionMailingAddressProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SubscriptionMailingAddressProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SubscriptionMailingAddress"));
  }

  public SubscriptionMailingAddressProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CountryCodeProjection<SubscriptionMailingAddressProjection<PARENT, ROOT>, ROOT> countryCode(
      ) {
     CountryCodeProjection<SubscriptionMailingAddressProjection<PARENT, ROOT>, ROOT> projection = new CountryCodeProjection<>(this, getRoot());
     getFields().put("countryCode", projection);
     return projection;
  }

  public SubscriptionMailingAddressProjection<PARENT, ROOT> address1() {
    getFields().put("address1", null);
    return this;
  }

  public SubscriptionMailingAddressProjection<PARENT, ROOT> address2() {
    getFields().put("address2", null);
    return this;
  }

  public SubscriptionMailingAddressProjection<PARENT, ROOT> city() {
    getFields().put("city", null);
    return this;
  }

  public SubscriptionMailingAddressProjection<PARENT, ROOT> company() {
    getFields().put("company", null);
    return this;
  }

  public SubscriptionMailingAddressProjection<PARENT, ROOT> country() {
    getFields().put("country", null);
    return this;
  }

  public SubscriptionMailingAddressProjection<PARENT, ROOT> firstName() {
    getFields().put("firstName", null);
    return this;
  }

  public SubscriptionMailingAddressProjection<PARENT, ROOT> lastName() {
    getFields().put("lastName", null);
    return this;
  }

  public SubscriptionMailingAddressProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public SubscriptionMailingAddressProjection<PARENT, ROOT> phone() {
    getFields().put("phone", null);
    return this;
  }

  public SubscriptionMailingAddressProjection<PARENT, ROOT> province() {
    getFields().put("province", null);
    return this;
  }

  public SubscriptionMailingAddressProjection<PARENT, ROOT> provinceCode() {
    getFields().put("provinceCode", null);
    return this;
  }

  public SubscriptionMailingAddressProjection<PARENT, ROOT> zip() {
    getFields().put("zip", null);
    return this;
  }
}
