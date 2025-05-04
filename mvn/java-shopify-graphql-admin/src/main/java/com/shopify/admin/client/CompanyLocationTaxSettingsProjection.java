package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CompanyLocationTaxSettingsProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CompanyLocationTaxSettingsProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CompanyLocationTaxSettings"));
  }

  public CompanyLocationTaxSettingsProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public TaxExemptionProjection<CompanyLocationTaxSettingsProjection<PARENT, ROOT>, ROOT> taxExemptions(
      ) {
     TaxExemptionProjection<CompanyLocationTaxSettingsProjection<PARENT, ROOT>, ROOT> projection = new TaxExemptionProjection<>(this, getRoot());
     getFields().put("taxExemptions", projection);
     return projection;
  }

  public CompanyLocationTaxSettingsProjection<PARENT, ROOT> taxExempt() {
    getFields().put("taxExempt", null);
    return this;
  }

  public CompanyLocationTaxSettingsProjection<PARENT, ROOT> taxRegistrationId() {
    getFields().put("taxRegistrationId", null);
    return this;
  }
}
