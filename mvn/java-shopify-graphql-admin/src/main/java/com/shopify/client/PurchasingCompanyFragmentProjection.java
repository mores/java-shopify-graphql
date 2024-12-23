package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class PurchasingCompanyFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public PurchasingCompanyFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("PurchasingCompany"));
  }

  public PurchasingCompanyFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CompanyProjection<PurchasingCompanyFragmentProjection<PARENT, ROOT>, ROOT> company() {
     CompanyProjection<PurchasingCompanyFragmentProjection<PARENT, ROOT>, ROOT> projection = new CompanyProjection<>(this, getRoot());
     getFields().put("company", projection);
     return projection;
  }

  public CompanyContactProjection<PurchasingCompanyFragmentProjection<PARENT, ROOT>, ROOT> contact(
      ) {
     CompanyContactProjection<PurchasingCompanyFragmentProjection<PARENT, ROOT>, ROOT> projection = new CompanyContactProjection<>(this, getRoot());
     getFields().put("contact", projection);
     return projection;
  }

  public CompanyLocationProjection<PurchasingCompanyFragmentProjection<PARENT, ROOT>, ROOT> location(
      ) {
     CompanyLocationProjection<PurchasingCompanyFragmentProjection<PARENT, ROOT>, ROOT> projection = new CompanyLocationProjection<>(this, getRoot());
     getFields().put("location", projection);
     return projection;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on PurchasingCompany {");
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
