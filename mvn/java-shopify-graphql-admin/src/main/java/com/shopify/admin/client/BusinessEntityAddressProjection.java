package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class BusinessEntityAddressProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public BusinessEntityAddressProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("BusinessEntityAddress"));
  }

  public BusinessEntityAddressProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CountryCodeProjection<BusinessEntityAddressProjection<PARENT, ROOT>, ROOT> countryCode() {
     CountryCodeProjection<BusinessEntityAddressProjection<PARENT, ROOT>, ROOT> projection = new CountryCodeProjection<>(this, getRoot());
     getFields().put("countryCode", projection);
     return projection;
  }

  public BusinessEntityAddressProjection<PARENT, ROOT> address1() {
    getFields().put("address1", null);
    return this;
  }

  public BusinessEntityAddressProjection<PARENT, ROOT> address2() {
    getFields().put("address2", null);
    return this;
  }

  public BusinessEntityAddressProjection<PARENT, ROOT> city() {
    getFields().put("city", null);
    return this;
  }

  public BusinessEntityAddressProjection<PARENT, ROOT> province() {
    getFields().put("province", null);
    return this;
  }

  public BusinessEntityAddressProjection<PARENT, ROOT> zip() {
    getFields().put("zip", null);
    return this;
  }
}
