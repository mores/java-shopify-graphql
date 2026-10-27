package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CustomerWhatsAppMarketingConsentUpdateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CustomerWhatsAppMarketingConsentUpdateProjectionRoot() {
    super(null, null, java.util.Optional.of("CustomerWhatsAppMarketingConsentUpdatePayload"));
  }

  public CustomerWhatsAppMarketingConsentUpdateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CustomerPhoneNumberProjection<CustomerWhatsAppMarketingConsentUpdateProjectionRoot<PARENT, ROOT>, CustomerWhatsAppMarketingConsentUpdateProjectionRoot<PARENT, ROOT>> customerPhoneNumber(
      ) {
    CustomerPhoneNumberProjection<CustomerWhatsAppMarketingConsentUpdateProjectionRoot<PARENT, ROOT>, CustomerWhatsAppMarketingConsentUpdateProjectionRoot<PARENT, ROOT>> projection = new CustomerPhoneNumberProjection<>(this, this);    
    getFields().put("customerPhoneNumber", projection);
    return projection;
  }

  public CustomerMarketingConsentErrorProjection<CustomerWhatsAppMarketingConsentUpdateProjectionRoot<PARENT, ROOT>, CustomerWhatsAppMarketingConsentUpdateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    CustomerMarketingConsentErrorProjection<CustomerWhatsAppMarketingConsentUpdateProjectionRoot<PARENT, ROOT>, CustomerWhatsAppMarketingConsentUpdateProjectionRoot<PARENT, ROOT>> projection = new CustomerMarketingConsentErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
