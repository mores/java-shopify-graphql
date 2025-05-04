package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class BusinessEntitiesProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public BusinessEntitiesProjectionRoot() {
    super(null, null, java.util.Optional.of("BusinessEntity"));
  }

  public BusinessEntitiesProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public BusinessEntityAddressProjection<BusinessEntitiesProjectionRoot<PARENT, ROOT>, BusinessEntitiesProjectionRoot<PARENT, ROOT>> address(
      ) {
    BusinessEntityAddressProjection<BusinessEntitiesProjectionRoot<PARENT, ROOT>, BusinessEntitiesProjectionRoot<PARENT, ROOT>> projection = new BusinessEntityAddressProjection<>(this, this);    
    getFields().put("address", projection);
    return projection;
  }

  public ShopifyPaymentsAccountProjection<BusinessEntitiesProjectionRoot<PARENT, ROOT>, BusinessEntitiesProjectionRoot<PARENT, ROOT>> shopifyPaymentsAccount(
      ) {
    ShopifyPaymentsAccountProjection<BusinessEntitiesProjectionRoot<PARENT, ROOT>, BusinessEntitiesProjectionRoot<PARENT, ROOT>> projection = new ShopifyPaymentsAccountProjection<>(this, this);    
    getFields().put("shopifyPaymentsAccount", projection);
    return projection;
  }

  public BusinessEntitiesProjectionRoot<PARENT, ROOT> companyName() {
    getFields().put("companyName", null);
    return this;
  }

  public BusinessEntitiesProjectionRoot<PARENT, ROOT> displayName() {
    getFields().put("displayName", null);
    return this;
  }

  public BusinessEntitiesProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public BusinessEntitiesProjectionRoot<PARENT, ROOT> primary() {
    getFields().put("primary", null);
    return this;
  }
}
