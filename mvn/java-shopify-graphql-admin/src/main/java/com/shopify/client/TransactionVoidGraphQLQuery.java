package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Trigger the voiding of an uncaptured authorization transaction.
 */
public class TransactionVoidGraphQLQuery extends GraphQLQuery {
  public TransactionVoidGraphQLQuery(String parentTransactionId, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (parentTransactionId != null || fieldsSet.contains("parentTransactionId")) {
        getInput().put("parentTransactionId", parentTransactionId);
    }
  }

  public TransactionVoidGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "transactionVoid";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String parentTransactionId;

    private String queryName;

    public TransactionVoidGraphQLQuery build() {
      return new TransactionVoidGraphQLQuery(parentTransactionId, queryName, fieldsSet);
               
    }

    /**
     * An uncaptured authorization transaction.
     */
    public Builder parentTransactionId(String parentTransactionId) {
      this.parentTransactionId = parentTransactionId;
      this.fieldsSet.add("parentTransactionId");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
