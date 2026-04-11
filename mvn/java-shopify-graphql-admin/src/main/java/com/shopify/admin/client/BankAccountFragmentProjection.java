package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class BankAccountFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public BankAccountFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("BankAccount"));
  }

  public BankAccountFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public BankAccountHolderTypeProjection<BankAccountFragmentProjection<PARENT, ROOT>, ROOT> accountHolderType(
      ) {
     BankAccountHolderTypeProjection<BankAccountFragmentProjection<PARENT, ROOT>, ROOT> projection = new BankAccountHolderTypeProjection<>(this, getRoot());
     getFields().put("accountHolderType", projection);
     return projection;
  }

  public BankAccountTypeProjection<BankAccountFragmentProjection<PARENT, ROOT>, ROOT> accountType(
      ) {
     BankAccountTypeProjection<BankAccountFragmentProjection<PARENT, ROOT>, ROOT> projection = new BankAccountTypeProjection<>(this, getRoot());
     getFields().put("accountType", projection);
     return projection;
  }

  public CustomerPaymentInstrumentBillingAddressProjection<BankAccountFragmentProjection<PARENT, ROOT>, ROOT> billingAddress(
      ) {
     CustomerPaymentInstrumentBillingAddressProjection<BankAccountFragmentProjection<PARENT, ROOT>, ROOT> projection = new CustomerPaymentInstrumentBillingAddressProjection<>(this, getRoot());
     getFields().put("billingAddress", projection);
     return projection;
  }

  public BankAccountFragmentProjection<PARENT, ROOT> bankName() {
    getFields().put("bankName", null);
    return this;
  }

  public BankAccountFragmentProjection<PARENT, ROOT> lastDigits() {
    getFields().put("lastDigits", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on BankAccount {");
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
