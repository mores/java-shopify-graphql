package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class BusinessEntityFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public BusinessEntityFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("BusinessEntity"));
  }

  public BusinessEntityFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public BusinessEntityAddressProjection<BusinessEntityFragmentProjection<PARENT, ROOT>, ROOT> address(
      ) {
     BusinessEntityAddressProjection<BusinessEntityFragmentProjection<PARENT, ROOT>, ROOT> projection = new BusinessEntityAddressProjection<>(this, getRoot());
     getFields().put("address", projection);
     return projection;
  }

  public ShopifyPaymentsAccountProjection<BusinessEntityFragmentProjection<PARENT, ROOT>, ROOT> shopifyPaymentsAccount(
      ) {
     ShopifyPaymentsAccountProjection<BusinessEntityFragmentProjection<PARENT, ROOT>, ROOT> projection = new ShopifyPaymentsAccountProjection<>(this, getRoot());
     getFields().put("shopifyPaymentsAccount", projection);
     return projection;
  }

  public BusinessEntityFragmentProjection<PARENT, ROOT> archived() {
    getFields().put("archived", null);
    return this;
  }

  public BusinessEntityFragmentProjection<PARENT, ROOT> companyName() {
    getFields().put("companyName", null);
    return this;
  }

  public BusinessEntityFragmentProjection<PARENT, ROOT> displayName() {
    getFields().put("displayName", null);
    return this;
  }

  public BusinessEntityFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public BusinessEntityFragmentProjection<PARENT, ROOT> primary() {
    getFields().put("primary", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on BusinessEntity {");
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
