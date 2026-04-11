package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.ReturnRefundInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Creates a refund for items being returned when the return status is `OPEN` or
 * `CLOSED`. This mutation processes the financial aspects of a return by
 * refunding line items, shipping costs, and duties back to the customer.
 */
public class ReturnRefundGraphQLQuery extends GraphQLQuery {
  public ReturnRefundGraphQLQuery(ReturnRefundInput returnRefundInput, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (returnRefundInput != null || fieldsSet.contains("returnRefundInput")) {
        getInput().put("returnRefundInput", returnRefundInput);
    }
  }

  public ReturnRefundGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "returnRefund";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private ReturnRefundInput returnRefundInput;

    private String queryName;

    public ReturnRefundGraphQLQuery build() {
      return new ReturnRefundGraphQLQuery(returnRefundInput, queryName, fieldsSet);
               
    }

    /**
     * The input fields to refund a return.
     */
    public Builder returnRefundInput(ReturnRefundInput returnRefundInput) {
      this.returnRefundInput = returnRefundInput;
      this.fieldsSet.add("returnRefundInput");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
