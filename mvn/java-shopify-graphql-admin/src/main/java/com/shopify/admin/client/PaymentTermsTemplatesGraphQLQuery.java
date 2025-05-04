package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.PaymentTermsType;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * The list of payment terms templates eligible for all shops and users.
 */
public class PaymentTermsTemplatesGraphQLQuery extends GraphQLQuery {
  public PaymentTermsTemplatesGraphQLQuery(PaymentTermsType paymentTermsType, String queryName,
      Set<String> fieldsSet) {
    super("query", queryName);
    if (paymentTermsType != null || fieldsSet.contains("paymentTermsType")) {
        getInput().put("paymentTermsType", paymentTermsType);
    }
  }

  public PaymentTermsTemplatesGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "paymentTermsTemplates";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private PaymentTermsType paymentTermsType;

    private String queryName;

    public PaymentTermsTemplatesGraphQLQuery build() {
      return new PaymentTermsTemplatesGraphQLQuery(paymentTermsType, queryName, fieldsSet);
               
    }

    /**
     * The payment terms type to filter the payment terms templates list.
     */
    public Builder paymentTermsType(PaymentTermsType paymentTermsType) {
      this.paymentTermsType = paymentTermsType;
      this.fieldsSet.add("paymentTermsType");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
