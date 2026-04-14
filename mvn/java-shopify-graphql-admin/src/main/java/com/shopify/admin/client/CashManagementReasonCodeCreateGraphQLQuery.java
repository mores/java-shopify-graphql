package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Create a cash management reason code.
 */
public class CashManagementReasonCodeCreateGraphQLQuery extends GraphQLQuery {
  public CashManagementReasonCodeCreateGraphQLQuery(String code, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (code != null || fieldsSet.contains("code")) {
        getInput().put("code", code);
    }
  }

  public CashManagementReasonCodeCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "cashManagementReasonCodeCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String code;

    private String queryName;

    public CashManagementReasonCodeCreateGraphQLQuery build() {
      return new CashManagementReasonCodeCreateGraphQLQuery(code, queryName, fieldsSet);
               
    }

    /**
     * The reason code to create.
     */
    public Builder code(String code) {
      this.code = code;
      this.fieldsSet.add("code");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
