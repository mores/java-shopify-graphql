package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PrivacySettingsProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PrivacySettingsProjectionRoot() {
    super(null, null, java.util.Optional.of("PrivacySettings"));
  }

  public PrivacySettingsProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CookieBannerProjection<PrivacySettingsProjectionRoot<PARENT, ROOT>, PrivacySettingsProjectionRoot<PARENT, ROOT>> banner(
      ) {
    CookieBannerProjection<PrivacySettingsProjectionRoot<PARENT, ROOT>, PrivacySettingsProjectionRoot<PARENT, ROOT>> projection = new CookieBannerProjection<>(this, this);    
    getFields().put("banner", projection);
    return projection;
  }

  public DataSaleOptOutPageProjection<PrivacySettingsProjectionRoot<PARENT, ROOT>, PrivacySettingsProjectionRoot<PARENT, ROOT>> dataSaleOptOutPage(
      ) {
    DataSaleOptOutPageProjection<PrivacySettingsProjectionRoot<PARENT, ROOT>, PrivacySettingsProjectionRoot<PARENT, ROOT>> projection = new DataSaleOptOutPageProjection<>(this, this);    
    getFields().put("dataSaleOptOutPage", projection);
    return projection;
  }

  public PrivacyPolicyProjection<PrivacySettingsProjectionRoot<PARENT, ROOT>, PrivacySettingsProjectionRoot<PARENT, ROOT>> privacyPolicy(
      ) {
    PrivacyPolicyProjection<PrivacySettingsProjectionRoot<PARENT, ROOT>, PrivacySettingsProjectionRoot<PARENT, ROOT>> projection = new PrivacyPolicyProjection<>(this, this);    
    getFields().put("privacyPolicy", projection);
    return projection;
  }
}
