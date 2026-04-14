package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Deletes a cash management reason code.
 */
public class CashManagementReasonCodeDeleteGraphQLQuery extends GraphQLQuery {
  public CashManagementReasonCodeDeleteGraphQLQuery(String id, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }
  }

  public CashManagementReasonCodeDeleteGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "cashManagementReasonCodeDelete";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private String queryName;

    public CashManagementReasonCodeDeleteGraphQLQuery build() {
      return new CashManagementReasonCodeDeleteGraphQLQuery(id, queryName, fieldsSet);
               
    }

    /**
     * The reason code id to delete.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
