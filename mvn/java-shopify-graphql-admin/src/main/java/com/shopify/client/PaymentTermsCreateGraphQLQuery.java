package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.PaymentTermsCreateInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;


public class PaymentTermsCreateGraphQLQuery extends GraphQLQuery {
  public PaymentTermsCreateGraphQLQuery(String referenceId,
      PaymentTermsCreateInput paymentTermsAttributes, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (referenceId != null || fieldsSet.contains("referenceId")) {
        getInput().put("referenceId", referenceId);
    }if (paymentTermsAttributes != null || fieldsSet.contains("paymentTermsAttributes")) {
        getInput().put("paymentTermsAttributes", paymentTermsAttributes);
    }
  }

  public PaymentTermsCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "paymentTermsCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String referenceId;

    private PaymentTermsCreateInput paymentTermsAttributes;

    private String queryName;

    public PaymentTermsCreateGraphQLQuery build() {
      return new PaymentTermsCreateGraphQLQuery(referenceId, paymentTermsAttributes, queryName, fieldsSet);
               
    }

    
    public Builder referenceId(String referenceId) {
      this.referenceId = referenceId;
      this.fieldsSet.add("referenceId");
      return this;
    }

    
    public Builder paymentTermsAttributes(PaymentTermsCreateInput paymentTermsAttributes) {
      this.paymentTermsAttributes = paymentTermsAttributes;
      this.fieldsSet.add("paymentTermsAttributes");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
