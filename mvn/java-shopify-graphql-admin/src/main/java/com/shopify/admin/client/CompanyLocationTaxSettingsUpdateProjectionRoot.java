package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CompanyLocationTaxSettingsUpdateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CompanyLocationTaxSettingsUpdateProjectionRoot() {
    super(null, null, java.util.Optional.of("CompanyLocationTaxSettingsUpdatePayload"));
  }

  public CompanyLocationTaxSettingsUpdateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CompanyLocationProjection<CompanyLocationTaxSettingsUpdateProjectionRoot<PARENT, ROOT>, CompanyLocationTaxSettingsUpdateProjectionRoot<PARENT, ROOT>> companyLocation(
      ) {
    CompanyLocationProjection<CompanyLocationTaxSettingsUpdateProjectionRoot<PARENT, ROOT>, CompanyLocationTaxSettingsUpdateProjectionRoot<PARENT, ROOT>> projection = new CompanyLocationProjection<>(this, this);    
    getFields().put("companyLocation", projection);
    return projection;
  }

  public BusinessCustomerUserErrorProjection<CompanyLocationTaxSettingsUpdateProjectionRoot<PARENT, ROOT>, CompanyLocationTaxSettingsUpdateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    BusinessCustomerUserErrorProjection<CompanyLocationTaxSettingsUpdateProjectionRoot<PARENT, ROOT>, CompanyLocationTaxSettingsUpdateProjectionRoot<PARENT, ROOT>> projection = new BusinessCustomerUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
