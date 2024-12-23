package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.PaymentTermsDeleteInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Delete payment terms for an order. To delete payment terms on a draft order,
 * use a draft order mutation and include the request with the `DraftOrderInput`.
 */
public class PaymentTermsDeleteGraphQLQuery extends GraphQLQuery {
  public PaymentTermsDeleteGraphQLQuery(PaymentTermsDeleteInput input, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public PaymentTermsDeleteGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "paymentTermsDelete";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private PaymentTermsDeleteInput input;

    private String queryName;

    public PaymentTermsDeleteGraphQLQuery build() {
      return new PaymentTermsDeleteGraphQLQuery(input, queryName, fieldsSet);
               
    }

    /**
     * The input fields used to delete the payment terms.
     */
    public Builder input(PaymentTermsDeleteInput input) {
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
