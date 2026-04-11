package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CheckoutAndAccountsConfigurationBrandingComponentsProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CheckoutAndAccountsConfigurationBrandingComponentsProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CheckoutAndAccountsConfigurationBrandingComponents"));
  }

  public CheckoutAndAccountsConfigurationBrandingComponentsProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CheckoutAndAccountsConfigurationBrandingCheckboxProjection<CheckoutAndAccountsConfigurationBrandingComponentsProjection<PARENT, ROOT>, ROOT> checkbox(
      ) {
     CheckoutAndAccountsConfigurationBrandingCheckboxProjection<CheckoutAndAccountsConfigurationBrandingComponentsProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingCheckboxProjection<>(this, getRoot());
     getFields().put("checkbox", projection);
     return projection;
  }

  public CheckoutAndAccountsConfigurationBrandingChoiceListProjection<CheckoutAndAccountsConfigurationBrandingComponentsProjection<PARENT, ROOT>, ROOT> choiceList(
      ) {
     CheckoutAndAccountsConfigurationBrandingChoiceListProjection<CheckoutAndAccountsConfigurationBrandingComponentsProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingChoiceListProjection<>(this, getRoot());
     getFields().put("choiceList", projection);
     return projection;
  }

  public CheckoutAndAccountsConfigurationBrandingControlProjection<CheckoutAndAccountsConfigurationBrandingComponentsProjection<PARENT, ROOT>, ROOT> control(
      ) {
     CheckoutAndAccountsConfigurationBrandingControlProjection<CheckoutAndAccountsConfigurationBrandingComponentsProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingControlProjection<>(this, getRoot());
     getFields().put("control", projection);
     return projection;
  }

  public CheckoutAndAccountsConfigurationBrandingDividerStyleProjection<CheckoutAndAccountsConfigurationBrandingComponentsProjection<PARENT, ROOT>, ROOT> divider(
      ) {
     CheckoutAndAccountsConfigurationBrandingDividerStyleProjection<CheckoutAndAccountsConfigurationBrandingComponentsProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingDividerStyleProjection<>(this, getRoot());
     getFields().put("divider", projection);
     return projection;
  }

  public CheckoutAndAccountsConfigurationBrandingImageValueProjection<CheckoutAndAccountsConfigurationBrandingComponentsProjection<PARENT, ROOT>, ROOT> favicon(
      ) {
     CheckoutAndAccountsConfigurationBrandingImageValueProjection<CheckoutAndAccountsConfigurationBrandingComponentsProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingImageValueProjection<>(this, getRoot());
     getFields().put("favicon", projection);
     return projection;
  }

  public CheckoutAndAccountsConfigurationBrandingFooterProjection<CheckoutAndAccountsConfigurationBrandingComponentsProjection<PARENT, ROOT>, ROOT> footer(
      ) {
     CheckoutAndAccountsConfigurationBrandingFooterProjection<CheckoutAndAccountsConfigurationBrandingComponentsProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingFooterProjection<>(this, getRoot());
     getFields().put("footer", projection);
     return projection;
  }

  public CheckoutAndAccountsConfigurationBrandingHeaderProjection<CheckoutAndAccountsConfigurationBrandingComponentsProjection<PARENT, ROOT>, ROOT> header(
      ) {
     CheckoutAndAccountsConfigurationBrandingHeaderProjection<CheckoutAndAccountsConfigurationBrandingComponentsProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingHeaderProjection<>(this, getRoot());
     getFields().put("header", projection);
     return projection;
  }

  public CheckoutAndAccountsConfigurationBrandingHeadingLevelProjection<CheckoutAndAccountsConfigurationBrandingComponentsProjection<PARENT, ROOT>, ROOT> headingLevel1(
      ) {
     CheckoutAndAccountsConfigurationBrandingHeadingLevelProjection<CheckoutAndAccountsConfigurationBrandingComponentsProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingHeadingLevelProjection<>(this, getRoot());
     getFields().put("headingLevel1", projection);
     return projection;
  }

  public CheckoutAndAccountsConfigurationBrandingHeadingLevelProjection<CheckoutAndAccountsConfigurationBrandingComponentsProjection<PARENT, ROOT>, ROOT> headingLevel2(
      ) {
     CheckoutAndAccountsConfigurationBrandingHeadingLevelProjection<CheckoutAndAccountsConfigurationBrandingComponentsProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingHeadingLevelProjection<>(this, getRoot());
     getFields().put("headingLevel2", projection);
     return projection;
  }

  public CheckoutAndAccountsConfigurationBrandingHeadingLevelProjection<CheckoutAndAccountsConfigurationBrandingComponentsProjection<PARENT, ROOT>, ROOT> headingLevel3(
      ) {
     CheckoutAndAccountsConfigurationBrandingHeadingLevelProjection<CheckoutAndAccountsConfigurationBrandingComponentsProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingHeadingLevelProjection<>(this, getRoot());
     getFields().put("headingLevel3", projection);
     return projection;
  }

  public CheckoutAndAccountsConfigurationBrandingMainProjection<CheckoutAndAccountsConfigurationBrandingComponentsProjection<PARENT, ROOT>, ROOT> main(
      ) {
     CheckoutAndAccountsConfigurationBrandingMainProjection<CheckoutAndAccountsConfigurationBrandingComponentsProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingMainProjection<>(this, getRoot());
     getFields().put("main", projection);
     return projection;
  }

  public CheckoutAndAccountsConfigurationBrandingMerchandiseThumbnailProjection<CheckoutAndAccountsConfigurationBrandingComponentsProjection<PARENT, ROOT>, ROOT> merchandiseThumbnail(
      ) {
     CheckoutAndAccountsConfigurationBrandingMerchandiseThumbnailProjection<CheckoutAndAccountsConfigurationBrandingComponentsProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingMerchandiseThumbnailProjection<>(this, getRoot());
     getFields().put("merchandiseThumbnail", projection);
     return projection;
  }

  public CheckoutAndAccountsConfigurationBrandingButtonProjection<CheckoutAndAccountsConfigurationBrandingComponentsProjection<PARENT, ROOT>, ROOT> primaryButton(
      ) {
     CheckoutAndAccountsConfigurationBrandingButtonProjection<CheckoutAndAccountsConfigurationBrandingComponentsProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingButtonProjection<>(this, getRoot());
     getFields().put("primaryButton", projection);
     return projection;
  }

  public CheckoutAndAccountsConfigurationBrandingButtonProjection<CheckoutAndAccountsConfigurationBrandingComponentsProjection<PARENT, ROOT>, ROOT> secondaryButton(
      ) {
     CheckoutAndAccountsConfigurationBrandingButtonProjection<CheckoutAndAccountsConfigurationBrandingComponentsProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingButtonProjection<>(this, getRoot());
     getFields().put("secondaryButton", projection);
     return projection;
  }

  public CheckoutAndAccountsConfigurationBrandingSelectProjection<CheckoutAndAccountsConfigurationBrandingComponentsProjection<PARENT, ROOT>, ROOT> select(
      ) {
     CheckoutAndAccountsConfigurationBrandingSelectProjection<CheckoutAndAccountsConfigurationBrandingComponentsProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingSelectProjection<>(this, getRoot());
     getFields().put("select", projection);
     return projection;
  }

  public CheckoutAndAccountsConfigurationBrandingSharedProjection<CheckoutAndAccountsConfigurationBrandingComponentsProjection<PARENT, ROOT>, ROOT> shared(
      ) {
     CheckoutAndAccountsConfigurationBrandingSharedProjection<CheckoutAndAccountsConfigurationBrandingComponentsProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingSharedProjection<>(this, getRoot());
     getFields().put("shared", projection);
     return projection;
  }

  public CheckoutAndAccountsConfigurationBrandingTextFieldProjection<CheckoutAndAccountsConfigurationBrandingComponentsProjection<PARENT, ROOT>, ROOT> textField(
      ) {
     CheckoutAndAccountsConfigurationBrandingTextFieldProjection<CheckoutAndAccountsConfigurationBrandingComponentsProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingTextFieldProjection<>(this, getRoot());
     getFields().put("textField", projection);
     return projection;
  }
}
