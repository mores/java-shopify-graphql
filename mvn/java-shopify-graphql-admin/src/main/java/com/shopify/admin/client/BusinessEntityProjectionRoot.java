package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class BusinessEntityProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public BusinessEntityProjectionRoot() {
    super(null, null, java.util.Optional.of("BusinessEntity"));
  }

  public BusinessEntityProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public BusinessEntityAddressProjection<BusinessEntityProjectionRoot<PARENT, ROOT>, BusinessEntityProjectionRoot<PARENT, ROOT>> address(
      ) {
    BusinessEntityAddressProjection<BusinessEntityProjectionRoot<PARENT, ROOT>, BusinessEntityProjectionRoot<PARENT, ROOT>> projection = new BusinessEntityAddressProjection<>(this, this);    
    getFields().put("address", projection);
    return projection;
  }

  public ShopifyPaymentsAccountProjection<BusinessEntityProjectionRoot<PARENT, ROOT>, BusinessEntityProjectionRoot<PARENT, ROOT>> shopifyPaymentsAccount(
      ) {
    ShopifyPaymentsAccountProjection<BusinessEntityProjectionRoot<PARENT, ROOT>, BusinessEntityProjectionRoot<PARENT, ROOT>> projection = new ShopifyPaymentsAccountProjection<>(this, this);    
    getFields().put("shopifyPaymentsAccount", projection);
    return projection;
  }

  public BusinessEntityProjectionRoot<PARENT, ROOT> archived() {
    getFields().put("archived", null);
    return this;
  }

  public BusinessEntityProjectionRoot<PARENT, ROOT> companyName() {
    getFields().put("companyName", null);
    return this;
  }

  public BusinessEntityProjectionRoot<PARENT, ROOT> displayName() {
    getFields().put("displayName", null);
    return this;
  }

  public BusinessEntityProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public BusinessEntityProjectionRoot<PARENT, ROOT> primary() {
    getFields().put("primary", null);
    return this;
  }
}
