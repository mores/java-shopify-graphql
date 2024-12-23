package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class TenderTransactionCreditCardDetailsFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public TenderTransactionCreditCardDetailsFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("TenderTransactionCreditCardDetails"));
  }

  public TenderTransactionCreditCardDetailsFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public TenderTransactionCreditCardDetailsFragmentProjection<PARENT, ROOT> creditCardCompany() {
    getFields().put("creditCardCompany", null);
    return this;
  }

  public TenderTransactionCreditCardDetailsFragmentProjection<PARENT, ROOT> creditCardNumber() {
    getFields().put("creditCardNumber", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on TenderTransactionCreditCardDetails {");
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
