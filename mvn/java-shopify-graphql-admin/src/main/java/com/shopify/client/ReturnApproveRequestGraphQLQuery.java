package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.ReturnApproveRequestInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Approves a customer's return request.
 * If this mutation is successful, then the `Return.status` field of the
 * approved return is set to `OPEN`.
 */
public class ReturnApproveRequestGraphQLQuery extends GraphQLQuery {
  public ReturnApproveRequestGraphQLQuery(ReturnApproveRequestInput input, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public ReturnApproveRequestGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "returnApproveRequest";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private ReturnApproveRequestInput input;

    private String queryName;

    public ReturnApproveRequestGraphQLQuery build() {
      return new ReturnApproveRequestGraphQLQuery(input, queryName, fieldsSet);
               
    }

    /**
     * The input fields to approve a return.
     */
    public Builder input(ReturnApproveRequestInput input) {
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
