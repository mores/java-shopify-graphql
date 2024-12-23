package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.ReturnRefundInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Refunds a return when its status is `OPEN` or `CLOSED` and associates it with the related return request.
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
