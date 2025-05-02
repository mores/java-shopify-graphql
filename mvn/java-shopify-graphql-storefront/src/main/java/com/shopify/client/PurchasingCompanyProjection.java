package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PurchasingCompanyProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PurchasingCompanyProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("PurchasingCompany"));
  }

  public PurchasingCompanyProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CompanyProjection<PurchasingCompanyProjection<PARENT, ROOT>, ROOT> company() {
     CompanyProjection<PurchasingCompanyProjection<PARENT, ROOT>, ROOT> projection = new CompanyProjection<>(this, getRoot());
     getFields().put("company", projection);
     return projection;
  }

  public CompanyContactProjection<PurchasingCompanyProjection<PARENT, ROOT>, ROOT> contact() {
     CompanyContactProjection<PurchasingCompanyProjection<PARENT, ROOT>, ROOT> projection = new CompanyContactProjection<>(this, getRoot());
     getFields().put("contact", projection);
     return projection;
  }

  public CompanyLocationProjection<PurchasingCompanyProjection<PARENT, ROOT>, ROOT> location() {
     CompanyLocationProjection<PurchasingCompanyProjection<PARENT, ROOT>, ROOT> projection = new CompanyLocationProjection<>(this, getRoot());
     getFields().put("location", projection);
     return projection;
  }
}
