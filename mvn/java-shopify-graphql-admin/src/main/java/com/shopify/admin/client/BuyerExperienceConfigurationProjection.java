package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class BuyerExperienceConfigurationProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public BuyerExperienceConfigurationProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("BuyerExperienceConfiguration"));
  }

  public BuyerExperienceConfigurationProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DepositConfigurationProjection<BuyerExperienceConfigurationProjection<PARENT, ROOT>, ROOT> deposit(
      ) {
     DepositConfigurationProjection<BuyerExperienceConfigurationProjection<PARENT, ROOT>, ROOT> projection = new DepositConfigurationProjection<>(this, getRoot());
     getFields().put("deposit", projection);
     return projection;
  }

  public PaymentTermsTemplateProjection<BuyerExperienceConfigurationProjection<PARENT, ROOT>, ROOT> paymentTermsTemplate(
      ) {
     PaymentTermsTemplateProjection<BuyerExperienceConfigurationProjection<PARENT, ROOT>, ROOT> projection = new PaymentTermsTemplateProjection<>(this, getRoot());
     getFields().put("paymentTermsTemplate", projection);
     return projection;
  }

  public BuyerExperienceConfigurationProjection<PARENT, ROOT> checkoutToDraft() {
    getFields().put("checkoutToDraft", null);
    return this;
  }

  public BuyerExperienceConfigurationProjection<PARENT, ROOT> editableShippingAddress() {
    getFields().put("editableShippingAddress", null);
    return this;
  }

  public BuyerExperienceConfigurationProjection<PARENT, ROOT> payNowOnly() {
    getFields().put("payNowOnly", null);
    return this;
  }
}
