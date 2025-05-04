package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Returns a bulk code creation resource by ID.
 */
public class DiscountRedeemCodeBulkCreationGraphQLQuery extends GraphQLQuery {
  public DiscountRedeemCodeBulkCreationGraphQLQuery(String id, String queryName,
      Set<String> fieldsSet) {
    super("query", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }
  }

  public DiscountRedeemCodeBulkCreationGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "discountRedeemCodeBulkCreation";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private String queryName;

    public DiscountRedeemCodeBulkCreationGraphQLQuery build() {
      return new DiscountRedeemCodeBulkCreationGraphQLQuery(id, queryName, fieldsSet);
               
    }

    /**
     * The ID of the `DiscountRedeemCodeBulkCreation` to return.
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
