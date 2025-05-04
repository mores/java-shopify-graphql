package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CustomerMergePreviewAlternateFieldsProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CustomerMergePreviewAlternateFieldsProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CustomerMergePreviewAlternateFields"));
  }

  public CustomerMergePreviewAlternateFieldsProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MailingAddressProjection<CustomerMergePreviewAlternateFieldsProjection<PARENT, ROOT>, ROOT> defaultAddress(
      ) {
     MailingAddressProjection<CustomerMergePreviewAlternateFieldsProjection<PARENT, ROOT>, ROOT> projection = new MailingAddressProjection<>(this, getRoot());
     getFields().put("defaultAddress", projection);
     return projection;
  }

  public CustomerEmailAddressProjection<CustomerMergePreviewAlternateFieldsProjection<PARENT, ROOT>, ROOT> email(
      ) {
     CustomerEmailAddressProjection<CustomerMergePreviewAlternateFieldsProjection<PARENT, ROOT>, ROOT> projection = new CustomerEmailAddressProjection<>(this, getRoot());
     getFields().put("email", projection);
     return projection;
  }

  public CustomerPhoneNumberProjection<CustomerMergePreviewAlternateFieldsProjection<PARENT, ROOT>, ROOT> phoneNumber(
      ) {
     CustomerPhoneNumberProjection<CustomerMergePreviewAlternateFieldsProjection<PARENT, ROOT>, ROOT> projection = new CustomerPhoneNumberProjection<>(this, getRoot());
     getFields().put("phoneNumber", projection);
     return projection;
  }

  public CustomerMergePreviewAlternateFieldsProjection<PARENT, ROOT> firstName() {
    getFields().put("firstName", null);
    return this;
  }

  public CustomerMergePreviewAlternateFieldsProjection<PARENT, ROOT> lastName() {
    getFields().put("lastName", null);
    return this;
  }
}
