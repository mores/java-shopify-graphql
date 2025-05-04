package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PrivacySettingsProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PrivacySettingsProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("PrivacySettings"));
  }

  public PrivacySettingsProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CookieBannerProjection<PrivacySettingsProjection<PARENT, ROOT>, ROOT> banner() {
     CookieBannerProjection<PrivacySettingsProjection<PARENT, ROOT>, ROOT> projection = new CookieBannerProjection<>(this, getRoot());
     getFields().put("banner", projection);
     return projection;
  }

  public DataSaleOptOutPageProjection<PrivacySettingsProjection<PARENT, ROOT>, ROOT> dataSaleOptOutPage(
      ) {
     DataSaleOptOutPageProjection<PrivacySettingsProjection<PARENT, ROOT>, ROOT> projection = new DataSaleOptOutPageProjection<>(this, getRoot());
     getFields().put("dataSaleOptOutPage", projection);
     return projection;
  }

  public PrivacyPolicyProjection<PrivacySettingsProjection<PARENT, ROOT>, ROOT> privacyPolicy() {
     PrivacyPolicyProjection<PrivacySettingsProjection<PARENT, ROOT>, ROOT> projection = new PrivacyPolicyProjection<>(this, getRoot());
     getFields().put("privacyPolicy", projection);
     return projection;
  }
}
