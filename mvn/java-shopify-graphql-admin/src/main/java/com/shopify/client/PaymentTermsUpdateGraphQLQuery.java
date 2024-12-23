package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.PaymentTermsUpdateInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Update payment terms on an order. To update payment terms on a draft order,
 * use a draft order mutation and include the request with the `DraftOrderInput`.
 */
public class PaymentTermsUpdateGraphQLQuery extends GraphQLQuery {
  public PaymentTermsUpdateGraphQLQuery(PaymentTermsUpdateInput input, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public PaymentTermsUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "paymentTermsUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private PaymentTermsUpdateInput input;

    private String queryName;

    public PaymentTermsUpdateGraphQLQuery build() {
      return new PaymentTermsUpdateGraphQLQuery(input, queryName, fieldsSet);
               
    }

    /**
     * The input fields used to update the payment terms.
     */
    public Builder input(PaymentTermsUpdateInput input) {
      this.input = input;
      this.fieldsSet.add("input");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
