package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class BusinessEntityProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public BusinessEntityProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("BusinessEntity"));
  }

  public BusinessEntityProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public BusinessEntityAddressProjection<BusinessEntityProjection<PARENT, ROOT>, ROOT> address() {
     BusinessEntityAddressProjection<BusinessEntityProjection<PARENT, ROOT>, ROOT> projection = new BusinessEntityAddressProjection<>(this, getRoot());
     getFields().put("address", projection);
     return projection;
  }

  public ShopifyPaymentsAccountProjection<BusinessEntityProjection<PARENT, ROOT>, ROOT> shopifyPaymentsAccount(
      ) {
     ShopifyPaymentsAccountProjection<BusinessEntityProjection<PARENT, ROOT>, ROOT> projection = new ShopifyPaymentsAccountProjection<>(this, getRoot());
     getFields().put("shopifyPaymentsAccount", projection);
     return projection;
  }

  public BusinessEntityProjection<PARENT, ROOT> archived() {
    getFields().put("archived", null);
    return this;
  }

  public BusinessEntityProjection<PARENT, ROOT> companyName() {
    getFields().put("companyName", null);
    return this;
  }

  public BusinessEntityProjection<PARENT, ROOT> displayName() {
    getFields().put("displayName", null);
    return this;
  }

  public BusinessEntityProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public BusinessEntityProjection<PARENT, ROOT> primary() {
    getFields().put("primary", null);
    return this;
  }
}
